/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema07;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Problema07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int limite;
        int numero = 2;
        int suma = 0;
        String cadena = "";
        
        System.out.println("Ingrese un número par:");
        limite = entrada.nextInt();
        
        do{
            if(limite < 2){
              System.out.println("Error. El número es menor a 2");
            }else{
              suma = suma + numero;
              cadena = cadena + numero + " + ";
              numero = numero + 2;
            }
        
        }while (numero <= limite);
        
      System.out.println(cadena + " = " + suma);
    }
    
}
