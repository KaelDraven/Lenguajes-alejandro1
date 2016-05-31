/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;
//                                   *******ENCAPSULAMIENTO*******
/**
 *
 * @author Alejandro
 */
public class Usuario {
    private int edad; //modificar acceso

    public Usuario(int edad) {
        this.edad = edad;
    }
/*
    public Usuario() {
    }
    //vamos a implementar el metodo SET para el atributo
    
    public void setEdad(int edad){
         if(edad<0){// se pide el valor (GET** mutador)
       // u1.edad=0; <-- asignar el valor (SET** mutador)
        edad=0;    
       System.out.println("no debes meter edades menores de 0");
        }
    this.edad=edad;
    
    }
    //vamos a implementar el metodo GET para el mismo atributo
    public int getEdad(){
     return edad;
     
    }
    */

    Usuario() {
       
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set 
     */
    public void setEdad(int edad) {
        this.edad = edad;
        if(edad<0){// se pide el valor (GET** mutador)
       // u1.edad=0; <-- asignar el valor (SET** mutador)
        edad=0;    
       System.out.println("no debes meter edades menores de 0");
        }
    }
    // java doc **documentacion para programadores
    
}
