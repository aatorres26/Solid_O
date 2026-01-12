/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package solid_o;

/**
 *
 * @author User
 */
public interface CalcularSalario {
    public static Salario calcular(int tipoMilitar){
        System.out.println("Ingrese su rango :");
        System.out.println("1:cabo\n 2:Sargento\n 3: Suboficial\n 4: Soldado");
        switch(tipoMilitar){
            case 1:
                return new CalculoCabo(); 
               
            case 2:
                return new CalculoSargento();
            case 3:
                return new CalculoSuboficial();
            case 4:
                return new CalculoSoldado();
            default:
                throw new IllegalArgumentException("Grado de militar no Valido");
        }
    }
}
