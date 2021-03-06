/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import views.altas.AltaAsignacion;
import views.altas.AltaDepartamento;
import views.altas.AltaJefeDepartamento;
import views.altas.AltaProyecto;
import views.altas.AltaTrabajador;
import views.busqueda.BusquedaDepartamento;

/**
 *
 * @author jared.hernandez
 */
public class MainActivity extends javax.swing.JFrame {

    /**
     * Creates new form MainActivity
     */
    public MainActivity() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        bajas = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        actiualizacion = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        consultas = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 51, 0));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Aplicación Building Projects");

        jPanel2.setBackground(new java.awt.Color(153, 51, 0));

        jPanel3.setBackground(new java.awt.Color(204, 0, 204));
        jPanel3.setForeground(new java.awt.Color(255, 0, 204));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Departamentos", "Trabajadores", "Jefes de departamento", "Proyectos", "Asignaciones" }));
        jComboBox1.setSelectedIndex(-1);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Altas");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bajas");

        jPanel5.setBackground(new java.awt.Color(204, 0, 204));
        jPanel5.setForeground(new java.awt.Color(255, 0, 204));

        bajas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Departamentos", "Trabajadores", "Jefes de departamento", "Proyectos", "Asignaciones" }));
        bajas.setSelectedIndex(-1);
        bajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(bajas, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bajas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(204, 0, 204));
        jPanel7.setForeground(new java.awt.Color(255, 0, 204));

        actiualizacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Departamentos", "Trabajadores", "Jefes de departamento", "Proyectos", "Asignaciones" }));
        actiualizacion.setSelectedIndex(-1);
        actiualizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actiualizacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(actiualizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(actiualizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Actualizacion");

        jPanel9.setBackground(new java.awt.Color(204, 0, 204));
        jPanel9.setForeground(new java.awt.Color(255, 0, 204));

        consultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Departamentos", "Trabajadores", "Jefes de departamento", "Proyectos", "Asignaciones" }));
        consultas.setSelectedIndex(-1);
        consultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(consultas, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(consultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Consultas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel2)
                .addGap(185, 185, 185)
                .addComponent(jLabel3)
                .addGap(140, 140, 140)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(125, 125, 125))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(337, 337, 337)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
         int seleccion = this.jComboBox1.getSelectedIndex();
         this.setVisible(false);
         
         switch (seleccion) {
             case 0:
                 AltaDepartamento altaDepartamento = new AltaDepartamento();
                 altaDepartamento.setVisible(true);
                 dispose();
                 break;
             case 1:
                 AltaTrabajador altaTrabajador = new AltaTrabajador();
                 altaTrabajador.setVisible(true);
                 dispose();
                 break;
             case 2:
                 AltaJefeDepartamento altaJefe = new AltaJefeDepartamento();
                 altaJefe.setVisible(true);
                 dispose();
                 break;
             case 3:
                 AltaProyecto altaProyecto = new AltaProyecto();
                 altaProyecto.setVisible(true);
                 dispose();
                 break;
             case 4:
                 AltaAsignacion altaAsignacion = new AltaAsignacion();
                 altaAsignacion.setVisible(true);
                 dispose();
                 break;
         }
         
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void bajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajasActionPerformed
        // TODO add your handling code here:
        int seleccion = this.bajas.getSelectedIndex();
        BusquedaDepartamento busqueda;
         switch (seleccion) {
             case 0:
                 busqueda = new BusquedaDepartamento("baja", "departamento");
                 this.setVisible(false);
                 busqueda.setVisible(true);
                 dispose();
                 break;
             case 1:
                 busqueda = new BusquedaDepartamento("baja", "trabajadores");
                 this.setVisible(false);
                 busqueda.setVisible(true);
                 dispose();
                 break;
             case 2:
                 busqueda = new BusquedaDepartamento("baja", "jefes");
                 this.setVisible(false);
                 busqueda.setVisible(true);
                 dispose();
                 break;
             case 3:
                 busqueda = new BusquedaDepartamento("baja","proyectos");
                 busqueda.setVisible(true);
                 dispose();
                 break;
             case 4:
                 busqueda = new BusquedaDepartamento("baja","asignaciones");
                 busqueda.setVisible(true);
                 dispose();
                 break;
         }
    }//GEN-LAST:event_bajasActionPerformed

    private void actiualizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actiualizacionActionPerformed
        // TODO add your handling code here:
         int seleccion = this.actiualizacion.getSelectedIndex();
        

         switch (seleccion) {
             case 0:
                 BusquedaDepartamento busqueda = new BusquedaDepartamento("actualizacion", "departamento");
                 this.setVisible(false);
                 busqueda.setVisible(true);
                 dispose();
                 break;
              case 1:
                 BusquedaDepartamento busquedaT = new BusquedaDepartamento("actualizacion", "trabajadores");
                 busquedaT.setVisible(true);
                 dispose();
                 break;
              case 2:
                 BusquedaDepartamento busquedaA = new BusquedaDepartamento("actualizacion", "jefes");
                 busquedaA.setVisible(true);
                 dispose();
                 break;
              case 3:
                 BusquedaDepartamento busquedaP = new BusquedaDepartamento("actualizacion", "proyectos");
                 busquedaP.setVisible(true);
                 dispose();
                 break;
              case 4:
                 BusquedaDepartamento busquedaAs = new BusquedaDepartamento("actualizacion", "asignaciones");
                 busquedaAs.setVisible(true);
                 dispose();
                 break;
         }
    }//GEN-LAST:event_actiualizacionActionPerformed

    private void consultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultasActionPerformed
        // TODO add your handling code here:
         int seleccion = this.consultas.getSelectedIndex();
        

         switch (seleccion) {
             case 0:
                 BusquedaDepartamento busqueda = new BusquedaDepartamento("consulta", "departamento");
                 this.setVisible(false);
                 busqueda.setVisible(true);
                 dispose();
                 break;
            case 1:
                 BusquedaDepartamento busquedaT = new BusquedaDepartamento("consulta", "trabajadores");
                 busquedaT.setVisible(true);
                 dispose();
                 break;
             case 2:
                 BusquedaDepartamento busquedaJ = new BusquedaDepartamento("consulta", "jefes");
                 busquedaJ.setVisible(true);
                 dispose();
                 break;
             case 3:
                 BusquedaDepartamento busquedaP = new BusquedaDepartamento("consulta", "proyectos");
                 busquedaP.setVisible(true);
                 dispose();
                 break;
             case 4:
                 BusquedaDepartamento busquedaAs = new BusquedaDepartamento("consulta", "asignaciones");
                 busquedaAs.setVisible(true);
                 dispose();
                 break;
         }
    }//GEN-LAST:event_consultasActionPerformed

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
            java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainActivity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> actiualizacion;
    private javax.swing.JComboBox<String> bajas;
    private javax.swing.JComboBox<String> consultas;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
