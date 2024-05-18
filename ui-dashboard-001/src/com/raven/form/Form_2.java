/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raven.form;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import thuvienDAO.PhieuNhapDAO;
import thuvienDTO.PhieuNhapDTO;

/**
 *
 * @author RAVEN
 */
public class Form_2 extends javax.swing.JPanel {
    PhieuNhapDAO pn = new PhieuNhapDAO();
    ArrayList<PhieuNhapDTO> pn1= new ArrayList<>();
    
    DefaultTableModel dtm;
    
    public Form_2()  {
        initComponents();
        dtm = new DefaultTableModel();
        String tieude[] = new String[]{ "Mã PN", "Mã NV", "Tên sách", "Ngày nhập",
            "Số Lượng", "Đơn giá", "Thành tiền"};
        dtm.setColumnIdentifiers(tieude);
        table.setModel(dtm);
        
        // Cập nhật dữ liệu cho bảng
        updateDB();
        
    }
    
    public void updateDB () {
        
        dtm.setRowCount(0);
        ArrayList<PhieuNhapDTO> arr = new ArrayList<>();
        try {
            arr = pn.getDSPN();
            for (PhieuNhapDTO dto : arr) {
    
    int mapn = dto.getMaPN();
    
    String maNV = dto.getStrMaND();
    String tenSach = dto.getStrTenSach();
    Date ngNhap = dto.getDateNgNhap(); // Assuming this is a java.util.Date
    
    int sl = dto.getSL();
    Double dongia = dto.getDonGia();
    double tong= sl*dongia;
    
    Object[] row = {mapn, maNV,tenSach,ngNhap, sl,dongia,tong };
    dtm.addRow(row);
}
        } catch (Exception ex) {
            Logger.getLogger(Form_2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
     
    
//    @SuppressWarnings("unchecked");
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaPN = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TenSach = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtSL = new javax.swing.JTextField();
        txtDonGia = new javax.swing.JTextField();
        txtMaNV = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        table = new rojeru_san.complementos.RSTableMetro();
        jdcNgaySinh = new rojeru_san.componentes.RSDateChooser();
        btnThem = new rojerusan.RSMaterialButtonRectangle();
        btnXoa = new rojerusan.RSMaterialButtonRectangle();
        btnCapNhat = new rojerusan.RSMaterialButtonRectangle();
        btnReset = new rojerusan.RSMaterialButtonRectangle();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(236, 245, 252));
        setPreferredSize(new java.awt.Dimension(915, 600));

        jPanel1.setBackground(new java.awt.Color(238, 252, 253));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel2.setBackground(new java.awt.Color(51, 204, 255));
        jLabel2.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("THÔNG TIN PHIẾU NHẬP");

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CHI TIẾT PHIẾU NHẬP");

        txtMaPN.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel4.setText("MÃ SỐ");

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel5.setText("TÊN NHÂN VIÊN");

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel6.setText("MÃ PHIẾU NHẬP");

        txtTen.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTen.setBorder(null);
        txtTen.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTen.setEnabled(false);
        txtTen.setOpaque(true);

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel7.setText("THỜI GIAN");

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel8.setText("TÊN SÁCH");

        TenSach.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đắc Nhân Tâm", "7 Thói Quen", "Nhà Giả Kim", "Tu Duy Nhanh", "Chiến Lược Xanh", "Quẳng Gánh Lo", "Sống Thực Tế Trên Đời ", "Phật pháp nhiệm màu", "Tiếng Chim Hót", "Điểm Bùng", "Nhật ký của Anne Frank", "Sức mạnh của thói quen", "Tôi đã bán một triệu", "Ngày xưa có một chuyện tình", "Những nguyên tắc thành công", "Đánh thức con người phi thường", "Chúng ta nên sống như thế nào?", "Hành trình về phương Đông", "Tin tức từ hành tinh xa" }));
        TenSach.setBorder(null);
        TenSach.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TenSach.setFocusable(false);
        TenSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TenSachActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel9.setText("SỐ LƯỢNG");

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("ĐƠN GIÁ");

        txtSL.setBorder(null);
        txtSL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSLKeyReleased(evt);
            }
        });

        txtDonGia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDonGia.setForeground(new java.awt.Color(255, 255, 255));
        txtDonGia.setBorder(null);
        txtDonGia.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDonGia.setEnabled(false);

        txtMaNV.setBorder(null);
        txtMaNV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMaNVKeyPressed(evt);
            }
        });

        table.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã PN", "Mã NV", "Tên sách", "Ngày nhập", "Số lượng", "Đơn giá", "Thành tiền"
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
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table);

        jdcNgaySinh.setFormatoFecha("\ndd/MM/yyyy");
        jdcNgaySinh.setPlaceholder("Ngày/Tháng/Năm");

        btnThem.setText("Thêm");
        btnThem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnCapNhat.setText("Sửa");
        btnCapNhat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCapNhat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCapNhatMouseClicked(evt);
            }
        });
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addComponent(txtMaPN)
                    .addComponent(jLabel7)
                    .addComponent(jdcNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(137, 137, 137)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TenSach, 0, 298, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(34, 34, 34)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDonGia, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TenSach))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtTen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSL)
                            .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(5, 5, 5)
                        .addComponent(txtMaPN, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jdcNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(106, 106, 106));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PHIẾU NHẬP SÁCH");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCapNhatActionPerformed

    public void resetRender() {
        txtMaNV.setText("");
        txtTen.setText("");
        txtMaPN.setText("");
        txtSL.setText("");
        txtDonGia.setText("");
        TenSach.setSelectedIndex(0);
        
        //cleat Selection Group
        
        jdcNgaySinh.setDatoFecha(null);
    }
    
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        resetRender();
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtMaNVKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaNVKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                pn1 = pn.showTenNV(txtMaNV.getText());
                StringBuilder names = new StringBuilder();
                for (PhieuNhapDTO dto : pn1) {
                    if (names.length() > 0) {
                        names.append(", ");
                    }
                    names.append(dto.getStrHoTen());
                }
                txtTen.setText(names.toString());
            } catch (Exception ex) {
                Logger.getLogger(Form_2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_txtMaNVKeyPressed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int rowNo = table.getSelectedRow();
        TableModel model = table.getModel();
        txtMaNV.setText(model.getValueAt(rowNo, 1).toString());
        
        txtMaPN.setText(model.getValueAt(rowNo, 0).toString());
        txtSL.setText(model.getValueAt(rowNo, 4).toString());
        TenSach.setSelectedItem(model.getValueAt(rowNo, 2));
        txtDonGia.setText(model.getValueAt(rowNo, 5).toString());
        Date ngnhap = (Date) model.getValueAt(rowNo, 3);
        jdcNgaySinh.setDatoFecha(ngnhap);
    }//GEN-LAST:event_tableMouseClicked

    private void txtSLKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSLKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSLKeyReleased

    private void TenSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TenSachActionPerformed
        try {
                pn1 = pn.showDonGia(String.valueOf(TenSach.getSelectedItem()));
                if (!pn1.isEmpty()) {
            // Lấy giá trị DonGia từ đối tượng đầu tiên trong danh sách
            PhieuNhapDTO dto = pn1.get(0);
            txtDonGia.setText(String.valueOf(dto.getDonGia()));
        } else {
            // Nếu không có kết quả, đặt txtDonGia là rỗng
            txtDonGia.setText("");
        }
            } catch (Exception ex) {
                Logger.getLogger(Form_2.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_TenSachActionPerformed

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        if (txtTen.getText().isEmpty() || txtMaNV.getText().isEmpty() || txtMaPN.getText().isEmpty() || txtSL.getText().isEmpty() || txtDonGia.getText().isEmpty() || jdcNgaySinh.getDatoFecha() == null ) {
    JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin.", "Lỗi", JOptionPane.ERROR_MESSAGE);
    return; // Stop further execution if any required field is empty
}
        
        try {
            PhieuNhapDTO pnDto = new PhieuNhapDTO();
            pnDto.setMaPN(Integer.parseInt(txtMaPN.getText()));
            pnDto.setStrMaND(txtMaNV.getText());
            pnDto.setDateNgNhap(new java.sql.Date(jdcNgaySinh.getDatoFecha().getTime()));
            
            pnDto.setSL(Integer.parseInt(txtSL.getText()));
            pnDto.setDonGia(Double.parseDouble(txtDonGia.getText()));
            pnDto.setStrMaSach(pn.getMS((String) TenSach.getSelectedItem()));
            
            if (pn.checkExistingMaPN(pnDto.getMaPN())) {
            JOptionPane.showMessageDialog(this, "Mã Phiếu nhập đã tồn tại trong hệ thống. Vui lòng nhập Mã PN khác!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

            boolean success = pn.ThemPN(pnDto);
            if (success) {
                JOptionPane.showMessageDialog(this, "Thêm phiếu nhập thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                resetRender();
                updateDB();
            } else {
                JOptionPane.showMessageDialog(this, "Thêm phiếu nhập thất bại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(this, "Có lỗi xảy ra: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        int selectedRow = table.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn phiếu nhập để xóa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }
        
        try {
            int mapn = Integer.parseInt(txtMaPN.getText());
            boolean success = pn.XoaPN(mapn);
            if (success) {
                JOptionPane.showMessageDialog(this, "Đã xóa phiếu nhập!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                resetRender();
                updateDB();
            } else {
                JOptionPane.showMessageDialog(this, "Xóa phiếu nhập thất bại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(this, "Có lỗi xảy ra: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnXoaMouseClicked

    private void btnCapNhatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCapNhatMouseClicked
        int selectedRow = table.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn phiếu nhập để cập nhật.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
        try {
            PhieuNhapDTO pnDto = new PhieuNhapDTO();
            pnDto.setMaPN(Integer.parseInt(txtMaPN.getText()));
            pnDto.setStrMaND(txtMaNV.getText());
            pnDto.setDateNgNhap(new java.sql.Date(jdcNgaySinh.getDatoFecha().getTime()));
            
            pnDto.setSL(Integer.parseInt(txtSL.getText()));
            pnDto.setDonGia(Double.parseDouble(txtDonGia.getText()));
            pnDto.setStrMaSach(pn.getMS((String) TenSach.getSelectedItem()));
            
            

            boolean success = pn.CapNhatPN(pnDto);
            if (success) {
                JOptionPane.showMessageDialog(this, "Đã cập nhật!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                resetRender();
                updateDB();
            } else {
                JOptionPane.showMessageDialog(this, "Cập nhật thất bại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(this, "Có lỗi xảy ra: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_btnCapNhatMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> TenSach;
    private rojerusan.RSMaterialButtonRectangle btnCapNhat;
    private rojerusan.RSMaterialButtonRectangle btnReset;
    private rojerusan.RSMaterialButtonRectangle btnThem;
    private rojerusan.RSMaterialButtonRectangle btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private rojeru_san.componentes.RSDateChooser jdcNgaySinh;
    private rojeru_san.complementos.RSTableMetro table;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtMaPN;
    private javax.swing.JTextField txtSL;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
