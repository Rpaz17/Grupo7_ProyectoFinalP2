package login;

import javax.swing.JOptionPane;
import proyecto.*;


public class VentaLogin extends javax.swing.JFrame {
    
    ControladorLogin controlador;
    Persona persona;
    
    
    public VentaLogin() {
        initComponents();
        setLocationRelativeTo(this);
        this.controlador = new ControladorLogin();
    }

    public ControladorLogin getControlador() {
        return controlador;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        Entrar = new javax.swing.JButton();
        Registrar = new javax.swing.JButton();
        txtContra = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre del usuario :");

        jLabel2.setText("Contraseña :");

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        Entrar.setText("Entrar");
        Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarActionPerformed(evt);
            }
        });

        Registrar.setText("Registrar");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Entrar)
                    .addComponent(Registrar))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(Entrar)
                .addGap(18, 18, 18)
                .addComponent(Registrar)
                .addContainerGap(33, Short.MAX_VALUE))
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

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
   
        /*
        nos manda a la ventana  de registr persona
         */
        VentanaRegistraPersona ventana = new VentanaRegistraPersona(this);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        this.dispose();
        txtUser.setText(null);
        txtContra.setText(null);
    }//GEN-LAST:event_RegistrarActionPerformed

    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarActionPerformed

        
        /*
         aqui estamos llenando los campos para poder ingresar
         */
        
        String user = txtUser.getText();
        String contra = txtContra.getText();
        
        
        /*
         necesitamos un auxiliar para así poder buscar el nombre de usuario 
         para así poder registrar pero solo si se encuentra en la lista de persona
         */
        Persona aux = controlador.buscarPersona(user);
        
        if (aux != null) {
            /*
             aquí debemos compara la contraseña con la persona que se encontró 
             con el nombre de usuario si son iguales me entre ya la ventana 
             -----------------------------------------------------------------
             en los parámetros de la ventana debemos mandar a la ventana y al
             usuario encontrado
             */
            if (aux.getContrasena().equals(contra)) {

                
                menu_principal display = new menu_principal();
                display.setVisible(true);
                this.dispose();
                
                
                txtUser.setText(null);
                txtContra.setText(null);
            }else{
                JOptionPane.showMessageDialog(null, "Error: Contraseña incorrecta");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Error: Usuario no encontrado");
        }
        
        
        
    }//GEN-LAST:event_EntrarActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentaLogin ventana = new VentaLogin();
                ventana.setVisible(true);
                ventana.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Entrar;
    private javax.swing.JButton Registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
