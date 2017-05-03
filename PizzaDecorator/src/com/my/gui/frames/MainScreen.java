package com.my.gui.frames;

import com.my.gui.ui.uiMainScreen;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class MainScreen extends javax.swing.JFrame {

    private uiMainScreen ui;    
    
    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
        ui = new uiMainScreen(this);
    }

    public JButton getBtnAdicionarMozzarella() {
        return btnAdicionarMozzarella;
    }

    public JButton getBtnAdicionarSalsaTomate() {
        return btnAdicionarSalsa;
    }

    public JButton getBtnCrearPizza() {
        return btnCrearPizza;
    }

    public JTextArea getTxtArStatus() {
        return txtArStatus;
    }

    public JLabel getLblAgregarQueso() {
        return lblAgregarQueso;
    }

    public JLabel getLblAgregarTomate() {
        return lblAgregarTomate;
    }

    public JLabel getLblCrearPizza() {
        return lblCrearPizza;
    }
        
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtArStatus = new javax.swing.JTextArea();
        btnCrearPizza = new javax.swing.JButton();
        btnAdicionarSalsa = new javax.swing.JButton();
        btnAdicionarMozzarella = new javax.swing.JButton();
        lblCrearPizza = new javax.swing.JLabel();
        lblAgregarTomate = new javax.swing.JLabel();
        lblAgregarQueso = new javax.swing.JLabel();
        btnTestButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pizza Decorator");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusable(false);
        setFocusableWindowState(false);
        setForeground(java.awt.Color.darkGray);
        setResizable(false);

        txtArStatus.setColumns(20);
        txtArStatus.setRows(5);
        jScrollPane1.setViewportView(txtArStatus);

        btnCrearPizza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pizza.png"))); // NOI18N
        btnCrearPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPizzaActionPerformed(evt);
            }
        });

        btnAdicionarSalsa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tomate.png"))); // NOI18N
        btnAdicionarSalsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarSalsaActionPerformed(evt);
            }
        });

        btnAdicionarMozzarella.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/quezo.png"))); // NOI18N
        btnAdicionarMozzarella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarMozzarellaActionPerformed(evt);
            }
        });

        lblCrearPizza.setText("Crear pizza");

        lblAgregarTomate.setText("Agregar tomate");

        lblAgregarQueso.setText("Agregar queso");

        btnTestButton.setText("Test Method");
        btnTestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 42, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCrearPizza)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(lblCrearPizza)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(lblAgregarTomate))
                                    .addComponent(btnAdicionarSalsa))
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnAdicionarMozzarella)
                                        .addGap(34, 34, 34))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblAgregarQueso)
                                        .addGap(68, 68, 68))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(btnTestButton)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdicionarMozzarella)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAgregarQueso))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(btnCrearPizza)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCrearPizza))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(btnTestButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAdicionarSalsa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAgregarTomate)))))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPizzaActionPerformed
        ui.accionBtnCrearPizza();
    }//GEN-LAST:event_btnCrearPizzaActionPerformed

    private void btnAdicionarSalsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarSalsaActionPerformed
        ui.accionBtnAgregarSalsaTomate();
    }//GEN-LAST:event_btnAdicionarSalsaActionPerformed

    private void btnAdicionarMozzarellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarMozzarellaActionPerformed
        ui.accionBtnAgregarMozzarella();
    }//GEN-LAST:event_btnAdicionarMozzarellaActionPerformed

    private void btnTestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestButtonActionPerformed
        ui.accionTestMethod();
    }//GEN-LAST:event_btnTestButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarMozzarella;
    private javax.swing.JButton btnAdicionarSalsa;
    private javax.swing.JButton btnCrearPizza;
    private javax.swing.JButton btnTestButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgregarQueso;
    private javax.swing.JLabel lblAgregarTomate;
    private javax.swing.JLabel lblCrearPizza;
    private javax.swing.JTextArea txtArStatus;
    // End of variables declaration//GEN-END:variables
}
