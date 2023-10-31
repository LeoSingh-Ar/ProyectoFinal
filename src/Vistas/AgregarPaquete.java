/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoDatos.AlojamientoData;
import AccesoDatos.CiudadData;
import AccesoDatos.PaqueteData;
import AccesoDatos.PasajeData;
import Entidades.Alojamiento;
import Entidades.Ciudad;
import Entidades.Paquete;
import Entidades.Pasaje;
import java.util.List;

/**
 *
 * @author Tomas
 */
public class AgregarPaquete extends javax.swing.JInternalFrame {

    /**
     * Creates new form AgregarPaquete
     */
    public AgregarPaquete() {
        initComponents();
        cargarCombo();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcCiudadOrigen = new javax.swing.JComboBox<>();
        jcCiudadDestino = new javax.swing.JComboBox<>();
        jcAlojamiento = new javax.swing.JComboBox<>();
        jcPasaje = new javax.swing.JComboBox<>();
        jbAgregar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        jLabel1.setText("Seleccione ciudad origen:");

        jLabel2.setText("Seleccione ciudad destino:");

        jLabel3.setText("Seleccione alojamiento:");

        jLabel4.setText("Seleccione pasaje:");

        jcCiudadOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCiudadOrigenActionPerformed(evt);
            }
        });

        jcCiudadDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCiudadDestinoActionPerformed(evt);
            }
        });

        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcCiudadOrigen, 0, 230, Short.MAX_VALUE)
                            .addComponent(jcCiudadDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcAlojamiento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcPasaje, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcCiudadOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcCiudadDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcPasaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregar)
                    .addComponent(jbSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcCiudadOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCiudadOrigenActionPerformed
        // TODO add your handling code here:
        jcPasaje.removeAllItems();
        Ciudad ciudad = (Ciudad)jcCiudadOrigen.getSelectedItem();
        PasajeData pd = new PasajeData();
        List<Pasaje> pasajes = pd.listarPasajes();
        for (Pasaje pasaje : pasajes) {
            if (pasaje.getCiudadOrigen().getIdCiudad() == ciudad.getIdCiudad()){
                jcPasaje.addItem(pasaje);
            }
        }
    }//GEN-LAST:event_jcCiudadOrigenActionPerformed

    private void jcCiudadDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCiudadDestinoActionPerformed
        // TODO add your handling code here:
        jcAlojamiento.removeAllItems();
        Ciudad ciudad = (Ciudad)jcCiudadDestino.getSelectedItem();
        AlojamientoData ad = new AlojamientoData();
        List<Alojamiento> alojamientos = ad.listarAlojamientos();
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento.getCiudadDestino().getIdCiudad() == ciudad.getIdCiudad()) {
                jcAlojamiento.addItem(alojamiento);
            }   
        }
    }//GEN-LAST:event_jcCiudadDestinoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        AgregarPaquete.this.setVisible(false);
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        // TODO add your handling code here:
        PaqueteData pd = new PaqueteData();
        Paquete paquete = new Paquete();
        Ciudad origen = (Ciudad)jcCiudadOrigen.getSelectedItem();
        Ciudad destino = (Ciudad)jcCiudadDestino.getSelectedItem();
        Alojamiento alojamiento = (Alojamiento)jcAlojamiento.getSelectedItem();
        Pasaje pasaje = (Pasaje)jcPasaje.getSelectedItem();
        paquete.setOrigen(origen);
        paquete.setDestino(destino);
        paquete.setPasaje(pasaje);
        paquete.setAlojamiento(alojamiento);
        pd.crearPaquete(paquete);
    }//GEN-LAST:event_jbAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alojamiento> jcAlojamiento;
    private javax.swing.JComboBox<Ciudad> jcCiudadDestino;
    private javax.swing.JComboBox<Ciudad> jcCiudadOrigen;
    private javax.swing.JComboBox<Pasaje> jcPasaje;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo() {
        CiudadData cd = new CiudadData();
        List<Ciudad> ciudades = cd.listarCiudades();
        for (Ciudad ciudad : ciudades) {
            jcCiudadOrigen.addItem(ciudad);
            jcCiudadDestino.addItem(ciudad);  
        } 
    }
}
