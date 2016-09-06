package almazarabarcha.vista;

import almazarabarcha.Modelo.Cliente;
import almazarabarcha.Modelo.GestorAlmazara;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class SeleccionarCliente extends VistaGestor{

    public SeleccionarCliente(GestorAlmazara gestor) {
        Cliente c;
        initComponents();
        this.filtro("");
        this.setBackground(estilos.getColorInterior());
    }
   

    private SeleccionarCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void filtro(String nombre_buscar){
        int i;        
        Object[] fila = new Object[4];
        DefaultTableModel modelo = (DefaultTableModel) tabla_filtro.getModel();
        ArrayList<Cliente> seleccionados = new ArrayList<>();
        
        
        int num_filas = modelo.getRowCount();
        for(i = 0; i < num_filas; i++)
                modelo.removeRow(0);
        
        if(nombre_buscar.isEmpty()){
            for(i = 0; i < gestor.getClientes().size();i++ )
            {
                    fila[0] = gestor.getClientes().get(i).getNombre_cliente();
                    fila[1] = gestor.getClientes().get(i).getDni();
                    fila[2] = gestor.getClientes().get(i).getDireccion();
                    fila[3] = gestor.getClientes().get(i).getTelefono();
                    modelo.addRow(fila);
            }
        }
        else{
            seleccionados = contenidoEn(nombre_buscar);
            
            for(i = 0; i < seleccionados.size();i++ )
            {
                fila[0] = seleccionados.get(i).getNombre_cliente();
                fila[1] = seleccionados.get(i).getDni();
                fila[2] = seleccionados.get(i).getDireccion();
                fila[3] = seleccionados.get(i).getTelefono();
                modelo.addRow(fila);
            }
        }
        
        
        
        tabla_filtro.setModel(modelo);
    }
    
    public ArrayList<Cliente> contenidoEn(String nombre_buscar){
        int i, j;
        String nombre;
        ArrayList<Cliente> seleccionados;
        seleccionados = new ArrayList<>();
        
        for(i = 0; i < gestor.getClientes().size(); i++){
            nombre = gestor.getClientes().get(i).getNombre_cliente();
            if(nombre.length() >= nombre_buscar.length())
                if(nombre.contains(nombre_buscar))
                    seleccionados.add(gestor.getClientes().get(i));
        }
        
        return seleccionados;
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
        textfield_buscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_filtro = new javax.swing.JTable();
        button_buscar = new javax.swing.JButton();
        javax.swing.JButton button_seleccionar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        javax.swing.JButton button_mostrar_operaciones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Buscar Cliente");

        tabla_filtro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "DNI", "Direccion", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_filtro);

        button_buscar.setText("Buscar");
        button_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_buscarActionPerformed(evt);
            }
        });

        button_seleccionar.setText("Seleccionar");
        button_seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_seleccionarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        button_mostrar_operaciones.setText("Mostrar Operaciones");
        button_mostrar_operaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_mostrar_operacionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_mostrar_operaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_seleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1066, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(textfield_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button_buscar))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textfield_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_modificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(button_seleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button_mostrar_operaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_buscarActionPerformed
        filtro(textfield_buscar.getText());
    }//GEN-LAST:event_button_buscarActionPerformed

    private void button_seleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_seleccionarActionPerformed
        int fila = tabla_filtro.getSelectedRow();
        String mostrar = "";
        if(fila > -1){
            mostrar += tabla_filtro.getValueAt(fila, 0) + "\n";
            mostrar += tabla_filtro.getValueAt(fila, 1) + "\n";
            mostrar += tabla_filtro.getValueAt(fila, 2) + "\n";
            mostrar += tabla_filtro.getValueAt(fila, 3) + "\n";
            mostrar += "............................" + "\n";
            JOptionPane.showMessageDialog(null,"Se ha seleccionado el cliente correctamente");
            
            GestorOperaciones g = new GestorOperaciones();
            g.getContentPane().setBackground(estilos.getColorInterior());
            g.setVisible(true);
            
            pos = gestor.buscarCliente((String) tabla_filtro.getValueAt(fila, 0));
            
        }else{
            JOptionPane.showMessageDialog(null,"No se ha seleccionado ningún elemento");
        }
        
        
        
    }//GEN-LAST:event_button_seleccionarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        new modificarCliente().setVisible(true);
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        
        if (JOptionPane.showConfirmDialog(new JFrame(), "¿Está seguro que desea eliminar el cliente seleccionado?","", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) 
        {
            int fila = tabla_filtro.getSelectedRow();
            boolean eliminado = false;
            eliminado = gestor.eliminarCliente((String) tabla_filtro.getValueAt(fila, 0));
        
            if(eliminado)
                JOptionPane.showMessageDialog(null,"Se ha eliminado correctamente");
        }
        
        filtro(textfield_buscar.getText());
    
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void button_mostrar_operacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_mostrar_operacionesActionPerformed
        int fila = tabla_filtro.getSelectedRow();
        String nombre_cliente;
        
        if (fila != -1)
        {
            nombre_cliente = (String) tabla_filtro.getValueAt(fila, 0); 
            MostrarOperaciones go = new MostrarOperaciones(nombre_cliente);
            go.setVisible(true);
      
        }
        else    
            JOptionPane.showMessageDialog(null,"No se ha seleccionado ningún elemento");
        
    }//GEN-LAST:event_button_mostrar_operacionesActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(SeleccionarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeleccionarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeleccionarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeleccionarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeleccionarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton button_buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_filtro;
    private javax.swing.JTextField textfield_buscar;
    // End of variables declaration//GEN-END:variables
}
