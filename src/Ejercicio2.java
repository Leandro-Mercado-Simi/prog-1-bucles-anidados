/*
Leer un número N y calcular el factorial de los números desde 0 hasta N.
*/

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero = 0;
        int factorial = 0;
        System.out.print("Ingrese un número: ");
        numero = s.nextInt();

        if (numero > 0) {
            for (int i = 0; i <= numero; i++) {
                factorial = 1;
                for (int j = 1; j <= i; j++) {
                    factorial = factorial * j;
                }
                System.out.println(i + "! = " + factorial);
            }
        } else {
            System.out.println("No se puede calcular");
        }

    }
}
