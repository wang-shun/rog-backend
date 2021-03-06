package com.rograndec.feijiayun.chain.business.report.retail.vo.excesssale;

import com.rograndec.feijiayun.chain.business.storage.move.entity.OtherInDetail;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OtherInDetailVO implements Serializable{

    /**
     * 商品ID
     */
    @ApiModelProperty(value = "商品ID" ,required = true)
    private Long goodsId;
    /**
     * 商品编码
     */
    @ApiModelProperty(value = "商品编码" )
    private String goodsCode;

    @ApiModelProperty(value="条形码")
    private String barcode;

    @ApiModelProperty(value = "商品名称")
    private String goodsName;

    /**
     * 商品通用名称
     */
    @ApiModelProperty(value = "商品通用名称")
    private String goodsGenericName;

    @ApiModelProperty(value = "剂型ID")
    private Long dosageId;

    /**
     * 剂型名称
     */
    @ApiModelProperty(value = "剂型名称")
    private String dosageName;

    /**
     * 商品规格
     */
    @ApiModelProperty(value = "商品规格")
    private String goodsSpecification;

    @ApiModelProperty(value="单位ID" )
    private Long unitId;

    /**
     * 单位名称
     */
    @ApiModelProperty(value = "单位名称")
    private String unitName;

    @ApiModelProperty(value = "生产厂商ID")
    private Long manufacturerId;

    /**
     * 生产厂商
     */
    @ApiModelProperty(value = "生产厂商")
    private String manufacturer;

    /**
     * 产地
     */
    @ApiModelProperty(value = "产地")
    private String goodsPlace;

    @ApiModelProperty(value="批准文号")
    private String approvalNumber;

    /**
     * 批号ID
     */
    @ApiModelProperty(value = "批号ID" ,required = true)
    private Long lotId;

    /**
     * 批号
     */
    @ApiModelProperty(value = "批号" ,required = true)
    private String lotNumber;

    /**
     * 生产日期
     */
    @ApiModelProperty(value = "生产日期" ,required = true)
    private Date productDate;

    /**
     * 有效期
     */
    @ApiModelProperty(value = "有效期" ,required = true)
    private Date validDate;

    /**
     * 源货位ID
     */
    @ApiModelProperty(value = "货位ID" ,required = true)
    private Long shelfId;

    /**
     * 源货位名称
     */
    @ApiModelProperty(value = "货位名称")
    private String shelfName;

    /**
     * 源货位质量状况
     */
    @ApiModelProperty(value = "货位质量状况")
    private String shelfStatusDesc;

    /**
     * 数量
     */
    @ApiModelProperty(value = "数量" ,required = true)
    private BigDecimal quantity;

    /**
     * 单价
     */
    @ApiModelProperty(value = "单价" ,required = true)
    private BigDecimal unitPrice;

    /**
     * 金额
     */
    @ApiModelProperty(value = "金额" ,required = true)
    private BigDecimal amount;

    /**
     * 进项税ID
     */
    @ApiModelProperty(value = "进项税ID" ,required = true)
    private Long taxRateId;

    /**
     * 进项税
     */
    @ApiModelProperty(value = "进项税")
    private BigDecimal taxRate;

    /**
     * 不含税单价
     */
    @ApiModelProperty(value = "不含税单价" )
    private BigDecimal notaxPrice;

    /**
     * 不含税金额
     */
    @ApiModelProperty(value = "不含税金额" )
    private BigDecimal notaxAmount;

    /**
     * 税额
     */
    @ApiModelProperty(value = "税额" )
    private BigDecimal taxAmount;

    /**
     * 行号
     */
    @ApiModelProperty(value = "行号" ,required = true)
    private Integer lineNum;
    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String remark;

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsGenericName() {
        return goodsGenericName;
    }

    public void setGoodsGenericName(String goodsGenericName) {
        this.goodsGenericName = goodsGenericName;
    }

    public Long getDosageId() {
        return dosageId;
    }

    public void setDosageId(Long dosageId) {
        this.dosageId = dosageId;
    }

    public String getDosageName() {
        return dosageName;
    }

    public void setDosageName(String dosageName) {
        this.dosageName = dosageName;
    }

    public String getGoodsSpecification() {
        return goodsSpecification;
    }

    public void setGoodsSpecification(String goodsSpecification) {
        this.goodsSpecification = goodsSpecification;
    }

    public Long getUnitId() {
        return unitId;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public Long getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(Long manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getGoodsPlace() {
        return goodsPlace;
    }

    public void setGoodsPlace(String goodsPlace) {
        this.goodsPlace = goodsPlace;
    }

    public String getApprovalNumber() {
        return approvalNumber;
    }

    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber;
    }

    public Long getLotId() {
        return lotId;
    }

    public void setLotId(Long lotId) {
        this.lotId = lotId;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    public Date getProductDate() {
        return productDate;
    }

    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }

    public Date getValidDate() {
        return validDate;
    }

    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }

    public Long getShelfId() {
        return shelfId;
    }

    public void setShelfId(Long shelfId) {
        this.shelfId = shelfId;
    }

    public String getShelfName() {
        return shelfName;
    }

    public void setShelfName(String shelfName) {
        this.shelfName = shelfName;
    }

    public String getShelfStatusDesc() {
        return shelfStatusDesc;
    }

    public void setShelfStatusDesc(String shelfStatusDesc) {
        this.shelfStatusDesc = shelfStatusDesc;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Long getTaxRateId() {
        return taxRateId;
    }

    public void setTaxRateId(Long taxRateId) {
        this.taxRateId = taxRateId;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public BigDecimal getNotaxPrice() {
        return notaxPrice;
    }

    public void setNotaxPrice(BigDecimal notaxPrice) {
        this.notaxPrice = notaxPrice;
    }

    public BigDecimal getNotaxAmount() {
        return notaxAmount;
    }

    public void setNotaxAmount(BigDecimal notaxAmount) {
        this.notaxAmount = notaxAmount;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public Integer getLineNum() {
        return lineNum;
    }

    public void setLineNum(Integer lineNum) {
        this.lineNum = lineNum;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "OtherInDetailVO{" +
                "goodsId=" + goodsId +
                ", goodsCode='" + goodsCode + '\'' +
                ", barcode='" + barcode + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", goodsGenericName='" + goodsGenericName + '\'' +
                ", dosageId=" + dosageId +
                ", dosageName='" + dosageName + '\'' +
                ", goodsSpecification='" + goodsSpecification + '\'' +
                ", unitId=" + unitId +
                ", unitName='" + unitName + '\'' +
                ", manufacturerId=" + manufacturerId +
                ", manufacturer='" + manufacturer + '\'' +
                ", goodsPlace='" + goodsPlace + '\'' +
                ", approvalNumber='" + approvalNumber + '\'' +
                ", lotId=" + lotId +
                ", lotNumber='" + lotNumber + '\'' +
                ", productDate=" + productDate +
                ", validDate=" + validDate +
                ", shelfId=" + shelfId +
                ", shelfName='" + shelfName + '\'' +
                ", shelfStatusDesc='" + shelfStatusDesc + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", amount=" + amount +
                ", taxRateId=" + taxRateId +
                ", taxRate=" + taxRate +
                ", notaxPrice=" + notaxPrice +
                ", notaxAmount=" + notaxAmount +
                ", taxAmount=" + taxAmount +
                ", lineNum=" + lineNum +
                ", remark='" + remark + '\'' +
                '}';
    }

    public static OtherInDetailVO converToVO(OtherInDetail o) {
        OtherInDetailVO vo = new OtherInDetailVO();
        vo.setGoodsId(o.getGoodsId());
        vo.setGoodsCode(o.getGoodsCode());
        vo.setBarcode(o.getBarcode());
        vo.setGoodsName(o.getGoodsName());
        vo.setGoodsGenericName(o.getGoodsGenericName());
        vo.setDosageId(o.getDosageId());
        vo.setDosageName(o.getDosageName());
        vo.setGoodsSpecification(o.getGoodsSpecification());
        vo.setUnitId(o.getUnitId());
        vo.setUnitName(o.getUnitName());
        vo.setManufacturerId(o.getManufacturerId());
        vo.setManufacturer(o.getManufacturer());
        vo.setGoodsPlace(o.getGoodsPlace());
        vo.setApprovalNumber(o.getApprovalNumber());
        vo.setLotNumber(o.getLotNumber());
        vo.setProductDate(o.getProductDate());
        vo.setValidDate(o.getValidDate());
        vo.setShelfId(o.getShelfId());
        vo.setShelfName(o.getShelfName());
        vo.setShelfStatusDesc(o.getShelfStatusDesc());
        vo.setQuantity(o.getQuantity());
        vo.setUnitPrice(o.getUnitPrice());
        vo.setAmount(o.getAmount());
        vo.setTaxRateId(o.getTaxRateId());
        vo.setTaxRate(o.getTaxRate());
        vo.setNotaxPrice(o.getNotaxPrice());
        vo.setNotaxAmount(o.getNotaxAmount());
        vo.setTaxAmount(o.getTaxAmount());
        vo.setLineNum(o.getLineNum());
        vo.setRemark(o.getRemark());
        return vo;
    }

}
