/*
 * p90_Temperaturas
 */

import java.util.Scanner;

public class p90_Temperaturas {
    
    public static double calcularSuma(int[] arreglo) {
        double suma = 0;
        for (int num : arreglo) {
            suma += num;
        }
        return suma;
    }
    public static double calcularPromedio(int[] arreglo) {
        double suma = calcularSuma(arreglo);
        return suma / arreglo.length;
    }
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de elementos: ");
        int n = scanner.nextInt();
        int[] arreglo = new int[n];
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
        arreglo[i] = scanner.nextInt();   
    }
    double suma = calcularSuma(arreglo);
        double promedio = calcularPromedio(arreglo);

        // Mostrar resultados
        System.out.println("La suma de los elementos es: " + suma);
        System.out.println("El promedio de los elementos es: " + promedio);
        
        scanner.close();
    }
}
