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
public class GenerarEmpleados {
    public static void generar()throws Exception{
Thread t1=new Thread(new Runnable(){

    public void run(){

        for(int i=0;i<5;i++){

            try{
                Departamento dep=new Departamento(i,"Sistemas");
                Empleado em=new Empleado(i,"Empleado"+i,dep);
                System.out.println("Empleado: "+em.getN()+" Departamento: "+em.getD());
}catch(Exception e){

}
}
}
});
   t1.start();     }
}
