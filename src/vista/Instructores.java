package vista;

import control.Controlador;
import javax.swing.JOptionPane;
import modeloVO.InstructorVO;

public class Instructores extends javax.swing.JPanel {

    Controlador c = new Controlador();
    InstructorVO insVO = new InstructorVO();
    Integer auxcedu = 0;

    public Instructores() {
        initComponents();
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);

    }

    public void visible(Boolean ok) {
        jPanel1.setEnabled(ok);
        txtNombre.setEnabled(ok);
        txtApellido.setEnabled(ok);
        txtTelefono.setEnabled(ok);
        txtEspecialidad.setEnabled(ok);
        txtJornada.setEnabled(ok);
        txtHora.setEnabled(ok);
    }

    public void limpiar(boolean n) {
        if (n) {
            txtNombre.setText("");
            txtApellido.setText("");
            txtTelefono.setText("");
            txtEspecialidad.setSelectedIndex(0);
            txtJornada.setSelectedIndex(0);
            txtHora.setSelectedIndex(0);
            txtCodigo.setText("");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEspecialidad = new javax.swing.JComboBox<>();
        txtJornada = new javax.swing.JComboBox<>();
        txtHora = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtCodigo.setName("jTxtCodigo"); // NOI18N
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        jLabel1.setText("Cedula");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Especialidad");

        jLabel6.setText("Telefono");

        jLabel5.setText("Jornada");

        txtTelefono.setMinimumSize(new java.awt.Dimension(6, 10));
        txtTelefono.setName("jTxtTelefono"); // NOI18N
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        txtNombre.setMinimumSize(new java.awt.Dimension(6, 10));
        txtNombre.setName("jTxtNombre"); // NOI18N
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreMouseClicked(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtApellido.setMinimumSize(new java.awt.Dimension(6, 10));
        txtApellido.setName("jTxtApellido"); // NOI18N
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        jLabel7.setText("Hora");

        txtEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione especialidad:", "Yoga", "Aquaerobics", "Bailoterapia", "Bodycombat", "Entrenamiento funcional", "Spinning" }));

        txtJornada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione jornada:", "Mañana", "Tarde", "Noche" }));

        txtHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione horario:", "6:00 am - 7:00 am", "7:00 am - 8:00 am", "8:00 am - 9:00 am", "9:00 am - 10:00 am", "3:00 pm - 4:00 pm", "4:00 pm - 5:00 pm", "5:00 pm - 6:00 pm", "6:00 pm - 7:00 pm", "7:00 pm - 8:00 pm", "8:00 pm - 9:00 pm" }));

        btnRegistrar.setText("Registrar");
        btnRegistrar.setName("jBtnRegistrar"); // NOI18N
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel6))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(1, 1, 1))
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtJornada, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEspecialidad, javax.swing.GroupLayout.Alignment.LEADING, 0, 259, Short.MAX_VALUE))
                            .addComponent(btnRegistrar))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJornada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnActualizar.setText("Actualizar");
        btnActualizar.setName("jBtnActualizar"); // NOI18N
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.setName("jBtnEliminar"); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.setName("jBtnConsultar"); // NOI18N
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConsultar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnEliminar)
                    .addComponent(btnActualizar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.getAccessibleContext().setAccessibleName("Información Instructor");
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if ((txtCodigo.getText().equals("")) || (txtNombre.getText().equals("")) || (txtApellido.getText().equals("")) || (txtTelefono.getText().equals(""))
                || (txtEspecialidad.getSelectedIndex() == 0) || (txtJornada.getSelectedIndex() == 0) || (txtHora.getSelectedIndex() == 0)) {
            JOptionPane.showMessageDialog(null, "Llenar todos los campos");
        } else {
            Integer cedula = Integer.parseInt(this.txtCodigo.getText());
            String nombre = this.txtNombre.getText();
            String apellido = this.txtApellido.getText();
            String telefono = this.txtTelefono.getText();
            String especialidad = this.txtEspecialidad.getSelectedItem().toString();
            String jornada = this.txtJornada.getSelectedItem().toString();
            String hora = this.txtHora.getSelectedItem().toString();

            if (btnRegistrar.getText().equalsIgnoreCase("Registrar")) {
                if (c.InstructorBuscar(cedula) == false) {
                    insVO = new InstructorVO(cedula, nombre, apellido, telefono, especialidad, jornada, hora);
                    c.InstructorRegistrar(insVO);
                } else {
                    JOptionPane.showMessageDialog(null, "La cedula que desea ingresar, ya existe");
                }
            } else if (btnRegistrar.getText().equalsIgnoreCase("Guardar")) {
                if (auxcedu.equals(cedula)) {
                    insVO.setCedula(auxcedu);
                    insVO.setApellido(apellido);
                    insVO.setNombre(nombre);
                    insVO.setJornada(jornada);
                    insVO.setEspecialidad(especialidad);
                    insVO.setTelefono(telefono);
                    insVO.setHora(hora);
                    c.InstructorActulizar(insVO, auxcedu);

                } else {
                    if (c.InstructorBuscar(cedula) == false) {

                        insVO.setCedula(cedula);
                        insVO.setApellido(apellido);
                        insVO.setNombre(nombre);
                        insVO.setJornada(jornada);
                        insVO.setEspecialidad(especialidad);
                        insVO.setTelefono(telefono);
                        insVO.setHora(hora);
                        c.InstructorActulizar(insVO, auxcedu);
                    } else {
                        JOptionPane.showMessageDialog(null, "El código que desea cambiar, ya existe");
                    }
                }

            }
            limpiar(true);
            visible(true);
            txtCodigo.setEnabled(true);
            btnActualizar.setEnabled(false);
            btnEliminar.setEnabled(false);
            btnRegistrar.setEnabled(true);
            btnConsultar.setEnabled(true);
            btnRegistrar.setText("Registrar");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        if (txtCodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite código");
        } else {
            Integer cedula = Integer.parseInt(this.txtCodigo.getText());
            boolean n = c.InstructorBuscar(cedula);
            if (n == true) {
                btnActualizar.setEnabled(true);
                btnEliminar.setEnabled(true);
                btnRegistrar.setEnabled(false);
                visible(false);
                c.InstructorLlenar(cedula, txtNombre, txtApellido, txtTelefono, txtJornada, txtHora, txtEspecialidad);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró Instructor: " + cedula);
                limpiar(true);
                btnActualizar.setEnabled(false);
                btnEliminar.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        btnActualizar.setEnabled(false);
        btnConsultar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnRegistrar.setEnabled(true);
        visible(true);
        auxcedu = Integer.parseInt(txtCodigo.getText());
        btnRegistrar.setText("Guardar");

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Integer cedula = Integer.parseInt(this.txtCodigo.getText());
        if (c.InstructorBuscar(cedula)) {
            if (0 == JOptionPane.showConfirmDialog(null, "Desea eliminar Instructor: " + cedula, "Eliminar", JOptionPane.YES_NO_OPTION)) {
                c.InstructorLlenar(cedula, txtNombre, txtApellido, txtTelefono, txtJornada, txtHora, txtEspecialidad);
                insVO = new InstructorVO();
                c.InstructorEliminar(cedula, insVO);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encuentra Instructor");
        }

        limpiar(true);
        visible(true);
        txtCodigo.setEnabled(true);
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnRegistrar.setEnabled(true);
        btnConsultar.setEnabled(true);

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseClicked
        btnActualizar.setEnabled(false);
        btnConsultar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }//GEN-LAST:event_txtNombreMouseClicked

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        char cc = evt.getKeyChar();
        if (Character.isLetter(cc)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingresa solo números enteros", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingresa solo letras", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingresa solo letras", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char cc = evt.getKeyChar();
        if (Character.isLetter(cc)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingresa solo números enteros", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiar(true);
        visible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnConsultar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnRegistrar;
    private javax.swing.JButton jButton1;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField txtApellido;
    public javax.swing.JTextField txtCodigo;
    private javax.swing.JComboBox<String> txtEspecialidad;
    private javax.swing.JComboBox<String> txtHora;
    private javax.swing.JComboBox<String> txtJornada;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
