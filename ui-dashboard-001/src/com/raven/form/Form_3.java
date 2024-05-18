/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raven.form;

import com.itextpdf.text.log.Logger;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.clio.annotations.Debug.Level;
import thuvienDAO.PhieuMuonDAO;
import thuvienDTO.PhieuMuonDTO;

/**
 *
 * @author RAVEN
 */
public class Form_3 extends javax.swing.JPanel {

    PhieuMuonDAO pm = new PhieuMuonDAO();
    
    
    DefaultTableModel dtm;
    
    public Form_3() {
        initComponents();
        dtm = new DefaultTableModel();
        String tieude[] = new String[]{ "Mã Phiếu", "Mã NV","Tên độc giả", "Tên sách",
            "SL", "Ngày mượn", "Ngày hẹn trả","Quá hạn"};
        dtm.setColumnIdentifiers(tieude);
        table.setModel(dtm);
        
        // Cập nhật dữ liệu cho bảng
        updateDB();
    }
    
    public void updateDB () {
        
        dtm.setRowCount(0);
        ArrayList<PhieuMuonDTO> arr = new ArrayList<>();
        try {

            arr = pm.getDSPM();
            for (PhieuMuonDTO dto : arr) {
    
    int mapm = dto.getMAPM();
    
    String maNV = dto.getMAND();
    String tenDG = dto.getTENDG();
    String tenSach = dto.getTENSACH();
    int sl = dto.getSL();
    Date ngMuon = dto.getNgMuon(); // Assuming this is a java.util.Date
    Date ngHen = dto.getNgHenTra();
    String QH = dto.getQUAHAN();
    
    
    Object[] row = {mapm, maNV,tenDG,tenSach,sl,ngMuon,ngHen,QH };
    dtm.addRow(row);
}
            
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Form_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
           
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new rojeru_san.complementos.RSTableMetro();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnMuon = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rSMetroTextPlaceHolder1 = new rojerusan.RSMetroTextPlaceHolder();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(238, 252, 253));

        table.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phiếu", "Mã NV", "Tên độc giả", "Tên sách", "SL", "Ngày mượn", "Ngày hẹn trả"
            }
        ));
        table.setAltoHead(20);
        table.setColorBackgoundHead(new java.awt.Color(236, 245, 252));
        table.setColorBordeFilas(new java.awt.Color(102, 102, 102));
        table.setColorBordeHead(new java.awt.Color(102, 102, 102));
        table.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        table.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        table.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        table.setColorForegroundHead(new java.awt.Color(0, 0, 0));
        table.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        table.setFuenteFilas(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        table.setFuenteFilasSelect(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        table.setFuenteHead(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        table.setGridColor(new java.awt.Color(255, 255, 255));
        table.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(table);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/icons8_back_to_65px_1.png"))); // NOI18N
        jLabel1.setText("TRẢ");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnMuon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMuon.setForeground(new java.awt.Color(0, 0, 204));
        btnMuon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMuon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/icons8_add_new_65px.png"))); // NOI18N
        btnMuon.setText("MƯỢN");
        btnMuon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMuon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMuon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMuonMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/icons8_delete_55px.png"))); // NOI18N
        jLabel3.setText("XÓA");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setIconTextGap(13);
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/icons8_settings_70px.png"))); // NOI18N
        jLabel4.setText("SỬA");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        rSMetroTextPlaceHolder1.setText("Nhập nội dung tìm kiếm");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/icons8_info_70px_1.png"))); // NOI18N
        jLabel5.setText("PHIẾU ĐÃ TRẢ");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/icons8_reset_60px.png"))); // NOI18N
        jLabel6.setText("Tải lại");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.setIconTextGap(13);
        jLabel6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(rSMetroTextPlaceHolder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(rSMetroTextPlaceHolder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnMuon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        PhieuTraSach fn = new PhieuTraSach();
         fn.show();
         fn.setLocationRelativeTo(null);
         
        
    }//GEN-LAST:event_jLabel5MouseClicked

    private void btnMuonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMuonMouseClicked
        ThemPhieuMuon fn = new ThemPhieuMuon();
         fn.show();
         fn.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnMuonMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        updateDB();
    }//GEN-LAST:event_jLabel6MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnMuon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private rojerusan.RSMetroTextPlaceHolder rSMetroTextPlaceHolder1;
    private rojeru_san.complementos.RSTableMetro table;
    // End of variables declaration//GEN-END:variables

   
}
