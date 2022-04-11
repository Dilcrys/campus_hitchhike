package com.lmx.hitchhike.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName approve
 */
@TableName(value ="approve")
@Data
public class Approve implements Serializable {
    /**
     * 认证id
     */
    @TableId(type = IdType.AUTO)
    private Long approveId;

    /**
     * 管理员id
     */
    private Long webId;

    /**
     * 乘客id
     */
    private Long passengerId;

    /**
     * 车主id
     */
    private Long ownerId;

    /**
     * 认证人姓名
     */
    private String approveName;

    /**
     * 认证人班级
     */
    private String approveClass;

    /**
     * 认证人学号
     */
    private String approveNumber;

    /**
     * 认证状态(0：未认证，1：已认证)
     */
    private String approveState;

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
        Approve other = (Approve) that;
        return (this.getApproveId() == null ? other.getApproveId() == null : this.getApproveId().equals(other.getApproveId()))
            && (this.getWebId() == null ? other.getWebId() == null : this.getWebId().equals(other.getWebId()))
            && (this.getPassengerId() == null ? other.getPassengerId() == null : this.getPassengerId().equals(other.getPassengerId()))
            && (this.getOwnerId() == null ? other.getOwnerId() == null : this.getOwnerId().equals(other.getOwnerId()))
            && (this.getApproveName() == null ? other.getApproveName() == null : this.getApproveName().equals(other.getApproveName()))
            && (this.getApproveClass() == null ? other.getApproveClass() == null : this.getApproveClass().equals(other.getApproveClass()))
            && (this.getApproveNumber() == null ? other.getApproveNumber() == null : this.getApproveNumber().equals(other.getApproveNumber()))
            && (this.getApproveState() == null ? other.getApproveState() == null : this.getApproveState().equals(other.getApproveState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getApproveId() == null) ? 0 : getApproveId().hashCode());
        result = prime * result + ((getWebId() == null) ? 0 : getWebId().hashCode());
        result = prime * result + ((getPassengerId() == null) ? 0 : getPassengerId().hashCode());
        result = prime * result + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        result = prime * result + ((getApproveName() == null) ? 0 : getApproveName().hashCode());
        result = prime * result + ((getApproveClass() == null) ? 0 : getApproveClass().hashCode());
        result = prime * result + ((getApproveNumber() == null) ? 0 : getApproveNumber().hashCode());
        result = prime * result + ((getApproveState() == null) ? 0 : getApproveState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", approveId=").append(approveId);
        sb.append(", webId=").append(webId);
        sb.append(", passengerId=").append(passengerId);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", approveName=").append(approveName);
        sb.append(", approveClass=").append(approveClass);
        sb.append(", approveNumber=").append(approveNumber);
        sb.append(", approveState=").append(approveState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}