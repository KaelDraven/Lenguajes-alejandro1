/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.Unitec.mavenMysql;
import java.sql.*;
/**
 *
 * @author Alejandro
 */

public class probarConexion {
    public static void main(String[] args) {
        try{
        
       // Connection con=conexion.conectarse("root",null);
       Tablita t=new Tablita("juan",90000f);
       DAOTablita.guardar(t);
       
        }catch (Exception e){
        
            System.err.println(e.getMessage());
        }
    }
}
