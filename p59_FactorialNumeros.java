/**
 *  p59_FactorialNumeros
 */
import java.util.Scanner;

public class p59_FactorialNumeros {
    public static void main(String[] args) {
        System.out.print("\033^[H\033[2J");
        System.out.println("Hasta que numero deseas ? "); int n =new Scanner(System.in).nextInt();

        for(int i = 1; i <= n; i++){
            float f = 1;
            System.out.printf("%d! = ", i);
            for(int j = 1; j <= i; j++) {
                System.out.printf("%d %s ",j , (i==j ? "" : "*") );
                f = f * j;
            }
            System.out.printf("= %,.0f " , f);
            System.out.println();
        }
    }
}