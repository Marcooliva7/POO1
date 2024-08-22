import java.util.Scanner;

public class p15_ConvertirADolares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad en pesos: ");
        double cantidadPesos = scanner.nextDouble();
        System.out.print("Ingrese la cotización del dólar (en pesos por dólar): ");
        double cotizacionDolar = scanner.nextDouble();
        double equivalenteDolares = cantidadPesos / cotizacionDolar;
        System.out.printf("El equivalente en dólares es: %.2f dólares%n", equivalenteDolares);
        scanner.close();
    }
}