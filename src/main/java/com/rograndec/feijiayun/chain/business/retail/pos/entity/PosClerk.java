package com.rograndec.feijiayun.chain.business.retail.pos.entity;

import java.io.Serializable;
import java.util.Date;

import com.rograndec.feijiayun.chain.business.basic.user.entity.User;
import com.rograndec.feijiayun.chain.business.basic.warehouse.vo.PosWarehouseCargoAreaVO;
import com.rograndec.feijiayun.chain.common.constant.EnableStatus;
import com.rograndec.feijiayun.chain.common.vo.UserVO;

import io.swagger.annotations.ApiModelProperty;
 
/**
 * 
 * saas_pos_clerk
 * 
 * 
 * @author liyut
 * 
 * 2017-09-18
 */
public class PosClerk implements Serializable {
    /**
     * 主键ID
     */
    @ApiModelProperty(value = "主键ID")
    private Long id;

    /**
     * 企业ID
     */
    @ApiModelProperty(value = "企业ID")
    private Long enterpriseId;

    /**
     * 上级企业ID
     */
    @ApiModelProperty(value = "上级企业ID")
    private Long parentId;

    /**
     * 营业人员ID
     */
    @ApiModelProperty(value = "营业人员ID")
    private Long clerkId;

    /**
     * 营业人员编码
     */
    @ApiModelProperty(value = "营业人员编码")
    private String clerkCode;

    /**
     * 营业人员名称
     */
    @ApiModelProperty(value = "营业人员名称")
    private String clerkName;

    /**
     * 柜组（货区）ID
     */
    @ApiModelProperty(value = "柜组（货区）ID")
    private Long cargoAreaId;

    /**
     * 柜组（货区）编码
     */
    @ApiModelProperty(value = "柜组（货区）编码")
    private String cargoAreaCode;

    /**
     * 柜组（货区）名称
     */
    @ApiModelProperty(value = "柜组（货区）名称")
    private String cargoAreaName;

    /**
     * 状态（0-禁用；1-启用）
     */
    @ApiModelProperty(value = "状态（0-禁用；1-启用）")
    private Integer status;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String remark;

    /**
     * 创建人ID
     */
    @ApiModelProperty(value = "创建人ID")
    private Long createrId;

    /**
     * 创建人编码
     */
    @ApiModelProperty(value = "创建人编码")
    private String createrCode;

    /**
     * 创建人名称
     */
    @ApiModelProperty(value = "创建人名称")
    private String createrName;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /**
     * 最后修改人ID
     */
    @ApiModelProperty(value = "最后修改人ID")
    private Long modifierId;

    /**
     * 最后修改人编码
     */
    @ApiModelProperty(value = "最后修改人编码")
    private String modifierCode;

    /**
     * 最后修改人名称
     */
    @ApiModelProperty(value = "最后修改人名称")
    private String modifierName;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    /**
     * saas_pos_clerk
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
     * 营业人员ID
     * @return clerk_id 营业人员ID
     */
    public Long getClerkId() {
        return clerkId;
    }

    /**
     * 营业人员ID
     * @param clerkId 营业人员ID
     */
    public void setClerkId(Long clerkId) {
        this.clerkId = clerkId;
    }

    /**
     * 营业人员编码
     * @return clerk_code 营业人员编码
     */
    public String getClerkCode() {
        return clerkCode;
    }

    /**
     * 营业人员编码
     * @param clerkCode 营业人员编码
     */
    public void setClerkCode(String clerkCode) {
        this.clerkCode = clerkCode == null ? null : clerkCode.trim();
    }

    /**
     * 营业人员名称
     * @return clerk_name 营业人员名称
     */
    public String getClerkName() {
        return clerkName;
    }

    /**
     * 营业人员名称
     * @param clerkName 营业人员名称
     */
    public void setClerkName(String clerkName) {
        this.clerkName = clerkName == null ? null : clerkName.trim();
    }

    /**
     * 柜组（货区）ID
     * @return cargo_area_id 柜组（货区）ID
     */
    public Long getCargoAreaId() {
        return cargoAreaId;
    }

    /**
     * 柜组（货区）ID
     * @param cargoAreaId 柜组（货区）ID
     */
    public void setCargoAreaId(Long cargoAreaId) {
        this.cargoAreaId = cargoAreaId;
    }

    /**
     * 柜组（货区）编码
     * @return cargo_area_code 柜组（货区）编码
     */
    public String getCargoAreaCode() {
        return cargoAreaCode;
    }

    /**
     * 柜组（货区）编码
     * @param cargoAreaCode 柜组（货区）编码
     */
    public void setCargoAreaCode(String cargoAreaCode) {
        this.cargoAreaCode = cargoAreaCode == null ? null : cargoAreaCode.trim();
    }

    /**
     * 柜组（货区）名称
     * @return cargo_area_name 柜组（货区）名称
     */
    public String getCargoAreaName() {
        return cargoAreaName;
    }

    /**
     * 柜组（货区）名称
     * @param cargoAreaName 柜组（货区）名称
     */
    public void setCargoAreaName(String cargoAreaName) {
        this.cargoAreaName = cargoAreaName == null ? null : cargoAreaName.trim();
    }

    /**
     * 状态（0-禁用；1-启用）
     * @return status 状态（0-禁用；1-启用）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态（0-禁用；1-启用）
     * @param status 状态（0-禁用；1-启用）
     */
    public void setStatus(Integer status) {
        this.status = status;
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
    
    public static PosClerk getPosClerk(User user,PosWarehouseCargoAreaVO cargoArea) {
    	PosClerk clerk = new PosClerk();
    	clerk.setEnterpriseId(user.getEnterpriseId());
    	clerk.setParentId(user.getParentId());
    	
    	clerk.setClerkId(user.getId());
    	clerk.setClerkCode(user.getCode());
    	clerk.setClerkName(user.getName());
    	
    	clerk.setCargoAreaId(cargoArea.getId());
    	clerk.setCargoAreaCode(cargoArea.getCode());
    	clerk.setCargoAreaName(cargoArea.getName());
    	 /**
         * 状态（0-禁用；1-启用）
         */
    	clerk.setStatus(EnableStatus.ENABLE.getStatus());
    	clerk.setCreaterId(user.getCreaterId());
    	clerk.setCreaterCode(user.getCreaterCode());
    	clerk.setCreaterName(user.getCreaterName());
    	clerk.setCreateTime(new Date());
    	clerk.setModifierId(user.getCreaterId());
    	clerk.setModifierCode(user.getCreaterCode());
    	clerk.setModifierName(user.getCreaterName());
    	clerk.setUpdateTime(new Date());
    	return clerk;
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
        sb.append(", enterpriseId=").append(enterpriseId);
        sb.append(", parentId=").append(parentId);
        sb.append(", clerkId=").append(clerkId);
        sb.append(", clerkCode=").append(clerkCode);
        sb.append(", clerkName=").append(clerkName);
        sb.append(", cargoAreaId=").append(cargoAreaId);
        sb.append(", cargoAreaCode=").append(cargoAreaCode);
        sb.append(", cargoAreaName=").append(cargoAreaName);
        sb.append(", status=").append(status);
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