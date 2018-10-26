package com.ibgi.bean;

/**
 * 可以根据领取日期  出生日期   法人信息 所属年份 领取状态 ibgi账号查询
 * Integer year, String account, String usename, String giftid, String giftname, String phone,
 * String openid, String birthday, Integer status, String administrator, Integer ismail,
 * String mailaddress, Integer mailstatus, String addresscode, String mailphone,
 * String messageboard, Date appointmenttime, Date collecttime, Date posttime, Date noticetime,
 * String remark, String mailcode, String legalperson
 */
public class HandOutBean {
    private String receiveDateStart;
    private String receiveDateEnd;
    private String birthdayStart;
    private String birthdayEnd;
    private String legalperson;
    private Integer year;
    private String status;
    private String account;

    @Override
    public String toString() {
        return "HandOutBean{" +
                "receiveDateStart='" + receiveDateStart + '\'' +
                ", receiveDateEnd='" + receiveDateEnd + '\'' +
                ", birthdayStart='" + birthdayStart + '\'' +
                ", birthdayEnd='" + birthdayEnd + '\'' +
                ", legalperson='" + legalperson + '\'' +
                ", year=" + year +
                ", status='" + status + '\'' +
                ", account='" + account + '\'' +
                '}';
    }

    public String getReceiveDateStart() {
        return receiveDateStart;
    }

    public void setReceiveDateStart(String receiveDateStart) {
        this.receiveDateStart = receiveDateStart;
    }

    public String getReceiveDateEnd() {
        return receiveDateEnd;
    }

    public void setReceiveDateEnd(String receiveDateEnd) {
        this.receiveDateEnd = receiveDateEnd;
    }

    public String getBirthdayStart() {
        return birthdayStart;
    }

    public void setBirthdayStart(String birthdayStart) {
        this.birthdayStart = birthdayStart;
    }

    public String getBirthdayEnd() {
        return birthdayEnd;
    }

    public void setBirthdayEnd(String birthdayEnd) {
        this.birthdayEnd = birthdayEnd;
    }

    public String getLegalperson() {
        return legalperson;
    }

    public void setLegalperson(String legalperson) {
        this.legalperson = legalperson;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public HandOutBean(String receiveDateStart, String receiveDateEnd, String birthdayStart, String birthdayEnd, String legalperson, Integer year, String status, String account) {
        this.receiveDateStart = receiveDateStart;
        this.receiveDateEnd = receiveDateEnd;
        this.birthdayStart = birthdayStart;
        this.birthdayEnd = birthdayEnd;
        this.legalperson = legalperson;
        this.year = year;
        this.status = status;
        this.account = account;
    }

    public HandOutBean() {
    }
}
