/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuvienBUS;

import java.util.ArrayList;
import thuvienDAO.NguoiDungDAO;
import thuvienDTO.NguoiDungDTO;

/**
 *
 * @author Admin
 */
public class NguoiDungBUS {
    private ArrayList<NguoiDungDTO> list_ND;
    
     private NguoiDungDAO ndDAO;
    
    public NguoiDungBUS() throws Exception {
        list_ND = new ArrayList<>();
        ndDAO = new NguoiDungDAO();
        list_ND = ndDAO.docDB();
    }
    
    public int getNumbND() {
        return list_ND.size();
    }
    
    public String getMaxMaND() throws Exception {
        ndDAO = new NguoiDungDAO();
        return ndDAO.getMaxMaND();
    }
    
    public ArrayList<NguoiDungDTO> getList_ND() {
        return list_ND;
    }
    
    public void setList_ND(ArrayList<NguoiDungDTO> list_ND) {
        this.list_ND = list_ND;
    }
    
    public NguoiDungDTO getInfor(String strMaND) {
        for (NguoiDungDTO nd : list_ND) {
            if (nd.getStrMaND().equals(strMaND)) {
                return nd;
            }
        }
        
        return null;
    }
    
    public NguoiDungDTO getInforuser(String strUser) {
        for (NguoiDungDTO nd : list_ND) {
            if (nd.getStrUserName().equals(strUser)) {
                return nd;
            }
        }
        return null;
    }
    
    public Boolean xoa(NguoiDungDTO nd) throws Exception {
        if (ndDAO.xoa(nd)) {

            // duyệt từng phẩn tử
            for (NguoiDungDTO taikhoan : list_ND) {
                if (taikhoan.getStrMaND().equals(nd.getStrMaND())) {
                    list_ND.remove(taikhoan);
                    break;
                }
            }
        }
        
        return false;
    }
    
    public Boolean sua(NguoiDungDTO nd) throws Exception {
        ndDAO.sua(nd);

        // duyệt từng phẩn tử
        for (NguoiDungDTO taikhoan : list_ND) {
            if (taikhoan.getStrMaND().equals(nd.getStrMaND())) {
                taikhoan.setStrUserName(nd.getStrUserName());
                taikhoan.setStrPass(nd.getStrPass());
                taikhoan.setStrHoTen(nd.getStrHoTen());
                taikhoan.setStrGioiTinh(nd.getStrGioiTinh());
                if (nd.getDateNgSinh() != null) {
                    taikhoan.setDateNgSinh(new java.sql.Date(nd.getDateNgSinh().getTime()));
                } else {
                    taikhoan.setDateNgSinh(null);
                }
                taikhoan.setStrDiaChi(nd.getStrDiaChi());
                taikhoan.setStrMail(nd.getStrMail());
                taikhoan.setStrSDT(nd.getStrSDT());
                taikhoan.setStrVaiTro(nd.getStrVaiTro());
                return true;
            }
            
        }
        
        return false;
    }

    public NguoiDungDTO findById(String MaND) throws Exception {
        return ndDAO.findById(MaND);
    }
    
}
