/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc;




import java.awt.HeadlessException;


import java.sql.DriverManager;

import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Jose
 */
public class Conexion {
//    Connection conexion = null;
//    Statement comando = null;
//    ResultSet registro;
    
    public static Connection conn;
    public static final String driver = "com.mysql.jdbc.Driver";
    public static final String user ="root";
    public static final String password = "";
    public static final String url="jdbc:mysql://localhost:3306/prueba";
    
    
 
//    public Connection MySQLConnect() {
// 
//        try {
//            //Driver JDBC
//            Class.forName("com.mysql.jdbc.Driver");
//            //Nombre del servidor. localhost:3306 es la ruta y el puerto de la conexión MySQL
//            //panamahitek_text es el nombre que le dimos a la base de datos
//            String servidor = "jdbc:mysql://localhost:3306/prueba";
//            //El root es el nombre de usuario por default. No hay contraseña
//            String usuario = "root";
//            String pass = "";
//            //Se inicia la conexión
//            conexion = (Connection) DriverManager.getConnection(servidor, usuario, pass);
// 
//        } catch (ClassNotFoundException ex) {
//            JOptionPane.showMessageDialog(null, ex, "Error en la conexión a la base de datos 1: " 
//                    + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
//            conexion = null;
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex, "Error en la conexión a la base de datos 2: " 
//                    + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
//            conexion = null;
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, ex, "Error en la conexión a la base de datos 3: " 
//                    + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
//            conexion = null;
//        } finally {
//            JOptionPane.showMessageDialog(null, "Conexión Exitosa");
//            return conexion;
//        }
//    }
            
    
    
    
    
//     public String driver = "com.mysql.jdbc.Driver";
//
//    // Nombre de la base de datos
//    public String database = "prueba";
//
//    // Host
//    public String hostname = "localhost";
//
//    // Puerto
//    public String port = "3306";
//
//    // Ruta de nuestra base de datos (desactivamos el uso de SSL con "?useSSL=false")
//    public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false";
//
//    // Nombre de usuario
//    public String username = "root";
//
//    // Clave de usuario
//    public String password = "";
//
//    public Connection conectarMySQL() {
//        Connection conn = null;
//
//        try {
//            Class.forName(driver);
//            conn = (Connection) DriverManager.getConnection(url, username, password);
//            JOptionPane.showMessageDialog(null, "conectado");
//        } catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//            JOptionPane.showMessageDialog(null, "error de conexion");
//        }
//
//        return conn;
//    }

    public Conexion() {
        
        conn=null;
        try {
            Class.forName(driver);
            conn= (Connection) DriverManager.getConnection(url, user, password);
            if (conn !=null) {
                JOptionPane.showMessageDialog(null, "Conexion establecida");
            }
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "error de conexion "+e);
        }
    }
    
    //este metodono nos retorna la conexion
    public Connection getConnection(){
        return conn;
    }
    
    //este metodo es para desconectar
    public void desconectar(){
        conn=null;
        if (conn==null) {
            JOptionPane.showMessageDialog(null, "conexion terminada");
        }else{
            JOptionPane.showMessageDialog(null, "no se pudo desconectar");
        }
    }

    

    
    
    
    
    
    

}
