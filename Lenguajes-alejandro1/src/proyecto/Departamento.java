/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Alejandro
 */
public class Departamento {
    Integer id;
    String nombre;
    
    public Departamento(){
    }
    public Departamento(Integer id,String nombre) throws ValorMenorCeroException {
        if(id<0)throw new ValorMenorCeroException();
    this.id=id;
    this.nombre=nombre;
    
    }
    public int getidD(){
    return id;
    }
    public void setidD(Integer id)throws ValorMenorCeroException{
        if(id<0)throw new ValorMenorCeroException();
    this.id=id;
    
    }
    public String getN(){
    return nombre;
    }
    public void setN(String nombre){
    this.nombre=nombre;
    }
}
