/*
 * p85_NombresEdades - Leer una serie de nombres y edades en dos arreglos
 */
import java.util.Scanner;
public class p85_NombresEdades {
    public static void main(String[] args) {
        int n=0, s=0, p=0;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.println("Cuantos elementos deseas procesar ? "); n = obj.nextInt();

        String[] nombres = new String[n];
        int[] edades =new int[n];  

        System.out.println("Dame los nombres y las edades dde los " + n + "elementos");
        for(int i=0; i < n ; i++) {
            obj.nextLine();
            System.out.print("Nombre     = "); nombres[i] = obj.nextLine();
            System.out.print("Edad       = "); edades[i] = obj.nextInt();
        }
        System.out.println("Los nombres y edades capturados son:");
        for( int i=0; i < n ; i++) {
            System.out.println(nombres[i] + " - " + edades[i]);
            s = s + edades[i];
        }
        p = s / n;
        System.out.println("\nEl promedio de edades es " + p);
    }
}
