/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import logica.LogicaNegocio;
import pa.cifpaviles.dam.aeropuertoclase.dto.Aeropuerto;

/**
 *
 * @author mariorl
 */
public class MenuInicio extends javax.swing.JFrame {

    /**
     * Creates new form MenuInicio
     */
    public MenuInicio() {
        initComponents();
    }
    
    private void cargaaeropuertos(){
        Aeropuerto a1 = new Aeropuerto("AMS","Aeropuerto de Amsterdam-Schiphol","Amsterdam");
        LogicaNegocio.addAeropuerto(a1);
        /*AMS;Aeropuerto de Amsterdam-Schiphol;Amsterdam
ABC;Aeropuerto de Albacete;Albacete
BCN;Aeropuerto de Barcelona-El Prat;Barcelona
BIO;Aeropuerto de Bilbao;Bilbao*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBienvenida = new javax.swing.JLabel();
        btnAddComapany = new javax.swing.JButton();
        btnAddVuelo = new javax.swing.JButton();
        btnOpcionesCompa = new javax.swing.JButton();
        btnOpcionesVuelos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblBienvenida.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBienvenida.setText("Menu de Inicio");

        btnAddComapany.setActionCommand("Añadir Compañia Aerea");
        btnAddComapany.setLabel("Añadir Compañia Aerea");
        btnAddComapany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddComapanyActionPerformed(evt);
            }
        });

        btnAddVuelo.setText("Añadir Vuelo (Datos Base)");
        btnAddVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVueloActionPerformed(evt);
            }
        });

        btnOpcionesCompa.setText("Opciones Compañia");
        btnOpcionesCompa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcionesCompaActionPerformed(evt);
            }
        });

        btnOpcionesVuelos.setText("Opciones vuelos (Datos Base)");
        btnOpcionesVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcionesVuelosActionPerformed(evt);
            }
        });

        jButton1.setText("Añadir vuelo diario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Menu vuelo diario");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(lblBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddComapany)
                    .addComponent(btnOpcionesCompa, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOpcionesVuelos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddVuelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(lblBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddComapany)
                    .addComponent(btnAddVuelo)
                    .addComponent(jButton1))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOpcionesCompa)
                    .addComponent(btnOpcionesVuelos)
                    .addComponent(jButton2))
                .addContainerGap(177, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddComapanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddComapanyActionPerformed
        PaginaCompany pag=new PaginaCompany();
        pag.setVisible(true);
        this.setVisible(false);
    
    }//GEN-LAST:event_btnAddComapanyActionPerformed

    private void btnAddVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVueloActionPerformed
        PaginaVuelos pag=new PaginaVuelos();
        pag.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAddVueloActionPerformed

    private void btnOpcionesVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcionesVuelosActionPerformed
        MenuVuelos pag=new MenuVuelos();
        pag.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnOpcionesVuelosActionPerformed

    private void btnOpcionesCompaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcionesCompaActionPerformed
        MenuCompanya pag=new MenuCompanya();
        pag.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnOpcionesCompaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PaginaVuelosDiarios pag=new PaginaVuelosDiarios();
        pag.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MenuVuelosDiarios pag=new MenuVuelosDiarios();
        pag.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddComapany;
    private javax.swing.JButton btnAddVuelo;
    private javax.swing.JButton btnOpcionesCompa;
    private javax.swing.JButton btnOpcionesVuelos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lblBienvenida;
    // End of variables declaration//GEN-END:variables
}
