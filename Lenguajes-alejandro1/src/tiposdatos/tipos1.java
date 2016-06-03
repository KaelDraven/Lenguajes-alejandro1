/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposdatos;

public class tipos1 {
    public static void main(String[] args) {
        /*//declaramos un byte
        byte b=2; //solo abarca todo lo que va desde -128 a 127 marca error
        short (short)1;
        //128  es posible incluirlo en esta
        int i=2;
        long l=2;
*/
        operaciones o=new operaciones();
        System.out.println(o.suma(4.0f, 5.0f));
        //en un dato flotante,es necesario colocar una F o f despues del numero de lo contrario 
        //lo toma como doble
        
    }
}
