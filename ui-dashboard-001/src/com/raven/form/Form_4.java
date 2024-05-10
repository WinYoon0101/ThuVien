/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raven.form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.management.modelmbean.ModelMBean;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import thuvienBUS.NguoiDungBUS;
import static thuvienDAO.NguoiDungDAO.connection;
import thuvienDAO.SQLConnectUnit;
import thuvienDAO.SQLConnection;
import thuvienDTO.NguoiDungDTO;
import static thuvienGUI.InitPublic.formatDate;
import static thuvienGUI.InitPublic.getID;

/**
 *
 * @author RAVEN
 */
public class Form_4 extends javax.swing.JPanel {
    
    DefaultTableModel model;
    
    
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public void updateDB () {
        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.56.1:1521:orcldb", "C##UITthuvien", "uitthuvien");
            String sql = "SELECT * FROM NGUOIDUNG ";
            ps = conn.prepareStatement(sql);
            
            rs = ps.executeQuery();
            model.setRowCount(0);

        // Iterate over the result set and add each row to the table model
        while (rs.next()) {
            if (rs.getString("VAITRO").equals("Khach hang")) {
        Object[] rowData = {
            rs.getString("MAND"),
            rs.getString("TENND"),
            rs.getString("MAIL"),
            rs.getDate("NGSINH"),
            rs.getString("GIOITINH"),
            rs.getString("DIACHI"),
            rs.getString("USERNAME"),
            rs.getString("PASS")
        };
        model.addRow(rowData); // Thêm dòng vào bảng
    }
        }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }  // TODO add your handling code here
    }
    
    
    
     public Form_4()   {       
        initComponents();  
        model = new DefaultTableModel();
        String tieude[]  = new String[]{ "Mã ND", "Họ Tên", "Email", "Ngày Sinh",
        "Giới Tính", "Địa Chỉ", "Username", "Mật khẩu"};
        model.setColumnIdentifiers(tieude);
        tblModel.setModel(model);
        setVisible(true);
        
        try {
            updateDB();
        } catch (Exception ex) {
            Logger.getLogger(Form_4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * Check đã có user hay mail trong database chưa
     */
    
    private boolean checkExistingUser(Connection conn, String username, String email) throws SQLException {
    String query = "SELECT * FROM NGUOIDUNG WHERE USERNAME = ? OR MAIL = ?";
    try (PreparedStatement ps = conn.prepareStatement(query)) {
        ps.setString(1, username);
        ps.setString(2, email);
        try (ResultSet rs = ps.executeQuery()) {
            return rs.next(); // If any row is returned, user already exists
        }
    }
    }

   
    
    
    public void resetRender() {
        txtMaKH.setText("");
        txtHoTen.setText("");
        txtEmail.setText("");
        txtDiaChi.setText("");
        txtusername.setText("");
        txtMatKhau.setText("");
        
        //cleat Selection Group
        GioiTinh.clearSelection();
        jdcNgaySinh.setDatoFecha(null);

    }
    
    
    
    
    
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GioiTinh = new javax.swing.ButtonGroup();
        panelColor31 = new com.raven.component.PanelColor3();
        txtusername = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rdbNu = new javax.swing.JRadioButton();
        rdbNam = new javax.swing.JRadioButton();
        lblMatKhau = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JTextField();
        jdcNgaySinh = new rojeru_san.componentes.RSDateChooser();
        btnNhapMoi = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblModel = new javax.swing.JTable();
        txtHoTen = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnTimKiem = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(915, 600));
        setRequestFocusEnabled(false);

        panelColor31.setOpaque(false);

        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Giới tính");

        GioiTinh.add(rdbNu);
        rdbNu.setForeground(new java.awt.Color(0, 0, 153));
        rdbNu.setText("Nữ");
        rdbNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNuActionPerformed(evt);
            }
        });

        GioiTinh.add(rdbNam);
        rdbNam.setForeground(new java.awt.Color(0, 0, 153));
        rdbNam.setText("Nam");
        rdbNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNamActionPerformed(evt);
            }
        });

        lblMatKhau.setForeground(new java.awt.Color(0, 0, 153));
        lblMatKhau.setText("Mật khẩu");

        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Mã người dùng");

        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Gmail");

        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Địa chỉ");

        txtMaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaKHActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChiActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Họ tên");

        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Ngày sinh");

        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Username");

        jdcNgaySinh.setFormatoFecha("dd/MM/yyyy");
        jdcNgaySinh.setPlaceholder("Ngày sinh");

        btnNhapMoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNhapMoi.setForeground(new java.awt.Color(0, 0, 153));
        btnNhapMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/icons8_add_25px_1.png"))); // NOI18N
        btnNhapMoi.setText("Nhập");
        btnNhapMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapMoiActionPerformed(evt);
            }
        });

        btnLuu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLuu.setForeground(new java.awt.Color(0, 0, 153));
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/icons8_save_25px.png"))); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnCapNhat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCapNhat.setForeground(new java.awt.Color(0, 0, 153));
        btnCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/icons8_update_file_20px.png"))); // NOI18N
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(0, 0, 153));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/icons8_delete_bin_25px.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        tblModel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblModel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblModelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblModel);

        txtHoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoTenActionPerformed(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 102));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("QUẢN LÝ ĐỘC GIẢ");

        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/icons8_search_24px_2.png"))); // NOI18N

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelColor31Layout = new javax.swing.GroupLayout(panelColor31);
        panelColor31.setLayout(panelColor31Layout);
        panelColor31Layout.setHorizontalGroup(
            panelColor31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelColor31Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(panelColor31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelColor31Layout.createSequentialGroup()
                        .addGroup(panelColor31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelColor31Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelColor31Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(15, 15, 15)
                                .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelColor31Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelColor31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMatKhau)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(371, 371, 371))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelColor31Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(rdbNam)
                        .addGroup(panelColor31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelColor31Layout.createSequentialGroup()
                                .addGap(311, 311, 311)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))
                            .addGroup(panelColor31Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(rdbNu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)))
                        .addGroup(panelColor31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelColor31Layout.createSequentialGroup()
                                .addGroup(panelColor31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtMatKhau, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelColor31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtHoTen)
                                        .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelColor31Layout.createSequentialGroup()
                                .addComponent(jdcNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                                .addGap(44, 44, 44))))
                    .addGroup(panelColor31Layout.createSequentialGroup()
                        .addComponent(btnNhapMoi)
                        .addGap(45, 45, 45)
                        .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnCapNhat)
                        .addGap(33, 33, 33)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(btnTimKiem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimKiem)
                        .addGap(44, 44, 44))
                    .addGroup(panelColor31Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelColor31Layout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelColor31Layout.setVerticalGroup(
            panelColor31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelColor31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(panelColor31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelColor31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelColor31Layout.createSequentialGroup()
                        .addGroup(panelColor31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(panelColor31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(panelColor31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelColor31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelColor31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(33, 33, 33)
                .addGroup(panelColor31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelColor31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jdcNgaySinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelColor31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdbNam)
                        .addComponent(rdbNu)))
                .addGap(27, 27, 27)
                .addGroup(panelColor31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelColor31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNhapMoi)
                        .addComponent(btnLuu)
                        .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnXoa)
                        .addComponent(btnTimKiem)))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(354, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelColor31, javax.swing.GroupLayout.PREFERRED_SIZE, 959, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelColor31, javax.swing.GroupLayout.PREFERRED_SIZE, 929, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void rdbNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbNuActionPerformed

    private void rdbNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbNamActionPerformed

    private void txtMaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaKHActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChiActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        int selectedRow = tblModel.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn một người dùng để cập nhật.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // Get the user ID from the selected row
    String maND = (String) tblModel.getValueAt(selectedRow, 0);

    // Assuming you have JTextField components for users to input updated information
    String tenND = txtHoTen.getText(); // Full Name
    String email = txtEmail.getText(); // Email
    java.sql.Date ngSinh = new java.sql.Date(jdcNgaySinh.getDatoFecha().getTime()); // Date of Birth
    String gioiTinh = rdbNam.isSelected() ? "Nam" : "Nữ";
    String diaChi = txtDiaChi.getText(); // Address
    String username = txtusername.getText(); // Username
    String password = txtMatKhau.getText(); // Password

    try {
        // Update the user information in the database
        conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.56.1:1521:orcldb", "C##UITthuvien", "uitthuvien");
        String sql = "UPDATE NGUOIDUNG SET TENND = ?, MAIL = ?, NGSINH = ?, GIOITINH = ?, DIACHI = ?, USERNAME = ?, PASS = ? WHERE MAND = ?";
        ps = conn.prepareStatement(sql);
        ps.setString(1, tenND);
        ps.setString(2, email);
        ps.setDate(3, ngSinh);
        ps.setString(4, gioiTinh);
        ps.setString(5, diaChi);
        ps.setString(6, username);
        ps.setString(7, password);
        ps.setString(8, maND);

        int updated = ps.executeUpdate();

        if (updated > 0) {
            // If update is successful, update the table
            JOptionPane.showMessageDialog(this, "Thông tin người dùng đã được cập nhật thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            // Update the table after update
            updateDB();
        } else {
            JOptionPane.showMessageDialog(this, "Không thể cập nhật thông tin người dùng. Vui lòng thử lại sau.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Không thể cập nhật thông tin người dùng. Vui lòng thử lại sau.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace(); // Print the error to console for debugging
    } finally {
        // Close resources
        try {
            if (ps != null) ps.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    resetRender();
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int selectedRow = tblModel.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn một người dùng để xóa.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Get the user ID from the selected row
    String maND = (String) tblModel.getValueAt(selectedRow, 0);

    // Display a confirmation dialog for deleting the user
    int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa người dùng này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
    if (option == JOptionPane.YES_OPTION) {
        try {
            // Delete the user from the database
            conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.56.1:1521:orcldb", "C##UITthuvien", "uitthuvien");
            String sql = "DELETE FROM NGUOIDUNG WHERE MAND = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, maND);
            int deleted = ps.executeUpdate();

            if (deleted > 0) {
                // If deletion is successful, update the table
                JOptionPane.showMessageDialog(this, "Đã xóa người dùng thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                // Update the table after deletion
                updateDB();
            } else {
                JOptionPane.showMessageDialog(this, "Không thể xóa người dùng. Vui lòng thử lại sau.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Không thể xóa người dùng. Vui lòng thử lại sau.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace(); // Print the error to console for debugging
        } finally {
            // Close resources
            try {
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    resetRender();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void txtHoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoTenActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnNhapMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapMoiActionPerformed
        
       if (txtHoTen.getText().isEmpty() || txtEmail.getText().isEmpty() || txtDiaChi.getText().isEmpty() || txtusername.getText().isEmpty() || txtMatKhau.getText().isEmpty() || jdcNgaySinh.getDatoFecha() == null || (!rdbNam.isSelected() && !rdbNu.isSelected())) {
    JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin.", "Lỗi", JOptionPane.ERROR_MESSAGE);
    return; // Stop further execution if any required field is empty
}


        
    String tenND = txtHoTen.getText(); // Full Name
    String email = txtEmail.getText(); // Email
    java.sql.Date ngSinh = new java.sql.Date(jdcNgaySinh.getDatoFecha().getTime()); // Date of Birth
    String gioiTinh = rdbNam.isSelected() ? "Nam" : "Nữ"; // Gender based on selected radio button
    String diaChi = txtDiaChi.getText(); // Address
    String username = txtusername.getText(); // Username
    String password = txtMatKhau.getText(); // Password

    
    

    
    try {
        // Connect to the database
        conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.56.1:1521:orcldb", "C##UITthuvien", "uitthuvien");

        // Check if username or email already exists
        if (checkExistingUser(conn, username, email)) {
            JOptionPane.showMessageDialog(this, "Username hoặc email đã tồn tại trong hệ thống. Vui lòng chọn một username hoặc email khác.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
            String maxMaNDQuery = "SELECT MAX(MaND) AS MaxND FROM NguoiDung";
    ps = conn.prepareStatement(maxMaNDQuery);
    rs = ps.executeQuery();
    
    String id = "";
    if (rs.next()) {
        String maxnd = rs.getString("MaxND");
        id = getID(maxnd);
    }
        

        // Prepare SQL statement for inserting a new user
        String sql = "INSERT INTO NGUOIDUNG (TENND, MAIL, NGSINH, GIOITINH, DIACHI, USERNAME, PASS, VAITRO,MAND) VALUES (?, ?, ?, ?, ?, ?, ?, ?,?)";
        ps = conn.prepareStatement(sql);
        ps.setString(1, tenND);
        ps.setString(2, email);
        ps.setDate(3, ngSinh);
        ps.setString(4, gioiTinh);
        ps.setString(5, diaChi);
        ps.setString(6, username);
        ps.setString(7, password);
        ps.setString(8, "Khach hang");
        ps.setString(9, "ND" + id);
        // Execute the SQL statement to insert the new user
        int inserted = ps.executeUpdate();

        if (inserted > 0) {
            // If insertion is successful, show success message
            JOptionPane.showMessageDialog(this, "Thêm người dùng mới thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            
            // Clear input fields after insertion
            resetRender();
            
            // Update the table after insertion
            updateDB();
        } else {
            // If insertion fails, show error message
            JOptionPane.showMessageDialog(this, "Không thể thêm người dùng mới. Vui lòng thử lại sau.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException ex) {
        // If an SQL exception occurs, show error message and print stack trace for debugging
        JOptionPane.showMessageDialog(this, "Không thể thêm người dùng mới. Vui lòng thử lại sau.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    } finally {
        // Close resources
        try {
            if (ps != null) ps.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            // If closing resources fails, show error message
            JOptionPane.showMessageDialog(null, e);
        }
    }

    }//GEN-LAST:event_btnNhapMoiActionPerformed

    private void tblModelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblModelMouseClicked
        int selectedRow = tblModel.getSelectedRow();
                if (selectedRow != -1) {
                    // Lấy thông tin của sách từ hàng được chọn
                    String mand = (String) tblModel.getValueAt(selectedRow, 0);
                    String ten = (String) tblModel.getValueAt(selectedRow, 1);
                    String mail = (String) tblModel.getValueAt(selectedRow, 2);
                    Date ngsinh = (Date) tblModel.getValueAt(selectedRow, 3);
                    
                    String gt = (String) tblModel.getValueAt(selectedRow, 4);
                    String diachi = (String) tblModel.getValueAt(selectedRow, 5);
                    String user = (String) tblModel.getValueAt(selectedRow, 6);
                    String pass = (String) tblModel.getValueAt(selectedRow, 7);

                    // Hiển thị thông tin lên các vùng nhập liệu
                    
                    txtMaKH.setText(mand);
                    txtHoTen.setText(ten);
                    txtEmail.setText(mail);
                    txtDiaChi.setText(diachi);
                    txtusername.setText(user);
                    txtMatKhau.setText(pass);
                    jdcNgaySinh.setDatoFecha(ngsinh);
               
                    
                    if (gt != null && gt.equals("Nam")) {
            
             rdbNam.setSelected(true);
        } else {
            rdbNu.setSelected(true);
        }
    }                                  
    }//GEN-LAST:event_tblModelMouseClicked

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        DefaultTableModel ob = (DefaultTableModel) tblModel.getModel();
        TableRowSorter <DefaultTableModel> obj  = new TableRowSorter<>(ob) ;
        tblModel.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(txtTimKiem.getText()) );
    }//GEN-LAST:event_txtTimKiemKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GioiTinh;
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnNhapMoi;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private rojeru_san.componentes.RSDateChooser jdcNgaySinh;
    private javax.swing.JLabel lblMatKhau;
    private com.raven.component.PanelColor3 panelColor31;
    private javax.swing.JRadioButton rdbNam;
    private javax.swing.JRadioButton rdbNu;
    private javax.swing.JTable tblModel;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables

   
}
