package com.rograndec.feijiayun.chain.common.exception;

import com.rograndec.feijiayun.chain.business.basic.warehouse.exception.BaseException;

/**
 * Created by ST on 2017/9/6.
 */
public class RequestParamBizException extends BaseException {

    /**
     * 值校验异常
     */
    public static final String VALUE_CHECK = "111112";

    public RequestParamBizException(String code, String message) {
        super(code, message);
    }
}