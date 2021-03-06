package com.rograndec.feijiayun.chain.business.report.quality.purchase.vo.supplier;

import com.rograndec.feijiayun.chain.common.constant.Nature;
import com.rograndec.feijiayun.chain.utils.date.DateStyle;
import com.rograndec.feijiayun.chain.utils.date.DateUtils;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class SupplierQualificationReport2ExcelVO implements Serializable {
    /**
     * 主键ID
     */
    @ApiModelProperty(value = "主键ID")
    private Long id;

    /**
     * 编码
     */
    @ApiModelProperty(value = "编码")
    private String code;

    /**
     * 名称
     */
    @ApiModelProperty(value = "名称")
    private String name;

    /**
     * 性质（0-批发企业；1-生产企业）
     */
    @ApiModelProperty(value = "性质（0-批发企业；1-生产企业）")
    private Integer nature;

    @ApiModelProperty(value = "性质（0-批发企业；1-生产企业）")
    private String natureName;


    @ApiModelProperty(value = "企业资质名称")
    private String qualificationName;

    @ApiModelProperty(value = "企业资质编码")
    private String qualificationCode;

    private Date validDate;
    @ApiModelProperty(value = "有效期至")
    private String validDateString;

    @ApiModelProperty(value = "附件id")
    private String fileId;

    /**
     * 预警内容
     */
    @ApiModelProperty(value = "预警内容")
    private String warnContent;

    /**
     * 预警信息
     */
    @ApiModelProperty(value = "预警信息")
    private String warnInfo;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNature() {
        return nature;
    }

    public void setNature(Integer nature) {
        this.nature = nature;
    }

    public String getNatureName() {
        return Nature.getName(nature);
    }

    public void setNatureName(String natureName) {
        this.natureName = natureName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQualificationName() {
        return qualificationName;
    }

    public void setQualificationName(String qualificationName) {
        this.qualificationName = qualificationName;
    }

    public String getQualificationCode() {
        return qualificationCode;
    }

    public void setQualificationCode(String qualificationCode) {
        this.qualificationCode = qualificationCode;
    }

    public Date getValidDate() {
        return validDate;
    }

    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }

    public String getValidDateString() {
        return DateUtils.DateToString(validDate, DateStyle.YYYY_MM_DD_HH_MM_SS);
    }

    public void setValidDateString(String validDateString) {
        this.validDateString = validDateString;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }



    public String getWarnContent() {
        return warnContent;
    }

    public void setWarnContent(String warnContent) {
        this.warnContent = warnContent;
    }

    public String getWarnInfo() {
        return warnInfo;
    }

    public void setWarnInfo(String warnInfo) {
        this.warnInfo = warnInfo;
    }
}