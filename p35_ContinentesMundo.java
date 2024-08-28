// Verificar si los numeros son consecutivos
import java.util.Scanner;
public class p35_ContinentesMundo {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese un número entre 1 y 6 para seleccionar un continente: ");
    int numero = scanner.nextInt();

    switch (numero) {
        case 1:
            System.out.println("Asia");
            break;
        case 2:
            System.out.println("África");
            break;
        case 3:
            System.out.println("América del Norte");
            break;
        case 4:
            System.out.println("América del Sur");
            break;
        case 5:
            System.out.println("Antártida");
            break;
        case 6:
            System.out.println("Europa");
            break;
        default:
            System.out.println("Error: El número que ingresaste no es valido, Suerte para la proxima...");
            break;
        }
    scanner.close();
    }
}