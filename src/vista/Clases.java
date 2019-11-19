package vista;

import ServiciosDAO.ClaseServiciosDAO;
import javax.swing.JOptionPane;
import modeloVO.ClasesVO;

import control.Controlador;
import java.util.ArrayList;

public class Clases extends javax.swing.JPanel {

    ClasesVO cs = new ClasesVO();
    Integer auxcedu = 0;
    Controlador c = new Controlador();
    ArrayList<String> lista = new ArrayList<>();

    public Clases() {
        initComponents();
        btnRegistrar.setEnabled(false);
    }

    public void visible(Boolean ok) {
        txtClase.setEnabled(ok);
        txtHorario.setEnabled(ok);
        txtInstructor.setEnabled(ok);
    }

    public void llenar(String m, String n) {
        ClaseServiciosDAO CS = new ClaseServiciosDAO();
        lista = CS.llenarInst(m, n, btnRegistrar);
        for (int i = 0; i < lista.size(); i++) {
            txtInstructor.addItem(lista.get(i));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtInstructor = new javax.swing.JComboBox<>();
        txtHorario = new javax.swing.JComboBox<>();
        btnConsultar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtClase = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion de clases"));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Codigo");

        jLabel2.setText("Clase");

        jLabel3.setText("Instructor");

        jLabel4.setText("Horario");

        txtCodigo.setName("jTxtCedula"); // NOI18N
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione horario:", "6:00 am - 7:00 am", "7:00 am - 8:00 am", "8:00 am - 9:00 am", "9:00 am - 10:00 am", "3:00 pm - 4:00 pm", "4:00 pm - 5:00 pm", "5:00 pm - 6:00 pm", "6:00 pm - 7:00 pm", "7:00 pm - 8:00 pm", "8:00 pm - 9:00 pm" }));

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtClase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione clase:", "Yoga", "Aquaerobics", "Bailoterapia", "Bodycombat", "Entrenamiento funcional", "Spinning" }));

        btnBuscar.setText("Buscar instructor");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar))
                    .addComponent(btnRegistrar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnConsultar))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(16, 16, 16))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(18, 18, 18)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtClase, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtInstructor, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInstructor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnCancelar)
                    .addComponent(btnEliminar))
                .addGap(0, 15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if ((txtCodigo.getText().equals("")) || (txtClase.getSelectedItem().toString().equals("Seleccionar")) || (txtHorario.getSelectedItem().toString().equals("Seleccionar"))
                || (txtInstructor.getSelectedItem().toString().equals("Seleccione Instructor"))) {
            JOptionPane.showMessageDialog(null, "Llenar todos los campos");
        } else {
            Integer codigo = Integer.parseInt(this.txtCodigo.getText());
            String clase = this.txtClase.getSelectedItem().toString();
            String horario = this.txtHorario.getSelectedItem().toString();
            Integer ins = (Integer.parseInt(this.txtInstructor.getSelectedItem().toString()));
            if (btnRegistrar.getText().equalsIgnoreCase("Registrar")) {
                if (c.ClaseBuscar(codigo) == false) {
                    cs = new ClasesVO(codigo, clase, horario, ins);
                    c.ClaseInsertar(cs);
                    btnRegistrar.setEnabled(false);
                } else {
                    JOptionPane.showMessageDialog(null, "El código que desea ingresar, ya existe");
                }
            } else if (btnRegistrar.getText().equalsIgnoreCase("Guardar")) {
                if (auxcedu.equals(codigo)) {
                    cs.setCodigo(auxcedu);
                    cs.setClase(clase);
                    cs.setHorario(horario);
                    cs.setInstructor(ins);
                    c.ClaseActualizar(cs, auxcedu);
                    btnRegistrar.setEnabled(false);
                } else {
                    if (c.ClaseBuscar(codigo) == false) {
                        cs.setCodigo(codigo);
                        cs.setClase(clase);
                        cs.setHorario(horario);
                        cs.setInstructor(ins);
                        c.ClaseActualizar(cs, auxcedu);
                        btnRegistrar.setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "El código que desea cambiar, ya existe");
                    }
                }
            }
        }
        txtCodigo.setText("");
        txtClase.setSelectedIndex(0);
        txtHorario.setSelectedIndex(0);
        txtInstructor.setSelectedIndex(0);
        visible(true);
        txtCodigo.setEnabled(true);
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnRegistrar.setEnabled(true);
        btnConsultar.setEnabled(true);
        btnRegistrar.setText("Registrar");
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        if (txtCodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite código");
        } else {
            Integer codigo = Integer.parseInt(this.txtCodigo.getText());
            boolean n = c.ClaseBuscar(codigo);
            if (n == true) {
                btnActualizar.setEnabled(true);
                btnEliminar.setEnabled(true);
                btnRegistrar.setEnabled(false);
                visible(false);
                c.ClaseLLenar(codigo, txtClase, txtHorario, txtInstructor);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró Clase: " + codigo);
                txtClase.setSelectedIndex(0);
                txtHorario.setSelectedIndex(0);
                //txtInstructor.setSelectedIndex(0);
                txtCodigo.setText("");
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

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtClase.setSelectedIndex(0);
        txtHorario.setSelectedIndex(0);
        txtInstructor.setSelectedIndex(0);
        txtCodigo.setText("");
        btnRegistrar.setEnabled(true);
        visible(true);
        btnActualizar.setVisible(true);
        btnEliminar.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        char cc = evt.getKeyChar();
        if (Character.isLetter(cc)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingresa solo números enteros", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {

            Integer codigo = Integer.parseInt(this.txtCodigo.getText());
            c.ClaseLLenar(codigo, txtClase, txtHorario, txtInstructor);
            cs = new ClasesVO();
            c.ClaseBorrar(codigo, cs);

            visible(false);
            txtClase.setSelectedIndex(0);
            txtHorario.setSelectedIndex(0);
            txtInstructor.setSelectedIndex(0);
            txtCodigo.setText("");
            visible(true);
            txtCodigo.setEnabled(true);
            btnActualizar.setEnabled(true);
            btnEliminar.setEnabled(true);
            btnRegistrar.setEnabled(true);
            btnConsultar.setEnabled(true);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        txtInstructor.removeAllItems();
        if (txtHorario.getSelectedIndex() == 0 && txtClase.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Llenar todos los campos");
        } else {
            String n, m;
            m = txtClase.getSelectedItem().toString();
            n = txtHorario.getSelectedItem().toString();
            llenar(m, n);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> txtClase;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JComboBox<String> txtHorario;
    public javax.swing.JComboBox<String> txtInstructor;
    // End of variables declaration//GEN-END:variables
}
