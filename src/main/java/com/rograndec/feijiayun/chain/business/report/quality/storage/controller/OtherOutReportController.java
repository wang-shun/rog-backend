package com.rograndec.feijiayun.chain.business.report.quality.storage.controller;

import com.rograndec.feijiayun.chain.business.report.quality.storage.service.OtherInReportService;
import com.rograndec.feijiayun.chain.business.report.quality.storage.service.OtherOutReportService;
import com.rograndec.feijiayun.chain.business.report.quality.storage.vo.*;
import com.rograndec.feijiayun.chain.business.storage.move.service.OtherInService;
import com.rograndec.feijiayun.chain.common.Page;
import com.rograndec.feijiayun.chain.common.Result;
import com.rograndec.feijiayun.chain.common.SelectBeanWithCode;
import com.rograndec.feijiayun.chain.common.SysCode;
import com.rograndec.feijiayun.chain.common.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;

/**
 * 
 * @author lizhongyi
 *
 */
@Api(value = "report_quality_storage_otherOut",description = "报表-质量管理-存储与养护-其它出库")
@RestController
@RequestMapping("report/quality/storage/otherOut")
@Validated
public class OtherOutReportController {

    private static final Log logger = LogFactory.getLog(OtherOutReportController.class);

    @Autowired
    private OtherOutReportService otherOutReportService;

    @Autowired
    private OtherInService otherInService;

    @ApiOperation(value="按条件搜索其他出库报表信息", notes = "按条件搜索其他出库报表信息 | 开发者 苏磊 | 已联调", produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(value = "/getOtherOutPage", method = RequestMethod.POST)
    @ApiImplicitParam(name = "requestOtherOutVO", value = "检索条件", required = true, dataType = "RequestOtherOutVO")
    public Result<OtherOutReportVO> getOtherInPage(HttpServletRequest request, @RequestBody RequestOtherOutVO requestOtherOutVO){
        Result<OtherOutReportVO> result = new Result<OtherOutReportVO>();
        try{
            if(requestOtherOutVO.getPageNo() <= 0 || requestOtherOutVO.getPageSize() <= 0){
                result.setBizCodeFallInfo(SysCode.SYS_PARAM_ERROR);
                return result;
            }
            Page page = new Page(requestOtherOutVO.getPageNo(), requestOtherOutVO.getPageSize());
            HttpSession session = request.getSession(true);
            UserVO loginUser = (UserVO) session.getAttribute("user");
            OtherOutReportVO vo  = otherOutReportService.getOtherOutPage(page,requestOtherOutVO,loginUser);
            result.setBizCodeSuccessInfo(SysCode.SUCCESS, vo);
        }catch(Exception e){
            logger.error("按条件搜索其他出库报表信息错误:"+e.getMessage(),e);
            result.setBizCodeFallInfo(SysCode.FAIL);
            return result;
        }
        return result;
    }

    @ApiOperation(value = "根据来源单位查找出对应的来源单位详细名称", notes = "根据来源单位查找出对应的来源单位详细名称 | 开发者 苏磊 | 已联调")
    @RequestMapping(value="/getSrcUnit", method=RequestMethod.GET)
    public Result<List<SelectBeanWithCode>> getExcessSaleGoodsList(HttpServletRequest request,
                                                                   @ApiParam(value = "0-部门；1-总部；2-门店；3-供货单位", required = true) @RequestParam Integer srcUnitType){
        Result<List<SelectBeanWithCode>> result = new Result<List<SelectBeanWithCode>>();
        try{
            HttpSession session = request.getSession(true);
            UserVO loginUser = (UserVO) session.getAttribute("user");
            List<SelectBeanWithCode> list = otherInService.getSrcUnit(loginUser,srcUnitType);
            result.setBizCodeSuccessInfo(SysCode.SUCCESS,list);
        }catch(Exception e){
            logger.error("查询新增时的移动人员错误:"+e.getMessage(),e);
            result.setBizCodeFallInfo(SysCode.FAIL);
            return result;
        }
        return result;
    }

    @ApiOperation(value = "其他出库信息报表导出", notes = "其他出库信息报表导出 | 开发者 苏磊 | 已联调")
    @RequestMapping(value="/exportOtherOut",method = RequestMethod.POST,produces=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @ApiImplicitParam(name = "requestOtherOutVO", value = "检索条件", required = true, dataType = "RequestOtherOutVO")
    public void exportOtherOut(HttpServletResponse response, HttpServletRequest request,RequestOtherOutVO requestOtherOutVO) throws Exception {

        try {
            OutputStream output = null;
            output = response.getOutputStream();
            //这段代码一定要放在流关闭之前，否会下载的文件会变成zip格式
            String name = "其他出库信息";
            response.setContentType("application/octet-stream;charset=utf-8");
            response.addHeader("Content-Disposition","attachment;filename=" + URLEncoder.encode(name, "UTF-8")+".xlsx");
            HttpSession session = request.getSession(true);
            UserVO loginUser = (UserVO) session.getAttribute("user");
            OtherOutExcelPageVO otherOutExcelPageVO = otherOutReportService.getExcelForm(requestOtherOutVO,loginUser);
            otherOutReportService.export(output,otherOutExcelPageVO,loginUser);
        }catch(Exception e){
            logger.error("其他出库信息报表导出:"+e.getMessage(),e);
        }

    }
	
}
