/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema09;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Problema09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int c1 = 12;
        int c2 = 11;
        int limite;
        int c3 = 0;
        int contador = 1;
        
        System.out.println("Ingrese el número de términos a presentar");
        limite = entrada.nextInt();
        
        while(contador <= limite){
          if(contador % 2 == 0){
            c3 = c3 + c1;
        }else{
          if(contador % 2 == 1)    
            c3 = c1 - c2;
          }           
            c1 = c1 + 12;
            c2 = c2 + 11;
            
      System.out.printf("El resultado de los %s primeros términos es: %s\n", contador
                                                                         , c3);
            
            contador = contador + 1;
    
    }
   
    
    }
    
}
