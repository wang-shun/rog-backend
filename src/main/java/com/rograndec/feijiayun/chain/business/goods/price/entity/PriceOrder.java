package com.rograndec.feijiayun.chain.business.goods.price.entity;

import com.rograndec.feijiayun.chain.business.goods.price.vo.AddOrUpdatePriceOrderVO;
import com.rograndec.feijiayun.chain.common.constant.SysType;
import com.rograndec.feijiayun.chain.common.vo.UserVO;
import com.rograndec.feijiayun.chain.utils.user.UserEnterpriseUtils;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class PriceOrder implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 基础价格清单ID（为0代表无）
     */
    private Long parentOrderId;

    /**
     * 企业ID
     */
    private Long enterpriseId;

    /**
     * 上级企业ID
     */
    private Long parentId;

    /**
     * 0-自定义价格清单；1-系统价格清单
     */
    private Integer sysType;

    /**
     * 价格类型（0-基础价格；1-配货价格；2-零售价格）
     */
    private Integer priceType;

    /**
     * 清单编码
     */
    private String code;

    /**
     * 清单名称
     */
    private String name;

    /**
     * 状态（0-禁用；1-启用）
     */
    private Integer status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建人ID
     */
    private Long createrId;

    /**
     *  创建人编码
     */
    private String createrCode;

    /**
     * 创建人名称 
     */
    private String createrName;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后修改人ID
     */
    private Long modifierId;

    /**
     * 最后修改人编码 
     */
    private String modifierCode;

    /**
     * 最后修改人名称
     */
    private String modifierName;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * saas_price_order
     */
    private static final long serialVersionUID = 1L;

    public static List<Long> getPriceOrderPIds(List<PriceOrder> priceOrders){

        List<Long> collect = priceOrders.stream().map(priceOrder -> priceOrder.getParentOrderId()).filter(pId -> pId != null)
                .filter(pId -> pId != 0).collect(Collectors.toList());

        return collect;
    }

    public static PriceOrder getPriceOrder(UserVO userVO , AddOrUpdatePriceOrderVO addOrUpdatePriceOrderVO,boolean isAdd) throws Exception {

        PriceOrder priceOrder = new PriceOrder();

        priceOrder.setId(addOrUpdatePriceOrderVO.getId());
        priceOrder.setParentOrderId(addOrUpdatePriceOrderVO.getParentOrderId());


        if(isAdd){
            priceOrder.setEnterpriseId(userVO.getEnterpriseId());
            priceOrder.setParentId(userVO.getParentId());
            priceOrder.setSysType(SysType.CUSTOMIZE.getCode());
            priceOrder.setCode(addOrUpdatePriceOrderVO.getCode());
            priceOrder.setPriceType(addOrUpdatePriceOrderVO.getPriceType());
        }

        priceOrder.setName(addOrUpdatePriceOrderVO.getName());
        priceOrder.setStatus(addOrUpdatePriceOrderVO.getStatus());

        UserEnterpriseUtils.setUserCreateOrModify(priceOrder,userVO,isAdd);

        return priceOrder;
    }

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
     * 基础价格清单ID（为0代表无）
     * @return parent_order_id 基础价格清单ID（为0代表无）
     */
    public Long getParentOrderId() {
        return parentOrderId;
    }

    /**
     * 基础价格清单ID（为0代表无）
     * @param parentOrderId 基础价格清单ID（为0代表无）
     */
    public void setParentOrderId(Long parentOrderId) {
        this.parentOrderId = parentOrderId;
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
     * 0-自定义价格清单；1-系统价格清单
     * @return sys_type 0-自定义价格清单；1-系统价格清单
     */
    public Integer getSysType() {
        return sysType;
    }

    /**
     * 0-自定义价格清单；1-系统价格清单
     * @param sysType 0-自定义价格清单；1-系统价格清单
     */
    public void setSysType(Integer sysType) {
        this.sysType = sysType;
    }

    /**
     * 清单编码
     * @return code 清单编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 清单编码
     * @param code 清单编码
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 清单名称
     * @return name 清单名称
     */
    public String getName() {
        return name;
    }

    /**
     * 清单名称
     * @param name 清单名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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
     *  创建人编码
     * @return creater_code  创建人编码
     */
    public String getCreaterCode() {
        return createrCode;
    }

    /**
     *  创建人编码
     * @param createrCode  创建人编码
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


    public Integer getPriceType() {
        return priceType;
    }

    public void setPriceType(Integer priceType) {
        this.priceType = priceType;
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
        sb.append(", parentOrderId=").append(parentOrderId);
        sb.append(", enterpriseId=").append(enterpriseId);
        sb.append(", parentId=").append(parentId);
        sb.append(", sysType=").append(sysType);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
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