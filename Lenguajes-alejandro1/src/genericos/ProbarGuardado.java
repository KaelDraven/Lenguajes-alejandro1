/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

/**
 *
 * @author Alejandro
 */
public class ProbarGuardado {
    public static void main(String[] args) {
        Usuario u=new Usuario("juan",20,"juan@gmail.com");
        PersistenciaUsuario p=new PersistenciaUsuario();
        try {
            p.Guardar(u);
            System.out.println("Usuario guardado");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
