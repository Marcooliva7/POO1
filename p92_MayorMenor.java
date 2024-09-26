/*
 * p92_MayorMenor - 
 */

import java.util.Scanner;

public class p92_MayorMenor {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de elementos: ");
        int n = scanner.nextInt();
        int[] numeros = new int[n];
        System.out.println("Ingrese los números:");
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Los números ingresados son:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println(); 
        int numeroMayor = numeros[0];
        int numeroMenor = numeros[0];

        for (int i = 1; i < n; i++) {
            if (numeros[i] > numeroMayor) {
                numeroMayor = numeros[i];
            }
            if (numeros[i] < numeroMenor) {
                numeroMenor = numeros[i];
            }
        }

        System.out.println("El número mayor es: " + numeroMayor);
        System.out.println("El número menor es: " + numeroMenor);
        scanner.close();
    }
}
