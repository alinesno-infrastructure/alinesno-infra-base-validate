/*
 *Copyright © 2018 anji-plus
 *安吉加加信息技术有限公司
 *http://www.anji-plus.com
 *All rights reserved.
 */
package com.alinesno.infra.base.validate.core.model.common;

import lombok.Data;
import org.apache.commons.lang.StringUtils;

import java.io.Serializable;

@Data
public class ResponseModel implements Serializable {

    private String repCode;

    private String repMsg;

    private Object repData;

    public ResponseModel() {
        this.repCode = RepCodeEnum.SUCCESS.getCode();
    }

    public boolean isSuccess(){
        return StringUtils.equals(repCode, RepCodeEnum.SUCCESS.getCode());
    }

    public ResponseModel(RepCodeEnum repCodeEnum) {
       this.setRepCodeEnum(repCodeEnum);
    }

    //成功
    public static ResponseModel success(){
        return ResponseModel.successMsg("成功");
    }
    public static ResponseModel successMsg(String message){
        ResponseModel responseModel = new ResponseModel();
        responseModel.setRepMsg(message);
        return responseModel;
    }
    public static ResponseModel successData(Object data){
        ResponseModel responseModel = new ResponseModel();
        responseModel.setRepCode(RepCodeEnum.SUCCESS.getCode());
        responseModel.setRepData(data);
        return responseModel;
    }

    //失败
    public static ResponseModel errorMsg(RepCodeEnum message){
        ResponseModel responseModel = new ResponseModel();
        responseModel.setRepCodeEnum(message);
        return responseModel;
    }
    public static ResponseModel errorMsg(String message){
        ResponseModel responseModel = new ResponseModel();
        responseModel.setRepCode(RepCodeEnum.ERROR.getCode());
        responseModel.setRepMsg(message);
        return responseModel;
    }
    public static ResponseModel errorMsg(RepCodeEnum repCodeEnum, String message){
        ResponseModel responseModel = new ResponseModel();
        responseModel.setRepCode(repCodeEnum.getCode());
        responseModel.setRepMsg(message);
        return responseModel;
    }
    public static ResponseModel exceptionMsg(String message){
        ResponseModel responseModel = new ResponseModel();
        responseModel.setRepCode(RepCodeEnum.EXCEPTION.getCode());
        responseModel.setRepMsg(RepCodeEnum.EXCEPTION.getDesc() + ": " + message);
        return responseModel;
    }

    public void setRepCode(String repCode) {
        this.repCode = repCode;
    }
    public void setRepCodeEnum(RepCodeEnum repCodeEnum) {
        this.repCode=repCodeEnum.getCode();
        this.repMsg=repCodeEnum.getDesc();
    }

    public void setRepData(Object repData) {
        this.repData = repData;
    }

}
