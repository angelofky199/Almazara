package almazarabarcha.vista;

import almazarabarcha.Modelo.Compra;
import static almazarabarcha.vista.VistaGestor.gestor;
import static almazarabarcha.vista.VistaGestor.pos;
import java.sql.Date;
import java.time.LocalDate;

public class AñadirCompra extends VistaGestor {


    public AñadirCompra() {
        initComponents();
        this.setBackground(estilos.getColorInterior());
        label_kg_oliva.setFont(estilos.getFuenteEtiquetas());
        label_observaciones.setFont(estilos.getFuenteEtiquetas());
        label_precio_kg_oliva.setFont(estilos.getFuenteEtiquetas());
        label_total.setFont(estilos.getFuenteEtiquetas());
        btn_añadir.setFont(estilos.getFuenteBotones());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_kg_oliva = new javax.swing.JLabel();
        text_kg_oliva = new javax.swing.JTextField();
        label_precio_kg_oliva = new javax.swing.JLabel();
        text_precio_kg = new javax.swing.JTextField();
        check_subencionado = new javax.swing.JCheckBox();
        check_factura = new javax.swing.JCheckBox();
        check_pagado = new javax.swing.JCheckBox();
        text_observaciones = new javax.swing.JTextField();
        label_observaciones = new javax.swing.JLabel();
        btn_añadir = new javax.swing.JButton();
        label_total = new javax.swing.JLabel();
        text_total = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label_kg_oliva.setText("KG Oliva");

        label_precio_kg_oliva.setText("Precio kg oliva");

        check_subencionado.setText("Subencionado");

        check_factura.setText("Factura");

        check_pagado.setText("Pagado");

        label_observaciones.setText("Observaciones");

        btn_añadir.setText("Añadir Compra");
        btn_añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_añadirActionPerformed(evt);
            }
        });

        label_total.setText("Total");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label_kg_oliva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label_precio_kg_oliva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label_total, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(text_kg_oliva, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(text_total, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(text_precio_kg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(119, 119, 119)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(check_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(check_pagado)
                                    .addComponent(check_subencionado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(text_observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 902, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(465, 465, 465)
                        .addComponent(btn_añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_kg_oliva, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_kg_oliva)
                    .addComponent(check_subencionado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_precio_kg, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_precio_kg_oliva)
                    .addComponent(check_factura))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_total, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_total)
                    .addComponent(check_pagado))
                .addGap(18, 18, 18)
                .addComponent(label_observaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(text_observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_añadirActionPerformed
        Compra c = new Compra();
        float kilos;
        float precio_kg_oliva;
        
        kilos = Float.parseFloat(text_kg_oliva.getText());
        precio_kg_oliva = Float.parseFloat(text_precio_kg.getText());
        
        c.setKg_oliva(kilos);
        c.setPrecio_kg_oliva(precio_kg_oliva);
        c.setPagado(check_pagado.isSelected());
        c.setFactura(check_factura.isSelected());
        c.setObservaciones(text_observaciones.getText());
        c.setFecha_compra(Date.valueOf(LocalDate.now()));
        
        text_total.setText(String.valueOf(c.TotalCompras()));
        
        String nombre = gestor.getClientes().get(pos).getNombre_cliente();
        gestor.addCompra(c, nombre);
    }//GEN-LAST:event_btn_añadirActionPerformed

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
            java.util.logging.Logger.getLogger(AñadirCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AñadirCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AñadirCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AñadirCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AñadirCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_añadir;
    private javax.swing.JCheckBox check_factura;
    private javax.swing.JCheckBox check_pagado;
    private javax.swing.JCheckBox check_subencionado;
    private javax.swing.JLabel label_kg_oliva;
    private javax.swing.JLabel label_observaciones;
    private javax.swing.JLabel label_precio_kg_oliva;
    private javax.swing.JLabel label_total;
    private javax.swing.JTextField text_kg_oliva;
    private javax.swing.JTextField text_observaciones;
    private javax.swing.JTextField text_precio_kg;
    private javax.swing.JTextField text_total;
    // End of variables declaration//GEN-END:variables
}
