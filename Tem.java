

package com.mycompany.tem;
import java.util.Scanner;

public class Tem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora de grados Fahrenheit.");
        System.out.println("Ingrese un valor: ");
        int a = sc.nextInt();
        int s =(a * 9/5) + 32;
        System.out.println("El resultado en Fahrenheit es: " + s);
    }
}
