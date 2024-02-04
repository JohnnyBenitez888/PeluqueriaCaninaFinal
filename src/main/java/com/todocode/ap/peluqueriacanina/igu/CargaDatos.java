
package com.todocode.ap.peluqueriacanina.igu;

import com.todocode.ap.peluqueriacanina.logica.Controladora;
import javax.swing.JOptionPane;

/**
 *
 * @author Johnny
 */
public class CargaDatos extends javax.swing.JFrame {

    
    Controladora control = new Controladora();
    
    public CargaDatos() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelNombreMas = new javax.swing.JLabel();
        txtNombreMascota = new javax.swing.JTextField();
        labelRaza = new javax.swing.JLabel();
        txtRaza = new javax.swing.JTextField();
        labelColor = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        labelAlergico = new javax.swing.JLabel();
        boxAlergico = new javax.swing.JComboBox<>();
        labelAtencion = new javax.swing.JLabel();
        boxAtencion = new javax.swing.JComboBox<>();
        labelNombreDueño = new javax.swing.JLabel();
        txtNombreDueño = new javax.swing.JTextField();
        labelTel = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        labelObservaciones = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAObservaciones = new javax.swing.JTextArea();
        btnLimpiar = new javax.swing.JButton();
        labelIcon = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        labelNombreMas.setBackground(new java.awt.Color(255, 255, 255));
        labelNombreMas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelNombreMas.setForeground(new java.awt.Color(51, 51, 51));
        labelNombreMas.setText("Nombre:");

        txtNombreMascota.setBackground(new java.awt.Color(51, 51, 51));
        txtNombreMascota.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNombreMascota.setForeground(new java.awt.Color(255, 255, 255));

        labelRaza.setBackground(new java.awt.Color(255, 255, 255));
        labelRaza.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelRaza.setForeground(new java.awt.Color(51, 51, 51));
        labelRaza.setText("Raza:");

        txtRaza.setBackground(new java.awt.Color(51, 51, 51));
        txtRaza.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtRaza.setForeground(new java.awt.Color(255, 255, 255));

        labelColor.setBackground(new java.awt.Color(255, 255, 255));
        labelColor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelColor.setForeground(new java.awt.Color(51, 51, 51));
        labelColor.setText("Color:");

        txtColor.setBackground(new java.awt.Color(51, 51, 51));
        txtColor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtColor.setForeground(new java.awt.Color(255, 255, 255));

        labelAlergico.setBackground(new java.awt.Color(255, 255, 255));
        labelAlergico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelAlergico.setForeground(new java.awt.Color(51, 51, 51));
        labelAlergico.setText("Alérgico:");

        boxAlergico.setBackground(new java.awt.Color(51, 51, 51));
        boxAlergico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        boxAlergico.setForeground(new java.awt.Color(255, 255, 255));
        boxAlergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No" }));

        labelAtencion.setBackground(new java.awt.Color(255, 255, 255));
        labelAtencion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelAtencion.setForeground(new java.awt.Color(51, 51, 51));
        labelAtencion.setText("Atención especial:");

        boxAtencion.setBackground(new java.awt.Color(51, 51, 51));
        boxAtencion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        boxAtencion.setForeground(new java.awt.Color(255, 255, 255));
        boxAtencion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No" }));

        labelNombreDueño.setBackground(new java.awt.Color(255, 255, 255));
        labelNombreDueño.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelNombreDueño.setForeground(new java.awt.Color(51, 51, 51));
        labelNombreDueño.setText("Nombre Dueño:");

        txtNombreDueño.setBackground(new java.awt.Color(51, 51, 51));
        txtNombreDueño.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNombreDueño.setForeground(new java.awt.Color(255, 255, 255));

        labelTel.setBackground(new java.awt.Color(255, 255, 255));
        labelTel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTel.setForeground(new java.awt.Color(51, 51, 51));
        labelTel.setText("Teléfono:");

        txtTel.setBackground(new java.awt.Color(51, 51, 51));
        txtTel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTel.setForeground(new java.awt.Color(255, 255, 255));

        labelObservaciones.setBackground(new java.awt.Color(255, 255, 255));
        labelObservaciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelObservaciones.setForeground(new java.awt.Color(51, 51, 51));
        labelObservaciones.setText("Observaciones:");

        txtAObservaciones.setBackground(new java.awt.Color(51, 51, 51));
        txtAObservaciones.setColumns(20);
        txtAObservaciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAObservaciones.setForeground(new java.awt.Color(255, 255, 255));
        txtAObservaciones.setRows(5);
        jScrollPane1.setViewportView(txtAObservaciones);

        btnLimpiar.setBackground(new java.awt.Color(51, 51, 51));
        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-Peluqueria.png"))); // NOI18N
        labelIcon.setToolTipText("");

        btnAtras.setBackground(new java.awt.Color(51, 51, 51));
        btnAtras.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/atras.png"))); // NOI18N
        btnAtras.setText(" Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(51, 51, 51));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guardar.png"))); // NOI18N
        btnGuardar.setText(" Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNombreMas)
                                    .addComponent(labelColor)
                                    .addComponent(labelAlergico)
                                    .addComponent(labelAtencion)
                                    .addComponent(labelRaza)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelNombreDueño))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelTel)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(boxAlergico, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(boxAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtNombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreDueño, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelObservaciones)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(labelIcon)
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                .addGap(23, 23, 23)
                                .addComponent(btnLimpiar)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNombreMas)
                            .addComponent(txtNombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelRaza)
                            .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelColor)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelAlergico)
                            .addComponent(boxAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelAtencion)
                            .addComponent(boxAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNombreDueño)
                            .addComponent(txtNombreDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelObservaciones)
                            .addComponent(jScrollPane1)))))
        );

        labelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(51, 51, 51));
        labelTitulo.setText("Carga de Datos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTitulo)
                .addGap(188, 188, 188))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(labelTitulo)
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    //BOTON SALIR------------------------
    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Principal pri = new Principal();
        pri.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    //BOTON GUARDAR--------------------------
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nameMascota = txtNombreMascota.getText();
        String raza = txtRaza.getText();
        String color = txtColor.getText();
        String observa = txtAObservaciones.getText();
        String alergico  = (String) boxAlergico.getSelectedItem();
        String ateEspe = (String) boxAtencion.getSelectedItem();
        String nameDuenio = txtNombreDueño.getText();
        String tel = txtTel.getText();
        
        control.guardar(nameMascota, raza, color, observa, alergico, ateEspe,nameDuenio, tel);
        limpiar();
        
        JOptionPane.showMessageDialog(null, "Carga de datos Exitosa");
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    //BOTON LIMPIAR--------------------------
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    
    public void limpiar(){
        txtNombreMascota.setText("");
        txtRaza.setText("");
        txtColor.setText("");
        boxAlergico.setSelectedIndex(0);
        boxAtencion.setSelectedIndex(0);
        txtNombreDueño.setText("");
        txtTel.setText("");
        txtAObservaciones.setText("");
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
            java.util.logging.Logger.getLogger(CargaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CargaDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxAlergico;
    private javax.swing.JComboBox<String> boxAtencion;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAlergico;
    private javax.swing.JLabel labelAtencion;
    private javax.swing.JLabel labelColor;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelNombreDueño;
    private javax.swing.JLabel labelNombreMas;
    private javax.swing.JLabel labelObservaciones;
    private javax.swing.JLabel labelRaza;
    private javax.swing.JLabel labelTel;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextArea txtAObservaciones;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtNombreDueño;
    private javax.swing.JTextField txtNombreMascota;
    private javax.swing.JTextField txtRaza;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
