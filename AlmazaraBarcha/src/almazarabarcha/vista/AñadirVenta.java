package almazarabarcha.vista;

import almazarabarcha.Modelo.Venta;

public class AñadirVenta extends VistaGestor {

    public AñadirVenta() {
        initComponents();
        this.setBackground(estilos.getColorInterior());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        check_factura = new javax.swing.JCheckBox();
        check_pagado = new javax.swing.JCheckBox();
        text_observaciones = new javax.swing.JTextField();
        label_observaciones = new javax.swing.JLabel();
        btn_venta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        text_5l = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        text_alberquina = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        text_lampante = new javax.swing.JTextField();
        text_10l = new javax.swing.JTextField();
        text_25l = new javax.swing.JTextField();
        txt_total_aceite = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        text_extra = new javax.swing.JTextField();
        check_regalar = new javax.swing.JCheckBox();
        label_bote_flor = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        text_bote_flor = new javax.swing.JTextField();
        text_bote_extra = new javax.swing.JTextField();
        txt_total = new javax.swing.JTextField();
        txt_total_envases = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Alberquina");

        check_factura.setText("Factura");

        check_pagado.setText("Pagado");

        label_observaciones.setText("Observaciones");

        btn_venta.setText("Añadir Venta");
        btn_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ventaActionPerformed(evt);
            }
        });

        jLabel3.setText("Lampante");

        jLabel5.setText("Extra");

        jLabel6.setText("Litros");

        jLabel7.setText("Litros");

        jLabel8.setText("Litros");

        jLabel9.setText("Envase 10 Litros");

        jLabel10.setText("Envase 5 Litros");

        jLabel11.setText("Envase 25 Litros");

        jLabel12.setText("Total Aceite");

        check_regalar.setText("Regalar Envases");
        check_regalar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_regalarActionPerformed(evt);
            }
        });

        label_bote_flor.setText("Bote Flor");

        jLabel2.setText("Bote Extra");

        jLabel1.setText("Total Envases");

        jLabel13.setText("Total");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_observaciones)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5)
                                .addComponent(label_bote_flor)))
                        .addGap(34, 34, 34)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(text_alberquina, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(text_lampante, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(text_bote_extra, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_bote_flor, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(140, 140, 140)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(text_10l, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel13))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(18, 18, 18)
                                                .addComponent(text_5l, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel7)
                                                        .addGap(213, 213, 213))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGap(142, 142, 142)
                                                        .addComponent(jLabel10)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addComponent(text_25l, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                        .addComponent(jLabel1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel12)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_total_aceite, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(59, 59, 59)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(check_pagado)
                                            .addComponent(check_regalar)
                                            .addComponent(check_factura)))
                                    .addComponent(txt_total_envases, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(210, 210, 210))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(105, 105, 105))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(text_extra, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addComponent(text_observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(477, 477, 477)
                .addComponent(btn_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(25, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_lampante, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_alberquina, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(check_regalar)
                                    .addComponent(txt_total_aceite, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(text_25l, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check_factura)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_10l, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(check_pagado)
                            .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(text_5l, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(txt_total_envases, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(19, 19, 19)
                                .addComponent(label_bote_flor)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(text_extra, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(text_bote_flor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_bote_extra, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(39, 39, 39)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_observaciones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ventaActionPerformed
        Venta venta = new Venta();
        
        venta.setRegalar_envases(check_regalar.isSelected());
        venta.setObservaciones(text_observaciones.getText());
        venta.setFactura_realizada(check_factura.isSelected());
        
        //Aceites
        if(!text_lampante.getText().isEmpty())
            venta.venderAceite("Lampante", Float.parseFloat(text_lampante.getText()));
        if(!text_extra.getText().isEmpty())
            venta.venderAceite("Extra", Float.parseFloat(text_extra.getText()));
        if(!text_alberquina.getText().isEmpty())
            venta.venderAceite("Arberquina", Float.parseFloat(text_alberquina.getText()));
        if(!text_bote_flor.getText().isEmpty())
            venta.venderAceite("Bote Flor", Float.parseFloat(text_bote_flor.getText()));
        if(!text_bote_extra.getText().isEmpty())
            venta.venderAceite("Bote Extra", Float.parseFloat(text_bote_extra.getText()));
        //Envases
        if(!text_5l.getText().isEmpty())
            venta.venderEnvase((float) 5, Integer.parseInt(text_5l.getText()));
        if(!text_10l.getText().isEmpty())
            venta.venderEnvase((float) 10, Integer.parseInt(text_10l.getText()));
        if(!text_25l.getText().isEmpty())
            venta.venderEnvase((float) 25, Integer.parseInt(text_25l.getText()));
        
        txt_total_aceite.setText(String.valueOf(venta.getPrecioTotal_tipos_aceite()));
        txt_total_envases.setText(String.valueOf(venta.getPrecioTotal_envases()));
        txt_total.setText(String.valueOf(venta.getTotalPrecio()));
        
        gestor.getClientes().get(pos).addVenta(venta);
        
        System.out.println(gestor.getClientes().get(pos).getVentas().get(0).toString());
    }//GEN-LAST:event_btn_ventaActionPerformed

    private void check_regalarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_regalarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_regalarActionPerformed

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
            java.util.logging.Logger.getLogger(AñadirVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AñadirVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AñadirVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AñadirVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AñadirVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_venta;
    private javax.swing.JCheckBox check_factura;
    private javax.swing.JCheckBox check_pagado;
    private javax.swing.JCheckBox check_regalar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel label_bote_flor;
    private javax.swing.JLabel label_observaciones;
    private javax.swing.JTextField text_10l;
    private javax.swing.JTextField text_25l;
    private javax.swing.JTextField text_5l;
    private javax.swing.JTextField text_alberquina;
    private javax.swing.JTextField text_bote_extra;
    private javax.swing.JTextField text_bote_flor;
    private javax.swing.JTextField text_extra;
    private javax.swing.JTextField text_lampante;
    private javax.swing.JTextField text_observaciones;
    private javax.swing.JTextField txt_total;
    private javax.swing.JTextField txt_total_aceite;
    private javax.swing.JTextField txt_total_envases;
    // End of variables declaration//GEN-END:variables
}
