package com.rograndec.feijiayun.chain.business.report.member.controller;

import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import com.rograndec.feijiayun.chain.business.system.enterprise.entity.EnterpriseBusiness;
import com.rograndec.feijiayun.chain.business.system.enterprise.service.EnterpriseBusinessService;
import com.rograndec.feijiayun.chain.common.constant.ChainType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rograndec.feijiayun.chain.business.report.member.service.MemberReportService;
import com.rograndec.feijiayun.chain.business.report.member.vo.MemberBirthDateParamVO;
import com.rograndec.feijiayun.chain.business.report.member.vo.MemberBirthDateVO;
import com.rograndec.feijiayun.chain.common.Page;
import com.rograndec.feijiayun.chain.common.Result;
import com.rograndec.feijiayun.chain.common.SysCode;
import com.rograndec.feijiayun.chain.common.vo.UserVO;
import com.rograndec.feijiayun.chain.exception.BusinessException;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * 
 * @author lizhongyi
 *
 */
@Api(value = "MemberBirthDateReportController",description = "报表-会员-会员会员生日")
@RestController
@RequestMapping("report/member/birthDate")
@Validated
public class MemberBirthDateReportController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberBirthDateReportController.class);
	
	@Autowired
	private MemberReportService memberReportService;
	@Autowired
	private EnterpriseBusinessService enterpriseBusinessService;

	@ApiOperation(value = "查询", notes = "查询会员生日明细列表 | 开发者 yuting.li | 已联调")
	@ResponseBody
    @RequestMapping(value="/queryMemberBirthDateList", method=RequestMethod.POST)
    public Result<Page<List<MemberBirthDateVO>>> queryMemberBirthDateList(HttpSession session,@Valid @RequestBody MemberBirthDateParamVO param){
		Result<Page<List<MemberBirthDateVO>>> result = new Result<>();
		if (param.getPageNo() <= 0 || param.getPageSize() <= 0) {
            throw new BusinessException("分页参数不对");
        }
		try {
            UserVO loginUser = (UserVO) session.getAttribute("user");
			//门店: 会员管理由总部控制时，读取总部的数据
			Long eId =loginUser.getEnterpriseId();
			EnterpriseBusiness enterpriseBus = enterpriseBusinessService.queryEnterpriseBusinessByEnterpriseId(loginUser.getEnterpriseId());
			if (!loginUser.getChainType().equals(ChainType.Headquarters.getCode())
					&& 0 == enterpriseBus.getMemberInfo()){
				eId = loginUser.getParentId();
			}

            param.setEnterpriseId(eId);
            if(0 != loginUser.getParentId() && null != loginUser.getParentId()) {
            	param.setParentId(loginUser.getParentId());
            }
            Page<List<MemberBirthDateVO>> page = memberReportService.getMemberBirthDate(param);
            result.setBizCodeSuccessInfo(SysCode.SUCCESS, page);
		} catch (Exception e) {
			logger.error("获取会员生日明细数据失败:", e);
            result.setBizCodeFallInfo(SysCode.FAIL);
            return result;
		}
		return result;
	}
	
	@ApiOperation(value = "导出Excel", notes = "会员生日列表导出至Excel | 开发者 yuting.li | 已联调")
	@RequestMapping(value="/exportExcel", method=RequestMethod.POST,produces= MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	@ApiImplicitParams({@ApiImplicitParam(name = "param", value = "会员销售查询条件", required = true, dataType = "MemberBirthDateParamVO")
	})
    public void exportExcel(HttpSession session,HttpServletResponse response,MemberBirthDateParamVO param){
		String name = "会员生日";
        try {
        	//这段代码一定要放在流关闭之前，否会下载的文件会变成zip格式
        	response.setContentType("application/msexcel;charset=UTF-8");
	        response.addHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(name, "UTF-8")+".xlsx");
	        UserVO loginUser = (UserVO) session.getAttribute("user");
			//门店: 会员管理由总部控制时，读取总部的数据
			Long eId =loginUser.getEnterpriseId();
			EnterpriseBusiness enterpriseBus = enterpriseBusinessService.queryEnterpriseBusinessByEnterpriseId(loginUser.getEnterpriseId());
			if (!loginUser.getChainType().equals(ChainType.Headquarters.getCode())
					&& 0 == enterpriseBus.getMemberInfo()){
				eId = loginUser.getParentId();
			}

            param.setEnterpriseId(eId);
            if(0 != loginUser.getParentId() && null != loginUser.getParentId()) {
            	param.setParentId(loginUser.getParentId());
            }
            param.setStart(null);
	        //输出Excel文件
	        OutputStream output = response.getOutputStream();
	        memberReportService.exportMemberBirthDate(output, param);
            output.close();
            output.flush();
        } catch (Exception e) {
        	logger.error("导出会员生日错误:",e);
        }
	}
	
}
