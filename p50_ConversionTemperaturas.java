/**
 * p50_ConversionTemperaturas -Se desea calcular la temperatura convertida de grados centígrados a grados farenheit
 */
import java.util.Scanner;
public class p50_ConversionTemperaturas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String continuar = "S";

        while (continuar.equalsIgnoreCase("S")) {
            System.out.print("Primera Temperatura (°C): ");
            int tempInicial = scanner.nextInt();
            System.out.print("Temperatura Final (°C): ");
            int tempFinal = scanner.nextInt();

            if (tempFinal < tempInicial) {
                System.out.println("Error: La temperatura final no puede ser menor que la temperatura inicial, Suerte para la proxima");
                continue;
            }

            System.out.println("------------------------------------");
            System.out.println("Centígrados   |  Farenheit");
            System.out.println("------------------------------------");

            for (int celsius = tempInicial; celsius <= tempFinal; celsius++) {
                double fahrenheit = (celsius * 9.0 / 5.0) + 32;
                System.out.printf("%d            |  %.1f%n", celsius, fahrenheit);
            }
            System.out.println("------------------------------------");
            System.out.print("¿Deseas continuar (S/N)? ");
            continuar = scanner.next();
        }

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}