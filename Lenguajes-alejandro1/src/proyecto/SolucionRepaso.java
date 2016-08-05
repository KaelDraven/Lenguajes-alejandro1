/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Alejandro
 */
public class SolucionRepaso {
    public static void main(String[] args) {
        Departamento dep=new Departamento();
        try{
            dep.setidD(3);
            dep.setN("sistemas");
            System.out.println("Departamento creado");
            GenerarEmpleados.generar();
        }catch(Exception e){}
        
    }
   
}