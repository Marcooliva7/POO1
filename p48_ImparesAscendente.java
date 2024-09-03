/**
 * - p48_ImparesAscendente- Se desea imprimir los números impares de forma ascendente desde 1 hasta el número que el usuario decida (n).
 */
import java.util.Scanner;
public class p48_ImparesAscendente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "S";

while (continuar.equalsIgnoreCase("S")) {
            System.out.print("Ingrese un número (n): ");
            int n = scanner.nextInt();
            int suma = 0;
            int conteo = 0;
            int numero = 1;

            StringBuilder numerosImpares = new StringBuilder();
            while (numero <= n) {
                numerosImpares.append(numero).append(" ");
                suma += numero;
                conteo++;
                numero += 2; 
            }
            System.out.println("Números impares entre 1 y " + n + ": " + numerosImpares.toString().trim());
            System.out.println("La suma: " + suma);
            double promedio = conteo > 0 ? (double) suma / conteo : 0;
            System.out.println("El promedio: " + promedio);

            System.out.print("¿Deseas continuar (S/N)? ");
            continuar = scanner.next();
        }

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}