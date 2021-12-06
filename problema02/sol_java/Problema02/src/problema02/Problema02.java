/*
En un almacén de venta de trajes, si se compra uno se hace el 20% de descuento, 
si se compran 2, el 25%, si se compran 3, el 40%, y si compra más de 3, el 50%. 
Elaborar un algoritmo que lea la cantidad de trajes y el precio unitario (todos 
tienen el mismo precio) e imprima el subtotal por pagar, el descuento y el total 
por pagar.
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Usuario iTC
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int precioT;
        int numeroT;
        double porcentaje1 = 20 ;
        double porcentaje2 = 25 ;
        double porcentaje3 = 40 ;
        double porcentaje4 = 50 ;
        double descuento;
        double valorSub;
        double valorTot;
        
        System.out.println("Ingrese el numero de trajes a comprar");
        numeroT = entrada.nextInt();
        System.out.println("Ingrese el precio de los trajes a comprar");
        precioT = entrada.nextInt();
        valorSub = precioT * numeroT ; 
        valorTot = precioT * numeroT ;
        descuento = 0;
        
        if (numeroT == 1) {
            descuento = ( porcentaje1 * valorTot)/100 ; 
            valorTot = valorTot - descuento;
        } else {
            if (numeroT == 2) {
            descuento = ( porcentaje2 * valorTot)/100 ; 
            valorTot = valorTot - descuento;
        } else {
                if (numeroT == 3) {
            descuento = ( porcentaje3 * valorTot)/100 ; 
            valorTot = valorTot - descuento;
        } else {
                    if (numeroT > 3) {
            descuento = ( porcentaje4 * valorTot)/100 ; 
            valorTot = valorTot - descuento;
        } else {
                }
            }
        }
        }  
        System.out.println("El valor total a pagar es: " + valorTot);
        System.out.println("El valor del descuento es: " + descuento);
        System.out.println("El valor subtotal a pagar es: " + valorSub);
    }
    
}
