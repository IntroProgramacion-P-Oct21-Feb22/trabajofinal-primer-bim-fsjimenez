/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double X;
        double Y;
        
        System.out.println("Ingrese el valor de X:");
        X = entrada.nextDouble();
        
        System.out.println("Ingrese el valor de Y:");
        Y = entrada.nextDouble();
        
    if(X > 0 && Y > 0){
         System.out.println("Las coordenadas pertenecen al primer cuadrante.");              
     }else{
      if(X < 0 && Y > 0) {
            System.out.println("Las coordenadas pertenecen al segundo cuadrante.");  
        }else{
        if(X < 0 && Y < 0) {
               System.out.println("Las coordenadas pertenecen al tercer cuadrante."); 
            }else{
            if(X > 0 && Y < 0)
                  System.out.println("Las coordenadas pertenecen al cuarto cuadrante."); 
                    }   
    }   
    }
    }
    
}
