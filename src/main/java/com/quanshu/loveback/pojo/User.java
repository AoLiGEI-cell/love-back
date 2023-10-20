package com.quanshu.loveback.pojo;

import java.time.LocalDateTime;

public class User {

    private Integer userid;
    private String password;
    private String usertype;
    private LocalDateTime createTime;
    private String profilephoto;

    public User() {
    }

    public User(Integer userid, String password, String usertype, LocalDateTime createTime, String profilephoto) {
        this.userid = userid;
        this.password = password;
        this.usertype = usertype;
        this.createTime = createTime;
        this.profilephoto = profilephoto;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getProfilephoto() {
        return profilephoto;
    }

    public void setProfilephoto(String profilephoto) {
        this.profilephoto = profilephoto;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", password='" + password + '\'' +
                ", usertype='" + usertype + '\'' +
                ", createTime=" + createTime +
                ", profilephoto='" + profilephoto + '\'' +
                '}';
    }
}
