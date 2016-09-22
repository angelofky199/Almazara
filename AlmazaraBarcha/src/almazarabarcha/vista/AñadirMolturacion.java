package almazarabarcha.vista;

import capaDAO.DaoMolturacion;
import excepciones.BusinessException;
import java.sql.Date;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pojos.Cliente;
import pojos.Molturacion;
import pojos.Usuario;

public class AñadirMolturacion extends VistaGestor {

    private Cliente cliente;
    private Usuario u;

    public AñadirMolturacion(Cliente c, Usuario u) {
        initComponents();
        label_aceite_producido.setFont(estilos.getFuenteEtiquetas());
        label_kg_oliva.setFont(estilos.getFuenteEtiquetas());
        label_observaciones.setFont(estilos.getFuenteEtiquetas());
        label_total_ingresos.setFont(estilos.getFuenteEtiquetas());
        btn_molturacion.setFont(estilos.getFuenteBotones());
        this.cliente = c;
        this.u = u;

    }

    private AñadirMolturacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        label_aceite_producido = new javax.swing.JLabel();
        text_aceite_prod = new javax.swing.JTextField();
        check_pagado = new javax.swing.JCheckBox();
        btn_molturacion = new javax.swing.JButton();
        text_observaciones = new javax.swing.JTextField();
        label_observaciones = new javax.swing.JLabel();
        label_total_ingresos = new javax.swing.JLabel();
        text_total = new javax.swing.JTextField();
        check_declara = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label_kg_oliva.setText("KG Oliva");

        label_aceite_producido.setText("Aceite producido");

        check_pagado.setText("Pagado");

        btn_molturacion.setText("Añadir molturacion");
        btn_molturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_molturacionActionPerformed(evt);
            }
        });

        label_observaciones.setText("Observaciones");

        label_total_ingresos.setText("Total ingresos");

        text_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_totalActionPerformed(evt);
            }
        });

        check_declara.setText("Declara");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label_total_ingresos, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label_aceite_producido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(label_kg_oliva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text_total, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text_kg_oliva, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text_aceite_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(check_pagado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(check_declara, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(text_observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 907, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(470, 470, 470)
                        .addComponent(btn_molturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 209, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_kg_oliva)
                    .addComponent(text_kg_oliva, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_aceite_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_aceite_producido)
                    .addComponent(check_declara))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_total_ingresos)
                    .addComponent(text_total, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check_pagado))
                .addGap(68, 68, 68)
                .addComponent(label_observaciones)
                .addGap(18, 18, 18)
                .addComponent(text_observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btn_molturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_molturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_molturacionActionPerformed

        if (text_kg_oliva.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan campos por completar");

        } else {
            if (text_observaciones.getText().equals("")) {
                text_observaciones.setText("");
            }
            if (text_aceite_prod.getText().equals("")) {
                text_aceite_prod.setText("0");
            }

            Molturacion m = new Molturacion();

            float kilos = Float.parseFloat(text_kg_oliva.getText());
            m.setKgOliva(kilos);
            float aceite_producido = Float.parseFloat(text_aceite_prod.getText());
            m.setLitrosAceiteProd(aceite_producido);
            m.setPagada(check_pagado.isSelected());

            if (check_declara.isSelected()) {
                m.setDeclara(true);
                m.setKgReflejadosDeclaracion(kilos);
            } else {
                m.setDeclara(false);
                m.setKgReflejadosDeclaracion(0);
            }

            if (cliente.isSubvencionado()) {
                m.setMaquila(m.CalcularMaquila());
            } else {
                m.setMaquila(0);
            }
            m.setObservaciones(text_observaciones.getText());
            m.setFecha(Date.valueOf(LocalDate.now()));
            m.setCliente(cliente);
            m.setUsuario(u);

            
           
            float total = m.CalcularIngresoObtenidoMulturacion();
            text_total.setText(String.valueOf(total));
            
            try {
                DaoMolturacion.insertar(m);
            } catch (BusinessException ex) {
                Logger.getLogger(AñadirMolturacion.class.getName()).log(Level.SEVERE, null, ex);
            }

            JOptionPane.showMessageDialog(null, "Se ha añadido la molturacion correctamente al cliente: " + cliente.getNombre());

        }

    }//GEN-LAST:event_btn_molturacionActionPerformed

    private void text_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_totalActionPerformed

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
            java.util.logging.Logger.getLogger(AñadirMolturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AñadirMolturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AñadirMolturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AñadirMolturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new AñadirMolturacion().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_molturacion;
    private javax.swing.JCheckBox check_declara;
    private javax.swing.JCheckBox check_pagado;
    private javax.swing.JLabel label_aceite_producido;
    private javax.swing.JLabel label_kg_oliva;
    private javax.swing.JLabel label_observaciones;
    private javax.swing.JLabel label_total_ingresos;
    private javax.swing.JTextField text_aceite_prod;
    private javax.swing.JTextField text_kg_oliva;
    private javax.swing.JTextField text_observaciones;
    private javax.swing.JTextField text_total;
    // End of variables declaration//GEN-END:variables
}
