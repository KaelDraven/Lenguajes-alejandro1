/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author Alejandro
 */
public class Animal {
    String nombre;
    String especie;
    boolean carnivori;
    public Animal(String valor){
        //no lleva nada dentro el constructor solo parentesis y llaves
        nombre=valor;
        // pueden existir cualquier cantidad de constructores pero todos necesitan ser diferentes
    
    
    }
    public Animal(){
    // este es un constructor por defecto
    nombre="Tigre";
    }
 //sobrecarga de constructores, permite personalizar mejor el programa
}
