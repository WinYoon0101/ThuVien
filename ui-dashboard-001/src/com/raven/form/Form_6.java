/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raven.form;

import javax.swing.table.TableModel;
import thuvienGUI.HomepageAdmin;

/**
 *
 * @author RAVEN
 */
public class Form_6 extends javax.swing.JPanel {

    /**
     * Creates new form Form_1
     */
    public Form_6() {
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
        Info.add(Them, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 100, 50));

        CapNhat.setBackground(new java.awt.Color(255, 255, 255));
        CapNhat.setForeground(new java.awt.Color(53, 58, 85));
        CapNhat.setText("CẬP NHẬT");
        CapNhat.setFont(new java.awt.Font("Nunito Sans 7pt ExtraBold", 1, 14)); // NOI18N
        CapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CapNhatActionPerformed(evt);
            }
        });
        Info.add(CapNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 100, 50));

        InfoLabel1.setFont(new java.awt.Font("Nunito Sans 7pt ExtraBold", 1, 18)); // NOI18N
        InfoLabel1.setForeground(new java.awt.Color(255, 255, 255));
        InfoLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InfoLabel1.setText("THÔNG TIN PHIẾU THU");
        Info.add(InfoLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 90));

        MaPM_Text.setFont(new java.awt.Font("Nunito Sans 7pt ExtraBold", 1, 12)); // NOI18N
        MaPM_Text.setForeground(new java.awt.Color(255, 255, 255));
        MaPM_Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MaPM_Text.setText("MÃ PHIẾU MƯỢN");
        Info.add(MaPM_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 100, 30));

        MaPM.setBackground(new java.awt.Color(53, 58, 85));
        MaPM.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        MaPM.setForeground(new java.awt.Color(255, 255, 255));
        MaPM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MaPM.setFont(new java.awt.Font("Nunito Sans 7pt", 0, 14)); // NOI18N
        MaPM.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        MaPM.setSelectionColor(new java.awt.Color(197, 158, 217));
        Info.add(MaPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 80, -1));

        MaDG_Text.setFont(new java.awt.Font("Nunito Sans 7pt ExtraBold", 1, 12)); // NOI18N
        MaDG_Text.setForeground(new java.awt.Color(255, 255, 255));
        MaDG_Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MaDG_Text.setText("MÃ ĐỘC GIẢ");
        Info.add(MaDG_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 80, 20));

        ThoiGian.setBackground(new java.awt.Color(53, 58, 85));
        ThoiGian.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        ThoiGian.setForeground(new java.awt.Color(255, 255, 255));
        ThoiGian.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ThoiGian.setFont(new java.awt.Font("Nunito Sans 7pt", 0, 14)); // NOI18N
        ThoiGian.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        ThoiGian.setSelectionColor(new java.awt.Color(197, 158, 217));
        Info.add(ThoiGian, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 80, -1));

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
        Info.add(SoTienThu_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 80, 20));

        SoTienThu.setBackground(new java.awt.Color(53, 58, 85));
        SoTienThu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        SoTienThu.setForeground(new java.awt.Color(255, 255, 255));
        SoTienThu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SoTienThu.setFont(new java.awt.Font("Nunito Sans 7pt", 0, 14)); // NOI18N
        SoTienThu.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        SoTienThu.setSelectionColor(new java.awt.Color(197, 158, 217));
        Info.add(SoTienThu, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 80, -1));

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
        Info.add(MaNV_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 100, 20));

        MaNV.setBackground(new java.awt.Color(53, 58, 85));
        MaNV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        MaNV.setForeground(new java.awt.Color(255, 255, 255));
        MaNV.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MaNV.setFont(new java.awt.Font("Nunito Sans 7pt", 0, 14)); // NOI18N
        MaNV.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        MaNV.setSelectionColor(new java.awt.Color(197, 158, 217));
        Info.add(MaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 80, -1));

        Xoa1.setBackground(new java.awt.Color(255, 255, 255));
        Xoa1.setForeground(new java.awt.Color(53, 58, 85));
        Xoa1.setText("XÓA");
        Xoa1.setFont(new java.awt.Font("Nunito Sans 7pt ExtraBold", 1, 14)); // NOI18N
        Xoa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Xoa1ActionPerformed(evt);
            }
        });
        Info.add(Xoa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 100, 50));

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
    }//GEN-LAST:event_ThemActionPerformed

    private void CapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CapNhatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CapNhatActionPerformed

    private void Xoa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Xoa1ActionPerformed
        // TODO add your handling code here:
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
