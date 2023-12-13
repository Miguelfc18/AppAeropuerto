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
import java.util.Arrays;
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
public class PanelVuelosPrevistos extends javax.swing.JFrame {

    /**
     * Creates new form PanelVuelosPrevistos
     */
    public PanelVuelosPrevistos() {
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

        btnVolver = new javax.swing.JButton();
        BtnDatos = new javax.swing.JButton();
        txtCodigoVuelo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableVuelos = new javax.swing.JTable();
        btnVolver1 = new javax.swing.JButton();

        btnVolver.setText("Menu Principal");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

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

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Destino para introducir");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PANEL DE VUELO PREVISTOS");

        TableVuelos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Aeropuerto origen", "Aeropuerto destino", "Numero de Plazas", "Fecha", "Hora oficial de Salida", "Hora oficial de llegada", "Dia que opera"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableVuelos);

        btnVolver1.setText("Menu Vuelos");
        btnVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BtnDatos)
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCodigoVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(12, 12, 12)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1091, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(387, 387, 387)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnVolver1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolver1)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigoVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(BtnDatos))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDatosActionPerformed
        String filePath = "./src/main/resources/VuelosBase.csv"; // Reemplaza con la ruta de tu archivo CSV
        DefaultTableModel model = (DefaultTableModel) TableVuelos.getModel();
        List<String[]> tabla = leerArchivoCSV(filePath);
        if (tabla != null && !tabla.isEmpty()) {
            List<String[]> datosCoincidentes = filtrarDatos(tabla, txtCodigoVuelo.getText());
            ordenarTabla(datosCoincidentes, 4);

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
        MenuInicio menu = new MenuInicio();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver1ActionPerformed
        MenuVuelos menu = new MenuVuelos();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolver1ActionPerformed

    private static List<String[]> leerArchivoCSV(String filePath) {
        List<String[]> tabla = new ArrayList<>();
        List<String[]> tabla2 = new ArrayList<>();
        List<String> tabla3;
        int total = 0;
        int total2 = 0;
        int total3 = 0;

        String valor = "";
        try (CSVReader reader = new CSVReader(new FileReader("./src/main/resources/VuelosDiarios.csv"))) {

            tabla2 = reader.readAll();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvException ex) {
            Logger.getLogger(PanelSalidas.class.getName()).log(Level.SEVERE, null, ex);
        }

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] lista;

            while ((lista = reader.readNext()) != null) {
                tabla3 = new ArrayList<>();
                String datosFiltrados = filtrarDatosDiarios(tabla2, lista[0]);
                if (lista[0] != null && !datosFiltrados.isEmpty()) {
                    for (String s : lista) {

                        if (total2 == 4 && lista.length > 0) {

                            if (lista[0] != null && !datosFiltrados.isEmpty()) {
                                valor += datosFiltrados + ",";
                                valor += s + ",";
                            } else {
                                valor += "" + ",";
                                valor += s + ",";
                            }

                        } else {
                            valor += s + ",";
                        }
                        total2++;

                    }
                    total2 = 0;
                    tabla3.addAll(Arrays.asList(valor.split(",")));
                    String[] array = tabla3.toArray(String[]::new);
                    valor = "";
                    total3++;
                    tabla.add(array);
                    total++;
                    tabla3 = null;
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvException ex) {
            Logger.getLogger(PanelSalidas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }

        return tabla;
    }

    private static List<String[]> filtrarDatos(List<String[]> tabla, String datoBuscado) {
        List<String[]> datosCoincidentes = new ArrayList<>();
        int total = 0;
        LocalDate fechaActual = LocalDate.now();
        String fechaComoString = fechaActual.toString();
        int dias = convertirDiaANumero(fechaComoString);
        boolean control = false;
        List<String[]> tabla2 = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader("./src/main/resources/VuelosDiarios.csv"))) {

            tabla2 = reader.readAll();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvException ex) {
            Logger.getLogger(PanelSalidas.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (String[] fila : tabla) {

            for (String dato : fila) {

                if (total == 1) {
                    String datosFiltrados = filtrarDatosDiarios(tabla2, fila[0]);
                    int numeroComoEntero = convertirDiaANumero(datosFiltrados);

                    if (numeroComoEntero >= dias && numeroComoEntero <= (dias + 7)) {
                        control = true;
                    }
                }
                if (total == 2 && dato.equals(datoBuscado) && control) {
                    datosCoincidentes.add(fila);
                }
                total++;
            }
            total = 0;
            control = false;

        }
        return datosCoincidentes;
    }

    private static String filtrarDatosDiarios(List<String[]> tabla, String datoBuscado) {
        String datosCoincidentes = "";
        int total = 0;
        for (String[] fila : tabla) {

            for (String dato : fila) {
                if (dato.equals(datoBuscado)) {
                    datosCoincidentes = fila[1];
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
                    // Convertir las fechas a valores numéricos en días para facilitar la comparación
                    int diasFila1 = convertirDiaANumero(fila1[columna]);
                    int diasFila2 = convertirDiaANumero(fila2[columna]);

                    // Orden ascendente (de menor a mayor), para orden descendente sería al revés
                    return Integer.compare(diasFila1, diasFila2);
                } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                    e.printStackTrace();
                    return 0;
                }
            }
        });
    }

    private static int convertirDiaANumero(String fecha) {
        String[] partesFecha = fecha.split("-");
        int dia = Integer.parseInt(partesFecha[2]);
        int mes = Integer.parseInt(partesFecha[1]);
        int anio = Integer.parseInt(partesFecha[0]);

        // Convertir la fecha a un valor numérico en días desde una referencia (por ejemplo, 01/01/0000)
        // Aquí se hace una conversión simple, no considera diferencias entre meses o años bisiestos
        return anio * 365 + mes * 30 + dia;
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
            java.util.logging.Logger.getLogger(PanelVuelosPrevistos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelVuelosPrevistos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelVuelosPrevistos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelVuelosPrevistos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelVuelosPrevistos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDatos;
    private javax.swing.JTable TableVuelos;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCodigoVuelo;
    // End of variables declaration//GEN-END:variables
}