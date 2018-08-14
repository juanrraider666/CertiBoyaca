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

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;

import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class frmRegistrofuncionario extends javax.swing.JFrame {

    /**
     * Creates new form frmRegistrofuncionario
     */
    public frmRegistrofuncionario() {
   
        JPanelBackground panelFondo = new JPanelBackground();
        this.setContentPane(panelFondo);
        panelFondo.setBackground();
        panelFondo.setOpaque(false);
        initComponents();
        this.setLayout(new GridBagLayout());
        this.setLocationRelativeTo(null);
        Date hoy = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        txtfecha.setText(dateFormat.format(hoy));

        Perfiles pe = new Perfiles();
        DefaultComboBoxModel cbomodel = new DefaultComboBoxModel(pe.mostrarPerfiles());
        cboperfiles.setModel(cbomodel);

        cargo.setVisible(false);

    }

    void limpiar() {
        cargo.setText(null);
        datosnombres.setText(null);
        datosapellidos.setText(null);
        datosdireccion.setText(null);
        datosidentificacion.setText(null);
        datosusuario.setText(null);
        datoscontraseña.setText(null);
        datosconfircontraseña.setText(null);
        datostelefono.setText(null);
        datoscorreo.setText(null);
        cboperfiles.setSelectedIndex(0);

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
        jLabel3 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        subtitulo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        datosnombres = new javax.swing.JTextField();
        apellidos = new javax.swing.JLabel();
        datosapellidos = new javax.swing.JTextField();
        identificacion = new javax.swing.JLabel();
        datosidentificacion = new javax.swing.JTextField();
        cboperfiles = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        datoscorreo = new javax.swing.JTextField();
        direccion = new javax.swing.JLabel();
        datosdireccion = new javax.swing.JTextField();
        telefono = new javax.swing.JLabel();
        datostelefono = new javax.swing.JTextField();
        datosusuario = new javax.swing.JTextField();
        constraseña = new javax.swing.JLabel();
        datoscontraseña = new javax.swing.JPasswordField();
        confcontraseña = new javax.swing.JLabel();
        datosconfircontraseña = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        fceharegistro = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        cargo = new javax.swing.JTextField();
        cancelar = new javax.swing.JButton();
        registrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setOpaque(false);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logook.png"))); // NOI18N

        titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titulo.setText("REGISTRO PARA EL INGRESO AL SISTEMA");

        subtitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        subtitulo.setText("DATOS DEL FUNCIONARIO");

        jButton1.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setText("SALIR");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Nombres :");

        datosnombres.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        apellidos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        apellidos.setText("Apellidos :");

        datosapellidos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        identificacion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        identificacion.setText("Identificación:");

        datosidentificacion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        cboperfiles.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cboperfiles.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboperfilesItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Cargo:");

        correo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        correo.setText("Correo electrónico:");

        datoscorreo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        direccion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        direccion.setText("Dirección:");

        datosdireccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        telefono.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        telefono.setText("Teléfono:");

        datostelefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        datosusuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        constraseña.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        constraseña.setText("Asignar contraseña:");

        datoscontraseña.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        confcontraseña.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        confcontraseña.setText("Confirmar contraseña:");

        datosconfircontraseña.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Usuario:");

        fceharegistro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fceharegistro.setText("Fecha de registro:");

        txtfecha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtfecha.setEnabled(false);

        cargo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cargo.setText("0");

        cancelar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cancelar.setText("Cancelar registro");
        cancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarMouseClicked(evt);
            }
        });
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        registrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        registrar.setText("Registrar usuario");
        registrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(80, 80, 80)
                                    .addComponent(subtitulo)))
                            .addGap(20, 20, 20)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(7, 7, 7)
                            .addComponent(datosnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(apellidos)
                            .addGap(8, 8, 8)
                            .addComponent(datosapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(identificacion)
                            .addGap(7, 7, 7)
                            .addComponent(datosidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(jLabel2)
                            .addGap(10, 10, 10)
                            .addComponent(cboperfiles, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(datoscorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(direccion)
                            .addGap(7, 7, 7)
                            .addComponent(datosdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(telefono)
                            .addGap(4, 4, 4)
                            .addComponent(datostelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(jLabel4)
                            .addGap(4, 4, 4)
                            .addComponent(datosusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(constraseña)
                            .addGap(8, 8, 8)
                            .addComponent(datoscontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(confcontraseña)
                            .addGap(5, 5, 5)
                            .addComponent(datosconfircontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(190, 190, 190)
                            .addComponent(fceharegistro)
                            .addGap(7, 7, 7)
                            .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(540, 540, 540)
                            .addComponent(cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(170, 170, 170)
                            .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 507, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(titulo)
                                    .addGap(21, 21, 21)
                                    .addComponent(subtitulo)))))
                    .addGap(48, 48, 48)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(datosnombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(datosapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(apellidos))))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(datosidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboperfiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(correo))
                        .addComponent(datoscorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(direccion)
                        .addComponent(datosdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(8, 8, 8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(datostelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(datosusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(telefono)
                                .addComponent(jLabel4))))
                    .addGap(8, 8, 8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(datoscontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(datosconfircontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(constraseña)
                                .addComponent(confcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(28, 28, 28)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(fceharegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addComponent(cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frmRolAdministrador.frmRegFun = null;
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cboperfilesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboperfilesItemStateChanged
        // TODO add your handling code here:
        Perfiles pe = (Perfiles) cboperfiles.getSelectedItem();
        System.out.println(pe.getId());
        cargo.setText("" + pe.getId());
    }//GEN-LAST:event_cboperfilesItemStateChanged

    private void cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMouseClicked
        frmLogin login = new frmLogin();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelarMouseClicked

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_cancelarActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        // TODO add your handling code here:

        Usuarios usu = new Usuarios();
        ConsultasUsuarios cu = new ConsultasUsuarios();
        ControladorUsuarios ctrl = new ControladorUsuarios(usu, cu);
        String nom = datosnombres.getText();
        String ape = datosapellidos.getText();
        String ident = datosidentificacion.getText();
        String dir = datosdireccion.getText();
        String tel = datostelefono.getText();
        String usua = datosusuario.getText();
        String pass = new String(datoscontraseña.getPassword());
        String confpass = new String(datosconfircontraseña.getPassword());
        Date hoy = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = dateFormat.format(hoy);
        int perfil = Integer.parseInt(cargo.getText());
        //        txtfecha.setText(dateFormat.format(hoy));
        if (nom.equals("") || ape.equals("") || ident.equals("") || usua.equals("") || pass.equals("") || confpass.equals("") || perfil == 0) {
            JOptionPane.showMessageDialog(null, "Es necesario completar todos los campos");
        } else {
            if (!pass.equals(confpass)) {
                JOptionPane.showMessageDialog(this, "Las contraseñas no coindicen");
            } else {
                if (ctrl.registrar(nom, ape, ident, dir, tel, usua, pass, fecha, perfil)) {
                    JOptionPane.showMessageDialog(this, "Registro guardado");
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(this, "Registro no guardado");
                }
            }
        }
    }//GEN-LAST:event_registrarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        frmRolAdministrador.frmRegFun = null;
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
            java.util.logging.Logger.getLogger(frmRegistrofuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistrofuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistrofuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistrofuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistrofuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidos;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField cargo;
    private javax.swing.JComboBox<String> cboperfiles;
    private javax.swing.JLabel confcontraseña;
    private javax.swing.JLabel constraseña;
    private javax.swing.JLabel correo;
    private javax.swing.JTextField datosapellidos;
    private javax.swing.JPasswordField datosconfircontraseña;
    private javax.swing.JPasswordField datoscontraseña;
    private javax.swing.JTextField datoscorreo;
    private javax.swing.JTextField datosdireccion;
    private javax.swing.JTextField datosidentificacion;
    private javax.swing.JTextField datosnombres;
    private javax.swing.JTextField datostelefono;
    private javax.swing.JTextField datosusuario;
    private javax.swing.JLabel direccion;
    private javax.swing.JLabel fceharegistro;
    private javax.swing.JLabel identificacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton registrar;
    private javax.swing.JLabel subtitulo;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtfecha;
    // End of variables declaration//GEN-END:variables
}