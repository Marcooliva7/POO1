/**
 * p53_NumerosNa1 - Imprime numeros de 100 a 1 en decrementos de n 
 */
import java.util.Scanner;

public class p53_NumerosNa1 {
    public static void main(String[] args) {
        int j,n,p;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033^[H\033[2J");System.out.flush();
        System.out.println("Imprime los numeros de n a 1 usando for:\n");
        System.out.print("Desde donde deseas decender ? "); n = obj.nextInt();
        System.out.print("En decrementos de            ? "); p = obj.nextInt();

        for(j=n; j >= 1; j-=p)
            System.out.print(j + " ");

System.out.println("\n El proceso ha terminado");

    }
}
