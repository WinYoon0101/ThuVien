/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuvienDTO;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class NguoiDungDTO {
    private String strMaND, strHoTen,  strGioiTinh,strSDT,strDiaChi ,strUserName, strPass,strVaiTro, strMail ;
    private Date dateNgSinh;
    private int MAROLE, TTND;

    public NguoiDungDTO(String strMaND, String strHoTen, String strGioiTinh, String strSDT, String strDiaChi, String strUserName, String strPass, String strVaiTro, String strMail, Date dateNgSinh, int MAROLE, int TTND) {
        this.strMaND = strMaND;
        this.strHoTen = strHoTen;
        this.strGioiTinh = strGioiTinh;
        this.strSDT = strSDT;
        this.strDiaChi = strDiaChi;
        this.strUserName = strUserName;
        this.strPass = strPass;
        this.strVaiTro = strVaiTro;
        this.strMail = strMail;
        this.dateNgSinh = dateNgSinh;
        this.MAROLE = MAROLE;
        this.TTND = TTND;
    }

    public NguoiDungDTO() {
        
    }

    public String getStrMaND() {
        return strMaND;
    }

    public void setStrMaND(String strMaND) {
        this.strMaND = strMaND;
    }

    public String getStrHoTen() {
        return strHoTen;
    }

    public void setStrHoTen(String strHoTen) {
        this.strHoTen = strHoTen;
    }

    public String getStrGioiTinh() {
        return strGioiTinh;
    }

    public void setStrGioiTinh(String strGioiTinh) {
        this.strGioiTinh = strGioiTinh;
    }

    public String getStrSDT() {
        return strSDT;
    }

    public void setStrSDT(String strSDT) {
        this.strSDT = strSDT;
    }

    public String getStrDiaChi() {
        return strDiaChi;
    }

    public void setStrDiaChi(String strDiaChi) {
        this.strDiaChi = strDiaChi;
    }

    public String getStrUserName() {
        return strUserName;
    }

    public void setStrUserName(String strUserName) {
        this.strUserName = strUserName;
    }

    public String getStrPass() {
        return strPass;
    }

    public void setStrPass(String strPass) {
        this.strPass = strPass;
    }

    public String getStrVaiTro() {
        return strVaiTro;
    }

    public void setStrVaiTro(String strVaiTro) {
        this.strVaiTro = strVaiTro;
    }

    public String getStrMail() {
        return strMail;
    }

    public void setStrMail(String strMail) {
        this.strMail = strMail;
    }

    public Date getDateNgSinh() {
        return dateNgSinh;
    }

    public void setDateNgSinh(Date dateNgSinh) {
        this.dateNgSinh = dateNgSinh;
    }

    public int getMAROLE() {
        return MAROLE;
    }

    public void setMAROLE(int MAROLE) {
        this.MAROLE = MAROLE;
    }

    public int getTTND() {
        return TTND;
    }

    public void setTTND(int TTND) {
        this.TTND = TTND;
    }

    @Override
    public String toString() {
        return "NGUOIDUNGDTO{" + "strMaND=" + strMaND + ", strHoTen=" + strHoTen + ", strGioiTinh=" + strGioiTinh + ", strSDT=" + strSDT + ", strDiaChi=" + strDiaChi + ", strUserName=" + strUserName + ", strPass=" + strPass + ", strVaiTro=" + strVaiTro + ", strMail=" + strMail + ", dateNgSinh=" + dateNgSinh + ", MAROLE=" + MAROLE + ", TTND=" + TTND + '}';
    }
    
}
