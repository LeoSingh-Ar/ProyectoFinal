/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author Leo_1
 */
public class MenuAdmin extends javax.swing.JInternalFrame {

    /**
     * Creates new form MenuAdmin
     */
    public MenuAdmin() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jModificarciudad = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
<<<<<<< Updated upstream
        jMenuItem6 = new javax.swing.JMenuItem();
=======
>>>>>>> Stashed changes
        jMenu2 = new javax.swing.JMenu();
        jMcrearusuario = new javax.swing.JMenuItem();
        jMmodificarusuario = new javax.swing.JMenuItem();

        setClosable(true);
        setResizable(true);
        setTitle("Panel Administrador");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 784, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 651, Short.MAX_VALUE)
        );

        jModificarciudad.setText("Menu");
        jModificarciudad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jModificarciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModificarciudadActionPerformed(evt);
            }
        });

        jMenuItem1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItem1.setText("Agregar Ciudad");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jModificarciudad.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItem2.setText("Formulario Alojamiento");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jModificarciudad.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItem3.setText("Formulario Pasaje");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jModificarciudad.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItem4.setText("Modificar Alojamiento");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jModificarciudad.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
<<<<<<< Updated upstream
        jMenuItem5.setText("Modificar Ciudad");
=======
        jMenuItem5.setText("Agregar Paquete");
>>>>>>> Stashed changes
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
<<<<<<< Updated upstream
        jModificarciudad.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItem6.setText("Modificar Pasaje");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jModificarciudad.add(jMenuItem6);

        jMenuBar1.add(jModificarciudad);
=======
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);
>>>>>>> Stashed changes

        jMenu2.setText("Usuario Admin");
        jMenu2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMcrearusuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMcrearusuario.setText("Crear Usuario");
        jMcrearusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMcrearusuarioActionPerformed(evt);
            }
        });
        jMenu2.add(jMcrearusuario);

        jMmodificarusuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMmodificarusuario.setText("Modificar Usuario");
        jMmodificarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmodificarusuarioActionPerformed(evt);
            }
        });
        jMenu2.add(jMmodificarusuario);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
        AgregarCiudad ac = new AgregarCiudad();
        
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        ac.setVisible(true);
        jDesktopPane1.add(ac);
        jDesktopPane1.revalidate();
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        
        AgregarAlojamiento aj = new AgregarAlojamiento();
        
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        aj.setVisible(true);
        jDesktopPane1.add(aj);
        jDesktopPane1.revalidate();
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jModificarciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModificarciudadActionPerformed
        // TODO add your handling code here:
        
   
    }//GEN-LAST:event_jModificarciudadActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        
        AgregarPasaje ap = new AgregarPasaje();
        
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        ap.setVisible(true);
        jDesktopPane1.add(ap);
        jDesktopPane1.revalidate();
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMcrearusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMcrearusuarioActionPerformed
        // TODO add your handling code here:
        
        CrearUsuario cu = new CrearUsuario();
        
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        cu.setVisible(true);
        jDesktopPane1.add(cu);
        jDesktopPane1.revalidate();
        
    }//GEN-LAST:event_jMcrearusuarioActionPerformed

    private void jMmodificarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmodificarusuarioActionPerformed
        // TODO add your handling code here:
        
        ModificarUsuario mu = new ModificarUsuario();
        
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        mu.setVisible(true);
        jDesktopPane1.add(mu);
        jDesktopPane1.revalidate();
        //nuevapruebamodificacion
        
    }//GEN-LAST:event_jMmodificarusuarioActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        
        ModificarAlojamiento ma = new ModificarAlojamiento();
        
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        ma.setVisible(true);
        jDesktopPane1.add(ma);
        jDesktopPane1.revalidate();
        
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
<<<<<<< Updated upstream
        
        
         ModificarCiudad mc = new ModificarCiudad();
        
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        mc.setVisible(true);
        jDesktopPane1.add(mc);
        jDesktopPane1.revalidate();
        
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        
        ModificarPasaje mp = new ModificarPasaje();
        
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        mp.setVisible(true);
        jDesktopPane1.add(mp);
        jDesktopPane1.revalidate();
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

=======
        AgregarPaquete ap = new AgregarPaquete();
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        ap.setVisible(true);
        jDesktopPane1.add(ap);
        jDesktopPane1.revalidate();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

>>>>>>> Stashed changes

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuItem jMcrearusuario;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
<<<<<<< Updated upstream
    private javax.swing.JMenuItem jMenuItem6;
=======
>>>>>>> Stashed changes
    private javax.swing.JMenuItem jMmodificarusuario;
    private javax.swing.JMenu jModificarciudad;
    // End of variables declaration//GEN-END:variables

    
}
