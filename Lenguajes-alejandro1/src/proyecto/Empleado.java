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
public class Empleado {
    Integer id;
    String nombre;
    Departamento departamento;
    
   public Empleado(){
   }
    public Empleado(Integer id,String nombre,Departamento departamento)throws ValorMenorCeroException,EmpleadoNuloException{
        if(id<0)throw new ValorMenorCeroException();
        if(departamento == null) throw new EmpleadoNuloException();
    this.id=id;
    this.nombre=nombre;
    this.departamento=departamento;
    }
    public int getidE(){
    return id;
    }
    public void setid(int id){
    this.id=id;
    }
    public String getN(){
    return nombre;
    }
    public void setN(String nombre){
    this.nombre=nombre;
    }
    public Departamento getD(){
    return departamento;
    }
    public void setD(Departamento departamento)throws EmpleadoNuloException{
        if(departamento == null) throw new EmpleadoNuloException();
    this.departamento=departamento;
    }
}
