package com.todocode.ap.peluqueriacanina.igu;

import com.todocode.ap.peluqueriacanina.logica.Controladora;
import com.todocode.ap.peluqueriacanina.logica.Duenio;
import com.todocode.ap.peluqueriacanina.logica.Mascota;
import javax.swing.JOptionPane;

public class ModificarDatos extends javax.swing.JFrame {

    Controladora control = null;
//    Mascota masco = new Mascota();
    int idMascota;
    int idDuenio;
    public ModificarDatos(int idMascota) {
        this.idMascota = idMascota;
        this.control = new Controladora();
        initComponents();
        cargar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
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
        btnAtras = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(51, 51, 51));
        labelTitulo.setText("Modificar Datos");

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

        btnModificar.setBackground(new java.awt.Color(51, 51, 51));
        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guardar.png"))); // NOI18N
        btnModificar.setText("Guardar Cambios");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
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
                                .addComponent(labelRaza))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelTel))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelAlergico))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelNombreDueño))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelNombreMas))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelColor)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(boxAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(txtNombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreDueño, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelObservaciones)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(labelAtencion)
                                .addGap(18, 18, 18)
                                .addComponent(boxAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreMas)
                    .addComponent(txtNombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRaza)
                    .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelColor)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAlergico)
                    .addComponent(boxAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAtencion)
                    .addComponent(boxAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreDueño)
                    .addComponent(txtNombreDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTel))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelObservaciones)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(labelTitulo)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        VerDatos ver = new VerDatos();
        ver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String nameMascota = txtNombreMascota.getText();
        String raza = txtRaza.getText();
        String color = txtColor.getText();
        String observa = txtAObservaciones.getText();
        String alergico  = (String) boxAlergico.getSelectedItem();
        String ateEspe = (String) boxAtencion.getSelectedItem();
        String nameDuenio = txtNombreDueño.getText();
        String tel = txtTel.getText();
        int idM = idMascota;
        int idD = idDuenio; //ID de duenio guardado en metodo cargar()
        control.editarMascota(idM, nameMascota, raza, color, observa, alergico, ateEspe,idD, nameDuenio, tel);
        limpiar();

        JOptionPane.showMessageDialog(null, "Modificación de datos Exitosa");

    }//GEN-LAST:event_btnModificarActionPerformed

    public void cargar() {
        Mascota masco = control.traerDato(idMascota);
        txtNombreMascota.setText(masco.getNombre());
        txtRaza.setText(masco.getRaza());
        txtColor.setText(masco.getColor());
        txtAObservaciones.setText(masco.getObservacion());
        boxAlergico.setSelectedItem((String) masco.getAlergico());
        boxAtencion.setSelectedItem((String) masco.getAtenEspecial());
        txtNombreDueño.setText(masco.getDuenio().getNombre());
        txtTel.setText(masco.getDuenio().getTelefono());
        idDuenio = masco.getDuenio().getIdDuenio();//Guardo el ID del duenio
    }

    public void limpiar() {
        txtNombreMascota.setText("");
        txtRaza.setText("");
        txtColor.setText("");
        boxAlergico.setSelectedIndex(0);
        boxAtencion.setSelectedIndex(0);
        txtNombreDueño.setText("");
        txtTel.setText("");
        txtAObservaciones.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxAlergico;
    private javax.swing.JComboBox<String> boxAtencion;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAlergico;
    private javax.swing.JLabel labelAtencion;
    private javax.swing.JLabel labelColor;
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
