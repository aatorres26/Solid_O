/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid_o;

/**
 *
 * @author User
 */
public class MostrarDatos {
     public void mostrar(Militar militar){
         Salario salario= CalcularSalario.calcular(
                 militar.getGrado());
        System.out.println("======REPORTE DE MILITAR======");
        System.out.println("Nombre: "+militar.getNombre());
        System.out.println("Departamento: "+militar.getEspecialidad());
        System.out.println("Salario: $"+ salario.calcularSalario(militar));
    }
}
