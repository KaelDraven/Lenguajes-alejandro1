/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica1;

/**
 *
 * @author Alejandro
 */
public class Procedimiento {
    public String IMS(User r){
     
    int ims = r.getpeso()*(r.getalt()*r.getalt());
    return ""+ims;
    }
}