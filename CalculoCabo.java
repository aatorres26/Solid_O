/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid_o;

/**
 *
 * @author User
 */
public class CalculoCabo implements Salario{

    @Override
    public double calcularSalario(Militar militar) {
        return  militar.getSemanas()*70;

    }
    
}
