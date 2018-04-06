/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import MySQL.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Itzel
 */
public class Estadios extends javax.swing.JFrame {

    /**
     * Creates new form Estadios
     */
    public Estadios() {
        initComponents();
         mostrardatos("");
    }
      void mostrardatos(String valor){
       
        
         Connection conexion;
         conexion=Conexion.getConexion();
         DefaultTableModel modelo=new DefaultTableModel();
         ResultSet rs = Database.getTabla("SELECT Nom_estadios FROM estadios");
         modelo.setColumnIdentifiers(new Object[]{"Etadios"});
         //        


jTable1.setModel(modelo);
String sql="";
if (valor.equals(""))
{
    sql="SELECT * FROM estadios";
}
else{
    sql="SELECT * FROM estadios WHERE (Id_etadios='"+valor+"' OR Nom_estadios='"+valor+"'  )";
}
String []datos=new String [2];
try {
    while (rs.next()) {
        // añade los resultado a al modelo de tabla
        modelo.addRow(new Object[]{rs.getString("Nom_estadios")});
    }
    // asigna el modelo a la tabla
    jTable1.setModel(modelo);
} catch (Exception e) {
    System.out.println(e);
}

      }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jMenuItem1.setText("Modificar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("eliminar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Estadios");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 20, 150, 30);

        jLabel2.setText("Ingresa el nombre Estadio");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 110, 125, 14);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(180, 110, 73, 20);

        jButton1.setText("Insertar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(270, 110, 71, 23);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(150, 240, 375, 98);

        jButton2.setText("Mostrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(260, 360, 69, 23);

        jButton3.setText("Buscar");
        getContentPane().add(jButton3);
        jButton3.setBounds(410, 110, 65, 23);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(480, 110, 64, 20);

        jButton4.setText("Modificar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(380, 360, 75, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/uefa.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 810, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try
        {
      Connection conexion;
       conexion=Conexion.getConexion();
           PreparedStatement pst=conexion.prepareStatement("INSERT INTO estadios(Nom_estadios) VALUES(?)");
            //pst.setString(1,jTextField1.getText());
            pst.setString(1,jTextField1.getText());



        int a=pst.executeUpdate();
        if(a>0){
            JOptionPane.showMessageDialog(null,"Registro exitoso");
             mostrardatos("");
        }
        else{
             JOptionPane.showMessageDialog(null,"Error al agregar");
        }

        }catch(SQLException ex)
        {
            try {
                throw new SQLException(ex);
            } catch (SQLException ex1) {
                Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex1);
            }
            
       
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         DefaultTableModel modelo = new DefaultTableModel();               
        ResultSet rs = Database.getTabla("SELECT Nom_estadios FROM estadios");
        modelo.setColumnIdentifiers(new Object[]{"Etadios"});
        try {
            while (rs.next()) {
                // añade los resultado a al modelo de tabla
                modelo.addRow(new Object[]{rs.getString("Nom_estadios")});
            }            
            // asigna el modelo a la tabla
            jTable1.setModel(modelo);            
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed
String  Id_estadios="";
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
                int fila=jTable1.getSelectedRow();
    if(fila>=0){
        jTextField1.setText(jTable1.getValueAt(fila,0).toString());
         //jTextField2.setText(jTable1.getValueAt(fila,1).toString());
      Id_estadios = jTable1.getValueAt(fila,0).toString();
           
    }
    else{
        JOptionPane.showMessageDialog(null,"No se encontro fila");
    }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
          Conexion cc=new Conexion();
          Connection cn=cc.getConexion();
          //Este nos sirve para poder modificar lo unico que cambia es id_equipos
try{
PreparedStatement pst=cn.prepareStatement("UPDATE estadios SET Nom_estadios='"+jTextField1.getText()+"' WHERE Nom_estadios='"+Id_estadios+"' ");

//PreparedStatement pst=cn.prepareStatement("UPDATE equipo SET equipos='"+"' WHERE Id_Equipos='"+Id_Equipos+"' ");
Id_estadios=jTextField1.getText();
pst.executeUpdate();
mostrardatos("");
}catch(Exception e){
    System.out.print(e.getMessage());
}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
                   Conexion cc=new Conexion();
             Connection cn=cc.getConexion();
              int fila=jTable1.getSelectedRow();
                 String cod="";
             cod=jTable1.getValueAt(fila,0).toString();
      try{
        PreparedStatement pst=cn.prepareStatement("DELETE FROM estadios WHERE Nom_estadios='"+cod+"'");
        pst.executeUpdate();
        mostrardatos("");// TODO add your handling code here:
         } catch (Exception e){
}  
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(Estadios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estadios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estadios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estadios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estadios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    
}