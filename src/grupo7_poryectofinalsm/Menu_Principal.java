package grupo7_poryectofinalsm;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Menu_Principal extends javax.swing.JPanel {

    public Menu_Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

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
    // End of variables declaration//GEN-END:variables
}
