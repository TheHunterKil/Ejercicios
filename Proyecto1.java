
package com.mycompany.proyecto1;
import java.util.Scanner;
public class Proyecto1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        int option;
        boolean keepGoing = true;

        while (keepGoing) {
            System.out.println("Bienvenido a la Calculadora Sencilla");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Por favor, elige una opción: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Eso no es un número válido. Inténtalo de nuevo.");
                scanner.next(); // descarta la entrada incorrecta
            }
            option = scanner.nextInt();

            if (option == 5) {
                keepGoing = false;
                System.out.println("Gracias por usar la calculadora. Adiós!");
                continue;
            }

            System.out.print("Ingresa el primer número: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Eso no es un número. Inténtalo de nuevo.");
                scanner.next(); // descarta la entrada incorrecta
            }
            num1 = scanner.nextDouble();

            System.out.print("Ingresa el segundo número: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Eso no es un número. Inténtalo de nuevo.");
                scanner.next(); // descarta la entrada incorrecta
            }
            num2 = scanner.nextDouble();

            switch (option) {
                case 1:
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("No se puede dividir por cero.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción entre 1 y 5.");
            }
        }
        scanner.close();
      
    }
}
