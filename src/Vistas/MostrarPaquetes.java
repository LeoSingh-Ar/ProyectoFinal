/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoDatos.CiudadData;
import AccesoDatos.PaqueteData;
import Entidades.Ciudad;
import Entidades.Paquete;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tomas
 */
public class MostrarPaquetes extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo = new DefaultTableModel();
    /**
     * Creates new form MostrarPaquetes
     */
    public MostrarPaquetes() {
        initComponents();
        cargarCombo();
        armarCabecera();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbCiudadDestino = new javax.swing.JComboBox<>();
        cbCiudadOrigen = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPaquetesDisponibles = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();
        jbFiltrar = new javax.swing.JButton();
        jbMostrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(853, 642));

        cbCiudadDestino.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        cbCiudadOrigen.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jtPaquetesDisponibles.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtPaquetesDisponibles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtPaquetesDisponibles);

        jbSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbFiltrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbFiltrar.setText("Filtrar");
        jbFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFiltrarActionPerformed(evt);
            }
        });

        jbMostrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbMostrar.setText("Mostrar todos");
        jbMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Ciudad Origen:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Ciudad Destino:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 778, Short.MAX_VALUE)
                        .addComponent(jbSalir)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(cbCiudadOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jbFiltrar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cbCiudadDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(184, 184, 184))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbMostrar)
                        .addGap(166, 166, 166))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCiudadOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCiudadDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbMostrar)
                    .addComponent(jbFiltrar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jbSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFiltrarActionPerformed
        // TODO add your handling code here:
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        Ciudad cOrigen = (Ciudad)cbCiudadOrigen.getSelectedItem();
        Ciudad cDestino = (Ciudad) cbCiudadDestino.getSelectedItem();
        PaqueteData pd = new PaqueteData();
        List<Paquete> paquetes = pd.listarPaquetes();
        for (Paquete paquete : paquetes) {
            if (paquete.getOrigen().getIdCiudad() == cOrigen.getIdCiudad() && paquete.getDestino().getIdCiudad() == cDestino.getIdCiudad()) {
                modelo.addRow(new Object[] {paquete.getOrigen(), paquete.getDestino(), paquete.getAlojamiento(), paquete.getPasaje()});
            }
        }
    }//GEN-LAST:event_jbFiltrarActionPerformed

    private void jbMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarActionPerformed
        // TODO add your handling code here:
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        PaqueteData pd = new PaqueteData();
        List<Paquete> paquetes = pd.listarPaquetes();
        for (Paquete paquete : paquetes) {
                modelo.addRow(new Object[] {paquete.getOrigen(), paquete.getDestino(), paquete.getAlojamiento(), paquete.getPasaje()});  
        }
    }//GEN-LAST:event_jbMostrarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        MostrarPaquetes.this.setVisible(false);
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Ciudad> cbCiudadDestino;
    private javax.swing.JComboBox<Ciudad> cbCiudadOrigen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbFiltrar;
    private javax.swing.JButton jbMostrar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTable jtPaquetesDisponibles;
    // End of variables declaration//GEN-END:variables
    private void cargarCombo() {
        CiudadData cd = new CiudadData();
        List<Ciudad> ciudades = cd.listarCiudades();
        for (Ciudad ciudad : ciudades) {
            cbCiudadOrigen.addItem(ciudad);
            cbCiudadDestino.addItem(ciudad);
        }
    }
    
    private void armarCabecera() {
        modelo.addColumn("Ciudad Origen");
        modelo.addColumn("Ciudad Destino");
        modelo.addColumn("Alojamiento");
        modelo.addColumn("Pasaje");
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        jtPaquetesDisponibles.setModel(modelo);
    } 
}
