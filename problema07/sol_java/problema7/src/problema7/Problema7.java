/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema7;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Problema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int numero1;
        int numero2 = 0;
        int resultado = 2;
        String cadena= "";
        int total= 0;

        
        
        System.out.println("Ingrese el número hasta donde generar");
        numero1 = entrada.nextInt();
        
        if (numero1 < 2 ){
            System.out.println("Error, numero ingresado menor a 2");
        } else{
            
        while (numero2 < numero1) {
            
        numero2 = numero2 + 2; 
        resultado = resultado + 2; 
        total = total + resultado;
        cadena = cadena + numero2 + "+ 2" + "= " + resultado + "\n";
        
            }
        }
        System.out.println("Suma de los numeros \n" + cadena);
        System.out.println("La suma total es: "+ total);
        
    }
    
}
