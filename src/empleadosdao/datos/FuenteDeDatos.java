/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleadosdao.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ingenieria
 */
public class FuenteDeDatos 
{
   private Connection conexion= null;
   private String url;
   private String badeDeDatos;
   private String usuario;
   private String clave;
   
   
   public FuenteDeDatos()
   {
       badeDeDatos="Empresa";
       clave="";
       usuario="root";
       url="jdbc:mysql://localhost/"+badeDeDatos;
   }
   
   public Connection crearConexion()
   {
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
           conexion =  DriverManager.getConnection(url,usuario,clave);
           System.out.println("Conexion realizada correctamente");
           
       } 
       catch (ClassNotFoundException ex) 
       {
           Logger.getLogger(FuenteDeDatos.class.getName()).log(Level.SEVERE, null, ex);
       }
       catch (SQLException ex) 
       {
           Logger.getLogger(FuenteDeDatos.class.getName()).log(Level.SEVERE, null, ex);
       }
       return conexion;
   }
}
