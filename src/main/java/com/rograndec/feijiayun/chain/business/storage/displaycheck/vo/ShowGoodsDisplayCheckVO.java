package com.rograndec.feijiayun.chain.business.storage.displaycheck.vo;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * saas_goods_display_check
 * 
 * 
 * @author Asze
 * 
 * 2017-09-26
 */
public class ShowGoodsDisplayCheckVO implements Serializable {
    /**
     * 细单ID集合
     */
    @ApiModelProperty(value = "细单ID集合")
    private String ids;

    /**
     * 检查日期
     */
    @ApiModelProperty(value = "检查日期")
    private Date checkDate;

    /**
     * 检查单号
     */
    @ApiModelProperty(value = "检查单号")
    private String code;

    /**
     * 检查人员ID
     */
    @ApiModelProperty(value = "检查人员ID")
    private Long checkerId;

    /**
     * 检查人员编码
     */
    @ApiModelProperty(value = "检查人员编码")
    private String checkerCode;

    /**
     * 检查人员名称
     */
    @ApiModelProperty(value = "检查人员名称")
    private String checkerName;

    /**
     * 库区ID
     */
    @ApiModelProperty(value = "库区ID")
    private Long warehouseAreaId;

    /**
     * 库区名称
     */
    @ApiModelProperty(value = "库区名称")
    private String warehouseAreaName;

    /**
     * 养护类型（0-重点养护；1-常规养护）
     */
    @ApiModelProperty(value = "养护类型（0-重点养护；1-常规养护）")
    private Integer maintanceType;

    /**
     * 养护类型名
     */
    @ApiModelProperty(value = "养护类型名")
    private String maintanceTypeName;

    /**
     * 药品类型（0-成药；1-中药饮片；2-拆零药品；3-近效期药品）
     */
    @ApiModelProperty(value = "药品类型（0-成药；1-中药饮片；2-拆零药品；3-近效期药品）")
    private Integer goodsType;

    /**
     * 药品类型名
     */
    @ApiModelProperty(value = "药品类型（0-成药；1-中药饮片；2-拆零药品；3-近效期药品）")
    private String goodsTypeName;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String remark;

    /**
     * saas_goods_display_check
     */
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     * @return ids 主键ID
     */
    public String getIds() {
        return ids;
    }

    /**
     * 主键ID
     * @param ids 主键ID
     */
    public void setIds(String ids) {
        this.ids = ids;
    }

    /**
     * 检查日期
     * @return check_date 检查日期
     */
    public Date getCheckDate() {
        return checkDate;
    }

    /**
     * 检查日期
     * @param checkDate 检查日期
     */
    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    /**
     * 检查单号
     * @return code 检查单号
     */
    public String getCode() {
        return code;
    }

    /**
     * 检查单号
     * @param code 检查单号
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 检查人员ID
     * @return checker_id 检查人员ID
     */
    public Long getCheckerId() {
        return checkerId;
    }

    /**
     * 检查人员ID
     * @param checkerId 检查人员ID
     */
    public void setCheckerId(Long checkerId) {
        this.checkerId = checkerId;
    }

    /**
     * 检查人员编码
     * @return checker_code 检查人员编码
     */
    public String getCheckerCode() {
        return checkerCode;
    }

    /**
     * 检查人员编码
     * @param checkerCode 检查人员编码
     */
    public void setCheckerCode(String checkerCode) {
        this.checkerCode = checkerCode == null ? null : checkerCode.trim();
    }

    /**
     * 检查人员名称
     * @return checker_name 检查人员名称
     */
    public String getCheckerName() {
        return checkerName;
    }

    /**
     * 检查人员名称
     * @param checkerName 检查人员名称
     */
    public void setCheckerName(String checkerName) {
        this.checkerName = checkerName == null ? null : checkerName.trim();
    }

    /**
     * 库区ID
     * @return warehouse_area_id 库区ID
     */
    public Long getWarehouseAreaId() {
        return warehouseAreaId;
    }

    /**
     * 库区ID
     * @param warehouseAreaId 库区ID
     */
    public void setWarehouseAreaId(Long warehouseAreaId) {
        this.warehouseAreaId = warehouseAreaId;
    }

    /**
     * 库区名称
     * @return warehouse_area_name 库区名称
     */
    public String getWarehouseAreaName() {
        return warehouseAreaName;
    }

    /**
     * 库区名称
     * @param warehouseAreaName 库区名称
     */
    public void setWarehouseAreaName(String warehouseAreaName) {
        this.warehouseAreaName = warehouseAreaName == null ? null : warehouseAreaName.trim();
    }

    /**
     * 养护类型（0-重点养护；1-常规养护）
     * @return maintance_type 养护类型（0-重点养护；1-常规养护）
     */
    public Integer getMaintanceType() {
        return maintanceType;
    }

    /**
     * 养护类型（0-重点养护；1-常规养护）
     * @param maintanceType 养护类型（0-重点养护；1-常规养护）
     */
    public void setMaintanceType(Integer maintanceType) {
        this.maintanceType = maintanceType;
    }

    /**
     * 药品类型（0-成药；1-中药饮片；2-拆零药品；3-近效期药品）
     * @return goods_type 药品类型（0-成药；1-中药饮片；2-拆零药品；3-近效期药品）
     */
    public Integer getGoodsType() {
        return goodsType;
    }

    /**
     * 药品类型（0-成药；1-中药饮片；2-拆零药品；3-近效期药品）
     * @param goodsType 药品类型（0-成药；1-中药饮片；2-拆零药品；3-近效期药品）
     */
    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
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

    public String getMaintanceTypeName() {
        return maintanceTypeName;
    }

    public void setMaintanceTypeName(String maintanceTypeName) {
        this.maintanceTypeName = maintanceTypeName;
    }

    public String getGoodsTypeName() {
        return goodsTypeName;
    }

    public void setGoodsTypeName(String goodsTypeName) {
        this.goodsTypeName = goodsTypeName;
    }

    /**
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        return "ShowGoodsDisplayCheckVO{" +
                "ids='" + ids + '\'' +
                ", checkDate=" + checkDate +
                ", code='" + code + '\'' +
                ", checkerId=" + checkerId +
                ", checkerCode='" + checkerCode + '\'' +
                ", checkerName='" + checkerName + '\'' +
                ", warehouseAreaId=" + warehouseAreaId +
                ", warehouseAreaName='" + warehouseAreaName + '\'' +
                ", maintanceType=" + maintanceType +
                ", maintanceTypeName='" + maintanceTypeName + '\'' +
                ", goodsType=" + goodsType +
                ", goodsTypeName='" + goodsTypeName + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}