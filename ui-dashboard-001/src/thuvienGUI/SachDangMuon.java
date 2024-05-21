/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package thuvienGUI;

import com.raven.form.Form_3;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import loginvsignup.LoginView;
import static loginvsignup.LoginView.pMaND;
import thuvienBUS.NguoiDungBUS;
import thuvienDAO.PhieuMuonDAO;
import thuvienDTO.NguoiDungDTO;
import thuvienDTO.PhieuMuonDTO;

/**
 *
 * @author Admin
 */
public class SachDangMuon extends javax.swing.JFrame {
    PhieuMuonDAO pm = new PhieuMuonDAO();
    DefaultTableModel dtm;
    /**
     * Creates new form HomePage
     * @throws java.lang.Exception
     */
    public SachDangMuon() throws Exception {
        initComponents();
        NguoiDungBUS nguoidungtbl = new NguoiDungBUS();
        NguoiDungDTO nd = nguoidungtbl.getInfor(pMaND);
        
        lblHoVaTen.setText(nd.getStrHoTen());
        lblMail.setText(nd.getStrMail());
        
        setLocationRelativeTo(null);
        
        dtm = new DefaultTableModel();
        String tieude[] = new String[]{ "Mã Phiếu", "Mã độc giả","Tên độc giả", "Tên sách","Số lượng",
            "Ngày hẹn trả"};
        dtm.setColumnIdentifiers(tieude);
        table.setModel(dtm);
        
        // Cập nhật dữ liệu cho bảng
        updateDB();
    }
    
    public void updateDB () {
        
        dtm.setRowCount(0);
        ArrayList<PhieuMuonDTO> arr = new ArrayList<>();
        try {

            arr = pm.getDSPhieuMuon(pMaND);
            for (PhieuMuonDTO dto : arr) {
    
    int mapm = dto.getMAPM();
    
    
    String tenDG = dto.getTENDG();
    String tenSach = dto.getTENSACH();
    String madg=dto.getMADG();
    int sl = dto.getSL();
    // Assuming this is a java.util.Date
    Date ngTra = dto.getNgHenTra();
    
    
    
    Object[] row = {mapm, madg,tenDG,tenSach,sl,ngTra };
    dtm.addRow(row);
}
            
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Form_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        rSYearDateBeanInfo1 = new rojeru_san.componentes.RSYearDateBeanInfo();
        panelColor11 = new com.raven.component.PanelColor1();
        header1 = new com.raven.component.Header();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new rojeru_san.complementos.RSTableMetro();
        panelColor1 = new com.raven.component.PanelColor();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblHoVaTen = new javax.swing.JLabel();
        rSButtonHover3 = new rojerusan.RSButtonHover();
        rSButtonHover4 = new rojerusan.RSButtonHover();
        rSButtonHover5 = new rojerusan.RSButtonHover();
        lblMail = new javax.swing.JLabel();
        rSButtonHover2 = new rojerusan.RSButtonHover();
        rSButtonHover1 = new rojerusan.RSButtonHover();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelColor11.setOpaque(false);

        table.setForeground(new java.awt.Color(53, 58, 85));
        table.setModel(new javax.swing.table.DefaultTableModel(
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
        table.setColorBackgoundHead(new java.awt.Color(102, 0, 102));
        table.setColorFilasForeground1(new java.awt.Color(53, 58, 85));
        table.setColorFilasForeground2(new java.awt.Color(53, 58, 85));
        table.setColorSelBackgound(new java.awt.Color(152, 133, 205));
        table.setColorSelForeground(new java.awt.Color(53, 58, 85));
        table.setFont(new java.awt.Font("Nunito Sans 7pt", 0, 14)); // NOI18N
        table.setFuenteFilas(new java.awt.Font("Nunito Sans 7pt ExtraBold", 0, 14)); // NOI18N
        table.setFuenteFilasSelect(new java.awt.Font("Nunito Sans 7pt ExtraBold", 1, 14)); // NOI18N
        table.setFuenteHead(new java.awt.Font("Nunito Sans 7pt ExtraBold", 1, 14)); // NOI18N
        table.setGridColor(new java.awt.Color(0, 0, 0));
        table.setRowHeight(30);
        table.setSelectionBackground(new java.awt.Color(51, 51, 51));
        table.setSelectionForeground(new java.awt.Color(255, 255, 255));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout panelColor11Layout = new javax.swing.GroupLayout(panelColor11);
        panelColor11.setLayout(panelColor11Layout);
        panelColor11Layout.setHorizontalGroup(
            panelColor11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelColor11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header1, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelColor11Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelColor11Layout.setVerticalGroup(
            panelColor11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelColor11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        panelColor1.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/icons8_literature_80px_1.png"))); // NOI18N
        jLabel2.setText("Application");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/icons8_male_user_120px.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblHoVaTen.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        lblHoVaTen.setForeground(new java.awt.Color(255, 255, 255));
        lblHoVaTen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHoVaTen.setText("Họ Tên Khách");

        rSButtonHover3.setBackground(new java.awt.Color(152, 133, 205));
        rSButtonHover3.setForeground(new java.awt.Color(248, 238, 249));
        rSButtonHover3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/icons8_dog_house_25px.png"))); // NOI18N
        rSButtonHover3.setColorHover(new java.awt.Color(115, 87, 170));
        rSButtonHover3.setHideActionText(true);
        rSButtonHover3.setIconTextGap(20);
        rSButtonHover3.setLabel("Dashboard");
        rSButtonHover3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover3ActionPerformed(evt);
            }
        });

        rSButtonHover4.setBackground(new java.awt.Color(152, 133, 205));
        rSButtonHover4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/icons8_settings_25px.png"))); // NOI18N
        rSButtonHover4.setColorHover(new java.awt.Color(115, 87, 170));
        rSButtonHover4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover4ActionPerformed(evt);
            }
        });

        rSButtonHover5.setBackground(new java.awt.Color(152, 133, 205));
        rSButtonHover5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/10.png"))); // NOI18N
        rSButtonHover5.setColorHover(new java.awt.Color(115, 87, 170));
        rSButtonHover5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover5ActionPerformed(evt);
            }
        });

        lblMail.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        lblMail.setForeground(new java.awt.Color(255, 255, 255));
        lblMail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMail.setText("Gmail");

        rSButtonHover2.setBackground(new java.awt.Color(152, 133, 205));
        rSButtonHover2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/icons8_course_25px.png"))); // NOI18N
        rSButtonHover2.setText("Feedback");
        rSButtonHover2.setColorHover(new java.awt.Color(115, 87, 170));
        rSButtonHover2.setIconTextGap(20);
        rSButtonHover2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover2ActionPerformed(evt);
            }
        });

        rSButtonHover1.setBackground(new java.awt.Color(152, 133, 205));
        rSButtonHover1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/5.png"))); // NOI18N
        rSButtonHover1.setText("My account");
        rSButtonHover1.setColorHover(new java.awt.Color(115, 87, 170));
        rSButtonHover1.setIconTextGap(15);

        javax.swing.GroupLayout panelColor1Layout = new javax.swing.GroupLayout(panelColor1);
        panelColor1.setLayout(panelColor1Layout);
        panelColor1Layout.setHorizontalGroup(
            panelColor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
            .addGroup(panelColor1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHoVaTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(lblMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelColor1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelColor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSButtonHover1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonHover2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelColor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(rSButtonHover3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelColor1Layout.createSequentialGroup()
                            .addComponent(rSButtonHover5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(48, 48, 48)
                            .addComponent(rSButtonHover4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelColor1Layout.setVerticalGroup(
            panelColor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelColor1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblMail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(rSButtonHover3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rSButtonHover2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rSButtonHover1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(panelColor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSButtonHover4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonHover5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelColor1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelColor11, javax.swing.GroupLayout.PREFERRED_SIZE, 927, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelColor1, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
            .addComponent(panelColor11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonHover4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover4ActionPerformed

    private void rSButtonHover5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover5ActionPerformed
        LoginView login = new LoginView();
        login.setVisible(true);
        this.dispose();
        login.setLocationRelativeTo(null);
    }//GEN-LAST:event_rSButtonHover5ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        
    }//GEN-LAST:event_tableMouseClicked

    private void rSButtonHover3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover3ActionPerformed
        
        try {
            Homepage fn = new Homepage();
            fn.setVisible(true);
            fn.setLocationRelativeTo(null);
            
        } catch (Exception ex) {
            Logger.getLogger(SachDangMuon.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
        
    }//GEN-LAST:event_rSButtonHover3ActionPerformed

    private void rSButtonHover2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover2ActionPerformed

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
            java.util.logging.Logger.getLogger(SachDangMuon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SachDangMuon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SachDangMuon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SachDangMuon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new SachDangMuon().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(SachDangMuon.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.component.Header header1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHoVaTen;
    private javax.swing.JLabel lblMail;
    private com.raven.component.PanelColor panelColor1;
    private com.raven.component.PanelColor1 panelColor11;
    private rojerusan.RSButtonHover rSButtonHover1;
    private rojerusan.RSButtonHover rSButtonHover2;
    private rojerusan.RSButtonHover rSButtonHover3;
    private rojerusan.RSButtonHover rSButtonHover4;
    private rojerusan.RSButtonHover rSButtonHover5;
    private rojeru_san.componentes.RSYearDateBeanInfo rSYearDateBeanInfo1;
    private rojeru_san.complementos.RSTableMetro table;
    // End of variables declaration//GEN-END:variables
}
