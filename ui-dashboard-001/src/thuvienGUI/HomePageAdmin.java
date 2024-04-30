/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuvienGUI;

import com.raven.event.EventMenuSelected;
import com.raven.form.Form_1;
import com.raven.form.Form_2;
import com.raven.form.Form_3;
import com.raven.form.Form_4;
import com.raven.form.Form_5;
import com.raven.form.Form_6;
import com.raven.form.Form_7;
import com.raven.form.Form_8;
import com.raven.form.Form_Sach;
import java.awt.Color;
import javax.swing.JComponent;

/**
 *
 * @author RAVEN
 */
public class HomepageAdmin extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    private Form_Sach home;
    private Form_1 form1;
    private Form_2 form2;
    private Form_3 form3;
    private Form_4 form4;
    private Form_5 form5;
    private Form_6 form6;
    private Form_7 form7;
    private Form_8 form8;


   
    public HomepageAdmin() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        home = new Form_Sach();
        form1 = new Form_1();
        form2 = new Form_2();
        form3 = new Form_3();
        form4 = new Form_4();
        form5 = new Form_5();
        form6 = new Form_6();
        form7 = new Form_7();
        form8 = new Form_8();



        menu.initMoving(HomepageAdmin.this);
        menu.addEventMenuSelected(new EventMenuSelected() {
            @Override
            public void selected(int index) {
                if (index == 0) {
                    setForm(form1);
                } else if (index == 1) {
                    setForm(home);
                } else if (index == 2) {
                    setForm(form2);
                } else if (index == 3) {
                    setForm(form3);
                } else if (index == 4) {
                    setForm(form4);
                } else if (index == 8) {
                    setForm(form5);
                }
                else if (index == 9) {
                    setForm(form6);
                }
                else if (index == 10) {
                    setForm(form7);
                }
                else if (index == 11) {
                    setForm(form8);
                }
            }
        });
        //  set when system open start with home form
        setForm(new Form_Sach());
    }

    private void setForm(JComponent com) {
        mainPanel.removeAll();
        mainPanel.add(com);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new com.raven.swing.PanelBorder();
        menu = new com.raven.component.Menu();
        header2 = new com.raven.component.Header();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        header2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        mainPanel.setOpaque(false);
        mainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header2, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(header2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.component.Header header2;
    private javax.swing.JPanel mainPanel;
    private com.raven.component.Menu menu;
    private com.raven.swing.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
