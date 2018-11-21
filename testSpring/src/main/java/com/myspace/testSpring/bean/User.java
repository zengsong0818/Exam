package com.myspace.testSpring.bean;

import java.io.Serializable;

public class User implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.username
     *
     * @mbg.generated
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.point
     *
     * @mbg.generated
     */
    private Long point;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.birthday
     *
     * @mbg.generated
     */
    private Boolean birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.buyNums
     *
     * @mbg.generated
     */
    private Integer buynums;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.backNums
     *
     * @mbg.generated
     */
    private Integer backnums;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.creditNums
     *
     * @mbg.generated
     */
    private Integer creditnums;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.buyAmount
     *
     * @mbg.generated
     */
    private Double buyamount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.backAmount
     *
     * @mbg.generated
     */
    private Double backamount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.username
     *
     * @return the value of user.username
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.username
     *
     * @param username the value for user.username
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.point
     *
     * @return the value of user.point
     *
     * @mbg.generated
     */
    public Long getPoint() {
        return point;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.point
     *
     * @param point the value for user.point
     *
     * @mbg.generated
     */
    public void setPoint(Long point) {
        this.point = point;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.birthday
     *
     * @return the value of user.birthday
     *
     * @mbg.generated
     */
    public Boolean getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.birthday
     *
     * @param birthday the value for user.birthday
     *
     * @mbg.generated
     */
    public void setBirthday(Boolean birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.buyNums
     *
     * @return the value of user.buyNums
     *
     * @mbg.generated
     */
    public Integer getBuynums() {
        return buynums;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.buyNums
     *
     * @param buynums the value for user.buyNums
     *
     * @mbg.generated
     */
    public void setBuynums(Integer buynums) {
        this.buynums = buynums;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.backNums
     *
     * @return the value of user.backNums
     *
     * @mbg.generated
     */
    public Integer getBacknums() {
        return backnums;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.backNums
     *
     * @param backnums the value for user.backNums
     *
     * @mbg.generated
     */
    public void setBacknums(Integer backnums) {
        this.backnums = backnums;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.creditNums
     *
     * @return the value of user.creditNums
     *
     * @mbg.generated
     */
    public Integer getCreditnums() {
        return creditnums;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.creditNums
     *
     * @param creditnums the value for user.creditNums
     *
     * @mbg.generated
     */
    public void setCreditnums(Integer creditnums) {
        this.creditnums = creditnums;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.buyAmount
     *
     * @return the value of user.buyAmount
     *
     * @mbg.generated
     */
    public Double getBuyamount() {
        return buyamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.buyAmount
     *
     * @param buyamount the value for user.buyAmount
     *
     * @mbg.generated
     */
    public void setBuyamount(Double buyamount) {
        this.buyamount = buyamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.backAmount
     *
     * @return the value of user.backAmount
     *
     * @mbg.generated
     */
    public Double getBackamount() {
        return backamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.backAmount
     *
     * @param backamount the value for user.backAmount
     *
     * @mbg.generated
     */
    public void setBackamount(Double backamount) {
        this.backamount = backamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
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
        User other = (User) that;
        return (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPoint() == null ? other.getPoint() == null : this.getPoint().equals(other.getPoint()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getBuynums() == null ? other.getBuynums() == null : this.getBuynums().equals(other.getBuynums()))
            && (this.getBacknums() == null ? other.getBacknums() == null : this.getBacknums().equals(other.getBacknums()))
            && (this.getCreditnums() == null ? other.getCreditnums() == null : this.getCreditnums().equals(other.getCreditnums()))
            && (this.getBuyamount() == null ? other.getBuyamount() == null : this.getBuyamount().equals(other.getBuyamount()))
            && (this.getBackamount() == null ? other.getBackamount() == null : this.getBackamount().equals(other.getBackamount()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPoint() == null) ? 0 : getPoint().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getBuynums() == null) ? 0 : getBuynums().hashCode());
        result = prime * result + ((getBacknums() == null) ? 0 : getBacknums().hashCode());
        result = prime * result + ((getCreditnums() == null) ? 0 : getCreditnums().hashCode());
        result = prime * result + ((getBuyamount() == null) ? 0 : getBuyamount().hashCode());
        result = prime * result + ((getBackamount() == null) ? 0 : getBackamount().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", username=").append(username);
        sb.append(", point=").append(point);
        sb.append(", birthday=").append(birthday);
        sb.append(", buynums=").append(buynums);
        sb.append(", backnums=").append(backnums);
        sb.append(", creditnums=").append(creditnums);
        sb.append(", buyamount=").append(buyamount);
        sb.append(", backamount=").append(backamount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}