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
public class GUIGBodega extends javax.swing.JFrame {

    /**
     * Creates new form GUIGBodega
     */
    public GUIGBodega() {
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

        desktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        desconecta = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        listaprod = new javax.swing.JMenuItem();
        ingresoprod = new javax.swing.JMenuItem();
        salidaprod = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        listaper = new javax.swing.JMenuItem();
        registroper = new javax.swing.JMenuItem();
        actualizarper = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        IMG = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        ayuda = new javax.swing.JMenuItem();
        about = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Inicio");

        desconecta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        desconecta.setMnemonic('o');
        desconecta.setText("Desconectar");
        desconecta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desconectaActionPerformed(evt);
            }
        });
        fileMenu.add(desconecta);

        salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        salir.setMnemonic('x');
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        fileMenu.add(salir);

        jMenuBar1.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Bodega");

        listaprod.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        listaprod.setMnemonic('t');
        listaprod.setText("Lista de Productos");
        listaprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaprodActionPerformed(evt);
            }
        });
        editMenu.add(listaprod);

        ingresoprod.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        ingresoprod.setText("Ingreso de Producto");
        ingresoprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoprodActionPerformed(evt);
            }
        });
        editMenu.add(ingresoprod);

        salidaprod.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        salidaprod.setMnemonic('d');
        salidaprod.setText("Salida de Producto");
        salidaprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salidaprodActionPerformed(evt);
            }
        });
        editMenu.add(salidaprod);

        jMenuBar1.add(editMenu);

        jMenu2.setText("Personal");

        listaper.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        listaper.setMnemonic('y');
        listaper.setText("Lista de Personal");
        listaper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaperActionPerformed(evt);
            }
        });
        jMenu2.add(listaper);

        registroper.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        registroper.setMnemonic('p');
        registroper.setText("Registro de Personal");
        registroper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroperActionPerformed(evt);
            }
        });
        jMenu2.add(registroper);

        actualizarper.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        actualizarper.setMnemonic('y');
        actualizarper.setText("Actualizacion de Personal");
        actualizarper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarperActionPerformed(evt);
            }
        });
        jMenu2.add(actualizarper);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Registro");

        IMG.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        IMG.setMnemonic('y');
        IMG.setText("Informe Mensual General");
        IMG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMGActionPerformed(evt);
            }
        });
        jMenu4.add(IMG);

        jMenuBar1.add(jMenu4);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Ayuda");

        ayuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        ayuda.setMnemonic('c');
        ayuda.setText("Contenidos");
        ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaActionPerformed(evt);
            }
        });
        helpMenu.add(ayuda);

        about.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        about.setMnemonic('a');
        about.setText("Acerca de...");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        helpMenu.add(about);

        jMenuBar1.add(helpMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void desconectaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desconectaActionPerformed
        GUILogout ds = new GUILogout();
        
        this.desktopPane.add("GUILogout", ds);
        Dimension d1 = this.desktopPane.getSize();
        Dimension d2 = ds.getSize();
        
        
        Long xMiddle = Math.round((d1.getWidth() - d2.getWidth()) / 2);
        Long yMiddle = Math.round((d1.getHeight() - d2.getHeight()) / 2);
       
        
        ds.setBounds(Integer.parseInt(xMiddle.toString()), Integer.parseInt(yMiddle.toString()), ds.getWidth(), ds.getHeight());
        ds.setVisible(true);
    }//GEN-LAST:event_desconectaActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
   GUISalir ds = new GUISalir();
        
        this.desktopPane.add("GUISalir", ds);
        Dimension d1 = this.desktopPane.getSize();
        Dimension d2 = ds.getSize();
        
        
        Long xMiddle = Math.round((d1.getWidth() - d2.getWidth()) / 2);
        Long yMiddle = Math.round((d1.getHeight() - d2.getHeight()) / 2);
       
        
        ds.setBounds(Integer.parseInt(xMiddle.toString()), Integer.parseInt(yMiddle.toString()), ds.getWidth(), ds.getHeight());
        ds.setVisible(true);
    }//GEN-LAST:event_salirActionPerformed

    private void listaperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaperActionPerformed
    GUIListaPersonal ds = new GUIListaPersonal();
        
        this.desktopPane.add("GUIListaPersonal", ds);
        Dimension d1 = this.desktopPane.getSize();
        Dimension d2 = ds.getSize();
        
        
        Long xMiddle = Math.round((d1.getWidth() - d2.getWidth()) / 2);
        Long yMiddle = Math.round((d1.getHeight() - d2.getHeight()) / 2);
       
        
        ds.setBounds(Integer.parseInt(xMiddle.toString()), Integer.parseInt(yMiddle.toString()), ds.getWidth(), ds.getHeight());
        ds.setVisible(true);
    }//GEN-LAST:event_listaperActionPerformed

    private void actualizarperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarperActionPerformed
      GUIUpdatePersonal ds = new GUIUpdatePersonal();
        
        this.desktopPane.add("GUIUpdatePersonal", ds);
        Dimension d1 = this.desktopPane.getSize();
        Dimension d2 = ds.getSize();
        
        
        Long xMiddle = Math.round((d1.getWidth() - d2.getWidth()) / 2);
        Long yMiddle = Math.round((d1.getHeight() - d2.getHeight()) / 2);
       
        
        ds.setBounds(Integer.parseInt(xMiddle.toString()), Integer.parseInt(yMiddle.toString()), ds.getWidth(), ds.getHeight());
        ds.setVisible(true);
    }//GEN-LAST:event_actualizarperActionPerformed

    private void IMGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMGActionPerformed
      GUIInforme ds = new GUIInforme();
        
        this.desktopPane.add("GUIInforme", ds);
        Dimension d1 = this.desktopPane.getSize();
        Dimension d2 = ds.getSize();
        
        
        Long xMiddle = Math.round((d1.getWidth() - d2.getWidth()) / 2);
        Long yMiddle = Math.round((d1.getHeight() - d2.getHeight()) / 2);
       
        
        ds.setBounds(Integer.parseInt(xMiddle.toString()), Integer.parseInt(yMiddle.toString()), ds.getWidth(), ds.getHeight());
        ds.setVisible(true);
    }//GEN-LAST:event_IMGActionPerformed

    private void ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaActionPerformed
 GUIAyuda ds = new GUIAyuda();
        
        this.desktopPane.add("GUIAyuda", ds);
        Dimension d1 = this.desktopPane.getSize();
        Dimension d2 = ds.getSize();
        
        
        Long xMiddle = Math.round((d1.getWidth() - d2.getWidth()) / 2);
        Long yMiddle = Math.round((d1.getHeight() - d2.getHeight()) / 2);
       
        
        ds.setBounds(Integer.parseInt(xMiddle.toString()), Integer.parseInt(yMiddle.toString()), ds.getWidth(), ds.getHeight());
        ds.setVisible(true);        ds.setVisible(true);    }//GEN-LAST:event_ayudaActionPerformed

    private void listaprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaprodActionPerformed
 GUIInventario ds = new GUIInventario();
        
        this.desktopPane.add("GUIInventario", ds);
        Dimension d1 = this.desktopPane.getSize();
        Dimension d2 = ds.getSize();
        
        
        Long xMiddle = Math.round((d1.getWidth() - d2.getWidth()) / 2);
        Long yMiddle = Math.round((d1.getHeight() - d2.getHeight()) / 2);
       
        
        ds.setBounds(Integer.parseInt(xMiddle.toString()), Integer.parseInt(yMiddle.toString()), ds.getWidth(), ds.getHeight());
        ds.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_listaprodActionPerformed

    private void ingresoprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoprodActionPerformed
 GUIRegistrarProducto ds = new GUIRegistrarProducto();
        
        this.desktopPane.add("GUIRegistrarProducto", ds);
        Dimension d1 = this.desktopPane.getSize();
        Dimension d2 = ds.getSize();
        
        
        Long xMiddle = Math.round((d1.getWidth() - d2.getWidth()) / 2);
        Long yMiddle = Math.round((d1.getHeight() - d2.getHeight()) / 2);
       
        
        ds.setBounds(Integer.parseInt(xMiddle.toString()), Integer.parseInt(yMiddle.toString()), ds.getWidth(), ds.getHeight());
        ds.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_ingresoprodActionPerformed

    private void salidaprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salidaprodActionPerformed
 GUISalidaProducto ds = new GUISalidaProducto();
        
        this.desktopPane.add("GUISalidaProducto", ds);
        Dimension d1 = this.desktopPane.getSize();
        Dimension d2 = ds.getSize();
        
        
        Long xMiddle = Math.round((d1.getWidth() - d2.getWidth()) / 2);
        Long yMiddle = Math.round((d1.getHeight() - d2.getHeight()) / 2);
       
        
        ds.setBounds(Integer.parseInt(xMiddle.toString()), Integer.parseInt(yMiddle.toString()), ds.getWidth(), ds.getHeight());
        ds.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_salidaprodActionPerformed

    private void registroperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroperActionPerformed
 GUIRegistroPersonal ds = new GUIRegistroPersonal();
        
        this.desktopPane.add("GUIRegistroPersonal", ds);
        Dimension d1 = this.desktopPane.getSize();
        Dimension d2 = ds.getSize();
        
        
        Long xMiddle = Math.round((d1.getWidth() - d2.getWidth()) / 2);
        Long yMiddle = Math.round((d1.getHeight() - d2.getHeight()) / 2);
       
        
        ds.setBounds(Integer.parseInt(xMiddle.toString()), Integer.parseInt(yMiddle.toString()), ds.getWidth(), ds.getHeight());
        ds.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_registroperActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
 GUIAbout ds = new GUIAbout();
        
        this.desktopPane.add("GUIAbout", ds);
        Dimension d1 = this.desktopPane.getSize();
        Dimension d2 = ds.getSize();
        
        
        Long xMiddle = Math.round((d1.getWidth() - d2.getWidth()) / 2);
        Long yMiddle = Math.round((d1.getHeight() - d2.getHeight()) / 2);
       
        
        ds.setBounds(Integer.parseInt(xMiddle.toString()), Integer.parseInt(yMiddle.toString()), ds.getWidth(), ds.getHeight());
        ds.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_aboutActionPerformed

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
            java.util.logging.Logger.getLogger(GUIGBodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIGBodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIGBodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIGBodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIGBodega().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem IMG;
    private javax.swing.JMenuItem about;
    private javax.swing.JMenuItem actualizarper;
    private javax.swing.JMenuItem ayuda;
    private javax.swing.JMenuItem desconecta;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem ingresoprod;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem listaper;
    private javax.swing.JMenuItem listaprod;
    private javax.swing.JMenuItem registroper;
    private javax.swing.JMenuItem salidaprod;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables

}