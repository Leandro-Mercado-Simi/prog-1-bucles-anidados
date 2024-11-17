/*
Mostrar los números primos desde 2 hasta N
*/

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = 0;
        int divisores = 0;
        System.out.print("Ingrese un número: ");
        num = s.nextInt();

        if (num > 0) {
            for (int i = 2; i <= num; i++) {
                divisores = 2;
                while (i % divisores != 0) {
                    divisores++;
                }
                if (divisores == i) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("No se puede calcular");
        }
    }
}
