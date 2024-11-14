/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author utpl
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        String tipoE;
        double sueldo;
        double adicional;
        double sueldoFinal = 0;
        
        System.out.println("Ingrese el nombre del empleado:");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese el tipo de empleado:");
        tipoE = entrada.nextLine();
        
        System.out.println("Ingrese el sueldo del empleado:");
        sueldo = entrada.nextDouble();
        
        switch (tipoE){
            case "1":
                adicional = 0.05;
                sueldoFinal = sueldo - adicional;
                System.out.printf("Informe\nNombre: %s\nTipo de Empleado: %s\n"
                        + "Sueldo Inicial: %.2f\nIncremento: %.2f\n"
                        + "Sueldo Final: %.2f\n", 
                        nombre, tipoE, sueldo, adicional, sueldoFinal);
                break;
                
            case "2":
                adicional = 0.07;
                sueldoFinal = sueldo - adicional;
                System.out.printf("Informe\nNombre: %s\nTipo de Empleado: %s\n"
                        + "Sueldo Inicial: %.2f\nIncremento: %.2f\n"
                        + "Sueldo Final: %.2f\n", 
                        nombre, tipoE, sueldo, adicional, sueldoFinal);
                break;
                
            case "3":
                adicional = 0.09;
                sueldoFinal = sueldo - adicional;
                System.out.printf("Informe\nNombre: %s\nTipo de Empleado: %s\n"
                        + "Sueldo Inicial: %.2f\nIncremento: %.2f\n"
                        + "Sueldo Final: %.2f\n", 
                        nombre, tipoE, sueldo, adicional, sueldoFinal);
                break;
                
            case "4":
                adicional = 0.12;
                sueldoFinal = sueldo - adicional;
                System.out.printf("Informe\nNombre: %s\nTipo de Empleado: %s\n"
                        + "Sueldo Inicial: %.2f\nIncremento: %.2f\n"
                        + "Sueldo Final: %.2f\n", 
                        nombre, tipoE, sueldo, adicional, sueldoFinal);
                break;
                
            default:
                adicional = 0.15;
                sueldoFinal = sueldo - adicional;
                System.out.printf("Informe\nNombre: %s\nTipo de Empleado: %s\n"
                        + "Sueldo Inicial: %.2f\nIncremento: %.2f\n"
                        + "Sueldo Final: %.2f\n", 
                        nombre, tipoE, sueldo, adicional, sueldoFinal);
                break;
        }
        
        
        
    }
    
}
