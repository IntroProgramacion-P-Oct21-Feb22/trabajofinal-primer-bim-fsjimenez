/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema9;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Problema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int c1 = 0;
        int c2 = 0;
        int limite;
        int contador = 0;
        String cadena = "S1= ";
        
        System.out.println("Ingrese el número de términos a presentar");
        limite = entrada.nextInt();
        
        while( limite  > contador){
            contador = contador + 1;
            c1 = c1 + 12;
            c2 = c2 + 11;  
            cadena = cadena + c1 + " - " + c2 + " + " ;
            if (limite == contador){
                 cadena = cadena + c1 + " - " + c2  ;
            }
        }
        System.out.printf("El resultado de los %s primeros términos es: %s\n", contador
                                                                         , cadena);
    }
    
}
