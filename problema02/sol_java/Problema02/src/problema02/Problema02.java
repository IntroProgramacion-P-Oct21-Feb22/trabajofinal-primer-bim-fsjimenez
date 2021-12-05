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
        
        int cantidadTrajes;
        double precioUnidad;
        double descuento;
        double porcentaje1 = 20;
        double porcentaje2 = 25;
        double porcentaje3 = 40;
        double porcentaje4 = 50;
        double subtotal;
        double valorTotal;
        
        System.out.println("Ingrese la cantidad de trajes a comprar:");
        cantidadTrajes = entrada.nextInt();
        
        System.out.println("Ingrese el precio por cada unidad:");
        precioUnidad = entrada.nextDouble();
        
        subtotal = cantidadTrajes * precioUnidad;
        descuento = 0;
        valorTotal = subtotal;
        
    if(cantidadTrajes == 1){
        descuento = (porcentaje1 * subtotal)/100;
        valorTotal = subtotal - descuento;                   
     }else{
      if(cantidadTrajes == 2) {
            descuento = (porcentaje2 * subtotal)/100;
            valorTotal = subtotal - descuento;
      }else{
      if(cantidadTrajes == 3) {
               descuento = (porcentaje3 * subtotal)/100;
               valorTotal = subtotal - descuento;
            }else{
            if(cantidadTrajes > 3)
                  descuento = (porcentaje4 * subtotal)/100;
                  valorTotal = subtotal - descuento;
                    }
    
    }   
    }
    
    System.out.printf("Subtotal: %s\nDescuento: %s\nCosto Total: %s\n",
            subtotal,
            descuento,
            valorTotal);  
    }
    
}
