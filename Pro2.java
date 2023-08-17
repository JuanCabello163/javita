/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pro2;
    import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Pro2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(); 
        //SUMAAAAAAA
        Scanner scanner = new Scanner(System.in);
        System.out.println("La Suma");
        System.out.print("Ingrese el primer numero: ");
        
        int numero1 = scanner.nextInt();
        
        System.out.print("INGRESE EL SEGUNDO NUMERO: ");
        
        int numero2 = scanner.nextInt();
        
        int suma = numero1 + numero2;
        System.out.println("La suma de " + numero1 + " + " + numero2 + " es: " + suma);
        
    
    }
}
