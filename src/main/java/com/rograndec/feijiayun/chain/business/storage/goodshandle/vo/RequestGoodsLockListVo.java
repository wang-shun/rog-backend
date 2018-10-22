package com.rograndec.feijiayun.chain.business.storage.goodshandle.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <获取商品锁定单请求参数>
 *
 * @Author: Zhengbin.jin 金正斌
 * @Email: Zhengbin.jin@rograndec.com
 * @2017/9/27 19:05
 */
@ApiModel(value = "RequestGoodsLockListVo", description = "储存管理-商品处理-药品锁定")
public class RequestGoodsLockListVo implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotNull(message = "每页显示数据不能为空")
    @ApiModelProperty(value = "每页显示数据", required = true)
    private Integer pageSize;

    @NotNull(message = "页码不能为空")
    @ApiModelProperty(value = "页码", required = true)
    private Integer pageNo;

    @NotNull(message = "状态不能为空")
    @ApiModelProperty(value = "状态  0-全部 34-已取消 92-待处理 33-已处理", required = true)
    private Integer status;

    @ApiModelProperty(value = "查询开始时间", required = false)
    private String startDate;

    @ApiModelProperty(value = "查询结束时间", required = false)
    private String endDate;

    @ApiModelProperty(value = "锁定原因（0-疑似质量问题；1-疑似伪劣商品；2-药品养护问题商品；3-陈列检查问题商品）", required = false)
    private Integer lockReason;

    @ApiModelProperty(value = "锁定单号", required = false)
    private String code;

    @ApiModelProperty(value = "锁定人", required = false)
    private String lockManName;

    @ApiModelProperty(required = false,value = "企业id")
    private  Long enterpriseId;

    @ApiModelProperty(required = false,value = "按日期排序0-升序 1-降序")
    private Integer sortDate;
    @ApiModelProperty(required = false,value = "按单号排序0-升序 1-降序")
    private Integer sortCode;
    private String sort;

    public Integer getSortDate() {
        return sortDate;
    }

    public void setSortDate(Integer sortDate) {
        this.sortDate = sortDate;
    }

    public Integer getSortCode() {
        return sortCode;
    }

    public void setSortCode(Integer sortCode) {
        this.sortCode = sortCode;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public Long getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLockManName() {
        return lockManName;
    }

    public void setLockManName(String lockManName) {
        this.lockManName = lockManName;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getLockReason() {
        return lockReason;
    }

    public void setLockReason(Integer lockReason) {
        this.lockReason = lockReason;
    }
}