/*
 * p76_NumeroMenor - Encuentra el numero menor de cuatro numeros 
 */
import java.util.Scanner;
public class p76_NumeroMenor {
    public static int encontrarNumeroMenor() {
        Scanner scanner = new Scanner(System.in);
        int menor = Integer.MAX_VALUE; 

        for (int i = 0; i < 4; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            if (numero < menor) {
                menor = numero; 
            }
        }

        return menor; 
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); 
        int menorNumero = encontrarNumeroMenor();
        System.out.println("El Numero menor  es: " + menorNumero);
    }
}
    
