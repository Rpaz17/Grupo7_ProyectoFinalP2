
package login;

import proyecto.*;

public class MiPerfil extends javax.swing.JFrame {

    VentaLogin ventana;
    Persona persona;

    public MiPerfil(VentaLogin ventana, Persona persona) {
        initComponents();
        setLocationRelativeTo(this);
        this.ventana = ventana;
        this.persona = persona;
        
        user.setText(persona.getNombreUser());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        user = new javax.swing.JLabel();
        Eliminar = new javax.swing.JButton();
        Cambiar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        user.setText("jLabel1");

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Cambiar.setText("Cambiar");
        Cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiarActionPerformed(evt);
            }
        });

        volver.setText("volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        jLabel1.setText("Mi Perfil");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(volver)
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar)
                    .addComponent(Cambiar)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(user)
                .addGap(28, 28, 28)
                .addComponent(Cambiar)
                .addGap(46, 46, 46)
                .addComponent(Eliminar)
                .addGap(51, 51, 51)
                .addComponent(volver)
                .addGap(32, 32, 32))
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

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
            Eliminar delete= new Eliminar(ventana,persona);
            delete.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_EliminarActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
    menu_principal menu = new menu_principal(ventana,persona);
    menu.setVisible(true);
    this.setVisible(false); 
    }//GEN-LAST:event_volverActionPerformed

    private void CambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiarActionPerformed
        CambiarPassword cambiar=new CambiarPassword(ventana,persona);
       cambiar.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_CambiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cambiar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel user;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
