package almazarabarcha.vista;

import capaDAO.DaoCambio;
import excepciones.BusinessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import pojos.Cambio;
import pojos.Cliente;
import pojos.Usuario;

public class AñadirCambio extends VistaGestor {

    Cliente c;
    Usuario u;
    Cambio cambio;

    public AñadirCambio(Cliente c, Usuario u) {
        initComponents();
        this.setBackground(estilos.getColorInterior());
        label_kg_oliva.setFont(estilos.getFuenteEtiquetas());
        label_rendimiento.setFont(estilos.getFuenteEtiquetas());
        label_maquila.setFont(estilos.getFuenteEtiquetas());
        label_litros_cambio.setFont(estilos.getFuenteEtiquetas());
        label_aceite_retirado.setFont(estilos.getFuenteEtiquetas());
        label_observaciones.setFont(estilos.getFuenteEtiquetas());
        btn_añadir_cambio.setFont(estilos.getFuenteBotones());
        this.c = c;
        this.u = u;
    }

    private AñadirCambio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text_observaciones = new javax.swing.JTextField();
        label_observaciones = new javax.swing.JLabel();
        btn_añadir_cambio = new javax.swing.JButton();
        label_kg_oliva = new javax.swing.JLabel();
        label_rendimiento = new javax.swing.JLabel();
        text_rendimiento = new javax.swing.JTextField();
        text_kg_oliva = new javax.swing.JTextField();
        check_factura = new javax.swing.JCheckBox();
        check_pagado = new javax.swing.JCheckBox();
        check_paga = new javax.swing.JCheckBox();
        check_retira = new javax.swing.JCheckBox();
        label_litros_cambio = new javax.swing.JLabel();
        text_litros_cambio = new javax.swing.JTextField();
        label_aceite_retirado = new javax.swing.JLabel();
        text_litros_retirado = new javax.swing.JTextField();
        label_maquila = new javax.swing.JLabel();
        text_maquila = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label_observaciones.setText("Observaciones");

        btn_añadir_cambio.setText("Añadir Cambio");
        btn_añadir_cambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_añadir_cambioActionPerformed(evt);
            }
        });

        label_kg_oliva.setText("KG oliva");

        label_rendimiento.setText("Rendimiento");

        check_factura.setText("Factura");

        check_pagado.setText("Pagado");

        check_paga.setText("Paga");

        check_retira.setText("Retira");

        label_litros_cambio.setText("Litros para cambio ");

        text_litros_cambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_litros_cambioActionPerformed(evt);
            }
        });

        label_aceite_retirado.setText("Litros aceite retirado");

        label_maquila.setText("Maquila");

        text_maquila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_maquilaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(label_rendimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(label_kg_oliva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_maquila, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(text_kg_oliva, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_rendimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_maquila, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_aceite_retirado, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(label_litros_cambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_litros_cambio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_litros_retirado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(check_retira)
                            .addComponent(check_pagado))
                        .addGap(47, 47, 47)
                        .addComponent(check_factura))
                    .addComponent(check_paga, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(284, 284, 284))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(text_observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(254, 254, 254))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(label_observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1010, 1010, 1010))))
            .addGroup(layout.createSequentialGroup()
                .addGap(470, 470, 470)
                .addComponent(btn_añadir_cambio, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_litros_cambio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_litros_cambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(text_kg_oliva, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_kg_oliva)
                    .addComponent(check_retira)
                    .addComponent(check_factura))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_litros_retirado, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_aceite_retirado)
                    .addComponent(label_rendimiento)
                    .addComponent(text_rendimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check_pagado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_maquila, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_maquila)
                    .addComponent(check_paga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(label_observaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btn_añadir_cambio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_añadir_cambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_añadir_cambioActionPerformed

        if (text_kg_oliva.getText().equals("") || text_rendimiento.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan campos por completar");
        }
        if (text_observaciones.getText().equals("")) {
            text_observaciones.setText("");
        }

        float kilos = Float.parseFloat(text_kg_oliva.getText());
        cambio.setKgOliva(kilos);

        float rend = Float.parseFloat(text_rendimiento.getText());
        cambio.setRendimiento(rend);

        if (text_maquila.getText().equals("")) {
            cambio.setMaquila(0);

        } else {
            float maquila = Float.parseFloat(text_maquila.getText());
            cambio.setPorcentajeMaquila(maquila);
        }

        float litros_retira = cambio.CalcularLitrosParaRetirar();
        text_litros_retirado.setText(String.valueOf(litros_retira));
        cambio.setLitrosRetirados(litros_retira);

        float litros_cambio = cambio.CalcularLitrosAceiteParaCambio();
        text_litros_cambio.setText(String.valueOf(litros_cambio));
        cambio.setLitrosCambio(litros_cambio);

        //cambio.setFactura(check_factura.isSelected());
        cambio.setPaga(check_paga.isSelected());
        cambio.setObservaciones(text_observaciones.getText());
        
        cambio.setCliente(c);
        cambio.setUsuario(u);

        try {
            DaoCambio.insertar(cambio);
        } catch (BusinessException ex) {
            Logger.getLogger(AñadirCambio.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(null, "Se ha añadido el cambio correctamente al cliente: " + c.getNombre());
    }//GEN-LAST:event_btn_añadir_cambioActionPerformed

    private void text_litros_cambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_litros_cambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_litros_cambioActionPerformed

    private void text_maquilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_maquilaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_maquilaActionPerformed

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
            java.util.logging.Logger.getLogger(AñadirCambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AñadirCambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AñadirCambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AñadirCambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AñadirCambio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_añadir_cambio;
    private javax.swing.JCheckBox check_factura;
    private javax.swing.JCheckBox check_paga;
    private javax.swing.JCheckBox check_pagado;
    private javax.swing.JCheckBox check_retira;
    private javax.swing.JLabel label_aceite_retirado;
    private javax.swing.JLabel label_kg_oliva;
    private javax.swing.JLabel label_litros_cambio;
    private javax.swing.JLabel label_maquila;
    private javax.swing.JLabel label_observaciones;
    private javax.swing.JLabel label_rendimiento;
    private javax.swing.JTextField text_kg_oliva;
    private javax.swing.JTextField text_litros_cambio;
    private javax.swing.JTextField text_litros_retirado;
    private javax.swing.JTextField text_maquila;
    private javax.swing.JTextField text_observaciones;
    private javax.swing.JTextField text_rendimiento;
    // End of variables declaration//GEN-END:variables
}
