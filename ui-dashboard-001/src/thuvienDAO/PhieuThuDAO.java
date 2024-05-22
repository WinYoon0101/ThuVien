/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuvienDAO;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import thuvienDTO.PhieuThuDTO;

/**
 *
 * @author ACER
 */
public class PhieuThuDAO {
    java.sql.Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    
    public ArrayList<PhieuThuDTO> getDSPT(String madg) throws Exception {
        ArrayList<PhieuThuDTO> DSPT = new ArrayList<>();
        
        
        try {
            String sql = "SELECT PT.MAPT, PT.MAPM, PT.TONGNO, PT.TIENCONLAI " +
                         "FROM PHIEUTHU PT WHERE PT.MADG = ? ";
            
            con = DriverManager.getConnection("jdbc:oracle:thin:@HacThienCau:1521:ORCLDB", "C##UITthuvien", "uitthuvien");
            ps = con.prepareStatement(sql);
            ps.setString(1, madg);         
            rs = ps.executeQuery();
            
  
            
            while (rs.next()) {
                PhieuThuDTO pt = new PhieuThuDTO();
                pt.setMAPT(rs.getString("MAPT"));
                pt.setMAPM(rs.getInt("MAPM"));
                pt.setTongNo(rs.getInt("TONGNO"));
                pt.setConLai(rs.getInt("TIENCONLAI"));
                DSPT.add(pt);
            }
            
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception("Error retrieving data", ex);
        }
        
        return DSPT;
    }
}
