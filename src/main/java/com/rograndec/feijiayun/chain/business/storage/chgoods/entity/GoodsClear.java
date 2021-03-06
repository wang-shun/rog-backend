package com.rograndec.feijiayun.chain.business.storage.chgoods.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
 
/**
 * 
 * saas_goods_clear
 * 
 * 
 * @author Asze
 * 
 * 2017-09-26
 */
public class GoodsClear implements Serializable {
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
     * 单据类型（5306）
     */
    @ApiModelProperty(value = "单据类型（5306）")
    private Integer orderType;

    /**
     * 清斗单号
     */
    @ApiModelProperty(value = "清斗单号")
    private String code;

    /**
     * 清斗日期
     */
    @ApiModelProperty(value = "清斗日期")
    private Date clearDate;

    /**
     * 清斗人员ID
     */
    @ApiModelProperty(value = "清斗人员ID")
    private Long clearManId;

    /**
     * 清斗人员编码
     */
    @ApiModelProperty(value = "清斗人员编码")
    private String clearManCode;

    /**
     * 清斗人员名称
     */
    @ApiModelProperty(value = "清斗人员名称")
    private String clearManName;

    /**
     * 复核人员ID
     */
    @ApiModelProperty(value = "复核人员ID")
    private Long auditManId;

    /**
     * 复核人员编码
     */
    @ApiModelProperty(value = "复核人员编码")
    private String auditManCode;

    /**
     * 复核人员名称
     */
    @ApiModelProperty(value = "复核人员名称")
    private String auditManName;

    /**
     * 数量合计
     */
    @ApiModelProperty(value = "数量合计")
    private BigDecimal quantityTotal;

    /**
     * 金额合计
     */
    @ApiModelProperty(value = "金额合计")
    private BigDecimal amountTotal;

    /**
     * 不含税金额合计
     */
    @ApiModelProperty(value = "不含税金额合计")
    private BigDecimal notaxAmountTotal;

    /**
     * 税额合计
     */
    @ApiModelProperty(value = "税额合计")
    private BigDecimal taxAmountTotal;

    /**
     * 品种数量
     */
    @ApiModelProperty(value = "品种数量")
    private Integer varietiesQuantity;

    /**
     * 流通监管码
     */
    @ApiModelProperty(value = "流通监管码")
    private String flowCode;

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
     * saas_goods_clear
     */
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     * @return Id 主键ID
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
     * 单据类型（5306）
     * @return order_type 单据类型（5306）
     */
    public Integer getOrderType() {
        return orderType;
    }

    /**
     * 单据类型（5306）
     * @param orderType 单据类型（5306）
     */
    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    /**
     * 清斗单号
     * @return code 清斗单号
     */
    public String getCode() {
        return code;
    }

    /**
     * 清斗单号
     * @param code 清斗单号
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 清斗日期
     * @return clear_date 清斗日期
     */
    public Date getClearDate() {
        return clearDate;
    }

    /**
     * 清斗日期
     * @param clearDate 清斗日期
     */
    public void setClearDate(Date clearDate) {
        this.clearDate = clearDate;
    }

    /**
     * 清斗人员ID
     * @return clear_man_id 清斗人员ID
     */
    public Long getClearManId() {
        return clearManId;
    }

    /**
     * 清斗人员ID
     * @param clearManId 清斗人员ID
     */
    public void setClearManId(Long clearManId) {
        this.clearManId = clearManId;
    }

    /**
     * 清斗人员编码
     * @return clear_man_code 清斗人员编码
     */
    public String getClearManCode() {
        return clearManCode;
    }

    /**
     * 清斗人员编码
     * @param clearManCode 清斗人员编码
     */
    public void setClearManCode(String clearManCode) {
        this.clearManCode = clearManCode == null ? null : clearManCode.trim();
    }

    /**
     * 清斗人员名称
     * @return clear_man_name 清斗人员名称
     */
    public String getClearManName() {
        return clearManName;
    }

    /**
     * 清斗人员名称
     * @param clearManName 清斗人员名称
     */
    public void setClearManName(String clearManName) {
        this.clearManName = clearManName == null ? null : clearManName.trim();
    }

    /**
     * 复核人员ID
     * @return audit_man_id 复核人员ID
     */
    public Long getAuditManId() {
        return auditManId;
    }

    /**
     * 复核人员ID
     * @param auditManId 复核人员ID
     */
    public void setAuditManId(Long auditManId) {
        this.auditManId = auditManId;
    }

    /**
     * 复核人员编码
     * @return audit_man_code 复核人员编码
     */
    public String getAuditManCode() {
        return auditManCode;
    }

    /**
     * 复核人员编码
     * @param auditManCode 复核人员编码
     */
    public void setAuditManCode(String auditManCode) {
        this.auditManCode = auditManCode == null ? null : auditManCode.trim();
    }

    /**
     * 复核人员名称
     * @return audit_man_name 复核人员名称
     */
    public String getAuditManName() {
        return auditManName;
    }

    /**
     * 复核人员名称
     * @param auditManName 复核人员名称
     */
    public void setAuditManName(String auditManName) {
        this.auditManName = auditManName == null ? null : auditManName.trim();
    }

    /**
     * 数量合计
     * @return quantity_total 数量合计
     */
    public BigDecimal getQuantityTotal() {
        return quantityTotal;
    }

    /**
     * 数量合计
     * @param quantityTotal 数量合计
     */
    public void setQuantityTotal(BigDecimal quantityTotal) {
        this.quantityTotal = quantityTotal;
    }

    /**
     * 品种数量
     * @return varieties_quantity 品种数量
     */
    public Integer getVarietiesQuantity() {
        return varietiesQuantity;
    }

    /**
     * 品种数量
     * @param varietiesQuantity 品种数量
     */
    public void setVarietiesQuantity(Integer varietiesQuantity) {
        this.varietiesQuantity = varietiesQuantity;
    }

    /**
     * 流通监管码
     * @return flow_code 流通监管码
     */
    public String getFlowCode() {
        return flowCode;
    }

    /**
     * 流通监管码
     * @param flowCode 流通监管码
     */
    public void setFlowCode(String flowCode) {
        this.flowCode = flowCode == null ? null : flowCode.trim();
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

    public BigDecimal getAmountTotal() {
        return amountTotal;
    }

    public void setAmountTotal(BigDecimal amountTotal) {
        this.amountTotal = amountTotal;
    }

    public BigDecimal getNotaxAmountTotal() {
        return notaxAmountTotal;
    }

    public void setNotaxAmountTotal(BigDecimal notaxAmountTotal) {
        this.notaxAmountTotal = notaxAmountTotal;
    }

    public BigDecimal getTaxAmountTotal() {
        return taxAmountTotal;
    }

    public void setTaxAmountTotal(BigDecimal taxAmountTotal) {
        this.taxAmountTotal = taxAmountTotal;
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
        sb.append(", orderType=").append(orderType);
        sb.append(", code=").append(code);
        sb.append(", clearDate=").append(clearDate);
        sb.append(", clearManId=").append(clearManId);
        sb.append(", clearManCode=").append(clearManCode);
        sb.append(", clearManName=").append(clearManName);
        sb.append(", auditManId=").append(auditManId);
        sb.append(", auditManCode=").append(auditManCode);
        sb.append(", auditManName=").append(auditManName);
        sb.append(", quantityTotal=").append(quantityTotal);
        sb.append(", varietiesQuantity=").append(varietiesQuantity);
        sb.append(", flowCode=").append(flowCode);
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
        sb.append(", amountTotal=").append(amountTotal);
        sb.append(", notaxAmountTotal=").append(notaxAmountTotal);
        sb.append(", taxAmountTotal=").append(taxAmountTotal);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}