/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuvienGUIAdmin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import static thuvienGUI.InitPublic.getConvertYYYYMMDD;


/**
 *
 * @author RAVEN
 */
public class Form_6 extends javax.swing.JPanel {
    DefaultTableModel model;
    
    
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public void updateDB () {
        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.56.1:1521:orcldb", "C##UITthuvien", "uitthuvien");
            String sql = "SELECT * FROM PHIEUTHU";
            ps = conn.prepareStatement(sql);
            
            rs = ps.executeQuery();
            model.setRowCount(0);

        // Iterate over the result set and add each row to the table model
        while (rs.next()) {
            
        Object[] rowData = {
            rs.getString("MAPT"),
            rs.getString("MAPM"),
            rs.getString("MADG"),
            rs.getString("MAND"),
            rs.getString("TONGNO"),
            rs.getString("TIENTHU"),
            rs.getString("TIENCONLAI"),
            rs.getString("TGPT"),
        };
        model.addRow(rowData); // Thêm dòng vào bảng
    
        }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }  // TODO add your handling code here
    }
    
    
    public void resetRender() {
        MaPT.setText("");
        MaPM.setText("");
        MaDG.setText("");
        MaNV.setText("");
        TongNo.setText("");
        SoTienThu.setText("");
        ConLai.setText("");
        ThoiGian.setText("");
    }
    private boolean checkExistingReceipt(Connection conn, String mapm) throws SQLException {
    String query = "SELECT * FROM PHIEUTHU WHERE MAPM = ?";
    try (PreparedStatement ps = conn.prepareStatement(query)) {
        ps.setString(1, mapm);
        try (ResultSet rs = ps.executeQuery()) {
            return rs.next(); // If any row is returned, user already exists
        }
    }
    }

      
    /**
     * Creates new form Form_1
     */
    public Form_6() {
        initComponents();
        model = new DefaultTableModel();
        String tieude[]  = new String[]{ "Mã PT", "Mã PM","Mã ĐG","Mã NV","Tổng nợ","Tiền thu","Còn lại","Thời gian"};
        model.setColumnIdentifiers(tieude);
        FineTable.setModel(model);
        setVisible(true);
        
        try {
            updateDB();
        } catch (Exception ex) {
            Logger.getLogger(Form_4.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Info = new javax.swing.JPanel();
        MaPT_Text = new javax.swing.JLabel();
        MaPT = new app.bolivia.swing.JCTextField();
        Them = new rojerusan.RSMaterialButtonRectangle();
        CapNhat = new rojerusan.RSMaterialButtonRectangle();
        InfoLabel1 = new javax.swing.JLabel();
        MaPM_Text = new javax.swing.JLabel();
        MaPM = new app.bolivia.swing.JCTextField();
        MaDG_Text = new javax.swing.JLabel();
        ThoiGian = new app.bolivia.swing.JCTextField();
        ThoiGian_Text = new javax.swing.JLabel();
        MaDG = new app.bolivia.swing.JCTextField();
        TongNo_Text = new javax.swing.JLabel();
        TongNo = new app.bolivia.swing.JCTextField();
        SoTienThu_Text = new javax.swing.JLabel();
        SoTienThu = new app.bolivia.swing.JCTextField();
        ConLai_Text = new javax.swing.JLabel();
        ConLai = new app.bolivia.swing.JCTextField();
        MaNV_Text = new javax.swing.JLabel();
        MaNV = new app.bolivia.swing.JCTextField();
        Xoa1 = new rojerusan.RSMaterialButtonRectangle();
        List = new javax.swing.JPanel();
        ManageLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FineTable = new rojeru_san.complementos.RSTableMetro();

        Info.setBackground(new java.awt.Color(53, 58, 85));
        Info.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Info.setFont(new java.awt.Font("Nunito Sans 7pt", 0, 14)); // NOI18N
        Info.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MaPT_Text.setFont(new java.awt.Font("Nunito Sans 7pt ExtraBold", 1, 12)); // NOI18N
        MaPT_Text.setForeground(new java.awt.Color(255, 255, 255));
        MaPT_Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MaPT_Text.setText("MÃ PHIẾU THU");
        Info.add(MaPT_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, 30));

        MaPT.setBackground(new java.awt.Color(53, 58, 85));
        MaPT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        MaPT.setForeground(new java.awt.Color(255, 255, 255));
        MaPT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MaPT.setEnabled(false);
        MaPT.setFont(new java.awt.Font("Nunito Sans 7pt", 0, 14)); // NOI18N
        MaPT.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        MaPT.setSelectionColor(new java.awt.Color(197, 158, 217));
        Info.add(MaPT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 80, -1));

        Them.setBackground(new java.awt.Color(255, 255, 255));
        Them.setForeground(new java.awt.Color(53, 58, 85));
        Them.setText("THÊM");
        Them.setFont(new java.awt.Font("Nunito Sans 7pt ExtraBold", 1, 14)); // NOI18N
        Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemActionPerformed(evt);
            }
        });
        Info.add(Them, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 100, 50));

        CapNhat.setBackground(new java.awt.Color(255, 255, 255));
        CapNhat.setForeground(new java.awt.Color(53, 58, 85));
        CapNhat.setText("CẬP NHẬT");
        CapNhat.setFont(new java.awt.Font("Nunito Sans 7pt ExtraBold", 1, 14)); // NOI18N
        CapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CapNhatActionPerformed(evt);
            }
        });
        Info.add(CapNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 100, 50));

        InfoLabel1.setFont(new java.awt.Font("Nunito Sans 7pt ExtraBold", 1, 18)); // NOI18N
        InfoLabel1.setForeground(new java.awt.Color(255, 255, 255));
        InfoLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InfoLabel1.setText("THÔNG TIN PHIẾU THU");
        Info.add(InfoLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 90));

        MaPM_Text.setFont(new java.awt.Font("Nunito Sans 7pt ExtraBold", 1, 12)); // NOI18N
        MaPM_Text.setForeground(new java.awt.Color(255, 255, 255));
        MaPM_Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MaPM_Text.setText("MÃ PHIẾU MƯỢN");
        Info.add(MaPM_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 120, 30));

        MaPM.setBackground(new java.awt.Color(53, 58, 85));
        MaPM.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        MaPM.setForeground(new java.awt.Color(255, 255, 255));
        MaPM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MaPM.setFont(new java.awt.Font("Nunito Sans 7pt", 0, 14)); // NOI18N
        MaPM.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        MaPM.setSelectionColor(new java.awt.Color(197, 158, 217));
        Info.add(MaPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 80, -1));

        MaDG_Text.setFont(new java.awt.Font("Nunito Sans 7pt ExtraBold", 1, 12)); // NOI18N
        MaDG_Text.setForeground(new java.awt.Color(255, 255, 255));
        MaDG_Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MaDG_Text.setText("MÃ ĐỘC GIẢ");
        Info.add(MaDG_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 90, 20));

        ThoiGian.setBackground(new java.awt.Color(53, 58, 85));
        ThoiGian.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        ThoiGian.setForeground(new java.awt.Color(255, 255, 255));
        ThoiGian.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ThoiGian.setFont(new java.awt.Font("Nunito Sans 7pt", 0, 14)); // NOI18N
        ThoiGian.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        ThoiGian.setSelectionColor(new java.awt.Color(197, 158, 217));
        Info.add(ThoiGian, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 150, -1));

        ThoiGian_Text.setFont(new java.awt.Font("Nunito Sans 7pt ExtraBold", 1, 12)); // NOI18N
        ThoiGian_Text.setForeground(new java.awt.Color(255, 255, 255));
        ThoiGian_Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ThoiGian_Text.setText("THỜI GIAN");
        Info.add(ThoiGian_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 80, 30));

        MaDG.setBackground(new java.awt.Color(53, 58, 85));
        MaDG.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        MaDG.setForeground(new java.awt.Color(255, 255, 255));
        MaDG.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MaDG.setFont(new java.awt.Font("Nunito Sans 7pt", 0, 14)); // NOI18N
        MaDG.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        MaDG.setSelectionColor(new java.awt.Color(197, 158, 217));
        Info.add(MaDG, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 80, -1));

        TongNo_Text.setFont(new java.awt.Font("Nunito Sans 7pt ExtraBold", 1, 12)); // NOI18N
        TongNo_Text.setForeground(new java.awt.Color(255, 255, 255));
        TongNo_Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TongNo_Text.setText("TỔNG NỢ");
        Info.add(TongNo_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 70, 20));

        TongNo.setBackground(new java.awt.Color(53, 58, 85));
        TongNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        TongNo.setForeground(new java.awt.Color(255, 255, 255));
        TongNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TongNo.setFont(new java.awt.Font("Nunito Sans 7pt", 0, 14)); // NOI18N
        TongNo.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        TongNo.setSelectionColor(new java.awt.Color(197, 158, 217));
        Info.add(TongNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 80, -1));

        SoTienThu_Text.setFont(new java.awt.Font("Nunito Sans 7pt ExtraBold", 1, 12)); // NOI18N
        SoTienThu_Text.setForeground(new java.awt.Color(255, 255, 255));
        SoTienThu_Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SoTienThu_Text.setText("SỐ TIỀN THU");
        Info.add(SoTienThu_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 100, 20));

        SoTienThu.setBackground(new java.awt.Color(53, 58, 85));
        SoTienThu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        SoTienThu.setForeground(new java.awt.Color(255, 255, 255));
        SoTienThu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SoTienThu.setFont(new java.awt.Font("Nunito Sans 7pt", 0, 14)); // NOI18N
        SoTienThu.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        SoTienThu.setSelectionColor(new java.awt.Color(197, 158, 217));
        Info.add(SoTienThu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 80, -1));

        ConLai_Text.setFont(new java.awt.Font("Nunito Sans 7pt ExtraBold", 1, 12)); // NOI18N
        ConLai_Text.setForeground(new java.awt.Color(255, 255, 255));
        ConLai_Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ConLai_Text.setText("CÒN LẠI");
        Info.add(ConLai_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 80, 30));

        ConLai.setBackground(new java.awt.Color(53, 58, 85));
        ConLai.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        ConLai.setForeground(new java.awt.Color(255, 255, 255));
        ConLai.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ConLai.setFont(new java.awt.Font("Nunito Sans 7pt", 0, 14)); // NOI18N
        ConLai.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        ConLai.setSelectionColor(new java.awt.Color(197, 158, 217));
        Info.add(ConLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 80, -1));

        MaNV_Text.setFont(new java.awt.Font("Nunito Sans 7pt ExtraBold", 1, 12)); // NOI18N
        MaNV_Text.setForeground(new java.awt.Color(255, 255, 255));
        MaNV_Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MaNV_Text.setText("MÃ NHÂN VIÊN");
        Info.add(MaNV_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 110, 20));

        MaNV.setBackground(new java.awt.Color(53, 58, 85));
        MaNV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        MaNV.setForeground(new java.awt.Color(255, 255, 255));
        MaNV.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MaNV.setFont(new java.awt.Font("Nunito Sans 7pt", 0, 14)); // NOI18N
        MaNV.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        MaNV.setSelectionColor(new java.awt.Color(197, 158, 217));
        Info.add(MaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 80, -1));

        Xoa1.setBackground(new java.awt.Color(255, 255, 255));
        Xoa1.setForeground(new java.awt.Color(53, 58, 85));
        Xoa1.setText("XÓA");
        Xoa1.setFont(new java.awt.Font("Nunito Sans 7pt ExtraBold", 1, 14)); // NOI18N
        Xoa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Xoa1ActionPerformed(evt);
            }
        });
        Info.add(Xoa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 100, 50));

        List.setBackground(new java.awt.Color(255, 255, 255));
        List.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManageLabel.setFont(new java.awt.Font("Nunito Sans 7pt ExtraBold", 1, 24)); // NOI18N
        ManageLabel.setForeground(new java.awt.Color(53, 58, 85));
        ManageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ManageLabel.setText("DANH SÁCH PHIẾU THU TIỀN PHẠT");
        List.add(ManageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 480, 40));

        FineTable.setForeground(new java.awt.Color(53, 58, 85));
        FineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Phiếu Thu", "Mã Phiếu Mượn", "Người lập phiếu", "Thời gian"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        FineTable.setColorBackgoundHead(new java.awt.Color(53, 58, 85));
        FineTable.setColorFilasForeground1(new java.awt.Color(53, 58, 85));
        FineTable.setColorFilasForeground2(new java.awt.Color(53, 58, 85));
        FineTable.setColorSelBackgound(new java.awt.Color(255, 153, 102));
        FineTable.setColorSelForeground(new java.awt.Color(53, 58, 85));
        FineTable.setFont(new java.awt.Font("Nunito Sans 7pt", 0, 14)); // NOI18N
        FineTable.setFuenteFilas(new java.awt.Font("Nunito Sans 7pt ExtraBold", 0, 14)); // NOI18N
        FineTable.setFuenteFilasSelect(new java.awt.Font("Nunito Sans 7pt ExtraBold", 1, 14)); // NOI18N
        FineTable.setFuenteHead(new java.awt.Font("Nunito Sans 7pt ExtraBold", 1, 14)); // NOI18N
        FineTable.setRowHeight(30);
        FineTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FineTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(FineTable);

        List.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 650, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(List, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Info, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(List, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemActionPerformed
        // TODO add your handling code here:
            if (MaPM.getText().isEmpty() || MaDG.getText().isEmpty() || MaNV.getText().isEmpty() || TongNo.getText().isEmpty() ||SoTienThu.getText().isEmpty() ||ConLai.getText().isEmpty() || ThoiGian.getText().isEmpty() ) {
    JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin.", "Lỗi", JOptionPane.ERROR_MESSAGE);
    return; // Stop further execution if any required field is empty
}
    String mapm = MaPM.getText();
    String madg = MaDG.getText();
    String manv = MaNV.getText();
    String tongNo = TongNo.getText();
    String tienThu = SoTienThu.getText();
    String conLai = ConLai.getText();
    String tg = ThoiGian.getText();
    
    try {
        // Connect to the database
        conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.56.1:1521:orcldb", "C##UITthuvien", "uitthuvien");


        
        if (checkExistingReceipt(conn, mapm)) {
            JOptionPane.showMessageDialog(this, "Mã phiếu mượn đã tồn tại trong hệ thống. Vui lòng chọn một mã phiếu mượn khác.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String maxMaPTQuery = "SELECT MAX(MAPT)+1 AS MaxPT FROM PHIEUTHU";
        ps = conn.prepareStatement(maxMaPTQuery);
        rs = ps.executeQuery();
        String id = "";
        if (rs.next()) {
        id = rs.getString("MaxPT");
        }            
      
       // Prepare SQL statement for inserting a new user
        String sql = "INSERT INTO PHIEUTHU (MAPT,MAPM,MADG,MAND,TENND,TONGNO,TIENTHU,TIENCONLAI,TGPT) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        ps = conn.prepareStatement(sql);
        ps.setString(1, id);
        ps.setDouble(2, Double.parseDouble(mapm));
        ps.setString(3, madg);
        ps.setString(4, manv);
        ps.setString(5, "Tên ND " + id);
        ps.setDouble(6, Double.parseDouble(tongNo));
        ps.setDouble(7, Double.parseDouble(tienThu));
        ps.setDouble(8, Double.parseDouble(conLai));
        java.sql.Date sqlDate = new java.sql.Date(getConvertYYYYMMDD(tg).getTime());
        ps.setDate(9, sqlDate);
        // Execute the SQL statement to insert the new user
        int inserted = ps.executeUpdate();

        if (inserted > 0) {
            // If insertion is successful, show success message
            JOptionPane.showMessageDialog(this, "Thêm phiếu thu mới thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            
            // Clear input fields after insertion
            resetRender();
            
            // Update the table after insertion
            updateDB();
        } else {
            // If insertion fails, show error message
            JOptionPane.showMessageDialog(this, "Không thể thêm phiếu thu mới. Vui lòng thử lại sau.", "Lỗi ", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException ex) {
        // If an SQL exception occurs, show error message and print stack trace for debugging
        JOptionPane.showMessageDialog(this, "Không thể thêm phiếu thu mới. Vui lòng thử lại sau.", "SQL Exception", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }   catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Không thể thêm phiếu thu mới. Vui lòng thử lại sau.", "Lỗi định dạng chuỗi", JOptionPane.ERROR_MESSAGE);        } finally {
        // Close resources
        try {
            if (ps != null) ps.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            // If closing resources fails, show error message
            JOptionPane.showMessageDialog(null, e);
        }
    }
    }//GEN-LAST:event_ThemActionPerformed

    private void CapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CapNhatActionPerformed
        // TODO add your handling code here:
         int selectedRow = FineTable.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn một phiếu thu để cập nhật.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // Get the user ID from the selected row
    String maPT = (String) FineTable.getValueAt(selectedRow, 0);

    // Assuming you have JTextField components for users to input updated information
    String mapm = MaPM.getText();
    String madg = MaDG.getText();
    String manv = MaNV.getText();
    String tongNo = TongNo.getText();
    String tienThu = SoTienThu.getText();
    String conLai = ConLai.getText();
    String tg = ThoiGian.getText();

    try {
        // Update the user information in the database
        conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.56.1:1521:orcldb", "C##UITthuvien", "uitthuvien");
        String sql = "UPDATE PHIEUTHU SET MAPM = ?, MADG = ?, MAND = ?, TONGNO = ?, TIENTHU = ?, TIENCONLAI = ?, TGPT = ? WHERE MAPT = ?";
        ps = conn.prepareStatement(sql);
        ps.setDouble(1, Double.parseDouble(mapm));
        ps.setString(2, madg);
        ps.setString(3, manv);
        ps.setDouble(4, Double.parseDouble(tongNo));
        ps.setDouble(5, Double.parseDouble(tienThu));
        ps.setDouble(6, Double.parseDouble(conLai));
        java.sql.Date sqlDate = new java.sql.Date(getConvertYYYYMMDD(tg).getTime());
        ps.setDate(7, sqlDate);
        ps.setString(8, maPT);
        int updated = ps.executeUpdate();

        if (updated > 0) {
            // If update is successful, update the table
            JOptionPane.showMessageDialog(this, "Thông tin phiếu thu đã được cập nhật thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            // Update the table after update
            updateDB();
        } else {
            JOptionPane.showMessageDialog(this, "Không thể cập nhật thông tin phiếu thu. Vui lòng thử lại sau.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Không thể cập nhật thông tin phiếu thu. Vui lòng thử lại sau.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace(); // Print the error to console for debugging
    }   catch (ParseException ex) {
            Logger.getLogger(Form_6.class.getName()).log(Level.SEVERE, null, ex);
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
    }//GEN-LAST:event_CapNhatActionPerformed

    private void Xoa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Xoa1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = FineTable.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn một phiếu thu để xóa.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Get the user ID from the selected row
    String maPT = (String) FineTable.getValueAt(selectedRow, 0);

    // Display a confirmation dialog for deleting the user
    int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa phiếu thu này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
    if (option == JOptionPane.YES_OPTION) {
        try {
            // Delete the user from the database
            conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.56.1:1521:orcldb", "C##UITthuvien", "uitthuvien");
            String sql = "DELETE FROM PHIEUTHU WHERE MAPT = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, maPT);
            int deleted = ps.executeUpdate();

            if (deleted > 0) {
                // If deletion is successful, update the table
                JOptionPane.showMessageDialog(this, "Đã xóa phiếu thu thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                // Update the table after deletion
                updateDB();
            } else {
                JOptionPane.showMessageDialog(this, "Không thể xóa phiếu thu. Vui lòng thử lại sau.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Không thể xóa phiếu thu. Vui lòng thử lại sau.", "Lỗi", JOptionPane.ERROR_MESSAGE);
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
    }//GEN-LAST:event_Xoa1ActionPerformed

    private void FineTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FineTableMouseClicked
        int rowNo = FineTable.getSelectedRow();
        TableModel model = FineTable.getModel();
        MaPT.setText(model.getValueAt(rowNo, 0).toString());
        MaPM.setText(model.getValueAt(rowNo, 1).toString());
        MaDG.setText(model.getValueAt(rowNo, 2).toString());
        MaNV.setText(model.getValueAt(rowNo, 3).toString());
        TongNo.setText(model.getValueAt(rowNo, 4).toString());
        SoTienThu.setText(model.getValueAt(rowNo, 5).toString());
        ConLai.setText(model.getValueAt(rowNo, 6).toString());
        ThoiGian.setText(model.getValueAt(rowNo, 7).toString());
    }//GEN-LAST:event_FineTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle CapNhat;
    private app.bolivia.swing.JCTextField ConLai;
    private javax.swing.JLabel ConLai_Text;
    private rojeru_san.complementos.RSTableMetro FineTable;
    private javax.swing.JPanel Info;
    private javax.swing.JLabel InfoLabel1;
    private javax.swing.JPanel List;
    private app.bolivia.swing.JCTextField MaDG;
    private javax.swing.JLabel MaDG_Text;
    private app.bolivia.swing.JCTextField MaNV;
    private javax.swing.JLabel MaNV_Text;
    private app.bolivia.swing.JCTextField MaPM;
    private javax.swing.JLabel MaPM_Text;
    private app.bolivia.swing.JCTextField MaPT;
    private javax.swing.JLabel MaPT_Text;
    private javax.swing.JLabel ManageLabel;
    private app.bolivia.swing.JCTextField SoTienThu;
    private javax.swing.JLabel SoTienThu_Text;
    private rojerusan.RSMaterialButtonRectangle Them;
    private app.bolivia.swing.JCTextField ThoiGian;
    private javax.swing.JLabel ThoiGian_Text;
    private app.bolivia.swing.JCTextField TongNo;
    private javax.swing.JLabel TongNo_Text;
    private rojerusan.RSMaterialButtonRectangle Xoa1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
