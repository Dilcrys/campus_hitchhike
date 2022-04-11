package com.lmx.hitchhike.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName hitchhike_order
 */
@TableName(value ="hitchhike_order")
@Data
public class HitchhikeOrder implements Serializable {
    /**
     * 订单id
     */
    @TableId(type = IdType.AUTO)
    private Long orderId;

    /**
     * 乘客id
     */
    private Long passengerId;

    /**
     * 车主id
     */
    private Long ownerId;

    /**
     * 最早出发时间
     */
    private String firstTime;

    /**
     * 最晚出发时间
     */
    private String lastTime;

    /**
     * 出发点
     */
    private String origin;

    /**
     * 目的地
     */
    private String destination;

    /**
     * 订单状态(0：待接单，1：已接单，2：未接单，3：已取消)
     */
    private String orderState;

    /**
     * 订单备注
     */
    private String orderNote;

    /**
     * 发单用户类型(0：乘客发单，1：车主发单)
     */
    private String releaseType;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        HitchhikeOrder other = (HitchhikeOrder) that;
        return (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getPassengerId() == null ? other.getPassengerId() == null : this.getPassengerId().equals(other.getPassengerId()))
            && (this.getOwnerId() == null ? other.getOwnerId() == null : this.getOwnerId().equals(other.getOwnerId()))
            && (this.getFirstTime() == null ? other.getFirstTime() == null : this.getFirstTime().equals(other.getFirstTime()))
            && (this.getLastTime() == null ? other.getLastTime() == null : this.getLastTime().equals(other.getLastTime()))
            && (this.getOrigin() == null ? other.getOrigin() == null : this.getOrigin().equals(other.getOrigin()))
            && (this.getDestination() == null ? other.getDestination() == null : this.getDestination().equals(other.getDestination()))
            && (this.getOrderState() == null ? other.getOrderState() == null : this.getOrderState().equals(other.getOrderState()))
            && (this.getOrderNote() == null ? other.getOrderNote() == null : this.getOrderNote().equals(other.getOrderNote()))
            && (this.getReleaseType() == null ? other.getReleaseType() == null : this.getReleaseType().equals(other.getReleaseType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getPassengerId() == null) ? 0 : getPassengerId().hashCode());
        result = prime * result + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        result = prime * result + ((getFirstTime() == null) ? 0 : getFirstTime().hashCode());
        result = prime * result + ((getLastTime() == null) ? 0 : getLastTime().hashCode());
        result = prime * result + ((getOrigin() == null) ? 0 : getOrigin().hashCode());
        result = prime * result + ((getDestination() == null) ? 0 : getDestination().hashCode());
        result = prime * result + ((getOrderState() == null) ? 0 : getOrderState().hashCode());
        result = prime * result + ((getOrderNote() == null) ? 0 : getOrderNote().hashCode());
        result = prime * result + ((getReleaseType() == null) ? 0 : getReleaseType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", passengerId=").append(passengerId);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", firstTime=").append(firstTime);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", origin=").append(origin);
        sb.append(", destination=").append(destination);
        sb.append(", orderState=").append(orderState);
        sb.append(", orderNote=").append(orderNote);
        sb.append(", releaseType=").append(releaseType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}