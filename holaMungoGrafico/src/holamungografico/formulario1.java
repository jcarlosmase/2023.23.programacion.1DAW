/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package holamungografico;

import javax.swing.JOptionPane;

/**
 *
 * @author Juan C. Jiménez
 */
public class formulario1 extends javax.swing.JFrame {

    /**
     * Creates new form formulario1
     */
    public formulario1() {
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

        panel1 = new javax.swing.JDesktopPane();
        barraMenu = new javax.swing.JMenuBar();
        mPrincipal = new javax.swing.JMenu();
        opcSalir = new javax.swing.JMenuItem();
        mClientes = new javax.swing.JMenu();
        opcNewCli = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mModificarCli = new javax.swing.JMenu();
        opcCambiarCli = new javax.swing.JMenuItem();
        opcBorrarCli = new javax.swing.JMenuItem();
        mProveedores = new javax.swing.JMenu();
        mFacturacion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Holaaaaaa");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 959, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );

        mPrincipal.setText("Principal");

        opcSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK));
        opcSalir.setText("Salir");
        opcSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcSalirActionPerformed(evt);
            }
        });
        mPrincipal.add(opcSalir);

        barraMenu.add(mPrincipal);

        mClientes.setText("Clientes");
        mClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mClientesActionPerformed(evt);
            }
        });

        opcNewCli.setText("Añadir cliente");
        opcNewCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcNewCliActionPerformed(evt);
            }
        });
        mClientes.add(opcNewCli);
        mClientes.add(jSeparator1);

        mModificarCli.setText("Modificar cliente");

        opcCambiarCli.setText("Cambiar datos");
        opcCambiarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcCambiarCliActionPerformed(evt);
            }
        });
        mModificarCli.add(opcCambiarCli);

        opcBorrarCli.setText("Borrar clieente");
        mModificarCli.add(opcBorrarCli);

        mClientes.add(mModificarCli);

        barraMenu.add(mClientes);

        mProveedores.setText("Proveedores");
        barraMenu.add(mProveedores);

        mFacturacion.setText("Facturación");
        barraMenu.add(mFacturacion);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcSalirActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(this, "¿Estás seguro que quieres salir?")==JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_opcSalirActionPerformed

    private void opcNewCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcNewCliActionPerformed
        // TODO add your handling code here:

        prueba ventana = new prueba();
        panel1.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_opcNewCliActionPerformed

    private void mClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mClientesActionPerformed

    private void opcCambiarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcCambiarCliActionPerformed
        // TODO add your handling code here:
        formulario2 ventana = new formulario2();
        ventana.setVisible(true);
    }//GEN-LAST:event_opcCambiarCliActionPerformed

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
            java.util.logging.Logger.getLogger(formulario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formulario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formulario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formulario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formulario1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu mClientes;
    private javax.swing.JMenu mFacturacion;
    private javax.swing.JMenu mModificarCli;
    private javax.swing.JMenu mPrincipal;
    private javax.swing.JMenu mProveedores;
    private javax.swing.JMenuItem opcBorrarCli;
    private javax.swing.JMenuItem opcCambiarCli;
    private javax.swing.JMenuItem opcNewCli;
    private javax.swing.JMenuItem opcSalir;
    private javax.swing.JDesktopPane panel1;
    // End of variables declaration//GEN-END:variables
}