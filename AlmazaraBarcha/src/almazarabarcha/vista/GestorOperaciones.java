package almazarabarcha.vista;

import almazarabarcha.Modelo.Molturacion;
import static almazarabarcha.vista.VistaGestor.gestor;
import static almazarabarcha.vista.VistaGestor.pos;
import java.awt.Color;
import java.util.ArrayList;

public class GestorOperaciones extends VistaGestor {

    public GestorOperaciones() {
        initComponents();
        this.setLocation(250, 150);
        this.setBackground(estilos.getColorInterior());
        jPanel1.setBackground(estilos.getColorInterior());
        btn_camb.setFont(estilos.getFuenteBotones());
        btn_comp.setFont(estilos.getFuenteBotones());
        btn_molt.setFont(estilos.getFuenteBotones());
        btn_vent.setFont(estilos.getFuenteBotones());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_molt = new javax.swing.JButton();
        btn_comp = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn_vent = new javax.swing.JButton();
        btn_camb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        btn_molt.setText("Molturacion");
        btn_molt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_moltActionPerformed(evt);
            }
        });

        btn_comp.setText("Compra");
        btn_comp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_compActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
        );

        btn_vent.setText("Venta");
        btn_vent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ventActionPerformed(evt);
            }
        });

        btn_camb.setText("Cambio");
        btn_camb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cambActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(btn_molt, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btn_comp, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btn_vent, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btn_camb, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_camb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_comp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_vent, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_molt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_moltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_moltActionPerformed
        AñadirMolturacion m = new AñadirMolturacion();
        jPanel1.removeAll();
        m.getContentPane().setBackground(estilos.getColorInterior());
        jPanel1.add(m.getContentPane());
        jPanel1.repaint();
        btn_molt.setBackground(Color.YELLOW);
        btn_camb.setBackground(Color.LIGHT_GRAY);
        btn_comp.setBackground(Color.LIGHT_GRAY);
        btn_vent.setBackground(Color.LIGHT_GRAY);
        
    }//GEN-LAST:event_btn_moltActionPerformed

    private void btn_compActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_compActionPerformed
        AñadirCompra c = new AñadirCompra();
        jPanel1.removeAll();
        c.getContentPane().setBackground(estilos.getColorInterior());
        jPanel1.add(c.getContentPane());
        jPanel1.repaint();
        btn_comp.setBackground(Color.YELLOW);
        btn_molt.setBackground(Color.LIGHT_GRAY);
        btn_camb.setBackground(Color.LIGHT_GRAY);
        btn_vent.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btn_compActionPerformed

    private void btn_ventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ventActionPerformed
        AñadirVenta v = new AñadirVenta();
        jPanel1.removeAll();
        v.getContentPane().setBackground(estilos.getColorInterior());
        jPanel1.add(v.getContentPane());
        jPanel1.repaint();
        btn_vent.setBackground(Color.YELLOW);
        btn_molt.setBackground(Color.LIGHT_GRAY);
        btn_comp.setBackground(Color.LIGHT_GRAY);
        btn_camb.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btn_ventActionPerformed

    private void btn_cambActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cambActionPerformed
        AñadirCambio c = new AñadirCambio();
        jPanel1.removeAll();
        c.getContentPane().setBackground(estilos.getColorInterior());
        jPanel1.add(c.getContentPane());
        jPanel1.repaint();
        btn_camb.setBackground(Color.YELLOW);
        btn_molt.setBackground(Color.LIGHT_GRAY);
        btn_comp.setBackground(Color.LIGHT_GRAY);
        btn_vent.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btn_cambActionPerformed
    
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
            java.util.logging.Logger.getLogger(GestorOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestorOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestorOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestorOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestorOperaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_camb;
    private javax.swing.JButton btn_comp;
    private javax.swing.JButton btn_molt;
    private javax.swing.JButton btn_vent;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
