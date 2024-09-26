/*
 * p93_ParesImpares - 
 */

import java.util.Random;

public class p93_ParesImpares {
    public static void main(String[] args) {
        final int MAX = 100;
        int[] a = new int[MAX];
        int[] b = new int[MAX];              // Este arreglo no lo use utiliza, solo rellenamos el a segun la practica
        Random random = new Random();

        for (int i = 0; i < MAX; i++) {
            a[i] = random.nextInt(21); 
        }

        System.out.println("Elementos del arreglo a[]:");
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println(); 
        int cuentaPares = 0;
        int cuentaImpares = 0;

        System.out.println("Elementos pares:");
        for (int num : a) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
                cuentaPares++;
            }
        }
        System.out.println(); 
        System.out.println("Elementos impares:");
        for (int num : a) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
                cuentaImpares++;
            }
        }
        System.out.println(); 
        System.out.println("Cantidad de elementos pares: " + cuentaPares);
        System.out.println("Cantidad de elementos impares: " + cuentaImpares);
    }
}
