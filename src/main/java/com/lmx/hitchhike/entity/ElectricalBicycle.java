package com.lmx.hitchhike.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName electrical_bicycle
 */
@TableName(value ="electrical_bicycle")
@Data
public class ElectricalBicycle implements Serializable {
    /**
     * 车辆id
     */
    @TableId(type = IdType.AUTO)
    private Long bicycleId;

    /**
     * 车主id
     */
    private Long ownerId;

    /**
     * 车牌号
     */
    private String bicycleNumber;

    /**
     * 车辆品牌
     */
    private String bicycleBrand;

    /**
     * 车辆图片
     */
    private String bicycleImage;

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
        ElectricalBicycle other = (ElectricalBicycle) that;
        return (this.getBicycleId() == null ? other.getBicycleId() == null : this.getBicycleId().equals(other.getBicycleId()))
            && (this.getOwnerId() == null ? other.getOwnerId() == null : this.getOwnerId().equals(other.getOwnerId()))
            && (this.getBicycleNumber() == null ? other.getBicycleNumber() == null : this.getBicycleNumber().equals(other.getBicycleNumber()))
            && (this.getBicycleBrand() == null ? other.getBicycleBrand() == null : this.getBicycleBrand().equals(other.getBicycleBrand()))
            && (this.getBicycleImage() == null ? other.getBicycleImage() == null : this.getBicycleImage().equals(other.getBicycleImage()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBicycleId() == null) ? 0 : getBicycleId().hashCode());
        result = prime * result + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        result = prime * result + ((getBicycleNumber() == null) ? 0 : getBicycleNumber().hashCode());
        result = prime * result + ((getBicycleBrand() == null) ? 0 : getBicycleBrand().hashCode());
        result = prime * result + ((getBicycleImage() == null) ? 0 : getBicycleImage().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bicycleId=").append(bicycleId);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", bicycleNumber=").append(bicycleNumber);
        sb.append(", bicycleBrand=").append(bicycleBrand);
        sb.append(", bicycleImage=").append(bicycleImage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}