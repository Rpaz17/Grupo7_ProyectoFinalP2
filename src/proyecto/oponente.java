/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto;
import java.util.Arrays;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import login.*;
import java.util.stream.Collectors;
//tiene que funcionar
public class oponente extends javax.swing.JFrame {
    VentaLogin ventana;
    Persona persona;
    ControladorLogin controladorLogin;
    public oponente(VentaLogin ventana, Persona persona) {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.ventana = ventana;
        this.persona = persona;
        this.controladorLogin = ventana.getControlador();
        inicializarComboBox();
    }

    private void inicializarComboBox() {      
        Persona[] arregloPersonas = controladorLogin.getArregloPersonas();//arreglo qeu contiene todos registrados
        String usuario = persona.getNombreUser();//obtener loqueado

        String[] colador = Arrays.stream(arregloPersonas)//metodo que hace este array en flujos
                             .filter(p -> p != null && !p.getNombreUser().equals(usuario))//aqui cuela y pasa todo menos usaurio logueado
                             .map(Persona::getNombreUser)//obtiene el sobrante
                             .toArray(String[]::new);//nuevos elemntos en array 

        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(colador);
        comboBox_oponente.setModel(comboBoxModel);//actualizamos el modelo
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_regresar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btn_continuar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        comboBox_oponente = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jPanel2.setOpaque(false);

        btn_regresar.setText("REGRESAR");
        btn_regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_regresarMouseClicked(evt);
            }
        });
        jPanel2.add(btn_regresar);

        jPanel3.setOpaque(false);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SELECCIONE OPONENTE");
        jPanel3.add(jLabel1);

        jPanel4.setOpaque(false);

        btn_continuar.setText("CONTINUAR");
        btn_continuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_continuarMouseClicked(evt);
            }
        });
        jPanel4.add(btn_continuar);

        jPanel5.setOpaque(false);

        comboBox_oponente.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        comboBox_oponente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBox_oponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_oponenteActionPerformed(evt);
            }
        });
        jPanel5.add(comboBox_oponente);

        jPanel6.setOpaque(false);

        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jPanel6.add(jLabel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_continuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_continuarMouseClicked
    //cambie esto
        String texto = jLabel2.getText();
        if (texto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un oponente");
        } else {
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Está seguro de continuar?", "Oponente "+texto, JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                bando ventana1 = new bando(ventana,persona);
                ventana1.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_btn_continuarMouseClicked

    private void btn_regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regresarMouseClicked
    partida_nueva menu = new partida_nueva(ventana,persona);
    menu.setVisible(true);
    this.dispose();          // TODO add your handling code here:
    }//GEN-LAST:event_btn_regresarMouseClicked

    private void comboBox_oponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_oponenteActionPerformed
    String label=""; 
    label=label+comboBox_oponente.getSelectedItem().toString();
    jLabel2.setText(label);
    }//GEN-LAST:event_comboBox_oponenteActionPerformed

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
            java.util.logging.Logger.getLogger(oponente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(oponente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(oponente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(oponente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_continuar;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JComboBox<String> comboBox_oponente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
