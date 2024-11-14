/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); // 10,2 / 10.2
        
        System.out.println("Ingrese la primera cantidad");
        double num1 = entrada.nextDouble();
        
        System.out.println ("Ingrese el operador");
        entrada.nextLine();
        String operador = entrada.nextLine();
        
        double operacion = 0;
        
        System.out.println("Ingrese la segunda cantidad");
        double num2 = entrada.nextDouble();
        
        if (num1 > num2) {
            switch (operador){
                case "+":
                   operacion = (num1 + num2);
                   System.out.printf("El resultado es: %.2f", operacion);
                   break;
                   
                case "-":
                    operacion = (num1 - num2);
                    System.out.printf("El resultado es: %.2f", operacion);
                    break;
                    
                case "*":
                    operacion = (num1 * num2);
                    System.out.printf("El resultado es: %.2f", operacion);
                    break;
                   
                case "/":
                    operacion = (num1 / num2);
                    System.out.printf("El resultado es: %.2f", operacion);
                    break;
                    
                case "MOD":
                    operacion = (num1 % num2);
                    System.out.printf("El resultado es: %.2f", operacion);
                    break;
                    
                case "^":
                    operacion = (Math.pow (num1, num2));
                    System.out.printf("El resultado es: %.2f", operacion);
                    break;
                 
            }
            
              
        }
    }
    
}
