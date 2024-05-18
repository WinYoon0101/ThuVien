/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuvienDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import thuvienDTO.SachDTO;
import java.sql.*;
import java.util.Date;
/**
 *
 * @author Admin
 */
public class SachDAO {
    
    java.sql.Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public ArrayList<SachDTO> getDSSach() throws Exception {
    ArrayList<SachDTO> DSSach = new ArrayList<>();
    try {
        String sql = "SELECT S.MASACH, S.TENSACH, S.SLCONLAI " +
                     "FROM SACH S";

        con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.56.1:1521:orcldb", "C##UITthuvien", "uitthuvien");

        java.sql.Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        
        while (rs.next()) {
            SachDTO sach = new SachDTO();
            sach.setStrMaSach(rs.getString("MASACH"));
            sach.setStrTenSach(rs.getString("TENSACH"));
            sach.setSLCon(rs.getInt("SLCONLAI"));
            DSSach.add(sach);
        }
        con.close();
    } catch (Exception ex) {
        ex.printStackTrace();
        throw new Exception("Error retrieving data", ex);
    }
    return DSSach;
}

    
}
