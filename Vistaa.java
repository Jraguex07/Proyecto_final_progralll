/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arboles;

/**
 *
 * @author RAGUEX
 */
import java.awt.BorderLayout;
import java.awt.Rectangle;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

public class Vistaa extends javax.swing.JFrame {

    private SimuladorArbolBinario simulador = new SimuladorArbolBinario();

    public Vistaa() {
        initComponents();
        this.inicializar(false);
    }

    private void inicializar(boolean enable) {
        this.InOrden.setEnabled(enable);
        this.PostOrden.setEnabled(enable);
        this.PreOrden.setEnabled(enable);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        botonInsertar = new java.awt.Button();
        PostOrden = new java.awt.Button();
        InOrden = new java.awt.Button();
        impresion = new java.awt.TextArea();
        txtdato = new java.awt.TextField();
        PreOrden = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        btntransversal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jInternalFrame1.setBackground(new java.awt.Color(102, 0, 255));
        jInternalFrame1.setForeground(new java.awt.Color(255, 255, 51));
        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel1.add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 480, 270));

        botonInsertar.setBackground(new java.awt.Color(204, 255, 51));
        botonInsertar.setLabel("Insertar");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });
        jPanel1.add(botonInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 170, 40));

        PostOrden.setBackground(new java.awt.Color(204, 255, 51));
        PostOrden.setLabel("postOrden");
        PostOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PostOrdenActionPerformed(evt);
            }
        });
        jPanel1.add(PostOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 140, 40));

        InOrden.setBackground(new java.awt.Color(204, 255, 51));
        InOrden.setLabel("inOden");
        InOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InOrdenActionPerformed(evt);
            }
        });
        jPanel1.add(InOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 137, 40));

        impresion.setBackground(new java.awt.Color(204, 255, 51));
        jPanel1.add(impresion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 280, 100));

        txtdato.setBackground(new java.awt.Color(255, 255, 153));
        txtdato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdatoActionPerformed(evt);
            }
        });
        jPanel1.add(txtdato, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 170, 40));

        PreOrden.setBackground(new java.awt.Color(204, 255, 51));
        PreOrden.setLabel("preOrden\n");
        PreOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreOrdenActionPerformed(evt);
            }
        });
        jPanel1.add(PreOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 137, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arboles/57c345267b34d2537746127fae92425f.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 630, 510));

        btntransversal.setBackground(new java.awt.Color(153, 255, 0));
        btntransversal.setText("Tranversal");
        btntransversal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntransversalActionPerformed(evt);
            }
        });
        jPanel1.add(btntransversal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 53, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdatoActionPerformed

    private void PreOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreOrdenActionPerformed
        String recorrido = null;
        recorrido = this.simulador.preOrden();
        
        this.impresion.setText("");
        this.impresion.setText(recorrido);
    }//GEN-LAST:event_PreOrdenActionPerformed

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        try {
            int dato = Integer.parseInt(txtdato.getText());
            if (this.simulador.insertar(dato)) {
                JOptionPane.showMessageDialog(null, "El dato fue insertado correctamente", " ...", 1);
                this.inicializar(true);
                
                complementos();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo insertar el dato", "Intenta de nuevo...", 0);

        }
    }//GEN-LAST:event_botonInsertarActionPerformed

    private void PostOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PostOrdenActionPerformed
        String recorrido = null;
        recorrido = this.simulador.postOrden();
        
        this.impresion.setText("");
        this.impresion.setText(recorrido);
    }//GEN-LAST:event_PostOrdenActionPerformed

    private void InOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InOrdenActionPerformed
        String recorrido = null;
        recorrido = this.simulador.inOrden();
        
        this.impresion.setText("");
        this.impresion.setText(recorrido);
    }//GEN-LAST:event_InOrdenActionPerformed

    private void btntransversalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntransversalActionPerformed
        
        String recorrido = null;
        recorrido = this.simulador.transversal();
        
         
        this.impresion.setText("");
        this.impresion.setText(recorrido);
    }//GEN-LAST:event_btntransversalActionPerformed
    public void complementos(){
        this.repintarArbol();
    }
    private void repintarArbol() {
        this.jDesktopPane1.removeAll();
        Rectangle tamaño = this.jInternalFrame1.getBounds();
        this.jInternalFrame1 = null;
        this.jInternalFrame1 = new JInternalFrame("Representación Gráfica", true);
        this.jDesktopPane1.add(this.jInternalFrame1, JLayeredPane.DEFAULT_LAYER);
        this.jInternalFrame1.setVisible(true);
        this.jInternalFrame1.setBounds(tamaño);
        this.jInternalFrame1.setEnabled(false);
        this.jInternalFrame1.add(this.simulador.getDibujo(), BorderLayout.CENTER);
    }
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
            java.util.logging.Logger.getLogger(Vistaa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vistaa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vistaa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vistaa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vistaa().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button InOrden;
    private java.awt.Button PostOrden;
    private java.awt.Button PreOrden;
    private java.awt.Button botonInsertar;
    private javax.swing.JButton btntransversal;
    private java.awt.TextArea impresion;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private java.awt.TextField txtdato;
    // End of variables declaration//GEN-END:variables
}
