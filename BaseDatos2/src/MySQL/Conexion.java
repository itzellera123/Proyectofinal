/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySQL;
import java.sql.*;

/**
 *
 * @author Rebe-pc
 */
public class Conexion {
   private static String db="ejemplo1";//nombre de la BD
    private static String user="root";//Usuario
    private static String pass="";//Contraseña
    private static String host="localhost:3306";//Host
    private static String server="jdbc:mysql://"+host+"/"+db;
    
    public static  Connection getConexion() {
        Connection cn=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection(server,user,pass);         
        }
        catch(Exception e){
         System.out.println(String.valueOf(e));}
        return cn;
    }

//    public Connection ejemplo() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public PreparedStatement prepareStatement(String insert_into_estadiosnombre_estadio_VALUES) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
