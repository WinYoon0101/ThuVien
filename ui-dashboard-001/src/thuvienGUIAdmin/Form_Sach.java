package thuvienGUIAdmin;

import com.model.Model_Card;
import com.model.StatusType;
import com.swing.ScrollBar;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Form_Sach extends javax.swing.JPanel {

    public Form_Sach() {
        initComponents();
        card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/stock.png")), "TỔNG SỐ SÁCH", "2000", "Tin tức"));
        card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/new.png")), "SÁCH MỚI VỀ", "150", "Chi tiết"));
        card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/flag.png")), "GIỚI THIỆU", "Review sách hay", "Tóm tắt"));
        //  add row table
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        table.addRow(new Object[]{"Cuốn theo chiều gió", "A", " Margaret Mitchell", "25 Apr,2023", StatusType.BORROWED});
        table.addRow(new Object[]{"Mặt trận bí ẩn", "B", "Brad Meltzer", "25 Apr,2023", StatusType.AVAILABLE});
        table.addRow(new Object[]{"Kỹ năng giao tiếp hiệu quả", "C", "Dale Carnegie", "25 Apr,2023", StatusType.AVAILABLE});
        table.addRow(new Object[]{"Điểm bắt đầu", "B", "John C. Maxwell", "25 Apr,2018", StatusType.NEW});
        table.addRow(new Object[]{"Hướng dẫn tự học hiệu quả", "C", "Barbara Oakley", "25 Apr,2023", StatusType.BORROWED});
        table.addRow(new Object[]{"Đứa con của người thầy", "C", "Totto-chan", "25 Apr,2018", StatusType.AVAILABLE});
        table.addRow(new Object[]{"Đường về phía trước", "A", "Nicholas Sparks", "25 Apr,2023", StatusType.AVAILABLE});
        table.addRow(new Object[]{"Giải mã bí ẩn hành tinh X", "B", "David Icke","25 Apr,2023", StatusType.NEW});
        table.addRow(new Object[]{"Sức mạnh của ngôn từ", "C", "Robin Lakoff", "25 Apr,2023", StatusType.BORROWED});
        table.addRow(new Object[]{"Nghìn Lẻ Một Đêm", "B", "Antoine Galland", "25 Apr,2023", StatusType.BORROWED});
        table.addRow(new Object[]{"Nhà Giả Kim", "A", "Paulo Coelho", "25 Apr,2023", StatusType.AVAILABLE});
        table.addRow(new Object[]{"Chuyện Xưa Tích Cũ", "C", "Tô Hoài", "25 Apr,2023", StatusType.AVAILABLE});
        table.addRow(new Object[]{"Dấu Chân Trên Cát", "A", "Nguyễn Ngọc Thạch", "25 Apr,2018", StatusType.NEW});
        table.addRow(new Object[]{"Nineteen Eighty-Four", "B", "George Orwell", "25 Apr,2023", StatusType.BORROWED});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JLayeredPane();
        card1 = new com.component.Card();
        card2 = new com.component.Card();
        card3 = new com.component.Card();
        panelBorder1 = new com.swing.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        spTable = new javax.swing.JScrollPane();
        table = new com.swing.Table();
        btsearch = new javax.swing.JButton();
        txtsearch = new javax.swing.JTextField();

        panel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        card1.setColor1(new java.awt.Color(142, 142, 250));
        card1.setColor2(new java.awt.Color(123, 123, 245));
        panel.add(card1);

        card2.setColor1(new java.awt.Color(186, 123, 247));
        card2.setColor2(new java.awt.Color(167, 94, 236));
        panel.add(card2);

        card3.setColor1(new java.awt.Color(241, 208, 62));
        card3.setColor2(new java.awt.Color(211, 184, 61));
        panel.add(card3);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setText("Sách");

        spTable.setBorder(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên sách", "Thể loại", "Tác giả", "Ngày nhập", "Tình trạng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spTable.setViewportView(table);

        btsearch.setForeground(new java.awt.Color(255, 255, 255));
        btsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/icons8_search_24px_2.png"))); // NOI18N
        btsearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        btsearch.setContentAreaFilled(false);
        btsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsearchActionPerformed(evt);
            }
        });

        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(spTable, javax.swing.GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btsearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtsearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTable, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsearchActionPerformed
    DefaultTableModel ob = (DefaultTableModel) table.getModel();
        TableRowSorter <DefaultTableModel> obj  = new TableRowSorter<>(ob) ;
        table.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(txtsearch.getText()) );
        
        
        
// TODO add your handling code here:
    }//GEN-LAST:event_btsearchActionPerformed

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        
    
    }//GEN-LAST:event_txtsearchActionPerformed

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        DefaultTableModel ob = (DefaultTableModel) table.getModel();
        TableRowSorter <DefaultTableModel> obj  = new TableRowSorter<>(ob) ;
        table.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(txtsearch.getText()) );



// TODO add your handling code here:
    }//GEN-LAST:event_txtsearchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btsearch;
    private com.component.Card card1;
    private com.component.Card card2;
    private com.component.Card card3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane panel;
    private com.swing.PanelBorder panelBorder1;
    private javax.swing.JScrollPane spTable;
    private com.swing.Table table;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
