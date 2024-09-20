/*
 * p79_SumaMultiplos - 
 */

import java.util.Scanner;

public class p79_SumaMultiplos {
    public static int sumaMultiplos(int ini, int fin, int constante) {
        int suma = 0;
        for (int i = ini; i <= fin; i++) {
            if (i % constante == 0) {
                suma += i;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); 
        int ini, fin, constante;

        do {
            // Mostrar menú
            System.out.println("Menú de Suma de Múltiplos:");
            System.out.println("1. Sumar múltiplos de 3 en un rango");
            System.out.println("2. Sumar múltiplos de 4 en un rango");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el límite inferior del rango: ");
                    ini = scanner.nextInt();
                    System.out.print("Introduce el límite superior del rango: ");
                    fin = scanner.nextInt();
                    if (ini < fin) {
                        int resultado = sumaMultiplos(ini, fin, 3);
                        System.out.println("La suma de múltiplos de 3 entre " + ini + " y " + fin + " es: " + resultado);
                    } else {
                        System.out.println("El rango no es válido. Asegúrate de que ini < fin.");
                    }
                    break;

                case 2:
                    System.out.print("Introduce el límite inferior del rango: ");
                    ini = scanner.nextInt();
                    System.out.print("Introduce el límite superior del rango: ");
                    fin = scanner.nextInt();
                    if (ini < fin) {
                        int resultado = sumaMultiplos(ini, fin, 4);
                        System.out.println("La suma de múltiplos de 4 entre " + ini + " y " + fin + " es: " + resultado);
                    } else {
                        System.out.println("El rango no es válido. Asegúrate de que ini < fin.");
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del programa.");
                    break;

            }

            System.out.println();
        } while (true);
        

    }
}
