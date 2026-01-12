/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid_o;
import java.util.*;
/**
 *
 * @author User
 */
public class Militar {
    private String nombre,especialidad;
    private double semanas;
    private double pago;
    private int grado;
    public Militar() {
    }
 Scanner sc= new Scanner (System.in);

    public Militar(String nombre, String especialidad, double semanas, double pago, int grado) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.semanas = semanas;
        this.pago = pago;
        this.grado = grado;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getSemanas() {
        return semanas;
    }

    public void setSemanas(double semanas) {
        this.semanas = semanas;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

   
 
    
    
    public void ingresarMilitar(){
        
         System.out.println("Ingresa el nombre del militar: ");
        nombre = sc.nextLine();
        System.out.println("Ingresa la especialidad: ");
        especialidad= sc.nextLine();
        System.out.println("Ingresa el pago por horas: ");
        pago= sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingresa las horas trabajadas");
        semanas= sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingresa su grado: ");
        grado = sc.nextInt();
        sc.nextLine();
        
        
    }
    
    
    
}
