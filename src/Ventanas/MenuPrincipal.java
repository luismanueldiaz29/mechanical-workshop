/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

/**
 *
 * @author acer pc
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        BotonCliente = new javax.swing.JButton();
        BotonEmpleado = new javax.swing.JButton();
        BotonReparacion = new javax.swing.JButton();
        EstadoGeneral = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 102, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Imajenes/salir_1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 60, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Imajenes/depositphotos_79986956-stock-illustration-retro-poster-design-for-auto5.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 440));

        BotonCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Imajenes/iconfinder_client_1931212.png"))); // NOI18N
        BotonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonClienteActionPerformed(evt);
            }
        });
        getContentPane().add(BotonCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 70, -1));

        BotonEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Imajenes/iconfinder_Tools_-_common_fixed-14_1208658.png"))); // NOI18N
        BotonEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(BotonEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 70, 60));

        BotonReparacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Imajenes/iconfinder_13_setting_configure_repair_support_optimization_google_2109119 (1).png"))); // NOI18N
        BotonReparacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonReparacionActionPerformed(evt);
            }
        });
        getContentPane().add(BotonReparacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 70, -1));

        EstadoGeneral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Imajenes/iconfinder_BT_c3tool_905663 (2).png"))); // NOI18N
        getContentPane().add(EstadoGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 70, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("  Gestionar cliente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 120, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("Gestion Reperacion");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 120, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("Estado General del taller");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 150, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText(" gestion Empleado");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 120, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Imajenes/fondo-otono.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BotonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonClienteActionPerformed
        // TODO add your handling code here:
        MenuCliente m = new MenuCliente();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonClienteActionPerformed

    private void BotonEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEmpleadoActionPerformed
        // TODO add your handling code here:
        MenuEmpliado E = new MenuEmpliado();
        E.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonEmpleadoActionPerformed

    private void BotonReparacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonReparacionActionPerformed
        // TODO add your handling code here:
        MenuPartesDeReparacion Mp = new MenuPartesDeReparacion();
        Mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonReparacionActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCliente;
    private javax.swing.JButton BotonEmpleado;
    private javax.swing.JButton BotonReparacion;
    private javax.swing.JButton EstadoGeneral;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
