/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package primeiroprojeto;

/**
 *
 * @author Administrador
 */
public class PrimeiraTela extends javax.swing.JFrame {

    /**
     * Creates new form PrimeiraTela
     */
    public PrimeiraTela() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfValor2 = new javax.swing.JTextField();
        jtfValor1 = new javax.swing.JTextField();
        jbSomar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtfResultado = new javax.swing.JTextField();
        jbSubtrair = new javax.swing.JButton();
        jbMultiplicar = new javax.swing.JButton();
        jbDividir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Super Calculadora Poderosa");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Valor 02:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Valor 01");

        jtfValor2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtfValor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfValor2ActionPerformed(evt);
            }
        });

        jtfValor1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtfValor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfValor1ActionPerformed(evt);
            }
        });

        jbSomar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbSomar.setText("+");
        jbSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSomarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Resultado");

        jtfResultado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtfResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfResultadoActionPerformed(evt);
            }
        });

        jbSubtrair.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbSubtrair.setText("-");
        jbSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSubtrairActionPerformed(evt);
            }
        });

        jbMultiplicar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbMultiplicar.setText("x");
        jbMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMultiplicarActionPerformed(evt);
            }
        });

        jbDividir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbDividir.setText("/");
        jbDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDividirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(190, 190, 190))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jbSomar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jbSubtrair)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jbMultiplicar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jbDividir))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfValor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfValor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSomar)
                    .addComponent(jbSubtrair)
                    .addComponent(jbMultiplicar)
                    .addComponent(jbDividir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
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

    private void jtfValor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfValor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfValor1ActionPerformed

    private void jbSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSomarActionPerformed
        // TODO add your handling code here:
        double n1 = Double.parseDouble(jtfValor1.getText());
        double n2 = Double.parseDouble(jtfValor2.getText());
        
        double total = n1 +n2;
        
        jtfResultado.setText(String.valueOf(total));
        jtfValor1.setText("");
        jtfValor2.setText("");
    }//GEN-LAST:event_jbSomarActionPerformed

    private void jtfResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfResultadoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jtfResultadoActionPerformed

    private void jbSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSubtrairActionPerformed
        // TODO add your handling code here:
        double n1 = Double.parseDouble(jtfValor1.getText());
        double n2 = Double.parseDouble(jtfValor2.getText());
        
        double total = n1 - n2;
        
        jtfResultado.setText(String.valueOf(total));
        jtfValor1.setText("");
        jtfValor2.setText("");
    }//GEN-LAST:event_jbSubtrairActionPerformed

    private void jbMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMultiplicarActionPerformed
        // TODO add your handling code here:
        double n1 = Double.parseDouble(jtfValor1.getText());
        double n2 = Double.parseDouble(jtfValor2.getText());
        
        double total = n1 * n2;
        
        jtfResultado.setText(String.valueOf(total));
        jtfValor1.setText("");
        jtfValor2.setText("");
    }//GEN-LAST:event_jbMultiplicarActionPerformed

    private void jbDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDividirActionPerformed
        // TODO add your handling code here:
        double n1 = Double.parseDouble(jtfValor1.getText());
        double n2 = Double.parseDouble(jtfValor2.getText());
        
        double total = n1 / n2;
        
        jtfResultado.setText(String.valueOf(total));
        jtfValor1.setText("");
        jtfValor2.setText("");
    }//GEN-LAST:event_jbDividirActionPerformed

    private void jtfValor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfValor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfValor2ActionPerformed

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
            java.util.logging.Logger.getLogger(PrimeiraTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrimeiraTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrimeiraTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrimeiraTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrimeiraTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbDividir;
    private javax.swing.JButton jbMultiplicar;
    private javax.swing.JButton jbSomar;
    private javax.swing.JButton jbSubtrair;
    private javax.swing.JTextField jtfResultado;
    private javax.swing.JTextField jtfValor1;
    private javax.swing.JTextField jtfValor2;
    // End of variables declaration//GEN-END:variables
}
