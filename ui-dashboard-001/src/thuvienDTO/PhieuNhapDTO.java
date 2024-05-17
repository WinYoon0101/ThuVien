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
public class PhieuNhapDTO {
    private String strMaND,strMaSach,strHoTen,strTenSach;
    private int MaPN,SL;
    private double DonGia;
    private Date dateNgNhap;

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }
    
    public String getStrTenSach() {
        return strTenSach;
    }

    public void setStrTenSach(String strTenSach) {
        this.strTenSach = strTenSach;
    }

    public String getStrHoTen() {
        return strHoTen;
    }

    public void setStrHoTen(String strHoTen) {
        this.strHoTen = strHoTen;
    }

    public String getStrMaSach() {
        return strMaSach;
    }

    public void setStrMaSach(String strMaSach) {
        this.strMaSach = strMaSach;
    }

    public int getSL() {
        return SL;
    }

    public void setSL(int SL) {
        this.SL = SL;
    }

    public String getStrMaND() {
        return strMaND;
    }

    public void setStrMaND(String strMaND) {
        this.strMaND = strMaND;
    }

    public int getMaPN() {
        return MaPN;
    }

    public void setMaPN(int MaPN) {
        this.MaPN = MaPN;
    }

    public Date getDateNgNhap() {
        return dateNgNhap;
    }

    public void setDateNgNhap(Date dateNgNhap) {
        this.dateNgNhap = dateNgNhap;
    }
    
}
