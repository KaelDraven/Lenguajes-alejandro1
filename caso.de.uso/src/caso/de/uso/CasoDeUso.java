/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso.de.uso;

/**
 *
 * @author Alejandro
 */
public class CasoDeUso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Animal animalitos[]={new delfin(), new aguila(), new Vivora(),new Leon(),new delfin(),new Vivora()};
       for(Animal ani:animalitos){
       ani.comer();
       }
    }
    
}
