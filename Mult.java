
package com.mycompany.mult;
import java.util.Scanner;
public class Mult {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número para ver su tabla de multiplicar: ");
        int n = scanner.nextInt();

        System.out.println("Tabla de multiplicar del " + n + " hasta el 10:");

        for (int i = 1; i <= 10; i++) {
            int r = n* i;
            System.out.println(n + " x " + i + " = " + r);
    }
}
