/*
Elaborar un algoritmo que permita leer los datos de un empleado (nombre, tipo de 
empleado, número de horas trabajadas y cuota que se le paga por hora) y calcule e 
imprima el sueldo por pagar. Si el empleado es tipo 1 se le pagan las horas extras 
(más de 40 horas) a 1.5 de la cuota por hora, si es tipo 2, a 2, si es tipo 3, a 
2.5, y si es tipo 4, a 3 veces la cuota por hora.
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Usuario iTC
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        int tipoEmpleado;
        double numeroHoras;
        double cuotaHora;
        double sueldo;
        
        System.out.println("Ingrese el nombre del empleado:");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese el tipo de empleado(1, 2, 3 o 4):");
        tipoEmpleado = entrada.nextInt();
        
        System.out.println("Ingrese el número de horas trabajadas:");
        numeroHoras = entrada.nextDouble();
        
        System.out.println("Ingrese la cuota a pagar por hora:");
        cuotaHora = entrada.nextDouble();
        
        sueldo = numeroHoras * cuotaHora;
        
    if(tipoEmpleado == 1 && numeroHoras >= 40){
        cuotaHora = 1.5 * cuotaHora;
        sueldo = cuotaHora * numeroHoras;                   
     }else{
      if(tipoEmpleado == 2) {
            cuotaHora = 2 * cuotaHora;
            sueldo = cuotaHora * numeroHoras;
        }else{
        if(tipoEmpleado == 3) {
               cuotaHora = 2.5 * cuotaHora;
               sueldo = cuotaHora * numeroHoras;
            }else{
            if(tipoEmpleado == 4)
                  cuotaHora = 3 * cuotaHora;
                  sueldo = cuotaHora * numeroHoras;
                    }   
    }   
    }
    
    System.out.println("El sueldo es de: " + sueldo);
    
  }
    
}
