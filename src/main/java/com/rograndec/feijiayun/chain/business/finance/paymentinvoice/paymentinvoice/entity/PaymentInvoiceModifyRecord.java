package com.rograndec.feijiayun.chain.business.finance.paymentinvoice.paymentinvoice.entity;

import com.rograndec.feijiayun.chain.business.finance.paymentinvoice.paymentinvoice.vo.PaymentInvoiceSaveVO;
import com.rograndec.feijiayun.chain.common.vo.UserVO;
import com.rograndec.feijiayun.chain.utils.date.DateUtils;
import com.rograndec.feijiayun.chain.utils.user.UserEnterpriseUtils;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.util.StringUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
 
/**
 * 
 * saas_payment_invoice_modify_record
 * 
 * 
 * @author lizhongyi
 * 
 * 2018-01-05
 */
public class PaymentInvoiceModifyRecord implements Serializable {
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
     * 表名
     */
    @ApiModelProperty(value = "表名")
    private String tableName;

    /**
     * 主键ID
     */
    @ApiModelProperty(value = "主键ID")
    private Long keyId;

    /**
     * 修改字段英文名称
     */
    @ApiModelProperty(value = "修改字段英文名称")
    private String columnEnName;

    /**
     * 修改字段中文名称（修改项目）
     */
    @ApiModelProperty(value = "修改字段中文名称（修改项目）")
    private String columnChName;

    /**
     * 原内容
     */
    @ApiModelProperty(value = "原内容")
    private String oldContent;

    /**
     * 新内容
     */
    @ApiModelProperty(value = "新内容")
    private String newContent;

    /**
     * 修改原因
     */
    @ApiModelProperty(value = "修改原因")
    private String reason;

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
     * 修改人ID
     */
    @ApiModelProperty(value = "修改人ID")
    private Long modifierId;

    /**
     * 修改人编码
     */
    @ApiModelProperty(value = "修改人编码")
    private String modifierCode;

    /**
     * 修改人名称
     */
    @ApiModelProperty(value = "修改人名称")
    private String modifierName;

    /**
     * 修改时间
     */
    @ApiModelProperty(value = "修改时间")
    private Date updateTime;


    public static List<PaymentInvoiceModifyRecord> generatePaymentInvoiceModifyRecords(UserVO userVO, PaymentInvoice oldPaymentInvoice, PaymentInvoice newPaymentInvoice, PaymentInvoiceSaveVO paymentInvoiceSaveVO) throws Exception {

        PaymentInvoiceModifyRecord prepayInvoiceBillDateModifyRecord = generatePaymentInvoiceBillDateModifyRecord( userVO,  oldPaymentInvoice,  newPaymentInvoice,  paymentInvoiceSaveVO);
        PaymentInvoiceModifyRecord prepayInvoiceBillManIdModifyRecord = generatePaymentInvoiceBillManIdModifyRecord( userVO,  oldPaymentInvoice,  newPaymentInvoice,  paymentInvoiceSaveVO);
        PaymentInvoiceModifyRecord prepayInvoiceBillManCodeModifyRecord = generatePaymentInvoiceBillManCodeModifyRecord( userVO,  oldPaymentInvoice,  newPaymentInvoice,  paymentInvoiceSaveVO);
        PaymentInvoiceModifyRecord prepayInvoiceBillManNameModifyRecord = generatePaymentInvoiceBillManNameModifyRecord( userVO,  oldPaymentInvoice,  newPaymentInvoice,  paymentInvoiceSaveVO);
        PaymentInvoiceModifyRecord prepayInvoiceRemarkodifyRecord = generatePaymentInvoiceRemarkodifyRecord( userVO,  oldPaymentInvoice,  newPaymentInvoice,  paymentInvoiceSaveVO);

        List<PaymentInvoiceModifyRecord> prepayInvoiceModifyRecords = new ArrayList<>();

        if(null != prepayInvoiceBillDateModifyRecord)
            prepayInvoiceModifyRecords.add(prepayInvoiceBillDateModifyRecord);

        if(null != prepayInvoiceBillManIdModifyRecord)
            prepayInvoiceModifyRecords.add(prepayInvoiceBillManIdModifyRecord);

        if(null != prepayInvoiceBillManCodeModifyRecord)
            prepayInvoiceModifyRecords.add(prepayInvoiceBillManCodeModifyRecord);

        if(null != prepayInvoiceBillManNameModifyRecord)
            prepayInvoiceModifyRecords.add(prepayInvoiceBillManNameModifyRecord);

        if(null != prepayInvoiceRemarkodifyRecord)
            prepayInvoiceModifyRecords.add(prepayInvoiceRemarkodifyRecord);

        return prepayInvoiceModifyRecords;
    }

    public static PaymentInvoiceModifyRecord generatePaymentInvoiceRemarkodifyRecord(UserVO userVO, PaymentInvoice oldPaymentInvoice, PaymentInvoice newPaymentInvoice, PaymentInvoiceSaveVO paymentInvoiceSaveVO) throws Exception {

        String oldRemark = StringUtils.isEmpty(oldPaymentInvoice.getRemark()) ? "" : oldPaymentInvoice.getRemark();
        String newRemark = StringUtils.isEmpty(newPaymentInvoice.getRemark()) ? "" : newPaymentInvoice.getRemark();



        if(oldRemark.equals(newRemark)){

            return null;
        }

        PaymentInvoiceModifyRecord prepayInvoiceModifyRecord = new PaymentInvoiceModifyRecord();
        /**
         * 企业ID
         */
        prepayInvoiceModifyRecord.setEnterpriseId(userVO.getEnterpriseId());

        /**
         * 上级企业ID
         */
        prepayInvoiceModifyRecord.setParentId(userVO.getParentId());

        /**
         * 表名
         */
        prepayInvoiceModifyRecord.setTableName("saas_payment_invoice");

        /**
         * 主键ID
         */
        prepayInvoiceModifyRecord.setKeyId(oldPaymentInvoice.getId());

        /**
         * 修改字段英文名称
         */
        prepayInvoiceModifyRecord.setColumnEnName("remark");

        /**
         * 修改字段中文名称（修改项目）
         */
        prepayInvoiceModifyRecord.setColumnChName("备注");

        /**
         * 原内容
         */
        prepayInvoiceModifyRecord.setOldContent(oldPaymentInvoice.getRemark());

        /**
         * 新内容
         */
        prepayInvoiceModifyRecord.setNewContent(newPaymentInvoice.getRemark());

        /**
         * 修改原因
         */
        prepayInvoiceModifyRecord.setReason(paymentInvoiceSaveVO.getRemark());

        /**
         * 备注
         */
        prepayInvoiceModifyRecord.setRemark(paymentInvoiceSaveVO.getRemark());

        UserEnterpriseUtils.setUserCreateOrModify(prepayInvoiceModifyRecord,userVO,true);

        return prepayInvoiceModifyRecord;

    }

    public static PaymentInvoiceModifyRecord generatePaymentInvoiceBillManNameModifyRecord(UserVO userVO, PaymentInvoice oldPaymentInvoice, PaymentInvoice newPaymentInvoice, PaymentInvoiceSaveVO paymentInvoiceSaveVO) throws Exception {

        String oldName = StringUtils.isEmpty(oldPaymentInvoice.getBillManName()) ? "" : oldPaymentInvoice.getBillManName();
        String newname = StringUtils.isEmpty(newPaymentInvoice.getBillManName()) ? "" : newPaymentInvoice.getBillManName();



        if(oldName.equals(newname)){

            return null;
        }

        PaymentInvoiceModifyRecord prepayInvoiceModifyRecord = new PaymentInvoiceModifyRecord();
        /**
         * 企业ID
         */
        prepayInvoiceModifyRecord.setEnterpriseId(userVO.getEnterpriseId());

        /**
         * 上级企业ID
         */
        prepayInvoiceModifyRecord.setParentId(userVO.getParentId());

        /**
         * 表名
         */
        prepayInvoiceModifyRecord.setTableName("saas_payment_invoice");

        /**
         * 主键ID
         */
        prepayInvoiceModifyRecord.setKeyId(oldPaymentInvoice.getId());

        /**
         * 修改字段英文名称
         */
        prepayInvoiceModifyRecord.setColumnEnName("bill_man_name");

        /**
         * 修改字段中文名称（修改项目）
         */
        prepayInvoiceModifyRecord.setColumnChName("开票人员名称");

        /**
         * 原内容
         */
        prepayInvoiceModifyRecord.setOldContent(oldPaymentInvoice.getBillManName());

        /**
         * 新内容
         */
        prepayInvoiceModifyRecord.setNewContent(newPaymentInvoice.getBillManName());

        /**
         * 修改原因
         */
        prepayInvoiceModifyRecord.setReason(paymentInvoiceSaveVO.getRemark());

        /**
         * 备注
         */
        prepayInvoiceModifyRecord.setRemark(paymentInvoiceSaveVO.getRemark());

        UserEnterpriseUtils.setUserCreateOrModify(prepayInvoiceModifyRecord,userVO,true);

        return prepayInvoiceModifyRecord;

    }

    public static PaymentInvoiceModifyRecord generatePaymentInvoiceBillManCodeModifyRecord(UserVO userVO, PaymentInvoice oldPaymentInvoice, PaymentInvoice newPaymentInvoice, PaymentInvoiceSaveVO paymentInvoiceSaveVO) throws Exception {

        String oldCode = StringUtils.isEmpty(oldPaymentInvoice.getBillManCode()) ? "" : oldPaymentInvoice.getBillManCode();
        String newCode = StringUtils.isEmpty(newPaymentInvoice.getBillManCode()) ? "" : newPaymentInvoice.getBillManCode();



        if(oldCode.equals(newCode)){

            return null;
        }

        PaymentInvoiceModifyRecord prepayInvoiceModifyRecord = new PaymentInvoiceModifyRecord();
        /**
         * 企业ID
         */
        prepayInvoiceModifyRecord.setEnterpriseId(userVO.getEnterpriseId());

        /**
         * 上级企业ID
         */
        prepayInvoiceModifyRecord.setParentId(userVO.getParentId());

        /**
         * 表名
         */
        prepayInvoiceModifyRecord.setTableName("saas_payment_invoice");

        /**
         * 主键ID
         */
        prepayInvoiceModifyRecord.setKeyId(oldPaymentInvoice.getId());

        /**
         * 修改字段英文名称
         */
        prepayInvoiceModifyRecord.setColumnEnName("bill_man_code");

        /**
         * 修改字段中文名称（修改项目）
         */
        prepayInvoiceModifyRecord.setColumnChName("开票人员编码");

        /**
         * 原内容
         */
        prepayInvoiceModifyRecord.setOldContent(oldPaymentInvoice.getBillManCode());

        /**
         * 新内容
         */
        prepayInvoiceModifyRecord.setNewContent(newPaymentInvoice.getBillManCode().toString());

        /**
         * 修改原因
         */
        prepayInvoiceModifyRecord.setReason(paymentInvoiceSaveVO.getRemark());

        /**
         * 备注
         */
        prepayInvoiceModifyRecord.setRemark(paymentInvoiceSaveVO.getRemark());

        UserEnterpriseUtils.setUserCreateOrModify(prepayInvoiceModifyRecord,userVO,true);

        return prepayInvoiceModifyRecord;

    }

    public static PaymentInvoiceModifyRecord generatePaymentInvoiceBillManIdModifyRecord(UserVO userVO, PaymentInvoice oldPaymentInvoice, PaymentInvoice newPaymentInvoice, PaymentInvoiceSaveVO paymentInvoiceSaveVO) throws Exception {

        String oldId = StringUtils.isEmpty(oldPaymentInvoice.getBillManId()) ? "" : oldPaymentInvoice.getBillManId().toString();
        String newId = StringUtils.isEmpty(newPaymentInvoice.getBillManId()) ? "" : newPaymentInvoice.getBillManId().toString();

        if(oldId.equals(newId)){

            return null;
        }

        PaymentInvoiceModifyRecord paymentInvoiceModifyRecord = new PaymentInvoiceModifyRecord();
        /**
         * 企业ID
         */
        paymentInvoiceModifyRecord.setEnterpriseId(userVO.getEnterpriseId());

        /**
         * 上级企业ID
         */
        paymentInvoiceModifyRecord.setParentId(userVO.getParentId());

        /**
         * 表名
         */
        paymentInvoiceModifyRecord.setTableName("saas_payment_invoice");

        /**
         * 主键ID
         */
        paymentInvoiceModifyRecord.setKeyId(oldPaymentInvoice.getId());

        /**
         * 修改字段英文名称
         */
        paymentInvoiceModifyRecord.setColumnEnName("bill_man_id");

        /**
         * 修改字段中文名称（修改项目）
         */
        paymentInvoiceModifyRecord.setColumnChName("开票人员id");

        /**
         * 原内容
         */
        paymentInvoiceModifyRecord.setOldContent(oldPaymentInvoice.getBillManId().toString());

        /**
         * 新内容
         */
        paymentInvoiceModifyRecord.setNewContent(newPaymentInvoice.getBillManId().toString());

        /**
         * 修改原因
         */
        paymentInvoiceModifyRecord.setReason(paymentInvoiceSaveVO.getRemark());

        /**
         * 备注
         */
        paymentInvoiceModifyRecord.setRemark(paymentInvoiceSaveVO.getRemark());

        UserEnterpriseUtils.setUserCreateOrModify(paymentInvoiceModifyRecord,userVO,true);

        return paymentInvoiceModifyRecord;

    }


    public static PaymentInvoiceModifyRecord generatePaymentInvoiceBillDateModifyRecord(UserVO userVO, PaymentInvoice oldPaymentInvoice, PaymentInvoice newPaymentInvoice, PaymentInvoiceSaveVO paymentInvoiceSaveVO) throws Exception {

        String oldDate = StringUtils.isEmpty(oldPaymentInvoice.getBillDate()) ? "" : DateUtils.DateToString(oldPaymentInvoice.getBillDate(), DateUtils.FMT_DATE);
        String newDate = StringUtils.isEmpty(newPaymentInvoice.getBillDate()) ? "" : DateUtils.DateToString(newPaymentInvoice.getBillDate(), DateUtils.FMT_DATE);

        if(oldDate.equals(newDate)){

            return null;
        }

        PaymentInvoiceModifyRecord prepayInvoiceModifyRecord = new PaymentInvoiceModifyRecord();
        /**
         * 企业ID
         */
        prepayInvoiceModifyRecord.setEnterpriseId(userVO.getEnterpriseId());

        /**
         * 上级企业ID
         */
        prepayInvoiceModifyRecord.setParentId(userVO.getParentId());

        /**
         * 表名
         */
        prepayInvoiceModifyRecord.setTableName("saas_payment_invoice");

        /**
         * 主键ID
         */
        prepayInvoiceModifyRecord.setKeyId(oldPaymentInvoice.getId());

        /**
         * 修改字段英文名称
         */
        prepayInvoiceModifyRecord.setColumnEnName("bill_date");

        /**
         * 修改字段中文名称（修改项目）
         */
        prepayInvoiceModifyRecord.setColumnChName("开票日期");

        /**
         * 原内容
         */
        prepayInvoiceModifyRecord.setOldContent(oldDate);

        /**
         * 新内容
         */
        prepayInvoiceModifyRecord.setNewContent(newDate);

        /**
         * 修改原因
         */
        prepayInvoiceModifyRecord.setReason(paymentInvoiceSaveVO.getRemark());

        /**
         * 备注
         */
        prepayInvoiceModifyRecord.setRemark(paymentInvoiceSaveVO.getRemark());

        UserEnterpriseUtils.setUserCreateOrModify(prepayInvoiceModifyRecord,userVO,true);

        return prepayInvoiceModifyRecord;

    }

    /**
     * saas_payment_invoice_modify_record
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
     * 表名
     * @return table_name 表名
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 表名
     * @param tableName 表名
     */
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    /**
     * 主键ID
     * @return key_id 主键ID
     */
    public Long getKeyId() {
        return keyId;
    }

    /**
     * 主键ID
     * @param keyId 主键ID
     */
    public void setKeyId(Long keyId) {
        this.keyId = keyId;
    }

    /**
     * 修改字段英文名称
     * @return column_en_name 修改字段英文名称
     */
    public String getColumnEnName() {
        return columnEnName;
    }

    /**
     * 修改字段英文名称
     * @param columnEnName 修改字段英文名称
     */
    public void setColumnEnName(String columnEnName) {
        this.columnEnName = columnEnName == null ? null : columnEnName.trim();
    }

    /**
     * 修改字段中文名称（修改项目）
     * @return column_ch_name 修改字段中文名称（修改项目）
     */
    public String getColumnChName() {
        return columnChName;
    }

    /**
     * 修改字段中文名称（修改项目）
     * @param columnChName 修改字段中文名称（修改项目）
     */
    public void setColumnChName(String columnChName) {
        this.columnChName = columnChName == null ? null : columnChName.trim();
    }

    /**
     * 原内容
     * @return old_content 原内容
     */
    public String getOldContent() {
        return oldContent;
    }

    /**
     * 原内容
     * @param oldContent 原内容
     */
    public void setOldContent(String oldContent) {
        this.oldContent = oldContent == null ? null : oldContent.trim();
    }

    /**
     * 新内容
     * @return new_content 新内容
     */
    public String getNewContent() {
        return newContent;
    }

    /**
     * 新内容
     * @param newContent 新内容
     */
    public void setNewContent(String newContent) {
        this.newContent = newContent == null ? null : newContent.trim();
    }

    /**
     * 修改原因
     * @return reason 修改原因
     */
    public String getReason() {
        return reason;
    }

    /**
     * 修改原因
     * @param reason 修改原因
     */
    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
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
     * 修改人ID
     * @return modifier_id 修改人ID
     */
    public Long getModifierId() {
        return modifierId;
    }

    /**
     * 修改人ID
     * @param modifierId 修改人ID
     */
    public void setModifierId(Long modifierId) {
        this.modifierId = modifierId;
    }

    /**
     * 修改人编码
     * @return modifier_code 修改人编码
     */
    public String getModifierCode() {
        return modifierCode;
    }

    /**
     * 修改人编码
     * @param modifierCode 修改人编码
     */
    public void setModifierCode(String modifierCode) {
        this.modifierCode = modifierCode == null ? null : modifierCode.trim();
    }

    /**
     * 修改人名称
     * @return modifier_name 修改人名称
     */
    public String getModifierName() {
        return modifierName;
    }

    /**
     * 修改人名称
     * @param modifierName 修改人名称
     */
    public void setModifierName(String modifierName) {
        this.modifierName = modifierName == null ? null : modifierName.trim();
    }

    /**
     * 修改时间
     * @return update_time 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 修改时间
     * @param updateTime 修改时间
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
        sb.append(", tableName=").append(tableName);
        sb.append(", keyId=").append(keyId);
        sb.append(", columnEnName=").append(columnEnName);
        sb.append(", columnChName=").append(columnChName);
        sb.append(", oldContent=").append(oldContent);
        sb.append(", newContent=").append(newContent);
        sb.append(", reason=").append(reason);
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