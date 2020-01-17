package cn.com.bluemoon.common.response;


/**
 * Title: SeckillResponse
 */
public class SeckillInfoResponse extends BaseResponse {

    /**
     * 下一次请求刷新时间
     */
    private int refreshTime;

    /**
     * 订单ID
     */
    private long orderId;

    /**
     * 订单编码
     */
    private String orderCode;

    /**
     * 下单资格码
     */
    private String orderQualificationCode;

    /**
     * @return the refreshTime
     */
    public int getRefreshTime() {
        return refreshTime;
    }

    /**
     * @param refreshTime the refreshTime to set
     */
    public void setRefreshTime(int refreshTime) {
        this.refreshTime = refreshTime;
    }

    /**
     * @return the orderId
     */
    public long getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the orderCode
     */
    public String getOrderCode() {
        return orderCode;
    }

    /**
     * @param orderCode the orderCode to set
     */
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderQualificationCode() {
        return orderQualificationCode;
    }

    public void setOrderQualificationCode(String orderQualificationCode) {
        this.orderQualificationCode = orderQualificationCode;
    }
}
