package almazarabarcha.vista;

import almazarabarcha.Modelo.Venta;

public class AñadirVenta extends VistaGestor {

    public AñadirVenta() {
        initComponents();
        label_10l.setFont(estilos.getFuenteEtiquetas());
        label_25l.setFont(estilos.getFuenteEtiquetas());
        label_5l.setFont(estilos.getFuenteEtiquetas());
        label_alberquina.setFont(estilos.getFuenteEtiquetas());
        label_bote_extra.setFont(estilos.getFuenteEtiquetas());
        label_bote_flor.setFont(estilos.getFuenteEtiquetas());
        label_extra.setFont(estilos.getFuenteEtiquetas());
        label_lampante.setFont(estilos.getFuenteEtiquetas());
        label_observaciones.setFont(estilos.getFuenteEtiquetas());
        label_total.setFont(estilos.getFuenteEtiquetas());
        label_total_aceite.setFont(estilos.getFuenteEtiquetas());
        label_total_envases.setFont(estilos.getFuenteEtiquetas());
        label_litros1.setFont(estilos.getFuenteEtiquetas());
        label_litros2.setFont(estilos.getFuenteEtiquetas());
        label_litros3.setFont(estilos.getFuenteEtiquetas());
        btn_venta.setFont(estilos.getFuenteBotones());
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_alberquina = new javax.swing.JLabel();
        check_factura = new javax.swing.JCheckBox();
        check_pagado = new javax.swing.JCheckBox();
        text_observaciones = new javax.swing.JTextField();
        label_observaciones = new javax.swing.JLabel();
        btn_venta = new javax.swing.JButton();
        label_lampante = new javax.swing.JLabel();
        text_5l = new javax.swing.JTextField();
        label_extra = new javax.swing.JLabel();
        text_alberquina = new javax.swing.JTextField();
        label_litros3 = new javax.swing.JLabel();
        label_litros1 = new javax.swing.JLabel();
        label_litros2 = new javax.swing.JLabel();
        label_10l = new javax.swing.JLabel();
        label_5l = new javax.swing.JLabel();
        label_25l = new javax.swing.JLabel();
        text_lampante = new javax.swing.JTextField();
        text_10l = new javax.swing.JTextField();
        text_25l = new javax.swing.JTextField();
        txt_total_aceite = new javax.swing.JTextField();
        label_total_aceite = new javax.swing.JLabel();
        text_extra = new javax.swing.JTextField();
        check_regalar = new javax.swing.JCheckBox();
        label_bote_flor = new javax.swing.JLabel();
        label_bote_extra = new javax.swing.JLabel();
        text_bote_flor = new javax.swing.JTextField();
        text_bote_extra = new javax.swing.JTextField();
        txt_total = new javax.swing.JTextField();
        txt_total_envases = new javax.swing.JTextField();
        label_total_envases = new javax.swing.JLabel();
        label_total = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label_alberquina.setText("Alberquina");

        check_factura.setText("Factura");

        check_pagado.setText("Pagado");

        label_observaciones.setText("Observaciones");

        btn_venta.setText("Añadir Venta");
        btn_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ventaActionPerformed(evt);
            }
        });

        label_lampante.setText("Lampante");

        label_extra.setText("Extra");

        label_litros3.setText("Litros");

        label_litros1.setText("Litros");

        label_litros2.setText("Litros");

        label_10l.setText("Envase 10 L");

        label_5l.setText("Envase 5 L");

        label_25l.setText("Envase 25 L");

        label_total_aceite.setText("Total Aceite");

        check_regalar.setText("Regalar Envases");
        check_regalar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_regalarActionPerformed(evt);
            }
        });

        label_bote_flor.setText("Bote Flor");

        label_bote_extra.setText("Bote Extra");

        label_total_envases.setText("Total Envases");

        label_total.setText("Total");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label_lampante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label_bote_extra, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label_alberquina, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_bote_flor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_extra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text_bote_extra, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text_bote_flor, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(text_extra, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_litros1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(label_5l, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label_litros3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(text_alberquina, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_lampante, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_litros2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_10l, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_25l, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(text_5l, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(text_25l, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(text_10l))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(label_total_aceite, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_total_aceite, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_total_envases, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_total, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_total_envases, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check_regalar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(check_pagado)
                        .addComponent(check_factura)))
                .addGap(210, 210, 210))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(470, 470, 470)
                        .addComponent(btn_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_lampante, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_lampante)
                            .addComponent(label_litros1)
                            .addComponent(text_25l, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_5l))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(text_alberquina, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_alberquina)
                                    .addComponent(label_litros2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(text_extra, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_litros3)
                                    .addComponent(label_extra)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(text_5l, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_10l))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(text_10l, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_25l)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(check_regalar)
                            .addComponent(txt_total_aceite, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_total_aceite))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(check_factura))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_total_envases, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_total_envases))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_bote_flor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_bote_flor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_bote_extra, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_bote_extra)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_total)
                            .addComponent(check_pagado))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(label_observaciones)
                .addGap(18, 18, 18)
                .addComponent(text_observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btn_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
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
        
        //gestor.getClientes().get(pos).addVenta(venta);
        
        //System.out.println(gestor.getClientes().get(pos).getVentas().get(0).toString());
    }//GEN-LAST:event_btn_ventaActionPerformed

    private void check_regalarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_regalarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_regalarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_venta;
    private javax.swing.JCheckBox check_factura;
    private javax.swing.JCheckBox check_pagado;
    private javax.swing.JCheckBox check_regalar;
    private javax.swing.JLabel label_10l;
    private javax.swing.JLabel label_25l;
    private javax.swing.JLabel label_5l;
    private javax.swing.JLabel label_alberquina;
    private javax.swing.JLabel label_bote_extra;
    private javax.swing.JLabel label_bote_flor;
    private javax.swing.JLabel label_extra;
    private javax.swing.JLabel label_lampante;
    private javax.swing.JLabel label_litros1;
    private javax.swing.JLabel label_litros2;
    private javax.swing.JLabel label_litros3;
    private javax.swing.JLabel label_observaciones;
    private javax.swing.JLabel label_total;
    private javax.swing.JLabel label_total_aceite;
    private javax.swing.JLabel label_total_envases;
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
