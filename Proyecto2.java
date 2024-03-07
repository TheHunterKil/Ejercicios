
package com.mycompany.suma;
import java.util.Scanner;
public class Suma {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    System.out.println("digite  numero");
    int num1 = sc.nextInt();
    System.out.println("ingrese numero: ");
    int num2 =sc.nextInt();
    int res = num1 + num2 ;
    System.out.println("La suma de "+ num1 + " y " + num2 +" es: "+ res );

    }
}
