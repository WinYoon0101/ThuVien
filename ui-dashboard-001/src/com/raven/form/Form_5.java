/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raven.form;

import javax.swing.table.TableModel;

/**
 *
 * @author RAVEN
 */
public class Form_5 extends javax.swing.JPanel {

    /**
     * Creates new form Form_1
     */
    public Form_5() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Manage = new javax.swing.JPanel();
        ManageLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        StaffTable = new rojeru_san.complementos.RSTableMetro();
        Info = new javax.swing.JPanel();
        MaNV_Text = new javax.swing.JLabel();
        MaNV = new app.bolivia.swing.JCTextField();
        HoTen_Text = new javax.swing.JLabel();
        HoTen = new app.bolivia.swing.JCTextField();
        SDT_Text = new javax.swing.JLabel();
        NgaySinh = new app.bolivia.swing.JCTextField();
        NgaySinh_Text = new javax.swing.JLabel();
        SDT = new app.bolivia.swing.JCTextField();
        GioiTinh_Text = new javax.swing.JLabel();
        GioiTinh = new rojerusan.RSComboMetro();
        Email_Text = new javax.swing.JLabel();
        DiaChi = new app.bolivia.swing.JCTextField();
        DiaChi_Text = new javax.swing.JLabel();
        Email = new app.bolivia.swing.JCTextField();
        Xoa = new rojerusan.RSMaterialButtonRectangle();
        Them = new rojerusan.RSMaterialButtonRectangle();
        CapNhat = new rojerusan.RSMaterialButtonRectangle();
        InfoLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(915, 600));

        Manage.setBackground(new java.awt.Color(255, 255, 255));
        Manage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManageLabel.setFont(new java.awt.Font("Nunito Sans 7pt ExtraBold", 1, 24)); // NOI18N
        ManageLabel.setForeground(new java.awt.Color(53, 58, 85));
        ManageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ManageLabel.setText("QUẢN LÝ NHÂN VIÊN");
        Manage.add(ManageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 270, 40));

        StaffTable.setForeground(new java.awt.Color(53, 58, 85));
        StaffTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NV", "Họ Tên", "SDT", "Ngày Sinh", "Giới tính", "Email", "Địa chỉ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        StaffTable.setColorBackgoundHead(new java.awt.Color(53, 58, 85));
        StaffTable.setColorFilasForeground1(new java.awt.Color(53, 58, 85));
        StaffTable.setColorFilasForeground2(new java.awt.Color(53, 58, 85));
        StaffTable.setColorSelBackgound(new java.awt.Color(255, 153, 102));
        StaffTable.setColorSelForeground(new java.awt.Color(53, 58, 85));
        StaffTable.setFont(new java.awt.Font("Nunito Sans 7pt", 0, 12)); // NOI18N
        StaffTable.setFuenteFilas(new java.awt.Font("Nunito Sans 7pt ExtraBold", 0, 12)); // NOI18N
        StaffTable.setFuenteFilasSelect(new java.awt.Font("Nunito Sans 7pt ExtraBold", 1, 12)); // NOI18N
        StaffTable.setFuenteHead(new java.awt.Font("Nunito Sans 7pt ExtraBold", 1, 12)); // NOI18N
        StaffTable.setRowHeight(30);
        StaffTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StaffTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(StaffTable);

        Manage.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 640, 450));

        Info.setBackground(new java.awt.Color(53, 58, 85));
        Info.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MaNV_Text.setFont(new java.awt.Font("Nunito Sans 7pt ExtraBold", 1, 12)); // NOI18N
        MaNV_Text.setForeground(new java.awt.Color(255, 255, 255));
        MaNV_Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MaNV_Text.setText("MÃ NV");
        Info.add(MaNV_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 60, 30));

        MaNV.setBackground(new java.awt.Color(53, 58, 85));
        MaNV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        MaNV.setForeground(new java.awt.Color(255, 255, 255));
        MaNV.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MaNV.setFont(new java.awt.Font("Nunito Sans 7pt", 0, 14)); // NOI18N
        MaNV.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        MaNV.setSelectionColor(new java.awt.Color(197, 158, 217));
        MaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaNVActionPerformed(evt);
            }
        });
        Info.add(MaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 60, -1));

        HoTen_Text.setFont(new java.awt.Font("Nunito Sans 7pt ExtraBold", 1, 12)); // NOI18N
        HoTen_Text.setForeground(new java.awt.Color(255, 255, 255));
        HoTen_Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HoTen_Text.setText("HỌ TÊN");
        Info.add(HoTen_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 80, 30));

        HoTen.setBackground(new java.awt.Color(53, 58, 85));
        HoTen.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        HoTen.setForeground(new java.awt.Color(255, 255, 255));
        HoTen.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        HoTen.setFont(new java.awt.Font("Nunito Sans 7pt", 0, 14)); // NOI18N
        HoTen.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        HoTen.setSelectionColor(new java.awt.Color(193, 158, 217));
        HoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoTenActionPerformed(evt);
            }
        });
        Info.add(HoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 160, -1));

        SDT_Text.setFont(new java.awt.Font("Nunito Sans 7pt ExtraBold", 1, 12)); // NOI18N
        SDT_Text.setForeground(new java.awt.Color(255, 255, 255));
        SDT_Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SDT_Text.setText("SỐ ĐIỆN THOẠI");
        Info.add(SDT_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 100, 30));

        NgaySinh.setBackground(new java.awt.Color(53, 58, 85));
        NgaySinh.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        NgaySinh.setForeground(new java.awt.Color(255, 255, 255));
        NgaySinh.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NgaySinh.setFont(new java.awt.Font("Nunito Sans 7pt", 0, 14)); // NOI18N
        NgaySinh.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        NgaySinh.setSelectionColor(new java.awt.Color(197, 158, 217));
        Info.add(NgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 130, -1));

        NgaySinh_Text.setFont(new java.awt.Font("Nunito Sans 7pt ExtraBold", 1, 12)); // NOI18N
        NgaySinh_Text.setForeground(new java.awt.Color(255, 255, 255));
        NgaySinh_Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NgaySinh_Text.setText("NGÀY SINH");
        Info.add(NgaySinh_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 70, 30));

        SDT.setBackground(new java.awt.Color(53, 58, 85));
        SDT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        SDT.setForeground(new java.awt.Color(255, 255, 255));
        SDT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SDT.setFont(new java.awt.Font("Nunito Sans 7pt", 0, 14)); // NOI18N
        SDT.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        SDT.setSelectionColor(new java.awt.Color(197, 158, 217));
        Info.add(SDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 260, -1));

        GioiTinh_Text.setFont(new java.awt.Font("Nunito Sans 7pt ExtraBold", 1, 12)); // NOI18N
        GioiTinh_Text.setForeground(new java.awt.Color(255, 255, 255));
        GioiTinh_Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GioiTinh_Text.setText("GIỚI TÍNH");
        Info.add(GioiTinh_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 90, 30));

        GioiTinh.setBackground(new java.awt.Color(53, 58, 85));
        GioiTinh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nam", "Nữ" }));
        GioiTinh.setColorArrow(new java.awt.Color(53, 58, 85));
        GioiTinh.setColorBorde(new java.awt.Color(255, 255, 255));
        GioiTinh.setColorFondo(new java.awt.Color(53, 58, 85));
        GioiTinh.setFont(new java.awt.Font("Nunito Sans 7pt", 0, 14)); // NOI18N
        GioiTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GioiTinhActionPerformed(evt);
            }
        });
        Info.add(GioiTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 90, 30));

        Email_Text.setFont(new java.awt.Font("Nunito Sans 7pt ExtraBold", 1, 12)); // NOI18N
        Email_Text.setForeground(new java.awt.Color(255, 255, 255));
        Email_Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Email_Text.setText("ĐỊA CHỈ EMAIL");
        Info.add(Email_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 110, 30));

        DiaChi.setBackground(new java.awt.Color(53, 58, 85));
        DiaChi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        DiaChi.setForeground(new java.awt.Color(255, 255, 255));
        DiaChi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DiaChi.setFont(new java.awt.Font("Nunito Sans 7pt", 0, 14)); // NOI18N
        DiaChi.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        DiaChi.setSelectionColor(new java.awt.Color(197, 158, 217));
        Info.add(DiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 260, -1));

        DiaChi_Text.setFont(new java.awt.Font("Nunito Sans 7pt ExtraBold", 1, 12)); // NOI18N
        DiaChi_Text.setForeground(new java.awt.Color(255, 255, 255));
        DiaChi_Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DiaChi_Text.setText("ĐỊA CHỈ");
        Info.add(DiaChi_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 60, 30));

        Email.setBackground(new java.awt.Color(53, 58, 85));
        Email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Email.setForeground(new java.awt.Color(255, 255, 255));
        Email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Email.setFont(new java.awt.Font("Nunito Sans 7pt", 0, 14)); // NOI18N
        Email.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        Email.setSelectionColor(new java.awt.Color(197, 158, 217));
        Info.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 260, -1));

        Xoa.setBackground(new java.awt.Color(255, 255, 255));
        Xoa.setForeground(new java.awt.Color(53, 58, 85));
        Xoa.setText("XÓA");
        Xoa.setFont(new java.awt.Font("Nunito Sans 7pt ExtraBold", 1, 14)); // NOI18N
        Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaActionPerformed(evt);
            }
        });
        Info.add(Xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 80, 50));

        Them.setBackground(new java.awt.Color(255, 255, 255));
        Them.setForeground(new java.awt.Color(53, 58, 85));
        Them.setText("THÊM");
        Them.setFont(new java.awt.Font("Nunito Sans 7pt ExtraBold", 1, 14)); // NOI18N
        Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemActionPerformed(evt);
            }
        });
        Info.add(Them, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 80, 50));

        CapNhat.setBackground(new java.awt.Color(255, 255, 255));
        CapNhat.setForeground(new java.awt.Color(53, 58, 85));
        CapNhat.setText("CẬP NHẬT");
        CapNhat.setFont(new java.awt.Font("Nunito Sans 7pt ExtraBold", 1, 14)); // NOI18N
        CapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CapNhatActionPerformed(evt);
            }
        });
        Info.add(CapNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, 90, 50));

        InfoLabel1.setFont(new java.awt.Font("Nunito Sans 7pt ExtraBold", 1, 18)); // NOI18N
        InfoLabel1.setForeground(new java.awt.Color(255, 255, 255));
        InfoLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InfoLabel1.setText("THÔNG TIN NHÂN VIÊN");
        Info.add(InfoLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 230, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Manage, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Info, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Manage, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addComponent(Info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void StaffTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StaffTableMouseClicked
        int rowNo = StaffTable.getSelectedRow();
        TableModel model = StaffTable.getModel();
        MaNV.setText(model.getValueAt(rowNo, 0).toString());
        HoTen.setText(model.getValueAt(rowNo, 1).toString());
        SDT.setText(model.getValueAt(rowNo, 2).toString());
        NgaySinh.setText(model.getValueAt(rowNo, 3).toString());
        GioiTinh.setSelectedItem(model.getValueAt(rowNo, 4));
        Email.setText(model.getValueAt(rowNo, 5).toString());
        DiaChi.setText(model.getValueAt(rowNo, 6).toString());
    }//GEN-LAST:event_StaffTableMouseClicked

    private void GioiTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GioiTinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GioiTinhActionPerformed

    private void XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_XoaActionPerformed

    private void ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ThemActionPerformed

    private void CapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CapNhatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CapNhatActionPerformed

    private void MaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaNVActionPerformed

    private void HoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HoTenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle CapNhat;
    private app.bolivia.swing.JCTextField DiaChi;
    private javax.swing.JLabel DiaChi_Text;
    private app.bolivia.swing.JCTextField Email;
    private javax.swing.JLabel Email_Text;
    private rojerusan.RSComboMetro GioiTinh;
    private javax.swing.JLabel GioiTinh_Text;
    private app.bolivia.swing.JCTextField HoTen;
    private javax.swing.JLabel HoTen_Text;
    private javax.swing.JPanel Info;
    private javax.swing.JLabel InfoLabel1;
    private app.bolivia.swing.JCTextField MaNV;
    private javax.swing.JLabel MaNV_Text;
    private javax.swing.JPanel Manage;
    private javax.swing.JLabel ManageLabel;
    private app.bolivia.swing.JCTextField NgaySinh;
    private javax.swing.JLabel NgaySinh_Text;
    private app.bolivia.swing.JCTextField SDT;
    private javax.swing.JLabel SDT_Text;
    private rojeru_san.complementos.RSTableMetro StaffTable;
    private rojerusan.RSMaterialButtonRectangle Them;
    private rojerusan.RSMaterialButtonRectangle Xoa;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
