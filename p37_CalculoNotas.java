import java.util.Scanner;

public class p37_CalculoNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumaCalificaciones = 0;

        System.out.println("Ingrese las calificaciones:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Calificación " + i + ": ");
            double calificacion = scanner.nextDouble();

            if (calificacion < 0 || calificacion > 10) {
                System.out.println("Error: La calificación debe estar entre 0 y 10.");
                scanner.close();
                return;
            }
            sumaCalificaciones += calificacion;
        }

        double promedio = sumaCalificaciones / 5;

        System.out.println("\nPromedio de las calificaciones: " + promedio);

        if (promedio > 0 && promedio <= 6) {
            System.out.println("REPROBADOOOO!!!");
        } else if (promedio > 6 && promedio <= 7) {
            System.out.println("Panzasteeee!!!");
        } else if (promedio > 7 && promedio <= 8) {
            System.out.println("Esta bien, pero pueder estar mejor");
        } else if (promedio > 8 && promedio <= 9) {
            System.out.println("Excelenteee");
        } else if (promedio > 9 && promedio <= 10) {
            System.out.println("MUCHOOO MUY BIEEEEEEN SIGUE ASI !!!!");
        } else {
            System.out.println("Error: El promedio debe estar entre 0 y 10.");
        }

        scanner.close();
    }
}
