package com.lmx.hitchhike.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName web_user
 */
@TableName(value ="web_user")
@Data
public class WebUser implements Serializable {
    /**
     * 管理员id
     */
    @TableId(type = IdType.AUTO)
    private Long webId;

    /**
     * 角色id
     */
    private Long roleId;

    /**
     * 管理员用户名
     */
    private String webUsername;

    /**
     * 管理员密码
     */
    private String webPassword;

    /**
     * 管理员手机号码
     */
    private String webPhone;

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
        WebUser other = (WebUser) that;
        return (this.getWebId() == null ? other.getWebId() == null : this.getWebId().equals(other.getWebId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getWebUsername() == null ? other.getWebUsername() == null : this.getWebUsername().equals(other.getWebUsername()))
            && (this.getWebPassword() == null ? other.getWebPassword() == null : this.getWebPassword().equals(other.getWebPassword()))
            && (this.getWebPhone() == null ? other.getWebPhone() == null : this.getWebPhone().equals(other.getWebPhone()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWebId() == null) ? 0 : getWebId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getWebUsername() == null) ? 0 : getWebUsername().hashCode());
        result = prime * result + ((getWebPassword() == null) ? 0 : getWebPassword().hashCode());
        result = prime * result + ((getWebPhone() == null) ? 0 : getWebPhone().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", webId=").append(webId);
        sb.append(", roleId=").append(roleId);
        sb.append(", webUsername=").append(webUsername);
        sb.append(", webPassword=").append(webPassword);
        sb.append(", webPhone=").append(webPhone);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}