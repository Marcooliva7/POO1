// Calcular Angulo

import java.util.Scanner;

public class p11_CalcularAngulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer ángulo en grados: ");
        double angulo1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo ángulo en grados: ");
        double angulo2 = scanner.nextDouble();
        double angulo3 = 180 - (angulo1 + angulo2);
        System.out.println("El tercer ángulo del triángulo es: " + angulo3 + " grados");
        scanner.close();
    }
}