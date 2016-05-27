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
        Usuario u1=new Usuario();
        u1.edad=-19;
        if(u1.edad<0){
        u1.edad=0;
            System.out.println("no debes meter edades menores de 0");
        }
        System.out.println("tu edad es "+u1.edad);
        
    }
}
