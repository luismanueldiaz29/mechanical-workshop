/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Loguica.Taller;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author acer pc
 */
public class PartesDeReparacion extends javax.swing.JFrame {
String opcion = null;
 double precio=0;
    /**
     * Creates new form PartesDeReparacion
     */
    public PartesDeReparacion() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        atraz = new javax.swing.JButton();
        TxtHorasestimadas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        MiCombo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        TxtCedulaCliente = new javax.swing.JTextField();
        EscojerCliente = new javax.swing.JButton();
        EscojerEmpleado = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        TxtEmpleado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jButton1.setText("Agregar parte");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        atraz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Imajenes/iconfinder_Arrow_Left_1063872 (1).png"))); // NOI18N
        atraz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrazActionPerformed(evt);
            }
        });

        TxtHorasestimadas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtHorasestimadasKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tipo de servicio :");

        jButton2.setText("Generar Horas Estimadas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Horas estimadas :");

        MiCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escoja una opcion", "Lavado", "pintura", "Reparacion" }));
        MiCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiComboActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Cedula del cliente : ");

        EscojerCliente.setText("Escojer Cliente");
        EscojerCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscojerClienteActionPerformed(evt);
            }
        });

        EscojerEmpleado.setText("Escojer Empleado");
        EscojerEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscojerEmpleadoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Empleado :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel8.setText("Crear partes de reparacion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TxtEmpleado)
                                            .addComponent(TxtHorasestimadas)
                                            .addComponent(MiCombo, 0, 183, Short.MAX_VALUE))
                                        .addGap(98, 98, 98)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(108, 108, 108)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton1)
                                                .addGap(33, 33, 33)
                                                .addComponent(EscojerCliente)
                                                .addGap(41, 41, 41)
                                                .addComponent(EscojerEmpleado))
                                            .addComponent(jLabel5))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(TxtCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 191, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(170, 170, 170)))
                        .addComponent(atraz, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(atraz)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(TxtHorasestimadas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MiCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TxtEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EscojerCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EscojerEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel5)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        public void mostrar(){
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            Taller.matrisReparacion(),
            new String [] {
                "Propietario","cedula","Matricula","Modelo","Tipo De Vehiculo","En Reparacion"
            }
        ));
        
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
       //lavado = 8.000; Pintura = 30.000; reparacion 6.000 cada hora
        int horas = Integer.valueOf(TxtHorasestimadas.getText());

        if(TxtHorasestimadas.getText()==null){
            JOptionPane.showMessageDialog(this, "ingrece el numero de horas ");
        }else{
            if(opcion!=null){
                double total = horas*precio;
                if(!Taller.Comprovar(TxtCedulaCliente.getText())){
                    JOptionPane.showMessageDialog(this,"No se encontro la cedula ingresada");
                }else{
                    Taller.CrearPartesdeRapracion(TxtCedulaCliente.getText(), opcion, TxtHorasestimadas.getText(),TxtEmpleado.getText(), String.valueOf(total));
                    jTable1.setModel(Taller.getDatoReparacion());
                    JOptionPane.showMessageDialog(this, "el total a pagar es de : "+total);
                }
            }    
    }//GEN-LAST:event_jButton1ActionPerformed
    }  
    private void atrazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrazActionPerformed
        // TODO add your handling code here:
        MenuPartesDeReparacion MpR = new MenuPartesDeReparacion();
        MpR.setVisible(true);
        dispose();
    }//GEN-LAST:event_atrazActionPerformed

    private void MiComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiComboActionPerformed
        // TODO add your handling code here:
        int i=MiCombo.getSelectedIndex();
        if(i==0){ 
               JOptionPane.showMessageDialog(this, "ESCOJA LA ESPECIALIDAD DEL EMPLIADO");
            }else{
                if(i==1){
                    if(Taller.bacanteLavado()==0){
                        opcion = "Lavado";
                        precio = 8000;
                    }else{
                        JOptionPane.showMessageDialog(null,"por ahora no se puede dar este servisio");
                    }
                }else{
                    if(i==2){
                         precio=30000;
                        opcion = "Pintura";
                    }else{
                        precio = 6000;
                        opcion = "Reparacion";
                    }
        
                }
            }
    }//GEN-LAST:event_MiComboActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String cadna = Integer.toString(Aleatorio());
        TxtHorasestimadas.setText(cadna);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TxtHorasestimadasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtHorasestimadasKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtHorasestimadasKeyTyped

    private void EscojerClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscojerClienteActionPerformed
        // TODO add your handling code here:
        jTable1.setModel(Taller.getDatos());
    }//GEN-LAST:event_EscojerClienteActionPerformed

    private void EscojerEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscojerEmpleadoActionPerformed
        // TODO add your handling code here:
        if(opcion==null){    
            JOptionPane.showMessageDialog(null, "Para escojer un empleado primero debe eljir el tipo de servicio");
        }else{
            //jTable1.setModel(Taller.RetornarCliente(opcion));
        }
    }//GEN-LAST:event_EscojerEmpleadoActionPerformed

    public int Aleatorio(){
        Random R = new Random();
        int num=0;
        for (int i = 0; i < 3; i++) {
           num=R.nextInt(3)+num;
        }
        return num;
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
            java.util.logging.Logger.getLogger(PartesDeReparacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PartesDeReparacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PartesDeReparacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PartesDeReparacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PartesDeReparacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EscojerCliente;
    private javax.swing.JButton EscojerEmpleado;
    private javax.swing.JComboBox MiCombo;
    private javax.swing.JTextField TxtCedulaCliente;
    private javax.swing.JTextField TxtEmpleado;
    private javax.swing.JTextField TxtHorasestimadas;
    private javax.swing.JButton atraz;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}