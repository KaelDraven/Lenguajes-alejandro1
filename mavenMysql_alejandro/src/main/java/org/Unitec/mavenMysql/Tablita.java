/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.Unitec.mavenMysql;

/**
 *
 * @author Alejandro
 */
public class Tablita {
    public Integer id;
    public String nombre;
    public Float sueldo;

    public Tablita(String nombre, Float sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public Tablita() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getSueldo() {
        return sueldo;
    }

    public void setSueldo(Float sueldo) {
        this.sueldo = sueldo;
    }
    
   
}
