/**
 * - p49_ParesDescendente -Se desea imprimir los números pares desde 100 hasta el número que el usuario decida (n).
 */
import java.util.Scanner;
public class p49_ParesDescendente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "S";

        while (continuar.equalsIgnoreCase("S")) {
            System.out.print("Ingrese un número menor a 100 : ");
            int n = scanner.nextInt();

            int suma = 0;
            int conteo = 0;
            StringBuilder numerosPares = new StringBuilder();

            int numero = 100;

            while (numero >= n) {
                if (numero % 2 == 0) {
                    numerosPares.append(numero).append(" ");
                    suma += numero;
                    conteo++;
                }
                numero--;
            }

            System.out.println("Números pares entre 100 y " + n + ": " + numerosPares.toString().trim());

            System.out.println("La suma es : " + suma);
            double promedio = conteo > 0 ? (double) suma / conteo : 0;
            System.out.println("El promedio es : " + promedio);

            System.out.print("¿Deseas continuar (S/N)? ");
            continuar = scanner.next();
        }

        System.out.println("Fin del programita, Gracias!!!!!45.");
        scanner.close();
    }
}