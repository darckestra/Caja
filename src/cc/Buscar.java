/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Jose
 */
public class Buscar extends javax.swing.JFrame {
Conexion c= new Conexion();
Connection conn = c.getConnection();
Statement sent;
DefaultTableModel dm;

private TableRowSorter trsfiltro;
    
    /**
     * Creates new form Buscar
     */
    public Buscar() {
        initComponents();
        llenar();
        this.setExtendedState(MAXIMIZED_BOTH); 
    }
    
    public static String codigo = "";
    
 public void filtro() {
     //se instancia el filtro
        trsfiltro.setRowFilter(RowFilter.regexFilter(txtBuscar.getText(), 0,1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBuscar = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtdos = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setText("Buscar:");

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        tblBuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBuscarMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblBuscar);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("opc");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        jMenuItem1.setText("Precios");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtdos, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jButton1)
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(txtdos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//se regresa a la vista de la caja
    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.dispose();  
        }
        else{
            //JOptionPane.showMessageDialog(this, "ocurrito un problema");
        }
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
       
    }//GEN-LAST:event_txtBuscarActionPerformed
//se pone en uso el filtro
    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        //se pone en uso el filtro
        char c = evt.getKeyChar();
        String cad = ("" + c).toUpperCase();
        c = cad.charAt(0);
        evt.setKeyChar(c);
        
        txtBuscar.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtBuscar.getText());
                txtBuscar.setText(cadena);
                repaint();
                filtro();
            }
        });
        trsfiltro = new TableRowSorter(tblBuscar.getModel());
        tblBuscar.setRowSorter(trsfiltro);
        llenar();


    }//GEN-LAST:event_txtBuscarKeyTyped

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
     
    }//GEN-LAST:event_txtBuscarKeyReleased
//se mandan los datos a los txt para poder hacer el update a la base de datos (temporal)
    private void tblBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBuscarMouseClicked
       int col = tblBuscar.getSelectedRow();        
        //txtProveedor.setText(tblProveedor.getModel().getValueAt(col, 0).toString());
        txtBuscar.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 3).toString());
        txtdos.setText(tblBuscar.getValueAt(tblBuscar.getSelectedRow(), 0).toString());
        
    }//GEN-LAST:event_tblBuscarMouseClicked
//se hace el update (actualizar) a la base de datos (temporal)
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String cantidad,donde="",total="";
        double pp,ppp;
//        char c = 0;
        cantidad=txtBuscar.getText();        
        //for (int n = 0, n <str.length (); n + +) { char c = str.charAt (n); System.out.println (c); }
        
//            for (int i = 0; i < en.length(); i++) {
//                c = en.charAt(i);                
//                    if (c == '.') {
//                    break;
//                    }else{
//                        cadena=cadena+c;
//                }
//            }        
//        pp= Integer.parseInt(cadena);
//        ppp=pp-1.5;
//        total=Integer.toString(ppp);        
        pp=Double.parseDouble(cantidad);
        ppp=pp-1.5;
        total = String.valueOf(ppp);
        donde=txtdos.getText();
        String sql="update productos set existencia = ? where codigo = ?";
        
        try {
           sent = conn.createStatement();
           //ResultSet rs = sent.executeQuery();
           PreparedStatement pstmt =conn.prepareStatement(sql);
           pstmt.setString(1, total);
           pstmt.setString(2, donde);
           pstmt.executeUpdate();
//           ResultSet rs = pstmt.executeQuery();
//            JOptionPane.showMessageDialog(null, pstmt);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        llenar();
        txtBuscar.setText("");
        txtdos.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed
//abre la ventana de precios
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        codigo = txtdos.getText();
        if (codigo.equals("")) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado codigo/producto");
        }
        else{
        //JOptionPane.showMessageDialog(null, "codigo " + codigo);
        Precios p = new Precios();              
        p.setVisible(true);
        }   
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    //---------------------------------------------------------------------
    //se hace el llenado de la tabla con un select a la base de datos
    public void llenar() {
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                //return super.isCellEditable(i, i1); //To change body of generated methods, choose Tools | Templates.
                if (columnas == 5) {
                    return true;
                } else {
                    return false;
                }
            }

        };

        //model.addColumn("id");
        model.addColumn("codigo");
        model.addColumn("descripcion");
        model.addColumn("unidad");
        model.addColumn("existencia");
        model.addColumn("familia");
        tblBuscar.setModel(model);
        String[] datos = new String[5];
        try {
            sent = conn.createStatement();
            ResultSet rs = sent.executeQuery("SELECT p.codigo,p.descripcion,p.unidad,p.existencia, f.descripcion as ddd FROM productos p left join familias f on p.id_familia=f.id_familia");
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);

                model.addRow(datos);

            }
            tblBuscar.setModel(model);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un problema");
        }

    }

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
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Buscar().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblBuscar;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtdos;
    // End of variables declaration//GEN-END:variables

}

