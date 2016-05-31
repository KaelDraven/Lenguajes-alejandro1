/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;
//                             *******clase logica-abstraccion******
/**
 *
 * @author Alejandro
 */
public class OperacionesUsuarios {
    //promedio
    public String calcularEdonDias(Usuario u){
    int edadDias=u.getEdad()*365;
    return ""+edadDias;
}
}
