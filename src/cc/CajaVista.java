/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc;

import com.mysql.jdbc.Connection;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jose
 */
public class CajaVista extends javax.swing.JFrame {

ZoneId zona = ZoneId.systemDefault();
private JTextField c1;
Conexion conn;

    /**
     * Creates new form CajaVista
     */
    public CajaVista() {
        initComponents();
        new Thread(new reloj()).start();
        this.setExtendedState(MAXIMIZED_BOTH); 
        //lblCajero.setText(u);
        //lblCaja.setText(p);    
        
    }
    
//-----------------------------------------------------------------------------
    public class reloj implements Runnable {
        
        @Override
        public void run() {
            new Timer(0, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    Date d = new Date();
                    DateFormat s = new SimpleDateFormat("HH:mm:ss" +" - "+ "dd/MM/yyyy");
                    lblhora.setText(s.format(d));
                }
            }).start();
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
//-----------------------------------------------------------------------------
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblhora = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        Mcajon = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        Msalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Caja:");

        jLabel3.setText("Cajero(a):");

        jButton1.setText("jButton1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");

        jLabel5.setText("ABARROTES AZTECA SUPER CEDIS S.A DE C.V");

        jMenu1.setText("Opciones");

        jMenuItem2.setText("Correcion Parcial");
        jMenu1.add(jMenuItem2);

        jMenuItem11.setText("Modo Cancelar");
        jMenu1.add(jMenuItem11);

        jMenuItem1.setText("Cancelación Total");
        jMenu1.add(jMenuItem1);

        Mcajon.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.SHIFT_MASK));
        Mcajon.setText("Abrir Cajon");
        Mcajon.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                McajonMenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        Mcajon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                McajonActionPerformed(evt);
            }
        });
        jMenu1.add(Mcajon);

        jMenuItem12.setText("Devolucion a ticket");
        jMenu1.add(jMenuItem12);

        jMenu5.setText("Retiros e Ingresos");

        jMenuItem13.setText("Retiros de caja");
        jMenu5.add(jMenuItem13);

        jMenuItem14.setText("Ingresos, otros");
        jMenu5.add(jMenuItem14);

        jMenuItem15.setText("Cancelar retiros");
        jMenu5.add(jMenuItem15);

        jMenuItem16.setText("Cancelar ingresos");
        jMenu5.add(jMenuItem16);

        jMenu1.add(jMenu5);

        jMenu3.setText("Reportes y Otros");

        jMenuItem5.setText("Tira de Ingresos por dia");
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Contenido de caja");
        jMenu3.add(jMenuItem6);

        jMenuItem7.setText("Corte x por caja y fecha");
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Corte de caja");
        jMenu3.add(jMenuItem8);

        jMenu1.add(jMenu3);

        jMenuItem17.setText("Digitar Precios");
        jMenu1.add(jMenuItem17);

        jMenu4.setText("Otros");

        jMenuItem9.setText("Reeimprimir Folio");
        jMenu4.add(jMenuItem9);

        jMenuItem10.setText("Reimprimir ticket");
        jMenu4.add(jMenuItem10);

        jMenu1.add(jMenu4);

        Msalir.setText("Salir");
        Msalir.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                MsalirMenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        Msalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MsalirActionPerformed(evt);
            }
        });
        jMenu1.add(Msalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblhora, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblhora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(406, 406, 406)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       
       
    }//GEN-LAST:event_jButton1MouseClicked

    private void MsalirMenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_MsalirMenuKeyPressed

    }//GEN-LAST:event_MsalirMenuKeyPressed

    private void McajonMenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_McajonMenuKeyPressed
        
    }//GEN-LAST:event_McajonMenuKeyPressed

    private void McajonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_McajonActionPerformed
        JOptionPane.showMessageDialog(this, "Cajon abierto");
    }//GEN-LAST:event_McajonActionPerformed

    private void MsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MsalirActionPerformed
       Login l = new Login();
       l.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_MsalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
       Buscar b = new Buscar();
       b.setVisible(true);
       this.dispose();
       
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
//-----------------------------------------------------------------------------
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
            java.util.logging.Logger.getLogger(CajaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CajaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CajaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CajaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CajaVista().setVisible(true);
//            }
//        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Mcajon;
    private javax.swing.JMenuItem Msalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JLabel lblhora;
    // End of variables declaration//GEN-END:variables
}
//------------------------------------------------------------------------------
//tabla pendiente por si se ocupa

//DefaultTableModel modelo = (DefaultTableModel) tblVender.getModel();
//        int fil = tblVender.getSelectedRow();
//        int col = tblVender.getSelectedColumn();
//        //JOptionPane.showMessageDialog(tblVender.getValueAt(tblVender.getSelectedRow(), 0).toString());
//        //JOptionPane.showMessageDialog(this, "Numero de la fila " + fil);
//        //JOptionPane.showMessageDialog(this, "Numero de la columna " + col);
//        if (col == 2) {
//            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//                Buscar b = new Buscar();
//                b.setVisible(true);
//            } else {
//                //JOptionPane.showMessageDialog(this, "ocurrito un problema");
//            }
//        } else {
//
//        }