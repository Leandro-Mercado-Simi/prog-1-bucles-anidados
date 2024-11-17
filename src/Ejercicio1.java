/*
Mostrar los números perfectos entre 1 y 1000.
*/

public class Ejercicio1 {
    public static void main(String[] args) {
        int suma, contador = 1;
        System.out.println("---------------------------------");
        System.out.println("Números perfectos entre 1 y 1000");

        do {
            suma = 0;
            for (int i = 1; i < contador; i++) {
                if (contador % i == 0) {
                    suma = suma + i;
                }
            }
            if (contador == suma) {
                System.out.println(contador);
            }
            contador++;
        } while (contador != 1000);

        System.out.println("---------------------------------");

    }
}
