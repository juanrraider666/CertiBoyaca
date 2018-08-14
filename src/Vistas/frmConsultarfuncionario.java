/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controlador.ControladorUsuarios;
import Modelo.ConsultasUsuarios;
import Modelo.Perfiles;
import Modelo.Usuarios;
import java.awt.GridBagLayout;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class frmConsultarfuncionario extends javax.swing.JFrame {

    /**
     * Creates new form frmConsultarfuncionario
     */
    public frmConsultarfuncionario() {
        JPanelBackground panelFondo = new JPanelBackground();
        this.setContentPane(panelFondo);
        panelFondo.setBackground();
        panelFondo.setOpaque(false);
        initComponents();
        this.setLayout(new GridBagLayout());
        this.setLocationRelativeTo(null);
        Perfiles pe = new Perfiles();
        DefaultComboBoxModel cbomodel = new DefaultComboBoxModel(pe.mostrarPerfiles());
        cboPerfil.setModel(cbomodel);
        txtperfil.setVisible(false);
        txtid.setVisible(false);
        txtpassactual.setVisible(false);
        btnguardar.setEnabled(false);
    }
    
     void limpiar() {
        txtapellidos.setText(null);
        txtapellidos.setEnabled(false);
        txtnombres.setText(null);
        txtnombres.setEnabled(false);
        txtdireccion.setText(null);
        txtdireccion.setEnabled(false);
        txttelefono.setText(null);
        txttelefono.setEnabled(false);
        txtidentificacion.setText(null);
        txtidentificacion.setEnabled(false);
        txtusuario.setText(null);
        txtusuario.setEnabled(false);
        cboPerfil.setSelectedIndex(0);
        cboPerfil.setEnabled(false);
        txtperfil.setText(null);
        txtperfil.setEnabled(false);
        txtpassactual.setText(null);
        txtpassactual.setEnabled(false);
        txtpass.setText(null);
        txtpass.setEnabled(false);
        txtconfpass.setText(null);
        txtconfpass.setEnabled(false);
        txtid.setText(null);
        chkchangepass.setSelected(false);
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
        btnguardar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        txtconfpass = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        chkchangepass = new javax.swing.JCheckBox();
        txtusuario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnbuscar = new javax.swing.JButton();
        txtbuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnombres = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtapellidos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtidentificacion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cboPerfil = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtperfil = new javax.swing.JTextField();
        txtpassactual = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setOpaque(false);

        btnguardar.setText("Guardar");
        btnguardar.setEnabled(false);
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btneditar.setText("Editar");
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        txtconfpass.setEnabled(false);

        jLabel12.setText("Confirmar Contraseña:");

        txtpass.setEnabled(false);

        jLabel11.setText("Nueva Contraseña:");

        chkchangepass.setText("Cambiar Contraseña");
        chkchangepass.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkchangepassItemStateChanged(evt);
            }
        });

        txtusuario.setEnabled(false);

        jLabel10.setText("Usuario:");

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Busqueda de Usuario:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("DATOS DE USUARIO");

        txtnombres.setEnabled(false);

        jLabel3.setText("Nombres:");

        jLabel4.setText("Apellidos:");

        txtapellidos.setEnabled(false);

        jLabel5.setText("Identificacion:");

        txtidentificacion.setEnabled(false);

        jLabel6.setText("Cargo:");

        cboPerfil.setEnabled(false);
        cboPerfil.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboPerfilItemStateChanged(evt);
            }
        });

        jLabel8.setText("Direccion:");

        txtdireccion.setEnabled(false);

        jLabel9.setText("Telefono:");

        txttelefono.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(64, 64, 64))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtpassactual, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 71, Short.MAX_VALUE))
                                    .addComponent(txttelefono)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(63, 63, 63)
                                    .addComponent(txtdireccion))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addGap(41, 41, 41)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtidentificacion, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtapellidos, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtnombres, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cboPerfil, javax.swing.GroupLayout.Alignment.LEADING, 0, 203, Short.MAX_VALUE)))))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(chkchangepass)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel11))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtconfpass)
                                        .addComponent(txtpass)))))
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnbuscar)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnbuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(chkchangepass)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtconfpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtperfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpassactual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnguardar)
                    .addComponent(btneditar))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:

        Usuarios mod = new Usuarios();
        ConsultasUsuarios modC = new ConsultasUsuarios();

        ControladorUsuarios ctrl = new ControladorUsuarios(mod, modC);

        int id = Integer.parseInt(txtid.getText());
        String apellidos = txtapellidos.getText();
        String nombres = txtnombres.getText();
        String identificacion = txtidentificacion.getText();
        String telefono = txttelefono.getText();
        String direccion = txtdireccion.getText();
        int perfil = Integer.parseInt(txtperfil.getText());
        String usuario = txtusuario.getText();
        String passactual = txtpassactual.getText();
        String newpass = new String(txtpass.getPassword());
        String confpass = new String(txtconfpass.getPassword());

        if (chkchangepass.isSelected()) {
            if (newpass.trim().length() == 0 || confpass.trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Los campos de contraseña no deben estas vacios");
            } else {
                if (newpass.equals(confpass)) {
                    if (ctrl.actualizar(id, nombres, apellidos, identificacion, direccion, telefono, perfil, usuario, newpass)) {
                        JOptionPane.showMessageDialog(this, "Registro Actualizado");
                        limpiar();

                    } else {
                        JOptionPane.showMessageDialog(this, "Error al  Actualizar");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Las contraseñas deben coincidir");
                }
            }

        } else {

            if (ctrl.actualizar(id, nombres, apellidos, identificacion, direccion, telefono, perfil, usuario, passactual)) {
                JOptionPane.showMessageDialog(this, "Registro Actualizado");

                limpiar();
            } else {
                JOptionPane.showMessageDialog(this, "Error al  Actualizar");
            }
        }
        //

    }//GEN-LAST:event_btnguardarActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        // TODO add your handling code here:

        txtapellidos.setEnabled(true);
        txtdireccion.setEnabled(true);
        txtnombres.setEnabled(true);
        txtidentificacion.setEnabled(true);
        txttelefono.setEnabled(true);
        txtusuario.setEnabled(true);
        cboPerfil.setEnabled(true);
        btnguardar.setEnabled(true);
        btneditar.setEnabled(true);

    }//GEN-LAST:event_btneditarActionPerformed

    private void chkchangepassItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkchangepassItemStateChanged
        // TODO add your handling code here:

        if (evt.getStateChange() == ItemEvent.SELECTED) {
            txtpass.setEnabled(true);
            txtconfpass.setEnabled(true);
        } else {
            txtpass.setEnabled(false);
            txtconfpass.setEnabled(false);
        }
    }//GEN-LAST:event_chkchangepassItemStateChanged

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        Usuarios u = new Usuarios();
        ConsultasUsuarios cu = new ConsultasUsuarios();

        ControladorUsuarios ctrl = new ControladorUsuarios(u, cu);

        if (!ctrl.buscar(txtbuscar.getText())) {
            JOptionPane.showMessageDialog(this, "No se encontro ningún registro");
        } else {
            txtapellidos.setText(u.getApellidos());
            txtnombres.setText(u.getNombres());
            txtdireccion.setText(u.getDireccion());
            txttelefono.setText(u.getTelefono());
            txtidentificacion.setText(u.getIdentificacion());
            txtusuario.setText(u.getUsuario());
            cboPerfil.setSelectedIndex(u.getPerfil());
            txtperfil.setText(String.valueOf(u.getPerfil()));
            txtpassactual.setText(u.getPassword());
            txtid.setText(String.valueOf(u.getId()));

        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void cboPerfilItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboPerfilItemStateChanged
        // TODO add your handling code here:

        Perfiles pe = (Perfiles) cboPerfil.getSelectedItem();
        System.out.println(pe.getId());
        txtperfil.setText(String.valueOf(pe.getId()));
    }//GEN-LAST:event_cboPerfilItemStateChanged

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        frmRolAdministrador.frmConFun = null;
        
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(frmConsultarfuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmConsultarfuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmConsultarfuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmConsultarfuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmConsultarfuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JComboBox<String> cboPerfil;
    private javax.swing.JCheckBox chkchangepass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JPasswordField txtconfpass;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtidentificacion;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtpassactual;
    private javax.swing.JTextField txtperfil;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}