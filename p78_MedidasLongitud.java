/*
 * p78_MedidasLongitud - convierta pulgadas a centímetros y metros a pies 
 */
import java.util.Scanner;
public class p78_MedidasLongitud {
    public static double pulgadasACentimetros(double pulgadas) {
        return pulgadas * 2.54;
    }

    public static double metrosAPies(double metros) {
        return metros * 3.281;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); 
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de Conversión:");
            System.out.println("1. Convierte pulgadas a centímetros");
            System.out.println("2. Convierte metros a pies");
            System.out.println("3. Salir");
            System.out.print("Que opcion quieres convertir ?: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce la cantidad en pulgadas: ");
                    double pulgadas = scanner.nextDouble();
                    double centimetros = pulgadasACentimetros(pulgadas);
                    System.out.println(pulgadas + " pulgadas son " + centimetros + " centímetros.");
                    break;

                case 2:
                    System.out.print("Introduce la cantidad en metros: ");
                    double metros = scanner.nextDouble();
                    double pies = metrosAPies(metros);
                    System.out.println(metros + " metros son " + pies + " pies.");
                    break;

                case 3:
                    System.out.println("Programa terminado, vamonos por los chilaquiles.");
                    break;

                default:
                    System.out.println("El numero que elejiste no esta en el menu, vuelve a seleccionar un numero del 1 - 3.");
                    break;
            }

            System.out.println(); 
        } while (opcion != 3);

        scanner.close();
    }
    
}
