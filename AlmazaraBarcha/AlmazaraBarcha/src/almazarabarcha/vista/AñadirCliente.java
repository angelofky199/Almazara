package almazarabarcha.vista;

import almazarabarcha.Modelo.Validador;
import almazarabarcha.estilos.Estilos;
import capaDAO.DaoCliente;
import excepciones.BusinessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import pojos.Cliente;

public class AñadirCliente extends JFrame {

    private final Estilos estilos;

    public AñadirCliente() {
        estilos = new Estilos();
        initComponents();
        //this.setBackground(estilos.getColorInterior());
        label_direccion.setFont(estilos.getFuenteEtiquetas());
        label_dni.setFont(estilos.getFuenteEtiquetas());
        label_nombre.setFont(estilos.getFuenteEtiquetas());
        label_poblacion.setFont(estilos.getFuenteEtiquetas());
        label_telefono.setFont(estilos.getFuenteEtiquetas());
        label_titulo.setFont(estilos.getFuenteTitulo2());
        btn_añadirCliente.setFont(estilos.getFuenteBotones());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_titulo = new javax.swing.JLabel();
        label_nombre = new javax.swing.JLabel();
        label_dni = new javax.swing.JLabel();
        label_direccion = new javax.swing.JLabel();
        label_poblacion = new javax.swing.JLabel();
        label_telefono = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        btn_añadirCliente = new javax.swing.JButton();
        check_subencionado = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label_titulo.setText("Añadir Cliente");

        label_nombre.setText("Nombre");

        label_dni.setText("DNI");

        label_direccion.setText("Direccion");

        label_poblacion.setText("Poblacion");

        label_telefono.setText("Telefono");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        btn_añadirCliente.setText("Añadir Cliente");
        btn_añadirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_añadirClienteActionPerformed(evt);
            }
        });

        check_subencionado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        check_subencionado.setText("Subencionado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                    .addComponent(label_dni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(label_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label_poblacion, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
                                .addComponent(jTextField3))
                            .addComponent(check_subencionado))))
                .addContainerGap(98, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(330, 330, 330))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_añadirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(505, 505, 505))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_dni))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_poblacion)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_nombre))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_direccion))
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_telefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(check_subencionado)
                .addGap(17, 17, 17)
                .addComponent(btn_añadirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void btn_añadirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_añadirClienteActionPerformed
        Validador validador = new Validador();
        boolean ok_insercion = false;
        boolean ok_dni;
        boolean ok_telefono;

        Cliente c = new Cliente();
        c.setDni(validador.corregirNumeros(this.jTextField1.getText()));
        c.setNombre(this.jTextField2.getText());
        c.setDireccion(this.jTextField3.getText());
        c.setPoblacion(this.jTextField4.getText());
        c.setTelefono(validador.corregirNumeros(this.jTextField5.getText()));
        c.setSubvencionado(check_subencionado.isSelected());

        ok_dni = validador.validarNIF(c.getDni()) || c.getDni().isEmpty();
        ok_telefono = validador.validarTelefono(c.getTelefono()) || c.getTelefono().isEmpty();

        if (ok_dni && ok_telefono) {
            if (!c.getNombre().isEmpty()) {
                try {
                    ok_insercion = DaoCliente.insertar(c);
                } catch (BusinessException ex) {
                    Logger.getLogger(AñadirCliente.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (!ok_insercion)
                    JOptionPane.showMessageDialog(null, "Ya existe un cliente con ese nombre", "Error", JOptionPane.ERROR_MESSAGE);
                else
                    JOptionPane.showMessageDialog(null, "El cliente se ha añadido correctamente");
            } else 
                JOptionPane.showMessageDialog(null, "El campo nombre es obligatorio", "Campo nombre vacío", JOptionPane.ERROR_MESSAGE);
        } else {
            String mal_insertado = "Hay errores en: \n";

            if (!ok_dni) 
                mal_insertado += "DNI: 8 dígitos y 1 letra\n";
            
            if (!ok_telefono) 
                mal_insertado += "Teléfono: 9 dígitos";
            
            JOptionPane.showMessageDialog(null, mal_insertado, "Error en inserción", JOptionPane.ERROR_MESSAGE);
        }

        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
        jTextField4.setText(null);
        jTextField5.setText(null);
    }//GEN-LAST:event_btn_añadirClienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_añadirCliente;
    private javax.swing.JCheckBox check_subencionado;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel label_direccion;
    private javax.swing.JLabel label_dni;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_poblacion;
    private javax.swing.JLabel label_telefono;
    private javax.swing.JLabel label_titulo;
    // End of variables declaration//GEN-END:variables
}
