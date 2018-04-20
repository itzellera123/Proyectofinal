
package Sistema;
import Sistema.*;
import Sistema.Inicio;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.table.TableModel;
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
 * @author Edu Lopez
 */

public class Estadios extends javax.swing.JFrame {

    /**
     * Creates new form Cramer
     */
    public Estadios() {
        initComponents();
        setLocationRelativeTo(null);//Aparesca en el centro
        setResizable(false);//No maximizar tamaño
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


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPBackground = new javax.swing.JPanel();
        jPSidePanel = new javax.swing.JPanel();
        jPinfo = new javax.swing.JPanel();
        jLInfo = new javax.swing.JLabel();
        jPOption = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPred = new javax.swing.JPanel();
        jLwelcometo = new javax.swing.JLabel();
        jPtop = new javax.swing.JPanel();
        jLbtnclose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPBackground.setBackground(new java.awt.Color(38, 38, 38));
        jPBackground.setToolTipText("");
        jPBackground.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPBackgroundFocusLost(evt);
            }
        });
        jPBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPSidePanel.setBackground(new java.awt.Color(45, 44, 65));
        jPSidePanel.setToolTipText("");
        jPSidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPinfo.setBackground(new java.awt.Color(204, 204, 204));
        jPinfo.setToolTipText("Mas informacion sobre Mathnet Support");
        jPinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPinfoMousePressed(evt);
            }
        });

        jLInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/Images/Info_15px.png"))); // NOI18N

        javax.swing.GroupLayout jPinfoLayout = new javax.swing.GroupLayout(jPinfo);
        jPinfo.setLayout(jPinfoLayout);
        jPinfoLayout.setHorizontalGroup(
            jPinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPinfoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPinfoLayout.setVerticalGroup(
            jPinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPinfoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPSidePanel.add(jPinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 40, 30));

        jPBackground.add(jPSidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 33, 40, 470));

        jPOption.setBackground(new java.awt.Color(75, 75, 75));
        jPOption.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jPOption.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));
        jPOption.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 110, -1));

        jButton1.setText("Insertar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPOption.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, -1, -1));

        jButton2.setText("Mostrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPOption.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, -1, -1));

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
        jScrollPane1.setViewportView(jTable1);

        jPOption.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, 150));

        jButton4.setText("Modificar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPOption.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("   EQUIPOS");
        jPOption.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jPBackground.add(jPOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 960, 380));

        jPred.setBackground(new java.awt.Color(193, 44, 66));
        jPred.setToolTipText("");

        jLwelcometo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLwelcometo.setForeground(new java.awt.Color(255, 255, 255));
        jLwelcometo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLwelcometo.setText("Liga MX");

        javax.swing.GroupLayout jPredLayout = new javax.swing.GroupLayout(jPred);
        jPred.setLayout(jPredLayout);
        jPredLayout.setHorizontalGroup(
            jPredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPredLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLwelcometo, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(495, Short.MAX_VALUE))
        );
        jPredLayout.setVerticalGroup(
            jPredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPredLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLwelcometo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPBackground.add(jPred, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 960, 60));

        jLbtnclose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbtnclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/Images/Close Window_15px.png"))); // NOI18N
        jLbtnclose.setToolTipText("Cerrar? :'v");
        jLbtnclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLbtncloseMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPtopLayout = new javax.swing.GroupLayout(jPtop);
        jPtop.setLayout(jPtopLayout);
        jPtopLayout.setHorizontalGroup(
            jPtopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPtopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLbtnclose, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPtopLayout.setVerticalGroup(
            jPtopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbtnclose, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        jPBackground.add(jPtop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1023, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 501, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPinfoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPinfoMousePressed
        JPanel jPNetwork = null;
        // TODO add your handling code here:
        resetColor(jPNetwork);
        JPanel jPAlgebra = null;
        resetColor(jPAlgebra);
        setColor(jPinfo);
    }//GEN-LAST:event_jPinfoMousePressed

    private void jLbtncloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbtncloseMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLbtncloseMousePressed

    private void jPBackgroundFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPBackgroundFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jPBackgroundFocusLost

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
String Id_estadios=" ";
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
     void setColor(JPanel panel){
        panel.setBackground(new Color(204,204,204));
    }
    
    void resetColor(JPanel panel){
        panel.setBackground(new Color(240,240,240));
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
            java.util.logging.Logger.getLogger(Estadios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estadios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estadios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estadios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLbtnclose;
    private javax.swing.JLabel jLwelcometo;
    private javax.swing.JPanel jPBackground;
    private javax.swing.JPanel jPOption;
    private javax.swing.JPanel jPSidePanel;
    private javax.swing.JPanel jPinfo;
    private javax.swing.JPanel jPred;
    private javax.swing.JPanel jPtop;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
