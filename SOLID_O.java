/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solid_o;

/**
 *
 * @author User
 */
public class SOLID_O {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado empleado =new Empleado ();
        empleado.ingresarEmpleado();
        MostrarDatos mostrar= new MostrarDatos();
        mostrar.mostrar(empleado);
    }
    
}
