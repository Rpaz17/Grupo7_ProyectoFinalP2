package grupo7_poryectofinalsm;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Menu_Principal extends javax.swing.JFrame {
    
    public Menu_Principal() {
        initComponents();
        this.setContentPane(new Imagen_Inicio());
        
    }    
  
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal().setVisible(true);
            }
    
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();

        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        ImageIcon nuevaImagen = new ImageIcon("C:/Users/fampa/Documents/NetBeansProjects/Grupo7_PoryectoFinalSM/src/Imagenes_rebeca/INICIO PRINCIPAL STRATEGO.png");
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    public class Imagen_Inicio extends JPanel {
         public void paint(Graphics g) {
        ImageIcon no_disponible = new ImageIcon("C:/Users/fampa/Documents/NetBeansProjects/Grupo7_PoryectoFinalSM/src/Imagenes_rebeca/INICIO PRINCIPAL STRATEGO.png");
        g.drawImage(no_disponible.getImage(), 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }
}
        // Variables declaration - do not modify
        // End of variables declaration
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
