/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almazarabarcha.vista;

import javax.swing.JFrame;

/**
 *
 * @author jose
 */
public class GestionCambio extends JFrame {

    /**
     * Creates new form GestionMolturaciones
     */
    public GestionCambio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_no_pagados = new javax.swing.JTable();
        label_pagados = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_pagados = new javax.swing.JTable();
        label_no_pagados = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        label_titulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_titulo.setText("Gestión Cambio");

        tabla_no_pagados.setBackground(new java.awt.Color(255, 153, 153));
        tabla_no_pagados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Fecha", "ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_no_pagados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabla_no_pagados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_no_pagadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_no_pagados);

        label_pagados.setText("Pagados");

        tabla_pagados.setBackground(new java.awt.Color(102, 255, 102));
        tabla_pagados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Fecha", "ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_pagados.setToolTipText("");
        tabla_pagados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabla_pagados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_pagadosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_pagados);

        label_no_pagados.setText("No pagados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_pagados)
                            .addComponent(label_no_pagados))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(label_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_pagados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_no_pagados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabla_no_pagadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_no_pagadosMouseClicked
        System.out.println("Pagados fila -->" + tabla_no_pagados.getSelectedRow());
    }//GEN-LAST:event_tabla_no_pagadosMouseClicked

    private void tabla_pagadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_pagadosMouseClicked
        System.out.println("No pagados fila -->" + tabla_pagados.getSelectedRow());
    }//GEN-LAST:event_tabla_pagadosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_no_pagados;
    private javax.swing.JLabel label_pagados;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JTable tabla_no_pagados;
    private javax.swing.JTable tabla_pagados;
    // End of variables declaration//GEN-END:variables
}
