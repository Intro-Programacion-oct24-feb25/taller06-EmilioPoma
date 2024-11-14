/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String tipo;
        String propietario;
        int valorC;
        double peaje;
        
        System.out.println("Ingrese el nombre del propietario:");
        propietario = entrada.nextLine();
        
        System.out.println("Ingrese el tipo del vehiculo");
        tipo = entrada.nextLine();
        tipo = tipo.toLowerCase();
        
        System.out.println("Ingrese el valor del vehiculo:");
        valorC = entrada.nextInt();
        
        switch(tipo){
            case "tipo 1":
                tipo = "vehiculo liviano particular";
                peaje = (0.0001*valorC)+2;
                System.out.printf("Peaje 'Buena via'\n\tPropietario: "
                        + "%s\nTipo: %s\n\tValor: %d\n\tPeaje: %.1f ", 
                        propietario, tipo, valorC, peaje);
                break;
                
            case "tipo 2":
                tipo = "vehiculo grande particular";
                peaje = (0.0002*valorC)+2.5;
                System.out.printf("Peaje 'Buena via'\n\tPropietario: "
                        + "%s\nTipo: %s\n\tValor: %d\n\tPeaje: %.1f ", 
                        propietario, tipo, valorC, peaje);
                break;
              
            case "tipo 3":
                tipo = "taxi";
                peaje = (0.0004*valorC)+1.5;
                System.out.printf("Peaje 'Buena via'\n\tPropietario: "
                        + "%s\nTipo: %s\n\tValor: %d\n\tPeaje: %.1f ", 
                        propietario, tipo, valorC, peaje);
                break;
              
             case "tipo 4":
                tipo = "bus urbano";
                peaje = (0.0005*valorC)+2.2;
                System.out.printf("Peaje 'Buena via'\n\tPropietario: "
                        + "%s\nTipo: %s\n\tValor: $%d\n\tPeaje: $%.1f ", 
                        propietario, tipo, valorC, peaje);
                break;
            
        }
        
    }
    
}
