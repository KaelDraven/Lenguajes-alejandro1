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
public class EmpleadoNuloException extends Exception{
    public EmpleadoNuloException(){
    super("el empleado no puede ser nulo");
    
    }
}
