/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuvienDAO;

import com.sun.jdi.connect.spi.Connection;
import java.sql.*;
/**
 *
 * @author Admin
 */
public class ConnectionUtils {
    
    public static Connection getMyConnection() throws Exception {
        // Cần cung cấp: URL cơ sở dữ liệu, tên người dùng và mật khẩu
        String dbURL = "jdbc:oracle:thin:@192.168.56.1:1521:orcldb";
        String username = "C##UITthuvien";
        String password = "uitthuvien";

        // Đăng ký trình điều khiển JDBC, nếu cần thiết
        Class.forName("oracle.jdbc.OracleDriver");

        // Mở kết nối
        return (Connection) DriverManager.getConnection(dbURL, username, password);
    }
}
