/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuvienDAO;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import thuvienDTO.NguoiDungDTO;
import static thuvienGUI.InitPublic.getID;

/**
 *
 * @author Admin
 */
public class NguoiDungDAO {
    java.sql.Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    SQLConnectUnit connect;
    public static SQLConnection connection = new SQLConnection("UITParking", "uitparking", "orcl");
    ;
    public static PreparedStatement pst = null;
    
    
    public String showEmail(String username) throws Exception {
    try {
        String sql = "SELECT MAIL FROM NGUOIDUNG WHERE USERNAME = ?";
        
        con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.56.1:1521:orcldb", "C##UITthuvien", "uitthuvien");
        
        ps = con.prepareStatement(sql);
        ps.setString(1, username);
        
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
            return rs.getString("MAIL");
        }
        
        con.close();
    } catch (Exception ex) {
        ex.printStackTrace();
        throw new Exception("Error retrieving data", ex);
    }
    return null; // Trả về null nếu không tìm thấy
}

    
    
    public ArrayList<NguoiDungDTO> docDB(String condition, String orderBy) throws Exception {
        // kết nối CSDL
        connect = new SQLConnectUnit();

        ResultSet result = this.connect.Select("NGUOIDUNG", condition, orderBy);
        ArrayList<NguoiDungDTO> nguoidungs = new ArrayList<>();
        while (result.next()) {
            NguoiDungDTO nguoidung = new NguoiDungDTO();
            nguoidung.setStrMaND(result.getString("MAND"));
            nguoidung.setStrHoTen(result.getString("TENND"));
            nguoidung.setStrGioiTinh(result.getString("GIOITINH"));    
            nguoidung.setStrSDT(result.getString("SDT"));
            nguoidung.setStrDiaChi(result.getString("DIACHI"));
            nguoidung.setStrUserName(result.getString("USERNAME"));
            nguoidung.setStrPass(result.getString("PASS"));
            nguoidung.setStrVaiTro(result.getString("VAITRO"));
            nguoidung.setStrMail(result.getString("MAIL"));
            
            nguoidung.setDateNgSinh(result.getDate("NGSINH"));
            nguoidung.setMAROLE(result.getInt("MAROLE"));
            nguoidung.setMAROLE(result.getInt("TTND"));
            nguoidungs.add(nguoidung);
        }
        connect.Close();
        return nguoidungs;
    }
    
    
    public ArrayList<NguoiDungDTO> docDB(String condition) throws Exception {
        return docDB(condition, null);
    }

    public ArrayList<NguoiDungDTO> docDB() throws Exception {
        return docDB(null);
    }
    
    
    public NguoiDungDTO findById(String MaND) throws Exception {
        String sql = "Select * from NGUOIDUNG where MAND = ?";
        try {
            pst = this.connection.getConnect().prepareStatement(sql);

            pst.setString(1, MaND);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                NguoiDungDTO nd = new NguoiDungDTO();
                nd.setStrMaND(rs.getString("MAND"));
                nd.setStrHoTen(rs.getString("TENND"));
                nd.setStrGioiTinh(rs.getString("GIOITINH"));
nd.setStrSDT(rs.getString("SDT"));
nd.setStrDiaChi(rs.getString("DIACHI"));
nd.setStrUserName(rs.getString("USERNAME"));
nd.setStrPass(rs.getString("PASS"));
nd.setStrVaiTro(rs.getString("VAITRO"));
nd.setStrMail(rs.getString("MAIL"));

nd.setDateNgSinh(rs.getDate("NGSINH"));
nd.setMAROLE(rs.getInt("MAROLE"));
nd.setTTND(rs.getInt("TTND"));
return  nd;
}
            return null;
        } catch (SQLException ex) {
            throw new ArithmeticException(ex.getMessage());
        }
    }
    
    public Boolean xoa(NguoiDungDTO nd) throws Exception {
        String sql = "DELETE FROM NGUOIDUNG WHERE MaND = ?";
        try {
            pst = this.connection.getConnect().prepareStatement(sql);

            pst.setString(1, nd.getStrMaND());

            return pst.executeUpdate() > 0;
        } catch (SQLException ex) {
            throw new ArithmeticException(ex.getMessage());
        }
    }
    
    
    public Boolean sua(NguoiDungDTO nd) throws Exception {
        String sql = "UPDATE NGUOIDUNG SET USERNAME = ?, PASS = ?, TENND = ?, "
                + "GIOITINH = ?, NGSINH = ?, DIACHI = ?, MAIL= ?, SDT = ?, "
                + "VAITRO = ? WHERE MAND = ?";
        try {
            pst = this.connection.getConnect().prepareStatement(sql);

            pst.setString(10, nd.getStrMaND());
            pst.setString(1, nd.getStrUserName());
            pst.setString(2, nd.getStrPass());
            pst.setString(3, nd.getStrHoTen());
            pst.setString(4, nd.getStrGioiTinh());
            
            if (nd.getDateNgSinh() != null) {
                pst.setDate(5, new java.sql.Date(nd.getDateNgSinh().getTime()));

            } else {
                pst.setDate(5, null);
            }
            
            pst.setString(6, nd.getStrDiaChi());
            pst.setString(7, nd.getStrMail());
            pst.setString(8, nd.getStrSDT());
            pst.setString(9, nd.getStrVaiTro());
    return pst.executeUpdate() > 0;
        } catch (SQLException ex) {
            throw new ArithmeticException(ex.getMessage());
        }
    }
    
    public String getMaxMaND() throws Exception {
        String sql = "Select Max(MaND) as MaxND from NGUOIDUNG";
        pst = this.connection.getConnect().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        String id = "";
        if (rs.next()) {
            String maxhd = rs.getString("MaxND");
            id = getID(maxhd);
        }
        return "ND" + id;
    }
    
    
}
