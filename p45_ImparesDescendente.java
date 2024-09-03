/**
 * p45_ImparesDescendente - 
 */
import java.util.Scanner;

public class p45_ImparesDescendente {
public static void main(String[] args) {
    int c, n, s;
    char resp;
    Scanner obj = new Scanner(System.in);

    do {
        System.out.print("\033^[H\033[2J"); System.out.flush();

        n = s = 0;
        System.out.println("\nImprime impares de forma decendentede 2 hasta 1\n");
        System.out.print("Desde donde deseas iniciar ");
        n = obj.nextInt();
        //if(n % 2== 0) n++;
        c = ( n%2==0 ? ++n : n) ;
        while (c >=1){
            System.out.printf("%d ", c);
            s += c;
            c -= 2;
        }
        System.out.printf("\nLa suma de los pares hasta %d es %d", n, s);

        System.out.printf("\nDeseas continuar (S/N) ? "); resp =Character.toUpperCase(obj.next().charAt(0));
    } while (resp != 'N');
    System.out.println("\nProcesos terminado");
    }
}