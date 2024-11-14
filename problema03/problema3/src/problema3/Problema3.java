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
        double incremento;
        double sueldoFinal;
        
        System.out.println("Ingrese el nombre del empleado");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese el tipo de empleado:");
        tipoE = entrada.nextLine();
        
        System.out.println("Ingrese el sueldo del empleado:");
        sueldo = entrada.nextDouble();
        
        
        
    }
    
}
