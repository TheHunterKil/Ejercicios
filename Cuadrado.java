
package com.mycompany.cuadrado;
import java.util.Scanner;
public class Cuadrado {

    public static void main(String[] args) {
     System.out.println("Calculadora de cuadrado, digite un numero para digitar su cuadrado: ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
int res =a * a;
System.out.println("el cuadrado de "+ a + " es " + res);


}
}