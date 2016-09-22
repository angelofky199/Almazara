/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almazarabarcha.vista;

import capaDAO.DaoMolturacion;
import excepciones.BusinessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojos.Molturacion;

/**
 *
 * @author Ventura
 */
public class FinalizarMolturacion extends javax.swing.JFrame {

    private Molturacion m;

    /**
     * Creates new form FinalizarMolturacion
     */
    public FinalizarMolturacion(Molturacion m) {
        initComponents();
        lb_kgOrujo.setVisible(false);
        lb_maquila.setVisible(false);
        lb_orujoTitulo.setVisible(false);
        lb_porcentaje.setVisible(false);
        lb_rendimiento.setVisible(false);
        lb_rendimientoTitulo.setVisible(false);
        lb_simKgMaquila.setVisible(false);
        lb_simKgOrujo.setVisible(false);
        lb_maquilaTitulo.setVisible(false);
        check_declara.setVisible(false);
        btnCancelar.setVisible(false);
        btnPagar.setVisible(false);
        this.m = m;
        lb_nomcliente.setText(m.getCliente().getNombre());
        lb_fecha.setText(m.getFecha().toString());
        lb_kgOliva.setText(String.valueOf(m.getKgOliva()));
        lb_costeMolturacion.setText(String.valueOf(m.getIngresoMolturacion()));
        lb_usuario.setText(m.getUsuario().getNombre());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lb_nomcliente = new javax.swing.JLabel();
        lb_fecha = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lb_kgOliva = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lb_costeMolturacion = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtfAceite = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lb_rendimientoTitulo = new javax.swing.JLabel();
        lb_rendimiento = new javax.swing.JLabel();
        lb_porcentaje = new javax.swing.JLabel();
        lb_orujoTitulo = new javax.swing.JLabel();
        lb_kgOrujo = new javax.swing.JLabel();
        lb_simKgOrujo = new javax.swing.JLabel();
        check_declara = new javax.swing.JCheckBox();
        lb_maquilaTitulo = new javax.swing.JLabel();
        lb_maquila = new javax.swing.JLabel();
        lb_simKgMaquila = new javax.swing.JLabel();
        btnPagar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lb_usuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Fecha: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Molturacion de ");

        lb_nomcliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_nomcliente.setText("jLabel3");

        lb_fecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_fecha.setText("jLabel3");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Kg de Oliva molturada:");

        lb_kgOliva.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_kgOliva.setText("jLabel4");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("COSTE TOTAL:");

        lb_costeMolturacion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lb_costeMolturacion.setText("jLabel6");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("€");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Litros de Aceite producido:");

        txtfAceite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfAceiteActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Kg");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Kg");

        lb_rendimientoTitulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_rendimientoTitulo.setText("Rendimiento:");

        lb_rendimiento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_rendimiento.setText("jLabel11");

        lb_porcentaje.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_porcentaje.setText("%");

        lb_orujoTitulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_orujoTitulo.setText("Kg de Orujo producido:");

        lb_kgOrujo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_kgOrujo.setText("jLabel13");

        lb_simKgOrujo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_simKgOrujo.setText("Kg");

        check_declara.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        check_declara.setText("El cliente declara");
        check_declara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_declaraActionPerformed(evt);
            }
        });

        lb_maquilaTitulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_maquilaTitulo.setText("Maquila:");

        lb_maquila.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_maquila.setText("jLabel15");

        lb_simKgMaquila.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_simKgMaquila.setText("Kg");

        btnPagar.setText("Pagar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Usuario:");

        lb_usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_usuario.setText("jLabel11");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(2, 2, 2)
                                                .addComponent(lb_nomcliente))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lb_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(106, 106, 106)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lb_usuario)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(check_declara)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(lb_maquilaTitulo)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lb_maquila)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lb_simKgMaquila))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lb_kgOliva, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel8))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(3, 3, 3))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtfAceite, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lb_orujoTitulo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lb_kgOrujo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lb_simKgOrujo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lb_rendimientoTitulo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lb_rendimiento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lb_porcentaje)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lb_costeMolturacion)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addComponent(btnPagar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lb_nomcliente)
                    .addComponent(jLabel3)
                    .addComponent(lb_kgOliva)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(lb_costeMolturacion)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(lb_usuario))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(lb_fecha)))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtfAceite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_rendimientoTitulo)
                    .addComponent(lb_rendimiento)
                    .addComponent(lb_porcentaje)
                    .addComponent(check_declara))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_orujoTitulo)
                    .addComponent(lb_kgOrujo)
                    .addComponent(lb_simKgOrujo)
                    .addComponent(lb_maquilaTitulo)
                    .addComponent(lb_maquila)
                    .addComponent(lb_simKgMaquila))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPagar)
                    .addComponent(btnCancelar))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfAceiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfAceiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfAceiteActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        m.setLitrosAceiteProd(Float.parseFloat(txtfAceite.getText()));
        m.CalcularRendimientoAceite();
        lb_rendimiento.setText(String.valueOf(m.getRendimiento()));
        lb_maquila.setText("0");
        m.CalcularOrujo();
        lb_kgOrujo.setText(String.valueOf(m.getKgOrujo()));
        lb_kgOrujo.setVisible(true);
        lb_maquila.setVisible(true);
        lb_orujoTitulo.setVisible(true);
        lb_porcentaje.setVisible(true);
        lb_rendimiento.setVisible(true);
        lb_rendimientoTitulo.setVisible(true);
        lb_simKgMaquila.setVisible(true);
        lb_simKgOrujo.setVisible(true);
        lb_maquilaTitulo.setVisible(true);
        check_declara.setVisible(true);
        btnCancelar.setVisible(true);
        btnPagar.setVisible(true);
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void check_declaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_declaraActionPerformed
        if (check_declara.isSelected()) {
            m.CalcularMaquila();
            lb_maquila.setText(String.valueOf(m.getMaquila()));
            m.setDeclara(true);
        } else {
            lb_maquila.setText("0");
            m.setMaquila(0);
            m.setDeclara(false);
        }
    }//GEN-LAST:event_check_declaraActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        try {
            m.setPagada(true);
            DaoMolturacion.update(m);
        } catch (BusinessException ex) {
            Logger.getLogger(FinalizarMolturacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPagarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnPagar;
    private javax.swing.JCheckBox check_declara;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lb_costeMolturacion;
    private javax.swing.JLabel lb_fecha;
    private javax.swing.JLabel lb_kgOliva;
    private javax.swing.JLabel lb_kgOrujo;
    private javax.swing.JLabel lb_maquila;
    private javax.swing.JLabel lb_maquilaTitulo;
    private javax.swing.JLabel lb_nomcliente;
    private javax.swing.JLabel lb_orujoTitulo;
    private javax.swing.JLabel lb_porcentaje;
    private javax.swing.JLabel lb_rendimiento;
    private javax.swing.JLabel lb_rendimientoTitulo;
    private javax.swing.JLabel lb_simKgMaquila;
    private javax.swing.JLabel lb_simKgOrujo;
    private javax.swing.JLabel lb_usuario;
    private javax.swing.JTextField txtfAceite;
    // End of variables declaration//GEN-END:variables
}
