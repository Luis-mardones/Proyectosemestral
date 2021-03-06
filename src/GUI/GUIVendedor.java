/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;

/**
 *
 * @author Familia
 */
public class GUIVendedor extends javax.swing.JFrame {

    /**
     * Creates new form GUIVendedor
     */
    public GUIVendedor() {
        initComponents();
        setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setTitle("Tools&Stuff: Adminstrador de Bodega V0.01");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        Desconectar = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        Inventario = new javax.swing.JMenuItem();
        Venta = new javax.swing.JMenuItem();
        Devolucion = new javax.swing.JMenuItem();
        Caja = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        IM = new javax.swing.JMenuItem();
        HV = new javax.swing.JMenuItem();
        fileMenu1 = new javax.swing.JMenu();
        Ayuda = new javax.swing.JMenuItem();
        About = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Inicio");

        Desconectar.setMnemonic('a');
        Desconectar.setText("Desconectar");
        Desconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesconectarActionPerformed(evt);
            }
        });
        fileMenu.add(Desconectar);

        Salir.setMnemonic('x');
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        fileMenu.add(Salir);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Tienda");

        Inventario.setMnemonic('y');
        Inventario.setText("Inventario de Tienda");
        Inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InventarioActionPerformed(evt);
            }
        });
        editMenu.add(Inventario);

        Venta.setMnemonic('p');
        Venta.setText("Venta de Productos");
        Venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentaActionPerformed(evt);
            }
        });
        editMenu.add(Venta);

        Devolucion.setMnemonic('d');
        Devolucion.setText("Devolucion de Productos");
        Devolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DevolucionActionPerformed(evt);
            }
        });
        editMenu.add(Devolucion);

        Caja.setMnemonic('d');
        Caja.setText("Realizar Caja");
        Caja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaActionPerformed(evt);
            }
        });
        editMenu.add(Caja);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Registro");

        IM.setMnemonic('c');
        IM.setText("Informe Mensual");
        IM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMActionPerformed(evt);
            }
        });
        helpMenu.add(IM);

        HV.setMnemonic('a');
        HV.setText("Historial de Venta");
        HV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HVActionPerformed(evt);
            }
        });
        helpMenu.add(HV);

        menuBar.add(helpMenu);

        fileMenu1.setMnemonic('f');
        fileMenu1.setText("Ayuda");

        Ayuda.setMnemonic('x');
        Ayuda.setText("Contenidos");
        Ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AyudaActionPerformed(evt);
            }
        });
        fileMenu1.add(Ayuda);

        About.setMnemonic('x');
        About.setText("Acerca de...");
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });
        fileMenu1.add(About);

        menuBar.add(fileMenu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        GUISalir ds = new GUISalir();

        this.desktopPane.add("GUISalir", ds);
        Dimension d1 = this.desktopPane.getSize();
        Dimension d2 = ds.getSize();

        Long xMiddle = Math.round((d1.getWidth() - d2.getWidth()) / 2);
        Long yMiddle = Math.round((d1.getHeight() - d2.getHeight()) / 2);

        ds.setBounds(Integer.parseInt(xMiddle.toString()), Integer.parseInt(yMiddle.toString()), ds.getWidth(), ds.getHeight());
        ds.setVisible(true);
    }//GEN-LAST:event_SalirActionPerformed

    private void AyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AyudaActionPerformed
        GUIAyuda ds = new GUIAyuda();

        this.desktopPane.add("GUIAyuda", ds);
        Dimension d1 = this.desktopPane.getSize();
        Dimension d2 = ds.getSize();

        Long xMiddle = Math.round((d1.getWidth() - d2.getWidth()) / 2);
        Long yMiddle = Math.round((d1.getHeight() - d2.getHeight()) / 2);

        ds.setBounds(Integer.parseInt(xMiddle.toString()), Integer.parseInt(yMiddle.toString()), ds.getWidth(), ds.getHeight());
        ds.setVisible(true);
    }//GEN-LAST:event_AyudaActionPerformed

    private void AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutActionPerformed
        GUIAbout ds = new GUIAbout();

        this.desktopPane.add("GUIAbout", ds);
        Dimension d1 = this.desktopPane.getSize();
        Dimension d2 = ds.getSize();

        Long xMiddle = Math.round((d1.getWidth() - d2.getWidth()) / 2);
        Long yMiddle = Math.round((d1.getHeight() - d2.getHeight()) / 2);

        ds.setBounds(Integer.parseInt(xMiddle.toString()), Integer.parseInt(yMiddle.toString()), ds.getWidth(), ds.getHeight());
        ds.setVisible(true);
    }//GEN-LAST:event_AboutActionPerformed

    private void DesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesconectarActionPerformed
        GUILogout ds = new GUILogout();

        this.desktopPane.add("GUILogout", ds);
        Dimension d1 = this.desktopPane.getSize();
        Dimension d2 = ds.getSize();

        Long xMiddle = Math.round((d1.getWidth() - d2.getWidth()) / 2);
        Long yMiddle = Math.round((d1.getHeight() - d2.getHeight()) / 2);

        ds.setBounds(Integer.parseInt(xMiddle.toString()), Integer.parseInt(yMiddle.toString()), ds.getWidth(), ds.getHeight());
        ds.setVisible(true);
    }//GEN-LAST:event_DesconectarActionPerformed

    private void CajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaActionPerformed
        GUICaja ds = new GUICaja();

        this.desktopPane.add("GUICaja", ds);
        Dimension d1 = this.desktopPane.getSize();
        Dimension d2 = ds.getSize();

        Long xMiddle = Math.round((d1.getWidth() - d2.getWidth()) / 2);
        Long yMiddle = Math.round((d1.getHeight() - d2.getHeight()) / 2);

        ds.setBounds(Integer.parseInt(xMiddle.toString()), Integer.parseInt(yMiddle.toString()), ds.getWidth(), ds.getHeight());
        ds.setVisible(true);
    }//GEN-LAST:event_CajaActionPerformed

    private void InventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InventarioActionPerformed
        GUIInventario ds = new GUIInventario();

        this.desktopPane.add("GUIInventario", ds);
        Dimension d1 = this.desktopPane.getSize();
        Dimension d2 = ds.getSize();

        Long xMiddle = Math.round((d1.getWidth() - d2.getWidth()) / 2);
        Long yMiddle = Math.round((d1.getHeight() - d2.getHeight()) / 2);

        ds.setBounds(Integer.parseInt(xMiddle.toString()), Integer.parseInt(yMiddle.toString()), ds.getWidth(), ds.getHeight());
        ds.setVisible(true);
    }//GEN-LAST:event_InventarioActionPerformed

    private void VentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentaActionPerformed
        GUIVenta ds = new GUIVenta();

        this.desktopPane.add("GUIVenta", ds);
        Dimension d1 = this.desktopPane.getSize();
        Dimension d2 = ds.getSize();

        Long xMiddle = Math.round((d1.getWidth() - d2.getWidth()) / 2);
        Long yMiddle = Math.round((d1.getHeight() - d2.getHeight()) / 2);

        ds.setBounds(Integer.parseInt(xMiddle.toString()), Integer.parseInt(yMiddle.toString()), ds.getWidth(), ds.getHeight());
        ds.setVisible(true);
    }//GEN-LAST:event_VentaActionPerformed

    private void DevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DevolucionActionPerformed
        GUIDevolucion ds = new GUIDevolucion();

        this.desktopPane.add("GUIDevolucion", ds);
        Dimension d1 = this.desktopPane.getSize();
        Dimension d2 = ds.getSize();

        Long xMiddle = Math.round((d1.getWidth() - d2.getWidth()) / 2);
        Long yMiddle = Math.round((d1.getHeight() - d2.getHeight()) / 2);

        ds.setBounds(Integer.parseInt(xMiddle.toString()), Integer.parseInt(yMiddle.toString()), ds.getWidth(), ds.getHeight());
        ds.setVisible(true);
    }//GEN-LAST:event_DevolucionActionPerformed

    private void IMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMActionPerformed
        GUIInforme ds = new GUIInforme();

        this.desktopPane.add("GUIInforme", ds);
        Dimension d1 = this.desktopPane.getSize();
        Dimension d2 = ds.getSize();

        Long xMiddle = Math.round((d1.getWidth() - d2.getWidth()) / 2);
        Long yMiddle = Math.round((d1.getHeight() - d2.getHeight()) / 2);

        ds.setBounds(Integer.parseInt(xMiddle.toString()), Integer.parseInt(yMiddle.toString()), ds.getWidth(), ds.getHeight());
        ds.setVisible(true);
    }//GEN-LAST:event_IMActionPerformed

    private void HVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HVActionPerformed
        GUIHistorialCaja ds = new GUIHistorialCaja();

        this.desktopPane.add("GUIHistorialCaja", ds);
        Dimension d1 = this.desktopPane.getSize();
        Dimension d2 = ds.getSize();

        Long xMiddle = Math.round((d1.getWidth() - d2.getWidth()) / 2);
        Long yMiddle = Math.round((d1.getHeight() - d2.getHeight()) / 2);

        ds.setBounds(Integer.parseInt(xMiddle.toString()), Integer.parseInt(yMiddle.toString()), ds.getWidth(), ds.getHeight());
        ds.setVisible(true);
    }//GEN-LAST:event_HVActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIVendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem About;
    private javax.swing.JMenuItem Ayuda;
    private javax.swing.JMenuItem Caja;
    private javax.swing.JMenuItem Desconectar;
    private javax.swing.JMenuItem Devolucion;
    private javax.swing.JMenuItem HV;
    private javax.swing.JMenuItem IM;
    private javax.swing.JMenuItem Inventario;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JMenuItem Venta;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu fileMenu1;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
