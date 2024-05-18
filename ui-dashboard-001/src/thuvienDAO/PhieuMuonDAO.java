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
                if (currentDate.isAfter(ngHenTra.plusDays(7))) {
                    pm.setQUAHAN("Có");
                } else if (currentDate.isAfter(ngHenTra)) {
                    pm.setQUAHAN("Sắp");
                } else {
                    pm.setQUAHAN("Không");
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
    
    public boolean ThemPM(PhieuMuonDTO pm) throws Exception {
    try {
        String sql = "INSERT INTO PHIEUMUON (MAPM, MAND, MADG, SL, TGMUON, TGTRA, TRANGTHAI) VALUES (?, ?, ?, ?, ?, ?, ?)";

        con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.56.1:1521:orcldb", "C##UITthuvien", "uitthuvien");

        ps = con.prepareStatement(sql);
        ps.setInt(1, pm.getMAPM());
        ps.setString(2, pm.getMAND());
        ps.setString(3, pm.getMADG());
        ps.setInt(4, pm.getSL());
        ps.setDate(5, new java.sql.Date(pm.getNgMuon().getTime()));
        ps.setDate(6, new java.sql.Date(pm.getNgHenTra().getTime()));
        ps.setString(7,"Đang mượn");

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
    
}
