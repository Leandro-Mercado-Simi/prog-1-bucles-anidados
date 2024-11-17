/*
Leer un número N y calcular la suma de los factoriales de los números desde 0 hasta N.
*/

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = 0;
        int factorial = 0;
        int suma = 0;

        System.out.print("Ingrese un número: ");
        num = s.nextInt();

        if (num > 0) {
            for (int i = 0; i <= num; i++) {
                factorial = 1;
                for (int j = 1; j <= i; j++) {
                    factorial = factorial * j;
                }
                System.out.println(i + "! = " + factorial);

                suma = suma + factorial;
            }

            System.out.println("Suma de los factoriales desde 0 hasta " + num + ": " + suma);
        } else {
            System.out.println("No se puede calcular");
        }

    }
}
