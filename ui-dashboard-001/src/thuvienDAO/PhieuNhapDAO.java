/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuvienDAO;

import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import thuvienDTO.PhieuNhapDTO;
import java.sql.*;
import thuvienDTO.NguoiDungDTO;


/**
 *
 * @author Admin
 */
public class PhieuNhapDAO {
    
    java.sql.Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public boolean checkExistingMaPN(int mapn) throws Exception {
        try {
        // Chuẩn bị truy vấn SQL
        String query = "SELECT * FROM PHIEUNHAP WHERE MAPN = ?";
        
        // Tạo kết nối đến cơ sở dữ liệu
        con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.56.1:1521:orcldb", "C##UITthuvien", "uitthuvien");

        // Chuẩn bị và thực thi truy vấn
        ps = con.prepareStatement(query);
        ps.setInt(1, mapn);
        ResultSet rs = ps.executeQuery();

        // Nếu có bất kỳ kết quả nào trả về từ truy vấn, mã phiếu nhập đã tồn tại
        return rs.next();
    } catch (Exception ex) {
        ex.printStackTrace();
        return false; // Trả về false nếu có lỗi xảy ra
    } }
    
    public boolean CapNhatPN(PhieuNhapDTO pn) {
    try {
        // Tạo câu lệnh SQL để cập nhật phiếu nhập
        String sql = "UPDATE PHIEUNHAP SET MAND = ?, TGNHAP = ?, MASACH = ?, SL = ? WHERE MAPN = ?";

        // Mở kết nối đến cơ sở dữ liệu
        con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.56.1:1521:orcldb", "C##UITthuvien", "uitthuvien");

        // Chuẩn bị câu lệnh SQL
        ps = con.prepareStatement(sql);
        ps.setString(1, pn.getStrMaND());
        ps.setDate(2, new java.sql.Date(pn.getDateNgNhap().getTime()));
        ps.setString(3, pn.getStrMaSach());
        ps.setInt(4, pn.getSL());
        ps.setInt(5, pn.getMaPN());

        // Thực thi câu lệnh và kiểm tra xem có bao nhiêu bản ghi đã được cập nhật
        int rowCount = ps.executeUpdate();

        // Trả về true nếu có ít nhất một bản ghi đã được cập nhật
        return rowCount > 0;
    } catch (SQLException ex) {
        ex.printStackTrace();
        return false; // Trả về false nếu có lỗi xảy ra
    } finally {
        // Đóng các tài nguyên sau khi sử dụng xong
        try {
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

    
    public boolean XoaPN(int mapn) throws Exception {
    try {
        String sql = "DELETE FROM PHIEUNHAP WHERE MAPN = ?";
        con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.56.1:1521:orcldb", "C##UITthuvien", "uitthuvien");
        ps = con.prepareStatement(sql);
        ps.setInt(1, mapn);

        // Thực thi truy vấn xóa và trả về true nếu có ít nhất một dòng được xóa thành công
        return ps.executeUpdate() > 0;
    } catch (Exception ex) {
        ex.printStackTrace();
        return false; // Trả về false nếu có lỗi xảy ra
    } finally {
        // Đảm bảo đóng kết nối và tuyên bố tài nguyên sau khi sử dụng xong
        if (ps != null) {
            ps.close();
        }
        if (con != null) {
            con.close();
        }
    }
}

    
    
        public boolean ThemPN(PhieuNhapDTO pn) throws Exception{
            try {
                String sql = "INSERT INTO PHIEUNHAP (MAPN, MAND, TGNHAP, MASACH, SL) VALUES(? ,?, ?, ?, ?)";

                con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.56.1:1521:orcldb", "C##UITthuvien", "uitthuvien");

                ps = con.prepareStatement(sql);
                ps.setInt(1, pn.getMaPN());
                ps.setString(2, pn.getStrMaND());
                ps.setDate(3, new java.sql.Date(pn.getDateNgNhap().getTime()));
                ps.setString(4, pn.getStrMaSach());

                ps.setInt(5, pn.getSL());
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
            return ps.executeUpdate()>0;  

        }
    
    
    public ArrayList<PhieuNhapDTO> showTenNV(String mand) throws Exception {
        ArrayList<PhieuNhapDTO> DSBN = new ArrayList<>();
        try{
            String sql = "SELECT TENND FROM NGUOIDUNG where MAND=? ";
            
            con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.56.1:1521:orcldb", "C##UITthuvien", "uitthuvien");
            
            ps = con.prepareStatement(sql);
            ps.setString(1, mand);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
            PhieuNhapDTO cms  = new PhieuNhapDTO();
            
            
            cms.setStrHoTen(rs.getString("TENND"));
            DSBN.add(cms);
             }
            con.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return DSBN;
        
}
    
    public String getMS(String tensach) throws Exception {
    String MS = null;
    try {
        String sql = "SELECT MASACH FROM SACH where TENSACH=? ";

        con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.56.1:1521:orcldb", "C##UITthuvien", "uitthuvien");

        ps = con.prepareStatement(sql);
        ps.setString(1, tensach);
        ResultSet rs = ps.executeQuery();

        // Kiểm tra xem ResultSet có dòng dữ liệu không trước khi truy xuất
        if (rs.next()) {
            MS = rs.getString("MASACH");
        }

        con.close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return MS;
}
    
    
    public ArrayList<PhieuNhapDTO> showDonGia(String tensach) throws Exception {
        ArrayList<PhieuNhapDTO> DSBN = new ArrayList<>();
        try{
            String sql = "SELECT TRIGIA FROM SACH where TENSACH=? ";
            
            con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.56.1:1521:orcldb", "C##UITthuvien", "uitthuvien");
            
            ps = con.prepareStatement(sql);
            ps.setString(1, tensach);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
            PhieuNhapDTO cms  = new PhieuNhapDTO();
            
            
            cms.setDonGia(rs.getDouble("TRIGIA"));
            DSBN.add(cms);
             }
            con.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return DSBN;
        
}
    
    public ArrayList<PhieuNhapDTO> getDSPN() throws Exception {
        ArrayList<PhieuNhapDTO> DSPN = new ArrayList<>();
        try {
            String sql = "SELECT PN.MAND, PN.MASACH, PN.MAPN, PN.SL, PN.TGNHAP, ND.TENND, S.TENSACH, S.TRIGIA " +
                         "FROM PHIEUNHAP PN " +
                         "JOIN NGUOIDUNG ND ON PN.MAND = ND.MAND " +
                         "JOIN SACH S ON PN.MASACH = S.MASACH";
            
            con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.56.1:1521:orcldb", "C##UITthuvien", "uitthuvien");
            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                PhieuNhapDTO cms = new PhieuNhapDTO();
                cms.setStrMaND(rs.getString("MAND"));
                cms.setStrMaSach(rs.getString("MASACH"));
                cms.setMaPN(rs.getInt("MAPN"));
                cms.setSL(rs.getInt("SL"));
                cms.setDateNgNhap(rs.getDate("TGNHAP"));
                cms.setStrHoTen(rs.getString("TENND"));
                cms.setStrTenSach(rs.getString("TENSACH"));
                cms.setDonGia(rs.getDouble("TRIGIA"));
                DSPN.add(cms);
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception("Error retrieving data", ex);
        }
        return DSPN;
    
    }
        

    
}
