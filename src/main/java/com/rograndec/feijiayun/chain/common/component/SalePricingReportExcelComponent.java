package com.rograndec.feijiayun.chain.common.component;

import com.rograndec.feijiayun.chain.common.vo.UserVO;
import com.rograndec.feijiayun.chain.utils.date.DateUtils;
import com.rograndec.feijiayun.chain.utils.excel.ExcelWriter;
import com.rograndec.feijiayun.chain.utils.reflect.ReflectUtils;

import org.apache.poi.ss.util.CellRangeAddress;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.*;

/**
 * Created by dongdong.zhang@rograndec.com on 2017/10/21
 * 会员管理公用导出模板
 */
@Component
public class SalePricingReportExcelComponent<T> {
	
	
	
	 public void commExcelExport(OutputStream output,LinkedHashMap<String, String> rowHeaderList, List<T> ts,UserVO user,Map<String,BigDecimal> quantity,String secondTitle){
	        try {
	            ExcelWriter writer = new ExcelWriter() {
	                public void generate() throws Exception {
	                	this.beginWorkSheet();
	                    this.beginSheet();
	                    int contextStartRowNum =3;
	                    //创建表头
	                    createRowHeader(this,user,rowHeaderList,secondTitle);
	                    if (ts != null&&!ts.isEmpty()){
	                        for (int rowNum = 0; rowNum < ts.size(); rowNum++) {
	                            // 插入新行
	                            this.insertRow(contextStartRowNum++);
	                            T t = ts.get(rowNum);
	                            Set<String> set = rowHeaderList.keySet();
	                            Object[] objSet = set.toArray();
	                            //序号
	                            this.createCell(0, rowNum+1);
	                            // 建立新单元格,索引值从0开始,表示第一列
	                            for(int k = 0 ; k < objSet.length ; k ++){
	                                Object objValue = ReflectUtils.getValueOfGet(t,objSet[k].toString());
	                                if(objValue instanceof Date){
	                                	objValue=DateUtils.DateToString((Date)objValue, DateUtils.FMT_DATE);
	                                 }
	                                this.createCell(k+1, null == objValue ? "" : objValue.toString());
	                            }
	                            // 结束行
	                            this.endRow();
	                        }
	                    }
	                    
	                    // 插入新行
                        this.insertRow(contextStartRowNum);
                        this.createCell(0,"合计");
                        int i=1;
                       for(Map.Entry<String, String> r:rowHeaderList.entrySet()){
                    	   for(Map.Entry<String, BigDecimal> m:quantity.entrySet()){
                    		   if(r.getKey().equals(m.getKey())){
                    			   this.createCell(i,m.getValue()+"");
                    		   }
                    	   }
                    	   i++;
                       }
                        /*for(int i=1;1<rowHeaderList.size();i++){
                        	
                        	this.createCell(i,quantity.get("quantity")+"");
                        }
                        this.createCell(28,quantity.get("amount")+"");
                        this.createCell(32,quantity.get("realAmount")+"");
                        this.createCell(35,quantity.get("notaxRealAmount")+"");
                        this.createCell(36,quantity.get("taxAmount")+"");*/
                        // 结束行
                        this.endRow(); 
	                    // 电子表格结束
	                    this.endSheet();
	               /*   //合并单元格
	                    this.beginMergerCell();
	                    *//**
	                     * 合并前两行头信息
	                     *//*
	                    this.setMergeCell(0, 0, 0, rowHeaderList.size());
	                    this.setMergeCell(1, 0, 1, rowHeaderList.size());
	                    this.endMergerCell();*/
	                    this.endWorkSheet();
	                }
	            };
	            CellRangeAddress[] regions=getRegions();
	            writer.process(output,regions);
	          /*  writer.process(output);*/
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	 
	 private CellRangeAddress[]  getRegions(){
		 //合并第一行
		 CellRangeAddress region1=new CellRangeAddress(0,0,0,11);
		 //合并第二行
		 CellRangeAddress region2=new CellRangeAddress(1,1,0,11);
		 return new CellRangeAddress[]{region1,region2};
	 }
	 
	 private void createRowHeader(ExcelWriter writer,UserVO user,LinkedHashMap<String, String> rowHeaderList,String secondTitle) throws IOException{
		int size=rowHeaderList.size()+1;
		int titleCellNum=size/2;
		 //插入第一行
		 writer.insertRow(0);
		 writer.createCell(titleCellNum,user.getEnterpriseName());
		 writer.endRow();
		 //插入第二行
		 writer.insertRow(1);
		 writer.createCell(titleCellNum,secondTitle);
		 writer.endRow();
		 int cellNum=0;
		 //插入第三行
		 writer.insertRow(2);
		 writer.createCell(cellNum++,"序号");
		 for(Map.Entry<String, String> entey:rowHeaderList.entrySet()){
			 writer.createCell(cellNum++,entey.getValue());
		 }
		 writer.endRow();
	 }
	 
}
