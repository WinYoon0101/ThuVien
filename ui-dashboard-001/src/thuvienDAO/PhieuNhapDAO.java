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
    
}
