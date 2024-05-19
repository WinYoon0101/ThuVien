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
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
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
        btnTra = new javax.swing.JLabel();
        btnMuon = new javax.swing.JLabel();
        btnXoa = new javax.swing.JLabel();
        btnSua = new javax.swing.JLabel();
        txtsearch = new rojerusan.RSMetroTextPlaceHolder();
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

        btnTra.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTra.setForeground(new java.awt.Color(0, 0, 204));
        btnTra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/icons8_back_to_65px_1.png"))); // NOI18N
        btnTra.setText("TRẢ");
        btnTra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTraMouseClicked(evt);
            }
        });

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

        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(0, 0, 204));
        btnXoa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/icons8_delete_55px.png"))); // NOI18N
        btnXoa.setText("XÓA");
        btnXoa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnXoa.setIconTextGap(13);
        btnXoa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSua.setForeground(new java.awt.Color(0, 0, 204));
        btnSua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/icons8_settings_70px.png"))); // NOI18N
        btnSua.setText("SỬA");
        btnSua.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSua.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaMouseClicked(evt);
            }
        });

        txtsearch.setText("Nhập nội dung tìm kiếm");
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsearchKeyTyped(evt);
            }
        });

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
                .addComponent(btnTra, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnMuon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnTra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.TRAILING)
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

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked
        int selectedRow = table.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn phiếu mượn để sửa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    ChiTietPhieuMuon fn = new ChiTietPhieuMuon();
         fn.show();
         fn.setLocationRelativeTo(null);
         
         TableModel model = table.getModel();
    String maPM = model.getValueAt(selectedRow, 0).toString();
    String sl = model.getValueAt(selectedRow, 4).toString();
    Date nghen = (Date) model.getValueAt(selectedRow, 6);
    
    String tenDocGia = model.getValueAt(selectedRow, 2).toString();
    String tenSach = model.getValueAt(selectedRow, 3).toString();
    
    fn.setMAPM(maPM);
    fn.setSL(sl);
    fn.setngHen(nghen);
    
    fn.setMADG(tenDocGia);
    fn.setMASACH(tenSach);

    
    }//GEN-LAST:event_btnSuaMouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        int selectedRow = table.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn phiếu mượn để xóa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }
    try {
            int mapn = Integer.parseInt(table.getValueAt(selectedRow, 0).toString());
            
            
            int confirmation = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa phiếu mượn này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
    if (confirmation == JOptionPane.YES_OPTION) {
        boolean success = pm.XoaPM(mapn);
        if (success) {
            JOptionPane.showMessageDialog(this, "Đã xóa phiếu mượn!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            
            updateDB(); // Update the table to reflect changes
        } else {
            JOptionPane.showMessageDialog(this, "Xóa phiếu mượn thất bại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Hủy bỏ việc xóa phiếu mượn.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
    }
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(this, "Có lỗi xảy ra: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_btnXoaMouseClicked

    private void btnTraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTraMouseClicked
        int selectedRow = table.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn phiếu mượn để trả!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    try {
        // Assuming the first column (index 0) contains the MAPM
        int mapm = Integer.parseInt(table.getValueAt(selectedRow, 0).toString());

        // Ask for confirmation
        int confirmation = JOptionPane.showConfirmDialog(this, "Độc giả đã trả đủ sách ?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (confirmation == JOptionPane.YES_OPTION) {
            boolean success = pm.CapNhatTrangThai(mapm);
            if (success) {
                JOptionPane.showMessageDialog(this, "Đã trả sách thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                
                updateDB(); // Update the table to reflect changes
            } else {
                JOptionPane.showMessageDialog(this, "Trả sách thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Hủy bỏ việc cập nhật trạng thái.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Có lỗi xảy ra: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
    
    }//GEN-LAST:event_btnTraMouseClicked

    private void txtsearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyTyped
        
    }//GEN-LAST:event_txtsearchKeyTyped

    private void txtsearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyPressed
        
    }//GEN-LAST:event_txtsearchKeyPressed

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        DefaultTableModel ob = (DefaultTableModel) table.getModel();
        TableRowSorter <DefaultTableModel> obj  = new TableRowSorter<>(ob) ;
        table.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(txtsearch.getText()) );
    }//GEN-LAST:event_txtsearchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnMuon;
    private javax.swing.JLabel btnSua;
    private javax.swing.JLabel btnTra;
    private javax.swing.JLabel btnXoa;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private rojeru_san.complementos.RSTableMetro table;
    private rojerusan.RSMetroTextPlaceHolder txtsearch;
    // End of variables declaration//GEN-END:variables

   
}
