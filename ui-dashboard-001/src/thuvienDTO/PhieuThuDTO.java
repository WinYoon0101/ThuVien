/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuvienDTO;
import java.util.Date;
/**
 *
 * @author ACER
 */
public class PhieuThuDTO {

    public String getMAPT() {
        return MAPT;
    }

    public void setMAPT(String MAPT) {
        this.MAPT = MAPT;
    }

    public String getMADG() {
        return MADG;
    }

    public void setMADG(String MADG) {
        this.MADG = MADG;
    }

    public String getMANV() {
        return MANV;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public String getTENND() {
        return TENND;
    }

    public void setTENND(String TENND) {
        this.TENND = TENND;
    }

    public int getMAPM() {
        return MAPM;
    }

    public void setMAPM(int MAPM) {
        this.MAPM = MAPM;
    }

    public int getTongNo() {
        return TongNo;
    }

    public void setTongNo(int TongNo) {
        this.TongNo = TongNo;
    }

    public int getTienThu() {
        return TienThu;
    }

    public void setTienThu(int TienThu) {
        this.TienThu = TienThu;
    }

    public int getConLai() {
        return ConLai;
    }

    public void setConLai(int ConLai) {
        this.ConLai = ConLai;
    }

    public Date getTg() {
        return Tg;
    }

    public void setTg(Date Tg) {
        this.Tg = Tg;
    }
    String MAPT, MADG, MANV, TENND;
    int MAPM, TongNo, TienThu, ConLai;
    Date Tg;
}