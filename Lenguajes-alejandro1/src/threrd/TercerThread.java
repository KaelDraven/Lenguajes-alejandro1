/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threrd;

/**
 *
 * @author Alejandro
 */
public class TercerThread {
    
    public static void main(String[] args) {
    Thread t1=new Thread(new Runnable(){
        //es una clase interna anonima */* hace falta el metodo run si es que marca en rojo 
        public void run(){
        
        }
    });
    Thread t2=new Thread(new Runnable() {
        @Override
        public void run() {
            
        }
    });
    t1.start();
    t2.start();
    }
}
