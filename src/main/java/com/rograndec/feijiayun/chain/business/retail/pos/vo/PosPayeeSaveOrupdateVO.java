package com.rograndec.feijiayun.chain.business.retail.pos.vo;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

 /**
 * 
 * @ClassName: PosPayeeSaveOrupdateVO
 * @Description:  零售管理-POS管理-收款人员-Rest接口
 * @author yuting.li
 * @version 1.0 
 * @date 2017-09-19 14:52:09
 */
@ApiModel(value = "PosPayeeSaveOrupdateVO", description = "零售管理-POS管理-收款人员")
public class PosPayeeSaveOrupdateVO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
     * 主键ID
     */
	@ApiModelProperty(required = true, value = "主键ID,修改时需要传入,新增时不需要")
	private Long id;
	
	/**
     * 收款人员ID
     */
	@NotNull(message="收款人员ID不能为空!")
	@ApiModelProperty(required = true, value = "收款人员ID")
	private Long payeeId;
	
	/**
     * 收款人编码
     */
	@ApiModelProperty(required = true, value = "收款人编码",hidden=true)
	private String payeeCode;
	
	/**
     * 收款人名称
     */
	@ApiModelProperty(required = true, value = "收款人名称",hidden=true)
	private String payeeName;
	
	/**
     * 班组ID
     */
	@ApiModelProperty(required = true, value = "班组ID")
	private Long teamId;
	
	/**
     * 班组编码
     */
	@ApiModelProperty(required = true, value = "班组编码",hidden=true)
	private String teamCode;
	
	/**
     * 班组名称
     */
	@ApiModelProperty(required = true, value = "班组名称",hidden=true)
	private String teamName;
	
	/**
     * 状态（0-禁用；1-启用）
     */
	@ApiModelProperty(required = true, value = "状态（0-禁用；1-启用）")
	private Integer status;
	
	/**
     * 备注
     */
	@ApiModelProperty(required = false, value = "备注")
	private String remark;
	

	/**
	 * 主键ID
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	/**
	 * 主键ID
	 */
	public Long getId() {
		return id;
	}
	
	/**
	 * 收款人员ID
	 */
	public void setPayeeId(Long payeeId) {
		this.payeeId = payeeId;
	}
	
	/**
	 * 收款人员ID
	 */
	public Long getPayeeId() {
		return payeeId;
	}
	
	/**
	 * 收款人编码
	 */
	public void setPayeeCode(String payeeCode) {
		this.payeeCode = payeeCode;
	}
	
	/**
	 * 收款人编码
	 */
	public String getPayeeCode() {
		return payeeCode;
	}
	
	/**
	 * 收款人名称
	 */
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}
	
	/**
	 * 收款人名称
	 */
	public String getPayeeName() {
		return payeeName;
	}
	
	/**
	 * 班组ID
	 */
	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}
	
	/**
	 * 班组ID
	 */
	public Long getTeamId() {
		return teamId;
	}
	
	/**
	 * 班组编码
	 */
	public void setTeamCode(String teamCode) {
		this.teamCode = teamCode;
	}
	
	/**
	 * 班组编码
	 */
	public String getTeamCode() {
		return teamCode;
	}
	
	
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	/**
	 * 状态（0-禁用；1-启用）
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	/**
	 * 状态（0-禁用；1-启用）
	 */
	public Integer getStatus() {
		return status;
	}
	
	/**
	 * 备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	/**
	 * 备注
	 */
	public String getRemark() {
		return remark;
	}
	

}