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
public class ProbarThread implements Runnable{
    public static void main(String[] args) {
        PrimerThread t1=new  PrimerThread();
        t1.start();
        Runnable r=new ProbarThread();
        Thread t2=new Thread(r);
        t2.start();
    }
    public void run(){
    
    }
}
