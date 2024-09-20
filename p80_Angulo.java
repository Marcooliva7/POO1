/*
 * p80_Angulo - Refresa el tipo de angulo
 * segun: < 90 agudo, = 90 recto, >90 y <180 obtuso, = 180 llano,  > 180 y < 360 concavo
 */
import java.util.Scanner;
public class p80_Angulo {
    public static String clasificarAngulo(double angulo) {
        if (angulo < 90) {
            return "Agudo";
        } else if (angulo == 90) {
            return "Recto";
        } else if (angulo > 90 && angulo < 180) {
            return "Obtuso";
        } else if (angulo == 180) {
            return "Llano";
        } else if (angulo > 180 && angulo < 360) {
            return "Cóncavo";
        } else {
            return "Ángulo inválido"; 
        }
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); 
        Scanner scanner = new Scanner(System.in);
        double angulo;

        System.out.print("Introduce un ángulo entre 0 y 360 grados: ");
        angulo = scanner.nextDouble();

        if (angulo >= 0 && angulo <= 360) {
            String tipo = clasificarAngulo(angulo);
            System.out.println("El ángulo es: " + tipo);
        } else {
            System.out.println("Este angulo no existe. Debe estar entre 0 y 360 grados.");
        }

        scanner.close();
    }
}

