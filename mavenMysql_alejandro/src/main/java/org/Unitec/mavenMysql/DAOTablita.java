/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.Unitec.mavenMysql;

/**
 *
 * @author Alejandro
 */
import java.sql.*;
public class DAOTablita {
    /**
     * @param t este argumento es el objeto de tipo tablita que deseas guardar
     * 
     * @throws Exception 
     */
    public static void guardar(Tablita t)throws Exception{
    //paso 1 conectarnos a MYsql
    Connection con= conexion.conectarse("root", null);
    //paso 2 generar el Statement de sql con la coneccion 
    PreparedStatement pr=con.prepareStatement("insert into tablita(nombre, sueldo) values(?,?)");
    pr.setString(1, t.getNombre());
    pr.setFloat(2, t.getSueldo());
    pr.execute();
        System.out.println("guardado con exito padre santo!!");
    
    }
}
