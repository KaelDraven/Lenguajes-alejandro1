/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class ProbarUsuarios {
    public static void main(String[] args) {
      // vamos a ller el arraylist a ver que hay
      //paso 1 creamos un objeto de la clase PersistenciaUsuario
      PersistenciaUsuario p=new PersistenciaUsuario();
      try{
        ArrayList<Usuario> Usuarios = p.buscartodos();
        int tam = Usuarios.size();
        System.out.println("usuarios guardados"+tam);
        for(int can=0;can<=tam; can++){
          
          System.out.println(Usuarios.get(can).getNombre()); 
          //para ver los demas usuarios revisar la cantidad y cambiar el numero
        }
    }catch (Exception ex){
          System.out.println(ex.getMessage());
    }
      
      
     }
}
