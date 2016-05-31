/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author Alejandro
 */
public class ProbarUsuario {
    public static void main(String[] args) {
        // creamos un objeto con el constructor de defecto de la clase usuario
        //en el codigo **main** no debe de haber codigo de programacion ya que se vuelve debil
        //los atributos necesitan unmetodo mutador 
        Usuario u1=new Usuario();
        u1.setEdad(19);
        //u1.edad=-19; <--- MAL (SET** mutador)
       
        System.out.println("tu edad es "+u1.getEdad());
        OperacionesUsuarios o=new OperacionesUsuarios();
        System.out.println("tu edad en dias es "+o.calcularEdonDias(u1));
        
    }
}
