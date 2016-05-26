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
    boolean carnivoro;
    public Animal(String valor){
        //no lleva nada dentro el constructor solo parentesis y llaves
        nombre=valor;
        // pueden existir cualquier cantidad de constructores pero todos necesitan ser diferentes
    
    
    }
    public Animal(){
    // este es un constructor por defecto
    nombre="Tigre";
    especie="felino";
    boolean carnivoro;
    }
 //sobrecarga de constructores, permite personalizar mejor el programa
    
    public Animal(String nombre, String val2){
    this.nombre=nombre; 
    //nombre= nombre; con el (String nombre)asignacion ciclica se le podria decir que es una verdad absoluta
        
     
    }
    public Animal(boolean carnivoro){
    this.carnivoro=carnivoro;
    
    }
    
    public Animal(boolean valo1,String especie,String nombre){
    
    this.especie=especie;
    this.nombre=nombre;
    }
}
