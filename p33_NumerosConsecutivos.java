// Verificar si los numeros son consecutivos
import java.util.Scanner;
public class p33_NumerosConsecutivos {

public static void main(String[] args) {

        Scanner scanner = new
Scanner(System.in);
    System.out.println("Dame el primer numero:");
    int num1 = scanner.nextInt();

    System.out.println("Dame el segundo numero:");
    int num2 = scanner.nextInt();
   
    System.out.println("Dame el tercer numero:");
    int num3 = scanner.nextInt();

    if ((num2 == num1 + 1) && (num3 == num2 + 1)) {
            System.out.println("Los numeros si son consecutivos.");
    }
        else {
            System.out.println("Los numeros que ingresaste no son consecutivos.");

           }
        }
}

   

