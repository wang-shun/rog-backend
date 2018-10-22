package com.rograndec.feijiayun.chain.business.system.set.entity;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Department implements Serializable {
    /**
     * 主键ID
     */
	@ApiModelProperty(value="主键ID",required=true)
    private Long id;

    /**
     * 上级部门ID
     */
	@ApiModelProperty(value="上级部门ID",required=true)
    private Long parentDeptId;

    /**
     * 企业ID
     */
	@ApiModelProperty(value="企业ID",required=true)
    private Long enterpriseId;

    /**
     * 上级企业ID
     */
	@ApiModelProperty(value="上级企业ID",required=true)
    private Long parentId;

    /**
     * 编码
     */
	@ApiModelProperty(value="编码",required=true)
    private String code;

    /**
     * 部门名称
     */
	@ApiModelProperty(value="部门名称",required=true)
    private String name;

    /**
     * 0：用户自定义部门；1-系统默认部门
     */
	@ApiModelProperty(value="0：用户自定义部门；1-系统默认部门",required=true)
    private Integer sysType;

    /**
     * 备注
     */
	@ApiModelProperty(value="备注",required=true)
    private String remark;

    /**
     * 创建人ID
     */
	@ApiModelProperty(value="创建人ID",required=true)
    private Long createrId;

    /**
     * 创建人编码
     */
	@ApiModelProperty(value="创建人编码",required=true)
    private String createrCode;

    /**
     * 创建人名称
     */
	@ApiModelProperty(value="创建人名称",required=true)
    private String createrName;

    /**
     * 创建时间
     */
	@ApiModelProperty(value="创建时间",required=true)
    private Date createTime;

    /**
     * 最后修改人ID
     */
	@ApiModelProperty(value="最后修改人ID",required=true)
    private Long modifierId;

    /**
     * 最后修改人编码
     */
	@ApiModelProperty(value="最后修改人编码",required=true)
    private String modifierCode;

    /**
     * 最后修改人名称
     */
	@ApiModelProperty(value="最后修改人名称",required=true)
    private String modifierName;

    /**
     * 更新时间
     */
	@ApiModelProperty(value="更新时间",required=true)
    private Date updateTime;

    /**
     * 当前部门下的岗位
     */
	@ApiModelProperty(value="当前部门下的岗位",required=true)
    private List<Position> positionList;
    
    /**
     * 状态(0-禁用 1-启用)
     */
	@ApiModelProperty(value="状态(0-禁用 1-启用)",required=true)
    private Integer status;
	
	/**
     * saas_department
     */
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     * @return id 主键ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键ID
     * @param id 主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 上级部门ID
     * @return parent_dept_id 上级部门ID
     */
    public Long getParentDeptId() {
        return parentDeptId;
    }

    /**
     * 上级部门ID
     * @param parentDeptId 上级部门ID
     */
    public void setParentDeptId(Long parentDeptId) {
        this.parentDeptId = parentDeptId;
    }

    /**
     * 企业ID
     * @return enterprise_id 企业ID
     */
    public Long getEnterpriseId() {
        return enterpriseId;
    }

    /**
     * 企业ID
     * @param enterpriseId 企业ID
     */
    public void setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    /**
     * 上级企业ID
     * @return parent_id 上级企业ID
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 上级企业ID
     * @param parentId 上级企业ID
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 编码
     * @return code 编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 编码
     * @param code 编码
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 部门名称
     * @return name 部门名称
     */
    public String getName() {
        return name;
    }

    /**
     * 部门名称
     * @param name 部门名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 0：用户自定义部门；1-系统默认部门
     * @return sys_type 0：用户自定义部门；1-系统默认部门
     */
    public Integer getSysType() {
        return sysType;
    }

    /**
     * 0：用户自定义部门；1-系统默认部门
     * @param sysType 0：用户自定义部门；1-系统默认部门
     */
    public void setSysType(Integer sysType) {
        this.sysType = sysType;
    }

    /**
     * 备注
     * @return remark 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 创建人ID
     * @return creater_id 创建人ID
     */
    public Long getCreaterId() {
        return createrId;
    }

    /**
     * 创建人ID
     * @param createrId 创建人ID
     */
    public void setCreaterId(Long createrId) {
        this.createrId = createrId;
    }

    /**
     * 创建人编码
     * @return creater_code 创建人编码
     */
    public String getCreaterCode() {
        return createrCode;
    }

    /**
     * 创建人编码
     * @param createrCode 创建人编码
     */
    public void setCreaterCode(String createrCode) {
        this.createrCode = createrCode == null ? null : createrCode.trim();
    }

    /**
     * 创建人名称
     * @return creater_name 创建人名称
     */
    public String getCreaterName() {
        return createrName;
    }

    /**
     * 创建人名称
     * @param createrName 创建人名称
     */
    public void setCreaterName(String createrName) {
        this.createrName = createrName == null ? null : createrName.trim();
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 最后修改人ID
     * @return modifier_id 最后修改人ID
     */
    public Long getModifierId() {
        return modifierId;
    }

    /**
     * 最后修改人ID
     * @param modifierId 最后修改人ID
     */
    public void setModifierId(Long modifierId) {
        this.modifierId = modifierId;
    }

    /**
     * 最后修改人编码
     * @return modifier_code 最后修改人编码
     */
    public String getModifierCode() {
        return modifierCode;
    }

    /**
     * 最后修改人编码
     * @param modifierCode 最后修改人编码
     */
    public void setModifierCode(String modifierCode) {
        this.modifierCode = modifierCode == null ? null : modifierCode.trim();
    }

    /**
     * 最后修改人名称
     * @return modifier_name 最后修改人名称
     */
    public String getModifierName() {
        return modifierName;
    }

    /**
     * 最后修改人名称
     * @param modifierName 最后修改人名称
     */
    public void setModifierName(String modifierName) {
        this.modifierName = modifierName == null ? null : modifierName.trim();
    }

    /**
     * 更新时间
     * @return update_time 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    
    public List<Position> getPositionList() {
		return positionList;
	}

	public void setPositionList(List<Position> positionList) {
		this.positionList = positionList;
	}
	
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}


    /**
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parentDeptId=").append(parentDeptId);
        sb.append(", enterpriseId=").append(enterpriseId);
        sb.append(", parentId=").append(parentId);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", sysType=").append(sysType);
        sb.append(", remark=").append(remark);
        sb.append(", createrId=").append(createrId);
        sb.append(", createrCode=").append(createrCode);
        sb.append(", createrName=").append(createrName);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifierId=").append(modifierId);
        sb.append(", modifierCode=").append(modifierCode);
        sb.append(", modifierName=").append(modifierName);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}