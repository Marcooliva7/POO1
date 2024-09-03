/**
 * - p51_SerieFibonaci - Se desean imprimir los primeros n números de la será de Fibonacci. El proceso debe de poder repetirse hasta
que el usuario lo decida.
 */
import java.util.Scanner;
public class p51_SerieFibonaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "S";

        while (continuar.equalsIgnoreCase("S")) {
            System.out.print("Número de términos que deseas imprimir ?: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("El número tiene que ser mayor que 0.");
                continue;
            }
            System.out.println("Los primeros " + n + " numeros de la sucesión Fibonacci son:");
            int a = 0, b = 1;
            int count = 0;
            while (count < n) {
                System.out.print(a + " ");

                int siguiente = a + b;
                a = b;
                b = siguiente;
                
                count++;
            }

            System.out.println(); 
            System.out.print("¿Deseas continuar (S/N)? ");
            continuar = scanner.next();
        }
        System.out.println("Programa finalizado, gracias por participar.");
        scanner.close();
    }
}
