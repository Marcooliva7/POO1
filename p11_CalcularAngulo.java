// Calcular Angulo

import java.util.Scanner;

public class p11_CalcularAngulo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese los dos primeros ángulos
        System.out.print("Ingrese el primer ángulo en grados: ");
        double angulo1 = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo ángulo en grados: ");
        double angulo2 = scanner.nextDouble();
        
        // Calcular el tercer ángulo usando la fórmula
        double angulo3 = 180 - (angulo1 + angulo2);
        
        // Mostrar el resultado
        System.out.println("El tercer ángulo del triángulo es: " + angulo3 + " grados");
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
}