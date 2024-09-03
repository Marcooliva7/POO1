/**
 * p39_Numeros1a100 - Imprimir numeros del 1-100 con While
 */
import java.util.Scanner;

public class p39_Numeros1a100 {
public static void main(String[] args) {
    System.out.println("\033^[H\033[2J"); System.out.flush();

    System.out.println("Imprimiendo los numeros de 0 a n");
    System.out.print("Hasta donde        ?"); int n = new Scanner(System.in).nextInt();
    System.out.print("En incrementos de  ?"); int i = new Scanner(System.in).nextInt();

    int c = 0;
    while (c <= n) {
        System.out.printf("%d ",c);
        c = c + i ;
      }
    }
    
}