package com.mycompany.ventas;
import java.util.Scanner;

public class Ventas {
    public static void main(String[] args) {
        double ventas[] = new double[30];
        System.out.println("ingrese las ventas del mes");
        Scanner scan = new Scanner(System.in);
        
        for(int i=0; i<ventas.length;i++){
            System.out.println("Venta " +(i+1));
            ventas[i]=scan.nextDouble();
        }
        int k=0;
        int total=0;
        
        while(k<30){
            if(ventas[k]>=2000){
                System.out.println(ventas[k]);
                total++;
            }
            k++;
        }
	System.out.append("El total de la venta mayores a $2000 es: "+total);

        
        
    }
}