/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

import java.io.*;
import java.util.ArrayList;

public class PersistenciaUsuario {
    //esta es una clase model de tipo logico, solamente contiene acciones, 
    //metodos que representan acciones concretas, las sintaxis
    //y estructura de dicho metodo depende de la accion
    ArrayList<Usuario> Usuarios;

    public PersistenciaUsuario() {
        Usuarios=new ArrayList<>();
       
    }
    public void Guardar(Usuario u) throws Exception{
        //paso uno generar el archivo a guardar
        File f=new File("Archivaldo.raton");
        //indicar que se va a guardar 
        FileOutputStream fos=new FileOutputStream(f);
        //generar el objeto que va a ayudar a guardar
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        //ahora si a guardar el objeto
        Usuarios.add(u);
        oos.writeObject(Usuarios);
        
    }
    }
    
    



