/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Usuario iTC
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double angulo1;
        double angulo2;
        double angulo3;
        
        System.out.println("Ingrese el primer ángulo");
        angulo1 = entrada.nextDouble();
        
        System.out.println("Ingrese el segundo ángulo");
        angulo2 = entrada.nextDouble();
        
        System.out.println("Ingrese el tercer ángulo");
        angulo3 = entrada.nextDouble();
        
    if(angulo1 == 90 || angulo2 == 90 || angulo3 == 90){
           System.out.println("El ángulo es rectángulo");   
     }else{
      if(angulo1 > 90 && angulo1 < 180 || angulo2 > 90 && angulo2 < 180
              || angulo3 > 90 && angulo3 < 180) {
             System.out.println("El ángulo es obtusángulo");
        }else{
        if(angulo1 < 90 && angulo2 < 90 && angulo3 < 90)
               System.out.println("El ángulo es acutángulo"); 
                }
     
    }
      }
    }
    

