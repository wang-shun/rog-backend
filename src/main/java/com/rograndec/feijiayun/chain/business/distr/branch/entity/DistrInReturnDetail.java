package com.rograndec.feijiayun.chain.business.distr.branch.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
 
/**
 * 
 * saas_distr_in_return_detail
 * 
 * 
 * @author rograndec
 * 
 * 2017-10-08
 */
public class DistrInReturnDetail implements Serializable {
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
     * 配进退出单ID
     */
    @ApiModelProperty(value = "配进退出单ID")
    private Long inReturnId;

    /**
     * 单据（配进退出单）类型（5421）
     */
    @ApiModelProperty(value = "单据（配进退出单）类型（5421）")
    private Integer orderType;

    /**
     * 配进退出单号
     */
    @ApiModelProperty(value = "配进退出单号")
    private String inReturnCode;

    /**
     * 配进退出日期
     */
    @ApiModelProperty(value = "配进退出日期")
    private Date inReturnDate;

    /**
     * 基础单据明细ID
     */
    @ApiModelProperty(value = "基础单据明细ID")
    private Long baseOrderDtlId;

    /**
     * 基础单据ID
     */
    @ApiModelProperty(value = "基础单据ID")
    private Long baseOrderId;

    /**
     * 基础单据类型
     */
    @ApiModelProperty(value = "基础单据类型")
    private Integer baseOrderType;

    /**
     * 基础单据编码
     */
    @ApiModelProperty(value = "基础单据编码")
    private String baseOrderCode;

    /**
     * 基础单据日期
     */
    @ApiModelProperty(value = "基础单据日期")
    private Date baseOrderDate;

    /**
     * 商品ID
     */
    @ApiModelProperty(value = "商品ID")
    private Long goodsId;

    /**
     * 商品编码
     */
    @ApiModelProperty(value = "商品编码")
    private String goodsCode;

    /**
     * 条形码
     */
    @ApiModelProperty(value = "条形码")
    private String barcode;

    /**
     * 商品名称
     */
    @ApiModelProperty(value = "商品名称")
    private String goodsName;

    /**
     * 商品通用名称
     */
    @ApiModelProperty(value = "商品通用名称")
    private String goodsGenericName;

    /**
     * 剂型ID
     */
    @ApiModelProperty(value = "剂型ID")
    private Long dosageId;

    /**
     * 剂型名称
     */
    @ApiModelProperty(value = "剂型名称")
    private String dosageName;

    /**
     * 单位ID
     */
    @ApiModelProperty(value = "单位ID")
    private Long unitId;

    /**
     * 单位名称
     */
    @ApiModelProperty(value = "单位名称")
    private String unitName;

    /**
     * 商品规格
     */
    @ApiModelProperty(value = "商品规格")
    private String goodsSpecification;

    /**
     * 生产厂商ID
     */
    @ApiModelProperty(value = "生产厂商ID")
    private Long manufacturerId;

    /**
     * 生产厂商
     */
    @ApiModelProperty(value = "生产厂商")
    private String manufacturer;

    /**
     * 商品产地
     */
    @ApiModelProperty(value = "商品产地")
    private String goodsPlace;

    /**
     * 批准文号
     */
    @ApiModelProperty(value = "批准文号")
    private String approvalNumber;

    /**
     * 批号ID
     */
    @ApiModelProperty(value = "批号ID")
    private Long lotId;

    /**
     * 批号
     */
    @ApiModelProperty(value = "批号")
    private String lotNumber;

    /**
     * 生产日期
     */
    @ApiModelProperty(value = "生产日期")
    private Date productDate;

    /**
     * 有效期
     */
    @ApiModelProperty(value = "有效期")
    private Date validDate;

    /**
     * 数量
     */
    @ApiModelProperty(value = "数量")
    private BigDecimal quantity;

    /**
     * 单价
     */
    @ApiModelProperty(value = "单价")
    private BigDecimal unitPrice;

    /**
     * 行折扣（%）
     */
    @ApiModelProperty(value = "行折扣（%）")
    private BigDecimal lineDiscount;

    /**
     * 金额（整单优惠前金额）
     */
    @ApiModelProperty(value = "金额（整单优惠前金额）")
    private BigDecimal amount;

    /**
     * 整单折扣（%）
     */
    @ApiModelProperty(value = "整单折扣（%）")
    private BigDecimal wholeDiscount;

    /**
     * 行优惠（整单优惠分摊到行的金额）
     */
    @ApiModelProperty(value = "行优惠（整单优惠分摊到行的金额）")
    private BigDecimal lineDiscountAmount;

    /**
     * 实际单价（实际金额/数量）
     */
    @ApiModelProperty(value = "实际单价（实际金额/数量）")
    private BigDecimal realPrice;

    /**
     * 实际金额
     */
    @ApiModelProperty(value = "实际金额")
    private BigDecimal realAmount;

    /**
     * 税率ID
     */
    @ApiModelProperty(value = "税率ID")
    private Long taxRateId;

    /**
     * 税率
     */
    @ApiModelProperty(value = "税率")
    private BigDecimal taxRate;

    /**
     * 不含税实际单价
     */
    @ApiModelProperty(value = "不含税实际单价")
    private BigDecimal notaxRealPrice;

    /**
     * 不含税实际金额
     */
    @ApiModelProperty(value = "不含税实际金额")
    private BigDecimal notaxRealAmount;

    /**
     * 税额
     */
    @ApiModelProperty(value = "税额")
    private BigDecimal taxAmount;

    /**
     * 未清数量
     */
    @ApiModelProperty(value = "未清数量")
    private BigDecimal unclearQuantity;

    /**
     * 已清数量
     */
    @ApiModelProperty(value = "已清数量")
    private BigDecimal clearQuantity;

    /**
     * 行号
     */
    @ApiModelProperty(value = "行号")
    private Integer lineNum;

    /**
     * 状态
     */
    @ApiModelProperty(value = "状态")
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
     * saas_distr_in_return_detail
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
     * 配进退出单ID
     * @return in_return_id 配进退出单ID
     */
    public Long getInReturnId() {
        return inReturnId;
    }

    /**
     * 配进退出单ID
     * @param inReturnId 配进退出单ID
     */
    public void setInReturnId(Long inReturnId) {
        this.inReturnId = inReturnId;
    }

    /**
     * 单据（配进退出单）类型（5421）
     * @return order_type 单据（配进退出单）类型（5421）
     */
    public Integer getOrderType() {
        return orderType;
    }

    /**
     * 单据（配进退出单）类型（5421）
     * @param orderType 单据（配进退出单）类型（5421）
     */
    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    /**
     * 配进退出单号
     * @return in_return_code 配进退出单号
     */
    public String getInReturnCode() {
        return inReturnCode;
    }

    /**
     * 配进退出单号
     * @param inReturnCode 配进退出单号
     */
    public void setInReturnCode(String inReturnCode) {
        this.inReturnCode = inReturnCode == null ? null : inReturnCode.trim();
    }

    /**
     * 配进退出日期
     * @return in_return_date 配进退出日期
     */
    public Date getInReturnDate() {
        return inReturnDate;
    }

    /**
     * 配进退出日期
     * @param inReturnDate 配进退出日期
     */
    public void setInReturnDate(Date inReturnDate) {
        this.inReturnDate = inReturnDate;
    }

    /**
     * 基础单据明细ID
     * @return base_order_dtl_id 基础单据明细ID
     */
    public Long getBaseOrderDtlId() {
        return baseOrderDtlId;
    }

    /**
     * 基础单据明细ID
     * @param baseOrderDtlId 基础单据明细ID
     */
    public void setBaseOrderDtlId(Long baseOrderDtlId) {
        this.baseOrderDtlId = baseOrderDtlId;
    }

    /**
     * 基础单据ID
     * @return base_order_id 基础单据ID
     */
    public Long getBaseOrderId() {
        return baseOrderId;
    }

    /**
     * 基础单据ID
     * @param baseOrderId 基础单据ID
     */
    public void setBaseOrderId(Long baseOrderId) {
        this.baseOrderId = baseOrderId;
    }

    /**
     * 基础单据类型
     * @return base_order_type 基础单据类型
     */
    public Integer getBaseOrderType() {
        return baseOrderType;
    }

    /**
     * 基础单据类型
     * @param baseOrderType 基础单据类型
     */
    public void setBaseOrderType(Integer baseOrderType) {
        this.baseOrderType = baseOrderType;
    }

    /**
     * 基础单据编码
     * @return base_order_code 基础单据编码
     */
    public String getBaseOrderCode() {
        return baseOrderCode;
    }

    /**
     * 基础单据编码
     * @param baseOrderCode 基础单据编码
     */
    public void setBaseOrderCode(String baseOrderCode) {
        this.baseOrderCode = baseOrderCode == null ? null : baseOrderCode.trim();
    }

    /**
     * 基础单据日期
     * @return base_order_date 基础单据日期
     */
    public Date getBaseOrderDate() {
        return baseOrderDate;
    }

    /**
     * 基础单据日期
     * @param baseOrderDate 基础单据日期
     */
    public void setBaseOrderDate(Date baseOrderDate) {
        this.baseOrderDate = baseOrderDate;
    }

    /**
     * 商品ID
     * @return goods_id 商品ID
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * 商品ID
     * @param goodsId 商品ID
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 商品编码
     * @return goods_code 商品编码
     */
    public String getGoodsCode() {
        return goodsCode;
    }

    /**
     * 商品编码
     * @param goodsCode 商品编码
     */
    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode == null ? null : goodsCode.trim();
    }

    /**
     * 条形码
     * @return barcode 条形码
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * 条形码
     * @param barcode 条形码
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    /**
     * 商品名称
     * @return goods_name 商品名称
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * 商品名称
     * @param goodsName 商品名称
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * 商品通用名称
     * @return goods_generic_name 商品通用名称
     */
    public String getGoodsGenericName() {
        return goodsGenericName;
    }

    /**
     * 商品通用名称
     * @param goodsGenericName 商品通用名称
     */
    public void setGoodsGenericName(String goodsGenericName) {
        this.goodsGenericName = goodsGenericName == null ? null : goodsGenericName.trim();
    }

    /**
     * 剂型ID
     * @return dosage_id 剂型ID
     */
    public Long getDosageId() {
        return dosageId;
    }

    /**
     * 剂型ID
     * @param dosageId 剂型ID
     */
    public void setDosageId(Long dosageId) {
        this.dosageId = dosageId;
    }

    /**
     * 剂型名称
     * @return dosage_name 剂型名称
     */
    public String getDosageName() {
        return dosageName;
    }

    /**
     * 剂型名称
     * @param dosageName 剂型名称
     */
    public void setDosageName(String dosageName) {
        this.dosageName = dosageName == null ? null : dosageName.trim();
    }

    /**
     * 单位ID
     * @return unit_id 单位ID
     */
    public Long getUnitId() {
        return unitId;
    }

    /**
     * 单位ID
     * @param unitId 单位ID
     */
    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    /**
     * 单位名称
     * @return unit_name 单位名称
     */
    public String getUnitName() {
        return unitName;
    }

    /**
     * 单位名称
     * @param unitName 单位名称
     */
    public void setUnitName(String unitName) {
        this.unitName = unitName == null ? null : unitName.trim();
    }

    /**
     * 商品规格
     * @return goods_specification 商品规格
     */
    public String getGoodsSpecification() {
        return goodsSpecification;
    }

    /**
     * 商品规格
     * @param goodsSpecification 商品规格
     */
    public void setGoodsSpecification(String goodsSpecification) {
        this.goodsSpecification = goodsSpecification == null ? null : goodsSpecification.trim();
    }

    /**
     * 生产厂商ID
     * @return manufacturer_id 生产厂商ID
     */
    public Long getManufacturerId() {
        return manufacturerId;
    }

    /**
     * 生产厂商ID
     * @param manufacturerId 生产厂商ID
     */
    public void setManufacturerId(Long manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    /**
     * 生产厂商
     * @return manufacturer 生产厂商
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * 生产厂商
     * @param manufacturer 生产厂商
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    /**
     * 商品产地
     * @return goods_place 商品产地
     */
    public String getGoodsPlace() {
        return goodsPlace;
    }

    /**
     * 商品产地
     * @param goodsPlace 商品产地
     */
    public void setGoodsPlace(String goodsPlace) {
        this.goodsPlace = goodsPlace == null ? null : goodsPlace.trim();
    }

    /**
     * 批准文号
     * @return approval_number 批准文号
     */
    public String getApprovalNumber() {
        return approvalNumber;
    }

    /**
     * 批准文号
     * @param approvalNumber 批准文号
     */
    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber == null ? null : approvalNumber.trim();
    }

    /**
     * 批号ID
     * @return lot_id 批号ID
     */
    public Long getLotId() {
        return lotId;
    }

    /**
     * 批号ID
     * @param lotId 批号ID
     */
    public void setLotId(Long lotId) {
        this.lotId = lotId;
    }

    /**
     * 批号
     * @return lot_number 批号
     */
    public String getLotNumber() {
        return lotNumber;
    }

    /**
     * 批号
     * @param lotNumber 批号
     */
    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber == null ? null : lotNumber.trim();
    }

    /**
     * 生产日期
     * @return product_date 生产日期
     */
    public Date getProductDate() {
        return productDate;
    }

    /**
     * 生产日期
     * @param productDate 生产日期
     */
    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }

    /**
     * 有效期
     * @return valid_date 有效期
     */
    public Date getValidDate() {
        return validDate;
    }

    /**
     * 有效期
     * @param validDate 有效期
     */
    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }

    /**
     * 数量
     * @return quantity 数量
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * 数量
     * @param quantity 数量
     */
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    /**
     * 单价
     * @return unit_price 单价
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * 单价
     * @param unitPrice 单价
     */
    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * 行折扣（%）
     * @return line_discount 行折扣（%）
     */
    public BigDecimal getLineDiscount() {
        return lineDiscount;
    }

    /**
     * 行折扣（%）
     * @param lineDiscount 行折扣（%）
     */
    public void setLineDiscount(BigDecimal lineDiscount) {
        this.lineDiscount = lineDiscount;
    }

    /**
     * 金额（整单优惠前金额）
     * @return amount 金额（整单优惠前金额）
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 金额（整单优惠前金额）
     * @param amount 金额（整单优惠前金额）
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 整单折扣（%）
     * @return whole_discount 整单折扣（%）
     */
    public BigDecimal getWholeDiscount() {
        return wholeDiscount;
    }

    /**
     * 整单折扣（%）
     * @param wholeDiscount 整单折扣（%）
     */
    public void setWholeDiscount(BigDecimal wholeDiscount) {
        this.wholeDiscount = wholeDiscount;
    }

    /**
     * 行优惠（整单优惠分摊到行的金额）
     * @return line_discount_amount 行优惠（整单优惠分摊到行的金额）
     */
    public BigDecimal getLineDiscountAmount() {
        return lineDiscountAmount;
    }

    /**
     * 行优惠（整单优惠分摊到行的金额）
     * @param lineDiscountAmount 行优惠（整单优惠分摊到行的金额）
     */
    public void setLineDiscountAmount(BigDecimal lineDiscountAmount) {
        this.lineDiscountAmount = lineDiscountAmount;
    }

    /**
     * 实际单价（实际金额/数量）
     * @return real_price 实际单价（实际金额/数量）
     */
    public BigDecimal getRealPrice() {
        return realPrice;
    }

    /**
     * 实际单价（实际金额/数量）
     * @param realPrice 实际单价（实际金额/数量）
     */
    public void setRealPrice(BigDecimal realPrice) {
        this.realPrice = realPrice;
    }

    /**
     * 实际金额
     * @return real_amount 实际金额
     */
    public BigDecimal getRealAmount() {
        return realAmount;
    }

    /**
     * 实际金额
     * @param realAmount 实际金额
     */
    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    /**
     * 税率ID
     * @return tax_rate_id 税率ID
     */
    public Long getTaxRateId() {
        return taxRateId;
    }

    /**
     * 税率ID
     * @param taxRateId 税率ID
     */
    public void setTaxRateId(Long taxRateId) {
        this.taxRateId = taxRateId;
    }

    /**
     * 税率
     * @return tax_rate 税率
     */
    public BigDecimal getTaxRate() {
        return taxRate;
    }

    /**
     * 税率
     * @param taxRate 税率
     */
    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    /**
     * 不含税实际单价
     * @return notax_real_price 不含税实际单价
     */
    public BigDecimal getNotaxRealPrice() {
        return notaxRealPrice;
    }

    /**
     * 不含税实际单价
     * @param notaxRealPrice 不含税实际单价
     */
    public void setNotaxRealPrice(BigDecimal notaxRealPrice) {
        this.notaxRealPrice = notaxRealPrice;
    }

    /**
     * 不含税实际金额
     * @return notax_real_amount 不含税实际金额
     */
    public BigDecimal getNotaxRealAmount() {
        return notaxRealAmount;
    }

    /**
     * 不含税实际金额
     * @param notaxRealAmount 不含税实际金额
     */
    public void setNotaxRealAmount(BigDecimal notaxRealAmount) {
        this.notaxRealAmount = notaxRealAmount;
    }

    /**
     * 税额
     * @return tax_amount 税额
     */
    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    /**
     * 税额
     * @param taxAmount 税额
     */
    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    /**
     * 未清数量
     * @return unclear_quantity 未清数量
     */
    public BigDecimal getUnclearQuantity() {
        return unclearQuantity;
    }

    /**
     * 未清数量
     * @param unclearQuantity 未清数量
     */
    public void setUnclearQuantity(BigDecimal unclearQuantity) {
        this.unclearQuantity = unclearQuantity;
    }

    /**
     * 已清数量
     * @return clear_quantity 已清数量
     */
    public BigDecimal getClearQuantity() {
        return clearQuantity;
    }

    /**
     * 已清数量
     * @param clearQuantity 已清数量
     */
    public void setClearQuantity(BigDecimal clearQuantity) {
        this.clearQuantity = clearQuantity;
    }

    /**
     * 行号
     * @return line_num 行号
     */
    public Integer getLineNum() {
        return lineNum;
    }

    /**
     * 行号
     * @param lineNum 行号
     */
    public void setLineNum(Integer lineNum) {
        this.lineNum = lineNum;
    }

    /**
     * 状态
     * @return status 状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态
     * @param status 状态
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
        sb.append(", inReturnId=").append(inReturnId);
        sb.append(", orderType=").append(orderType);
        sb.append(", inReturnCode=").append(inReturnCode);
        sb.append(", inReturnDate=").append(inReturnDate);
        sb.append(", baseOrderDtlId=").append(baseOrderDtlId);
        sb.append(", baseOrderId=").append(baseOrderId);
        sb.append(", baseOrderType=").append(baseOrderType);
        sb.append(", baseOrderCode=").append(baseOrderCode);
        sb.append(", baseOrderDate=").append(baseOrderDate);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsCode=").append(goodsCode);
        sb.append(", barcode=").append(barcode);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsGenericName=").append(goodsGenericName);
        sb.append(", dosageId=").append(dosageId);
        sb.append(", dosageName=").append(dosageName);
        sb.append(", unitId=").append(unitId);
        sb.append(", unitName=").append(unitName);
        sb.append(", goodsSpecification=").append(goodsSpecification);
        sb.append(", manufacturerId=").append(manufacturerId);
        sb.append(", manufacturer=").append(manufacturer);
        sb.append(", goodsPlace=").append(goodsPlace);
        sb.append(", approvalNumber=").append(approvalNumber);
        sb.append(", lotId=").append(lotId);
        sb.append(", lotNumber=").append(lotNumber);
        sb.append(", productDate=").append(productDate);
        sb.append(", validDate=").append(validDate);
        sb.append(", quantity=").append(quantity);
        sb.append(", unitPrice=").append(unitPrice);
        sb.append(", lineDiscount=").append(lineDiscount);
        sb.append(", amount=").append(amount);
        sb.append(", wholeDiscount=").append(wholeDiscount);
        sb.append(", lineDiscountAmount=").append(lineDiscountAmount);
        sb.append(", realPrice=").append(realPrice);
        sb.append(", realAmount=").append(realAmount);
        sb.append(", taxRateId=").append(taxRateId);
        sb.append(", taxRate=").append(taxRate);
        sb.append(", notaxRealPrice=").append(notaxRealPrice);
        sb.append(", notaxRealAmount=").append(notaxRealAmount);
        sb.append(", taxAmount=").append(taxAmount);
        sb.append(", unclearQuantity=").append(unclearQuantity);
        sb.append(", clearQuantity=").append(clearQuantity);
        sb.append(", lineNum=").append(lineNum);
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