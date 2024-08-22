// Volumen de un cilindro
import java.util.Scanner;

public class p13_VolumenCilindro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio del cilindro en centímetros: ");
        double radio = scanner.nextDouble();
        System.out.print("Ingrese la altura del cilindro en centímetros: ");
        double altura = scanner.nextDouble();
        double volumen = Math.PI * (radio * radio) * altura;
        System.out.printf("El volumen del cilindro es: %.2f centímetros cúbicos%n", volumen);
        scanner.close();
    }
}