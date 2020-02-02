package com.example.demo.pojo;

import java.io.Serializable;

/**
 * customer
 * @author 
 */
public class Customer implements Serializable {
    /**
     * 顾客编号
     */
    private String cId;

    /**
     * 顾客姓名
     */
    private String cName;

    /**
     * 顾客性别
     */
    private String cSex;

    /**
     * 顾客年龄
     */
    private Integer cAge;

    /**
     * 顾客密码
     */
    private String cPassword;

    /**
     * 顾客电话号码
     */
    private String cPhone;

    /**
     * 顾客邮箱
     */
    private String cEmail;

    /**
     * 顾客地址
     */
    private String cAddress;

    /**
     * 顾客等级
     */
    private Integer cClass;

    /**
     * 顾客健康状况
     */
    private String cHealthystatus;

    /**
     * 备注
     */
    private String cRemark;

    private static final long serialVersionUID = 1L;

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcSex() {
        return cSex;
    }

    public void setcSex(String cSex) {
        this.cSex = cSex;
    }

    public Integer getcAge() {
        return cAge;
    }

    public void setcAge(Integer cAge) {
        this.cAge = cAge;
    }

    public String getcPassword() {
        return cPassword;
    }

    public void setcPassword(String cPassword) {
        this.cPassword = cPassword;
    }

    public String getcPhone() {
        return cPhone;
    }

    public void setcPhone(String cPhone) {
        this.cPhone = cPhone;
    }

    public String getcEmail() {
        return cEmail;
    }

    public void setcEmail(String cEmail) {
        this.cEmail = cEmail;
    }

    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    public Integer getcClass() {
        return cClass;
    }

    public void setcClass(Integer cClass) {
        this.cClass = cClass;
    }

    public String getcHealthystatus() {
        return cHealthystatus;
    }

    public void setcHealthystatus(String cHealthystatus) {
        this.cHealthystatus = cHealthystatus;
    }

    public String getcRemark() {
        return cRemark;
    }

    public void setcRemark(String cRemark) {
        this.cRemark = cRemark;
    }

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
        Customer other = (Customer) that;
        return (this.getcId() == null ? other.getcId() == null : this.getcId().equals(other.getcId()))
            && (this.getcName() == null ? other.getcName() == null : this.getcName().equals(other.getcName()))
            && (this.getcSex() == null ? other.getcSex() == null : this.getcSex().equals(other.getcSex()))
            && (this.getcAge() == null ? other.getcAge() == null : this.getcAge().equals(other.getcAge()))
            && (this.getcPassword() == null ? other.getcPassword() == null : this.getcPassword().equals(other.getcPassword()))
            && (this.getcPhone() == null ? other.getcPhone() == null : this.getcPhone().equals(other.getcPhone()))
            && (this.getcEmail() == null ? other.getcEmail() == null : this.getcEmail().equals(other.getcEmail()))
            && (this.getcAddress() == null ? other.getcAddress() == null : this.getcAddress().equals(other.getcAddress()))
            && (this.getcClass() == null ? other.getcClass() == null : this.getcClass().equals(other.getcClass()))
            && (this.getcHealthystatus() == null ? other.getcHealthystatus() == null : this.getcHealthystatus().equals(other.getcHealthystatus()))
            && (this.getcRemark() == null ? other.getcRemark() == null : this.getcRemark().equals(other.getcRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getcId() == null) ? 0 : getcId().hashCode());
        result = prime * result + ((getcName() == null) ? 0 : getcName().hashCode());
        result = prime * result + ((getcSex() == null) ? 0 : getcSex().hashCode());
        result = prime * result + ((getcAge() == null) ? 0 : getcAge().hashCode());
        result = prime * result + ((getcPassword() == null) ? 0 : getcPassword().hashCode());
        result = prime * result + ((getcPhone() == null) ? 0 : getcPhone().hashCode());
        result = prime * result + ((getcEmail() == null) ? 0 : getcEmail().hashCode());
        result = prime * result + ((getcAddress() == null) ? 0 : getcAddress().hashCode());
        result = prime * result + ((getcClass() == null) ? 0 : getcClass().hashCode());
        result = prime * result + ((getcHealthystatus() == null) ? 0 : getcHealthystatus().hashCode());
        result = prime * result + ((getcRemark() == null) ? 0 : getcRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cId=").append(cId);
        sb.append(", cName=").append(cName);
        sb.append(", cSex=").append(cSex);
        sb.append(", cAge=").append(cAge);
        sb.append(", cPassword=").append(cPassword);
        sb.append(", cPhone=").append(cPhone);
        sb.append(", cEmail=").append(cEmail);
        sb.append(", cAddress=").append(cAddress);
        sb.append(", cClass=").append(cClass);
        sb.append(", cHealthystatus=").append(cHealthystatus);
        sb.append(", cRemark=").append(cRemark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}