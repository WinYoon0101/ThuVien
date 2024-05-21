/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuvienDAO;

import com.sun.jdi.connect.spi.Connection;
import java.beans.Statement;
import java.util.ArrayList;
import thuvienDTO.PhieuMuonDTO;
import java.sql.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
/**
 *
 * @author Admin
 */
public class PhieuMuonDAO {
    
    java.sql.Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public ArrayList<PhieuMuonDTO> getDSPM() throws Exception {
        ArrayList<PhieuMuonDTO> DSPM = new ArrayList<>();
        
        
        try {
            String sql = "SELECT PM.MAPM, PM.MAND, PM.MADG, PM.SL, PM.TGMUON, PM.TGTRA, " +
                         "ND2.TENND AS TENDG,  S.TENSACH " +
                         "FROM PHIEUMUON PM " +
                         "JOIN NGUOIDUNG ND1 ON PM.MAND = ND1.MAND " +
                         "JOIN NGUOIDUNG ND2 ON PM.MADG = ND2.MAND " +
                         "JOIN SACH S ON PM.MASACH = S.MASACH " +
                          "WHERE PM.TRANGTHAI = 'Đang mượn' ";
            
            con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.56.1:1521:orcldb", "C##UITthuvien", "uitthuvien");
            
            java.sql.Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
             LocalDate currentDate = LocalDate.now();
            
            while (rs.next()) {
                PhieuMuonDTO pm = new PhieuMuonDTO();
                pm.setMAND(rs.getString("MAND"));
                pm.setMADG(rs.getString("MADG"));
                pm.setMAPM(rs.getInt("MAPM"));
                pm.setSL(rs.getInt("SL"));
                pm.setNgMuon(rs.getDate("TGMUON"));
                pm.setNgHenTra(rs.getDate("TGTRA"));
                pm.setTENDG(rs.getString("TENDG"));
                pm.setTENSACH(rs.getString("TENSACH"));
                
                 LocalDate ngHenTra = rs.getDate("TGTRA").toLocalDate();
                LocalDate ngaySapHetHan = currentDate.plusDays(7);

if (ngHenTra.isAfter(currentDate) && ngHenTra.isBefore(ngaySapHetHan)) {
    pm.setQUAHAN("Sắp");
} else if (ngHenTra.isAfter(ngaySapHetHan)) {
    pm.setQUAHAN("Không");
} else {
    pm.setQUAHAN("Có");
}
                DSPM.add(pm);
            }
            
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception("Error retrieving data", ex);
        }
        
        return DSPM;
    }
    
    public ArrayList<PhieuMuonDTO> getDSPhieuTra() throws Exception {
        ArrayList<PhieuMuonDTO> DSPM = new ArrayList<>();
        
        
        try {
            String sql = "SELECT PM.MAPM, PM.MAND, PM.MADG, PM.SL, PM.TGMUON, PM.TGTRA, " +
                         "ND2.TENND AS TENDG,  S.TENSACH " +
                         "FROM PHIEUMUON PM " +
                         "JOIN NGUOIDUNG ND1 ON PM.MAND = ND1.MAND " +
                         "JOIN NGUOIDUNG ND2 ON PM.MADG = ND2.MAND " +
                         "JOIN SACH S ON PM.MASACH = S.MASACH " +
                          "WHERE PM.TRANGTHAI = 'Đã trả' ";
            
            con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.56.1:1521:orcldb", "C##UITthuvien", "uitthuvien");
            
            java.sql.Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            
            
            while (rs.next()) {
                PhieuMuonDTO pm = new PhieuMuonDTO();
                pm.setMAND(rs.getString("MAND"));
                pm.setMADG(rs.getString("MADG"));
                pm.setMAPM(rs.getInt("MAPM"));
                pm.setSL(rs.getInt("SL"));
                pm.setNgMuon(rs.getDate("TGMUON"));
                pm.setNgHenTra(rs.getDate("TGTRA"));
                pm.setTENDG(rs.getString("TENDG"));
                pm.setTENSACH(rs.getString("TENSACH"));
                pm.setNgTra(rs.getDate("TGTRA"));
                
               
                DSPM.add(pm);
            }
            
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception("Error retrieving data", ex);
        }
        
        return DSPM;
    }
    
    public ArrayList<PhieuMuonDTO> getDSPhieuMuon(String MaND) throws Exception {
        ArrayList<PhieuMuonDTO> DSPM = new ArrayList<>();
        
        
        try {
            String sql = "SELECT PM.MAPM, PM.MAND, PM.MADG, PM.SL, PM.TGMUON, PM.TGTRA, " +
                         "ND2.TENND AS TENDG,  S.TENSACH " +
                         "FROM PHIEUMUON PM " +
                         "JOIN NGUOIDUNG ND1 ON PM.MAND = ND1.MAND " +
                         "JOIN NGUOIDUNG ND2 ON PM.MADG = ND2.MAND " +
                         "JOIN SACH S ON PM.MASACH = S.MASACH " +
                          "WHERE PM.TRANGTHAI = 'Đang mượn' AND PM.MADG= ? ";
            
            con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.56.1:1521:orcldb", "C##UITthuvien", "uitthuvien");
            
            PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, MaND);  // Set the MaND parameter in the SQL query
        
        ResultSet rs = stmt.executeQuery();
            
            
            
            while (rs.next()) {
                PhieuMuonDTO pm = new PhieuMuonDTO();
                pm.setMAND(rs.getString("MAND"));
                pm.setMADG(rs.getString("MADG"));
                pm.setMAPM(rs.getInt("MAPM"));
                pm.setSL(rs.getInt("SL"));
                pm.setNgMuon(rs.getDate("TGMUON"));
                pm.setNgHenTra(rs.getDate("TGTRA"));
                pm.setTENDG(rs.getString("TENDG"));
                pm.setTENSACH(rs.getString("TENSACH"));
                pm.setNgTra(rs.getDate("TGTRA"));
                
               
                DSPM.add(pm);
            }
            
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception("Error retrieving data", ex);
        }
        
        return DSPM;
    }
    
    
    
    
    
    public boolean ThemPM(PhieuMuonDTO pm) throws Exception {
    try {
        String sql = "INSERT INTO PHIEUMUON (MAPM, MAND, MADG, SL, TGMUON, TGTRA, TRANGTHAI,MASACH) VALUES (?, ?, ?, ?, ?, ?, ?,?)";

        con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.56.1:1521:orcldb", "C##UITthuvien", "uitthuvien");

        ps = con.prepareStatement(sql);
        ps.setInt(1, pm.getMAPM());
        ps.setString(2, pm.getMAND());
        ps.setString(3, pm.getMADG());
        ps.setInt(4, pm.getSL());
        ps.setDate(5, new java.sql.Date(pm.getNgMuon().getTime()));
        ps.setDate(6, new java.sql.Date(pm.getNgHenTra().getTime()));
        ps.setString(7,"Đang mượn");
        ps.setString(8, pm.getMASACH());
        return ps.executeUpdate() > 0;  
    } catch (Exception ex) {
        ex.printStackTrace();
        throw new Exception("Error inserting data", ex);
    } finally {
        if (ps != null) {
            ps.close();
        }
        if (con != null) {
            con.close();
        }
    }
}
    
    public boolean XoaPM(int mapm) throws Exception {
        
        try {
            String sql = "DELETE FROM PHIEUMUON WHERE MAPM = ?";
            con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.56.1:1521:orcldb", "C##UITthuvien", "uitthuvien");
            ps = con.prepareStatement(sql);
            ps.setInt(1, mapm);

            // Execute the delete query and return true if at least one row was deleted
            return ps.executeUpdate() > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false; // Return false if an error occurs
        } finally {
            // Ensure resources are closed after use
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }

    public int getMaxMaPM() throws Exception {
    int maxMaPM = 0;
    try {
        String sql = "SELECT MAX(MAPM) AS MAX_MAPM FROM PHIEUMUON";
        con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.56.1:1521:orcldb", "C##UITthuvien", "uitthuvien");
        java.sql.Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        
        if (rs.next()) {
            maxMaPM = rs.getInt("MAX_MAPM");
        }
        
        con.close();
    } catch (Exception ex) {
        ex.printStackTrace();
        throw new Exception("Error retrieving max MAPM", ex);
    }
    return maxMaPM;
}
    
    public String showTenND(String mand) throws Exception {
    try {
        String sql = "SELECT TENND FROM NGUOIDUNG WHERE MAND = ?";
        
        con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.56.1:1521:orcldb", "C##UITthuvien", "uitthuvien");
        
        ps = con.prepareStatement(sql);
        ps.setString(1, mand);
        
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
            return rs.getString("TENND");
        }
        
        con.close();
    } catch (Exception ex) {
        ex.printStackTrace();
        throw new Exception("Error retrieving data", ex);
    }
    return null; // Trả về null nếu không tìm thấy
}

    public boolean CapNhatTrangThai(int mapm) throws Exception {
    
    try {
        String sql = "UPDATE PHIEUMUON SET TRANGTHAI = 'Đã trả' WHERE MAPM = ?";
        con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.56.1:1521:orcldb", "C##UITthuvien", "uitthuvien");
        ps = con.prepareStatement(sql);
        ps.setInt(1, mapm);

        // Execute the update query and return true if at least one row was updated
        return ps.executeUpdate() > 0;
    } catch (Exception ex) {
        ex.printStackTrace();
        return false; // Return false if an error occurs
    } finally {
        // Ensure resources are closed after use
        if (ps != null) {
            ps.close();
        }
        if (con != null) {
            con.close();
        }
    }
}

    public String getMaSach(String tenSach) throws SQLException {
        String maSach = null;

        try {
            String sql = "SELECT MASACH FROM SACH WHERE TENSACH = ?";
            con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.56.1:1521:orcldb", "C##UITthuvien", "uitthuvien");
            ps = con.prepareStatement(sql);
            ps.setString(1, tenSach);
            rs = ps.executeQuery();

            if (rs.next()) {
                maSach = rs.getString("MASACH");
            }
        } finally {
            // Đảm bảo đóng tài nguyên, ngay cả khi có ngoại lệ xảy ra
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        }

        return maSach;
    }
    
    public String getMaND(String tenND) throws SQLException {
        String maND = null;
        

        try {
            String sql = "SELECT MAND FROM NGUOIDUNG WHERE TENND = ?";
            con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.56.1:1521:orcldb", "C##UITthuvien", "uitthuvien");
            ps = con.prepareStatement(sql);
            ps.setString(1, tenND);
            rs = ps.executeQuery();

            if (rs.next()) {
                maND = rs.getString("MAND");
            }
        } finally {
            // Đảm bảo đóng tài nguyên, ngay cả khi có ngoại lệ xảy ra
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        }

        return maND;
    }
    
    public boolean CapNhatPhieuMuon(PhieuMuonDTO pm) {
    try {
        // Tạo câu lệnh SQL để cập nhật phiếu mượn
        String sql = "UPDATE PHIEUMUON SET MADG = ?, MASACH = ?, SL = ?, TGTRA = ? WHERE MAPM = ?";

        // Mở kết nối đến cơ sở dữ liệu
        con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.56.1:1521:orcldb", "C##UITthuvien", "uitthuvien");

        // Chuẩn bị câu lệnh SQL
        ps = con.prepareStatement(sql);
        ps.setString(1, pm.getMADG());
        ps.setString(2, pm.getMASACH());
        ps.setInt(3, pm.getSL());
        ps.setDate(4, new java.sql.Date(pm.getNgHenTra().getTime()));
        ps.setInt(5, pm.getMAPM());

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
}
