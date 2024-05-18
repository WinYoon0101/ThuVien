/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.raven.form;

import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import thuvienDAO.PhieuMuonDAO;
import thuvienDAO.SachDAO;
import thuvienDTO.PhieuMuonDTO;
import thuvienDTO.SachDTO;

/**
 *
 * @author Admin
 */
public class ThemPhieuMuon extends javax.swing.JFrame {
    PhieuMuonDAO pm = new PhieuMuonDAO();
    SachDAO sach = new SachDAO();
    
    DefaultTableModel dtm;
    
    public ThemPhieuMuon() {
        initComponents();
        
        int newMaPM = 0;
        try {
            newMaPM = pm.getMaxMaPM() + 1;
        } catch (Exception ex) {
            Logger.getLogger(ThemPhieuMuon.class.getName()).log(Level.SEVERE, null, ex);
        }
    txtMAPM.setText(String.valueOf(newMaPM));
    
    dtm = new DefaultTableModel();
        String tieude[] = new String[]{ "Mã sách", "Tên sách",
            "SL khả dụng"};
        dtm.setColumnIdentifiers(tieude);
        table.setModel(dtm);
        
        // Cập nhật dữ liệu cho bảng
        updateDB();
        
    }
    
    
    public void updateDB () {
        
        dtm.setRowCount(0);
        ArrayList<SachDTO> arr = new ArrayList<>();
        try {

            arr = sach.getDSSach();
            for (SachDTO dto : arr) {
    
                String mapm = dto.getStrMaSach();
    
    
    String tenSach = dto.getStrTenSach();
    int sl = dto.getSLCon();
    
    
    
    Object[] row = {mapm, tenSach,sl };
    dtm.addRow(row);
}
            
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Form_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
           
    }

    


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        rSMetroTextPlaceHolder1 = new rojerusan.RSMetroTextPlaceHolder();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtMADG = new app.bolivia.swing.JCTextField();
        jLabel21 = new javax.swing.JLabel();
        txtMANV = new app.bolivia.swing.JCTextField();
        jLabel23 = new javax.swing.JLabel();
        jdcNgMuon = new rojeru_san.componentes.RSDateChooser();
        jLabel24 = new javax.swing.JLabel();
        jdcNgHenTra = new rojeru_san.componentes.RSDateChooser();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new rojeru_san.complementos.RSTableMetro();
        txtTENSACH = new app.bolivia.swing.JCTextField();
        jLabel39 = new javax.swing.JLabel();
        txtSL = new app.bolivia.swing.JCTextField();
        jLabel41 = new javax.swing.JLabel();
        txtMASACH = new app.bolivia.swing.JCTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtMAPM = new app.bolivia.swing.JCTextField();
        jLabel40 = new javax.swing.JLabel();
        txtTENDG = new app.bolivia.swing.JCTextField();
        jLabel22 = new javax.swing.JLabel();
        txtTENNV = new app.bolivia.swing.JCTextField();
        rSMaterialButtonRectangle2 = new rojerusan.RSMaterialButtonRectangle();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(238, 252, 253));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/icons8_undo_70px.png"))); // NOI18N
        jLabel2.setText("QUAY LẠI");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Cambria", 1, 48)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 102));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("MƯỢN SÁCH");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSMetroTextPlaceHolder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rSMetroTextPlaceHolder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(29, 29, 29))))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 102));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("THÔNG TIN PHIẾU MƯỢN");

        jLabel37.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel37.setText("Mã độc giả");

        txtMADG.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        txtMADG.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txtMADG.setPhColor(new java.awt.Color(102, 102, 102));
        txtMADG.setPlaceholder("|");
        txtMADG.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMADGFocusLost(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("Mã nhân viên");

        txtMANV.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        txtMANV.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txtMANV.setPhColor(new java.awt.Color(102, 102, 102));
        txtMANV.setPlaceholder("|");
        txtMANV.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMANVFocusLost(evt);
            }
        });
        txtMANV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMANVActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Thời gian lập phiếu");

        jdcNgMuon.setColorBackground(new java.awt.Color(102, 102, 102));
        jdcNgMuon.setColorButtonHover(new java.awt.Color(102, 102, 102));
        jdcNgMuon.setColorDiaActual(new java.awt.Color(0, 0, 0));
        jdcNgMuon.setColorForeground(new java.awt.Color(102, 102, 102));
        jdcNgMuon.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jdcNgMuon.setFormatoFecha("dd/MM/yyyy\n");
        jdcNgMuon.setFuente(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jdcNgMuon.setName(""); // NOI18N
        jdcNgMuon.setPlaceholder("Ngày lập phiếu");

        jLabel24.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("Hạn trả");

        jdcNgHenTra.setColorBackground(new java.awt.Color(102, 102, 102));
        jdcNgHenTra.setColorButtonHover(new java.awt.Color(102, 102, 102));
        jdcNgHenTra.setColorDiaActual(new java.awt.Color(0, 0, 0));
        jdcNgHenTra.setColorForeground(new java.awt.Color(102, 102, 102));
        jdcNgHenTra.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jdcNgHenTra.setFormatoFecha("dd/MM/yyyy\n");
        jdcNgHenTra.setFuente(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jdcNgHenTra.setName(""); // NOI18N
        jdcNgHenTra.setPlaceholder("Ngày trả");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcNgHenTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcNgMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtMANV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMADG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel15)
                .addGap(29, 29, 29)
                .addComponent(jLabel37)
                .addGap(18, 18, 18)
                .addComponent(txtMADG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(txtMANV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel23)
                .addGap(26, 26, 26)
                .addComponent(jdcNgMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addComponent(jdcNgHenTra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 102));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("THÔNG TIN SÁCH");

        jLabel38.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel38.setText("Mã Sách");

        table.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sách", "Tên sách", "SL khả dụng"
            }
        ));
        table.setAltoHead(20);
        table.setColorBackgoundHead(new java.awt.Color(255, 255, 255));
        table.setColorBordeFilas(new java.awt.Color(102, 102, 102));
        table.setColorBordeHead(new java.awt.Color(102, 102, 102));
        table.setColorFilasBackgound1(new java.awt.Color(200, 200, 200));
        table.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        table.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        table.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        table.setColorForegroundHead(new java.awt.Color(0, 0, 0));
        table.setColorSelBackgound(new java.awt.Color(0, 0, 0));
        table.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        table.setFuenteFilas(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        table.setFuenteFilasSelect(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        table.setFuenteHead(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        table.setGridColor(new java.awt.Color(132, 132, 132));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        txtTENSACH.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        txtTENSACH.setDisabledTextColor(new java.awt.Color(0, 0, 102));
        txtTENSACH.setEnabled(false);
        txtTENSACH.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txtTENSACH.setPhColor(new java.awt.Color(204, 204, 204));

        jLabel39.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel39.setText("Số lượng");

        txtSL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        txtSL.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txtSL.setPhColor(new java.awt.Color(102, 102, 102));

        jLabel41.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel41.setText("Tên Sách");

        txtMASACH.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        txtMASACH.setDisabledTextColor(new java.awt.Color(0, 0, 102));
        txtMASACH.setEnabled(false);
        txtMASACH.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txtMASACH.setPhColor(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtMASACH, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(txtTENSACH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jLabel41))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTENSACH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMASACH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 102));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("CHI TIẾT PHIẾU MƯỢN");

        jLabel31.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setText("Mã phiếu");

        txtMAPM.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        txtMAPM.setDisabledTextColor(new java.awt.Color(0, 0, 102));
        txtMAPM.setEnabled(false);
        txtMAPM.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txtMAPM.setPhColor(new java.awt.Color(102, 102, 102));

        jLabel40.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel40.setText("Tên độc giả");

        txtTENDG.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        txtTENDG.setDisabledTextColor(new java.awt.Color(0, 0, 102));
        txtTENDG.setEnabled(false);
        txtTENDG.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txtTENDG.setPhColor(new java.awt.Color(102, 102, 102));
        txtTENDG.setPlaceholder("|");

        jLabel22.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Tên nhân viên");

        txtTENNV.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        txtTENNV.setDisabledTextColor(new java.awt.Color(0, 0, 102));
        txtTENNV.setEnabled(false);
        txtTENNV.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txtTENNV.setPhColor(new java.awt.Color(102, 102, 102));
        txtTENNV.setPlaceholder("|");
        txtTENNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTENNVActionPerformed(evt);
            }
        });

        rSMaterialButtonRectangle2.setBackground(new java.awt.Color(53, 58, 85));
        rSMaterialButtonRectangle2.setText("Xác nhận");
        rSMaterialButtonRectangle2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        rSMaterialButtonRectangle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTENDG, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(rSMaterialButtonRectangle2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(txtTENNV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE))
                    .addComponent(txtMAPM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel18)
                .addGap(35, 35, 35)
                .addComponent(jLabel31)
                .addGap(26, 26, 26)
                .addComponent(txtMAPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel40)
                .addGap(18, 18, 18)
                .addComponent(txtTENDG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(txtTENNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(rSMaterialButtonRectangle2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void txtMANVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMANVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMANVActionPerformed

    private void txtTENNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTENNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTENNVActionPerformed

    private void rSMaterialButtonRectangle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle2ActionPerformed
        if (txtMADG.getText().isEmpty() || txtMANV.getText().isEmpty() ||  txtTENNV.getText().isEmpty()|| txtTENDG.getText().isEmpty()||
        txtSL.getText().isEmpty() || txtTENSACH.getText().isEmpty() ||
        jdcNgMuon.getDatoFecha() == null || jdcNgHenTra.getDatoFecha() == null) {
        JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return; // Dừng thực hiện nếu có trường bị bỏ trống
    }

    try {
        // Lấy giá trị MAPM mới
        int newMaPM = pm.getMaxMaPM() + 1;

        // Tạo đối tượng PhieuMuonDTO và thiết lập các thuộc tính
        PhieuMuonDTO pmDto = new PhieuMuonDTO();
        pmDto.setMAPM(newMaPM);
        pmDto.setMAND(txtMANV.getText());
        pmDto.setMADG(txtMADG.getText());
        pmDto.setMASACH(txtMASACH.getText());
        pmDto.setSL(Integer.parseInt(txtSL.getText()));
        pmDto.setNgMuon(new java.sql.Date(jdcNgMuon.getDatoFecha().getTime()));
        pmDto.setNgHenTra(new java.sql.Date(jdcNgHenTra.getDatoFecha().getTime()));
        
        
        
        pmDto.setTRANGTHAI("Đang mượn");
        

        // Gọi phương thức ThemPM để thêm phiếu mượn
        boolean success = pm.ThemPM(pmDto);
        if (success) {
            JOptionPane.showMessageDialog(this, "Thêm phiếu mượn thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);          
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Thêm phiếu mượn thất bại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Có lỗi xảy ra: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_rSMaterialButtonRectangle2ActionPerformed

    private void txtMADGFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMADGFocusLost
        try {
            String madg = txtMADG.getText().trim();
            if (!madg.isEmpty()) {
                String tendg = pm.showTenND(madg); // Gọi phương thức showTenND để lấy tên độc giả từ MADG
                if (tendg != null) {
                    txtTENDG.setText(tendg); // Đặt tên độc giả vào txtTENDG
                } else {
                    JOptionPane.showMessageDialog(ThemPhieuMuon.this, "Không tồn tại độc giả với mã " + madg, "Thông báo", JOptionPane.WARNING_MESSAGE);
                    txtTENDG.setText(""); // Xóa nội dung trong txtTENDG nếu không tìm thấy tên độc giả
                }
            } else {
                txtTENDG.setText(""); // Xóa nội dung trong txtTENDG nếu MADG trống
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(ThemPhieuMuon.this, "Có lỗi xảy ra khi lấy tên độc giả: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtMADGFocusLost

    private void txtMANVFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMANVFocusLost
        try {
            String madg = txtMANV.getText().trim();
            if (!madg.isEmpty()) {
                String tendg = pm.showTenND(madg); // Gọi phương thức showTenND để lấy tên độc giả từ MADG
                if (tendg != null) {
                    txtTENNV.setText(tendg); // Đặt tên độc giả vào txtTENDG
                } else {
                    JOptionPane.showMessageDialog(ThemPhieuMuon.this, "Không tồn tại nhân viên với mã " + madg, "Thông báo", JOptionPane.WARNING_MESSAGE);
                    txtTENNV.setText(""); // Xóa nội dung trong txtTENDG nếu không tìm thấy tên độc giả
                }
            } else {
                txtTENNV.setText(""); // Xóa nội dung trong txtTENDG nếu MADG trống
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(ThemPhieuMuon.this, "Có lỗi xảy ra khi lấy tên độc giả: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtMANVFocusLost

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int rowNo = table.getSelectedRow();
        TableModel model = table.getModel();
        txtTENSACH.setText(model.getValueAt(rowNo, 1).toString());
        txtMASACH.setText(model.getValueAt(rowNo, 0).toString());
    }//GEN-LAST:event_tableMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ThemPhieuMuon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemPhieuMuon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemPhieuMuon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemPhieuMuon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemPhieuMuon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private rojeru_san.componentes.RSDateChooser jdcNgHenTra;
    private rojeru_san.componentes.RSDateChooser jdcNgMuon;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle2;
    private rojerusan.RSMetroTextPlaceHolder rSMetroTextPlaceHolder1;
    private rojeru_san.complementos.RSTableMetro table;
    private app.bolivia.swing.JCTextField txtMADG;
    private app.bolivia.swing.JCTextField txtMANV;
    private app.bolivia.swing.JCTextField txtMAPM;
    private app.bolivia.swing.JCTextField txtMASACH;
    private app.bolivia.swing.JCTextField txtSL;
    private app.bolivia.swing.JCTextField txtTENDG;
    private app.bolivia.swing.JCTextField txtTENNV;
    private app.bolivia.swing.JCTextField txtTENSACH;
    // End of variables declaration//GEN-END:variables
}
