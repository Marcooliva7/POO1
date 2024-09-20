/*
 * p77_DiaSemana - Elije un numero y te lo evuelve con el dia de la semana correspondiente en letra
 */

import java.util.Scanner;

public class p77_DiaSemana {
    public static String obtenerDiaDeLaSemana() {
        Scanner scanner = new Scanner(System.in);
        int dia;

        while (true) {
            System.out.print("Introduce un número del 1 al 7: ");
            dia = scanner.nextInt();

            if (dia >= 1 && dia <= 7) {
                break; 
            } else {
                System.out.println("El numero que elejiste es incorrecto, vuleve a intentarlo. Elije un numero  entre 1 y 7.");
            }
        }
        switch (dia) {
            case 1:
                return "Lunes";
            case 2:
                return "Martes";
            case 3:
                return "Miércoles";
            case 4:
                return "Jueves";
            case 5:
                return "Viernes";
            case 6:
                return "Sábado";
            case 7:
                return "Domingo";
            default:
                return ""; 
        }
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); 
        String dia = obtenerDiaDeLaSemana();
        System.out.println("El día de la semana que corresponde al numero es: " + dia);
    }
}
