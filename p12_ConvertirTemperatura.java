// Convertir Temepratura
import java.util.Scanner;

public class p12_ConvertirTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) * (5.0 / 9.0);
        
        // Resultado
        System.out.printf("La temperatura en grados Celsius es: %.2f%n", celsius);
        
        scanner.close();
    }
}
