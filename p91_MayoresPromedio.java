/*
 * p91_MayoresPromedio - 
 */

import java.util.Scanner;

public class p91_MayoresPromedio {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de calificaciones: ");
        int n = scanner.nextInt();
        float[] calificaciones = new float[n];

        System.out.println("Ingrese las calificaciones:");
        for (int i = 0; i < n; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextFloat();
        }

        System.out.println("Las calificaciones son:");
        for (float calificacion : calificaciones) {
            System.out.print(calificacion + " ");
        }
        System.out.println(); 

        float suma = 0;
        for (float calificacion : calificaciones) {
            suma += calificacion;
        }
        float promedio = suma / n;
        System.out.println("La suma de las calificaciones es: " + suma);
        System.out.println("El promedio de las calificaciones es: " + promedio);

        System.out.println("Calificaciones mayores al promedio:");
        int contador = 0;
        for (float calificacion : calificaciones) {
            if (calificacion > promedio) {
                System.out.print(calificacion + " ");
                contador++;
            }
        }
        System.out.println(); 
        System.out.println("Número de calificaciones mayores al promedio: " + contador);

        scanner.close();
    }
}
