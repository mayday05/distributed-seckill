package cn.com.bluemoon.common.exception;

/**
 * 抽象接口
 */
public interface ServiceExceptionEnum {

    /**
     * 请求是否成功
     */
    Boolean getIsSuccess();

    /**
     * 获取返回的code
     */
    Integer getResponseCode();

    /**
     * 获取返回的message
     */
    String getResponseMsg();
}
