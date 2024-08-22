// Volumen del cilindro
public class p13_VolumenCilindro {
    import java.util.Scanner;

public class VolumenCilindro {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese el radio del cilindro
        System.out.print("Ingrese el radio del cilindro en centímetros: ");
        double radio = scanner.nextDouble();
        
        // Solicitar al usuario que ingrese la altura del cilindro
        System.out.print("Ingrese la altura del cilindro en centímetros: ");
        double altura = scanner.nextDouble();
        
        // Calcular el volumen del cilindro usando la fórmula
        double volumen = Math.PI * (radio * radio) * altura;
        
        // Mostrar el resultado
        System.out.printf("El volumen del cilindro es: %.2f centímetros cúbicos%n", volumen);
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
}

