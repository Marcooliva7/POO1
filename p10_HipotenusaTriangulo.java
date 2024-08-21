// Hipotenusa de un triangulo

import java.util.Scanner;

public class p10_HipotenusaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new
        Scanner(System.in);

        System.out.print("Cuanto mide cateto1 ");
        double cateto1 =
        scanner.nextDouble();
        System.out.print("Cuanto mide cateto2");
        double cateto2 =
        scanner.nextDouble();

        double hipotenusa =
        Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2));

        System.out.println("La hipotenusa es: " + hipotenusa);
        }
    }
