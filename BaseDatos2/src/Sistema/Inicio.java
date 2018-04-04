/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Edu Lopez
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame2
     */
    public Inicio() {
        initComponents();
        setLocationRelativeTo(null);//Aparesca en el centro
        setResizable(false);//No maximizar tamaño
        reloj hora=new reloj(Jhora);
        hora.start();
        fecha();
    }
        public void fecha(){
        String dias=Fecha();
        Jfecha.setText(dias);
    }
            public String nombre(int mes){
        switch(mes){
            case 0: return "01";
            case 1: return "02";
            case 2: return "03";
            case 3: return "04";
            case 4: return "05";
            case 5: return "06";
            case 6: return "07";
            case 7: return "08";
            case 8: return "09";
            case 9: return "10";
            case 10: return "11";
            case 11: return "12";
        }
        return "Error";
    }
        public String Fecha(){
        GregorianCalendar fecha=new GregorianCalendar();
        int dia=fecha.get(fecha.DAY_OF_MONTH);
        int mes=fecha.get(fecha.MONTH);
        int ano=fecha.get(fecha.YEAR);
        String mifecha= String.valueOf(dia)+"/"+nombre(mes)+"/"+String.valueOf(ano);
        return mifecha;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Jhora = new javax.swing.JLabel();
        Jfecha = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("Bienvenido a Liga Bancomer Mx");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 530, 130));

        jButton1.setText("Agregar Nuevo Torneo");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 150, 30));

        jButton2.setText("Editar Torneo");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 150, 30));

        jButton3.setText("Mostar Torneos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 150, 30));

        Jhora.setFont(new java.awt.Font("Segoe UI Black", 1, 11)); // NOI18N
        Jhora.setText("hora");
        getContentPane().add(Jhora, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 120, 30));

        Jfecha.setFont(new java.awt.Font("Segoe UI Black", 1, 11)); // NOI18N
        Jfecha.setText("fecha");
        getContentPane().add(Jfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 140, -1));

        jButton4.setText("iniciar sesion");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/uefa.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        MostrarDatos obj=new MostrarDatos();//Abrir nueva ventana
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String Administrador = "Edu Lopez";//Nombre del Admi
        String password = "12345"; //Contraseña
        String Admi_introducido="";
        String pass_introducido="";
        while(Admi_introducido.equals(Administrador)==false || pass_introducido.equals(password)==false){
            Admi_introducido=JOptionPane.showInputDialog("Introdusca el Nombre");
            pass_introducido=JOptionPane.showInputDialog("Introdusca la Contraseña");
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jfecha;
    private javax.swing.JLabel Jhora;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
