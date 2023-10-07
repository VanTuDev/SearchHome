/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.sql.Date;

/**
 *
 * @author admin
 */
public class Accounts {

    private String user;
    private String pass;
    private String renter;
    private String lessor;
    private String admins;
    private String img;
    private String fullname;
    private String dob;
    private String gender;
    private String numphone;
    private String cccd;
    private String gmail;
    private String roles;
    private String dot;
    private String wot;
    private String maxacthuc;
    private String thoigianhieuluccuamaxacthuc;
    private String trangthaixacthuc;

    public Accounts() {
    }

    public Accounts(String user, String pass, String renter, String lessor, String admins, String img, String fullname, String dob, String gender, String numphone, String cccd, String gmail, String roles, String dot, String wot, String maxacthuc, String thoigianhieuluccuamaxacthuc, String trangthaixacthuc) {
        this.user = user;
        this.pass = pass;
        this.renter = renter;
        this.lessor = lessor;
        this.admins = admins;
        this.img = img;
        this.fullname = fullname;
        this.dob = dob;
        this.gender = gender;
        this.numphone = numphone;
        this.cccd = cccd;
        this.gmail = gmail;
        this.roles = roles;
        this.dot = dot;
        this.wot = wot;
        this.maxacthuc = maxacthuc;
        this.thoigianhieuluccuamaxacthuc = thoigianhieuluccuamaxacthuc;
        this.trangthaixacthuc = trangthaixacthuc;
    }

    

    
    

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRenter() {
        return renter;
    }

    public void setRenter(String renter) {
        this.renter = renter;
    }

    public String getLessor() {
        return lessor;
    }

    public void setLessor(String lessor) {
        this.lessor = lessor;
    }

    public String getAdmins() {
        return admins;
    }

    public void setAdmins(String admins) {
        this.admins = admins;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

   
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNumphone() {
        return numphone;
    }

    public void setNumphone(String numphone) {
        this.numphone = numphone;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getMaxacthuc() {
        return maxacthuc;
    }

    public void setMaxacthuc(String maxacthuc) {
        this.maxacthuc = maxacthuc;
    }

    public String getThoigianhieuluccuamaxacthuc() {
        return thoigianhieuluccuamaxacthuc;
    }

    public void setThoigianhieuluccuamaxacthuc(String thoigianhieuluccuamaxacthuc) {
        this.thoigianhieuluccuamaxacthuc = thoigianhieuluccuamaxacthuc;
    }

    public String isTrangthaixacthuc() {
        return trangthaixacthuc;
    }

    public void setTrangthaixacthuc(String trangthaixacthuc) {
        this.trangthaixacthuc = trangthaixacthuc;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getDot() {
        return dot;
    }

    public void setDot(String dot) {
        this.dot = dot;
    }

    public String getWot() {
        return wot;
    }

    public void setWot(String wot) {
        this.wot = wot;
    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Accounts{");
        sb.append("user=").append(user);
        sb.append(", pass=").append(pass);
        sb.append(", renter=").append(renter);
        sb.append(", lessor=").append(lessor);
        sb.append(", admins=").append(admins);
        sb.append(", img=").append(img);
        sb.append(", fullname=").append(fullname);
        sb.append(", gender=").append(gender);
        sb.append(", numphone=").append(numphone);
        sb.append(", cccd=").append(cccd);
        sb.append(", gmail=").append(gmail);
        sb.append(", roles=").append(roles);
        sb.append(", dot=").append(dot);
        sb.append(", wot=").append(wot);
        sb.append('}');
        return sb.toString();
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    
    
}
