/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mfcal
 */
public class Llegadas extends javax.swing.JFrame {

    /**
     * Creates new form Llegadas
     */
    public Llegadas() {
        initComponents();
        txtCodigoVuelo.setText(LocalDate.now().toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnDatos = new javax.swing.JButton();
        txtCodigoVuelo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableVuelos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnDatos.setText("Ver datos");
        BtnDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDatosActionPerformed(evt);
            }
        });

        txtCodigoVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoVueloActionPerformed(evt);
            }
        });

        jLabel1.setText("Hora para introducir");

        TableVuelos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Fecha", "Hora de salida real", "Hora de llegada real", "Número de plazas ocupadas", "Precio del vuelo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableVuelos);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PANEL DE LLEGADAS");

        btnVolver.setText("Menu Vuelo");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(432, 432, 432))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(BtnDatos))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtCodigoVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1091, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnVolver))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnVolver)
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(36, 36, 36)
                        .addComponent(txtCodigoVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(BtnDatos))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDatosActionPerformed
        String filePath = "./src/main/resources/VuelosDiarios.csv"; // Reemplaza con la ruta de tu archivo CSV
        DefaultTableModel model = (DefaultTableModel) TableVuelos.getModel();

        List<String[]> tabla = leerArchivoCSV(filePath);

        if (tabla != null && !tabla.isEmpty()) {
            List<String[]> datosCoincidentes = filtrarDatos(tabla, txtCodigoVuelo.getText());
            ordenarTabla(datosCoincidentes,3);

            if (datosCoincidentes != null && !datosCoincidentes.isEmpty()) {
                for (String[] fila : datosCoincidentes) {
                    model.addRow(fila);

                }
            } else {
                System.out.println("No se encontraron datos coincidentes.");
            }
        } else {
            System.out.println("No se pudo leer el archivo CSV.");
        }
    }//GEN-LAST:event_BtnDatosActionPerformed

    private void txtCodigoVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoVueloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoVueloActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        MenuVuelosDiarios menu=new MenuVuelosDiarios();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

        private static List<String[]> leerArchivoCSV(String filePath) {
        List<String[]> tabla = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            tabla = reader.readAll();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvException ex) {
            Logger.getLogger(PanelSalidas.class.getName()).log(Level.SEVERE, null, ex);
        }

        return tabla;
    }

    
    private static List<String[]> filtrarDatos(List<String[]> tabla, String datoBuscado) {
        List<String[]> datosCoincidentes = new ArrayList<>();

        for (String[] fila : tabla) {
            for (String dato : fila) {
                if (dato.equals(datoBuscado)) {
                    datosCoincidentes.add(fila);
                }
            }
        }

        return datosCoincidentes;
    }
    
    private static void ordenarTabla(List<String[]> tabla, int columna) {
         Collections.sort(tabla, new Comparator<String[]>() {
        @Override
        public int compare(String[] fila1, String[] fila2) {
            try {
                // Convertir las horas a valores numéricos en segundos para facilitar la comparación
                int segundosFila1 = convertirHorasASegundos(fila1[columna]);
                int segundosFila2 = convertirHorasASegundos(fila2[columna]);

                // Orden descendente (de mayor a menor), para orden ascendente sería al revés
                return Integer.compare(segundosFila1, segundosFila2);
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                return 0;
            }
        }
    });
    }
    
    private static int convertirHorasASegundos(String tiempo) {
    String[] partesTiempo = tiempo.split(":");
    int horas = Integer.parseInt(partesTiempo[0]);
    int minutos = Integer.parseInt(partesTiempo[1]);
    int segundos = Integer.parseInt(partesTiempo[2]);

    // Convertir horas a segundos
    return horas * 3600 + minutos * 60 + segundos;
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
            java.util.logging.Logger.getLogger(Llegadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Llegadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Llegadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Llegadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Llegadas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDatos;
    private javax.swing.JTable TableVuelos;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCodigoVuelo;
    // End of variables declaration//GEN-END:variables
}
