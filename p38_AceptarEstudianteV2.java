import java.util.Scanner;

public class p38_AceptarEstudianteV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.print("Sexo del estudiante (h/m): ");
        char sexo = scanner.next().toLowerCase().charAt(0);

        System.out.print("Edad del estudiante: ");
        int edad = scanner.nextInt();

        System.out.print("Primera calificación: ");
        double calificacion1 = scanner.nextDouble();
        System.out.print("Segunda calificación: ");
        double calificacion2 = scanner.nextDouble();
        System.out.print("Tercera calificación: ");
        double calificacion3 = scanner.nextDouble();

        double promedio = (calificacion1 + calificacion2 + calificacion3) / 3;

        boolean aceptado = sexo == 'm' && edad > 21 && promedio >= 8 && promedio <= 9.5;

        if (aceptado) {
            System.out.println("\nEstudiante " + nombre + " ¡FELICIDADES! fuiste aceptado en la Universidad Kitty Kat SA.");
        } else {
            System.out.println("\nEstudiante " + nombre + " ¡LO SIENTO! no fuiste aceptado en la Universidad Kitty Kat SA.");
        }

        scanner.close();
    }
}
