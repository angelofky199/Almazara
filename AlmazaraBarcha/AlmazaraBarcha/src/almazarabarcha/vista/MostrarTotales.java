package almazarabarcha.vista;

import almazarabarcha.estilos.Estilos;
import javax.swing.JFrame;

public class MostrarTotales extends JFrame {
    private final Estilos estilos = new Estilos();
    
    public MostrarTotales() {
        initComponents();
        label_total_cambio.setFont(estilos.getFuenteEtiquetas());
        label_total_compra.setFont(estilos.getFuenteEtiquetas());
        label_total_molturacion.setFont(estilos.getFuenteEtiquetas());
        label_total_ventas.setFont(estilos.getFuenteEtiquetas());
    }
    
    public void setTotalCambios(){
    
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        label_total_molturacion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        label_total_cambio = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        label_total_compra = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        label_total_ventas = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Kg Oliva Moturados", null, null, null},
                {"Plantones Molturados", null, null, null},
                {"Aceite Prucido(Litros)", null, null, null}
            },
            new String [] {
                "", "Clientes", "Almazara ", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        label_total_molturacion.setText("Total Molturacion");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Maquila", null},
                {"KG Molturacion", null},
                {"Orujo", null}
            },
            new String [] {
                "", "Para declarar"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Ingresos Molturacion", null, null, null}
            },
            new String [] {
                "", "Ficticio", "Real", "Diferencia"
            }
        ));
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(1).setHeaderValue("Ficticio");
            jTable3.getColumnModel().getColumn(2).setHeaderValue("Real");
            jTable3.getColumnModel().getColumn(3).setHeaderValue("Diferencia");
        }

        label_total_cambio.setText("Total Cambio");

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Total € Real", null},
                {"Aceite real retirado", null},
                {"Ingreso de olivas", null},
                {"Maquila reflejada", null},
                {"Deuda clientes", null}
            },
            new String [] {
                "", ""
            }
        ));
        jScrollPane5.setViewportView(jTable5);

        label_total_compra.setText("Total Compra ");

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"TOTAL KG OLIVAS LIMPIA", null},
                {"SUBTOTAL € A PAGAR", null},
                {"TOTAL € PAGADOS", null}
            },
            new String [] {
                "", ""
            }
        ));
        jScrollPane6.setViewportView(jTable6);

        label_total_ventas.setText("Total Ventas");

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"TOTAL € VENTAS DE ACEITE Y ENVASES", null},
                {"TOTAL € VENTAS SIN IVA", null},
                {"VENTA TOTAL LITROS FLOR", null},
                {"VENTA TOTAL LITROS EXTRA", null},
                {"VENTA TOTAL LITROS ARBEQUINA", null},
                {"VENTA TOTAL DE LAMPANTE KG", null}
            },
            new String [] {
                "", ""
            }
        ));
        jScrollPane7.setViewportView(jTable7);

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Rendimiento medio", null}
            },
            new String [] {
                "", ""
            }
        ));
        jScrollPane8.setViewportView(jTable8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_total_cambio, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_total_molturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_total_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_total_ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_total_molturacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(label_total_cambio)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(label_total_compra)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_total_ventas)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JLabel label_total_cambio;
    private javax.swing.JLabel label_total_compra;
    private javax.swing.JLabel label_total_molturacion;
    private javax.swing.JLabel label_total_ventas;
    // End of variables declaration//GEN-END:variables
}
