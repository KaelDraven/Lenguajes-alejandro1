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
public class ValorMenorCeroException extends Exception {
    
    public ValorMenorCeroException(){
    super("el id tiene que ser mayor que cero");
}
}
