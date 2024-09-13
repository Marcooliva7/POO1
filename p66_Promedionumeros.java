//p66_PromedioNumeros - Calcula el promedio de tres números usando una función

import java.util.Scanner;
public class p66_Promedionumeros {
    public static float Promedio(float n1, float n2, float n3) {
        float suma, prom;
        suma = n1 + n2 + n3;
        prom = suma/3;
        return prom;
    }
    
public static void main(String[] args) {
    System.out.print("\033[H\033[2J"); System.out.flush();
    Scanner obj = new Scanner(System.in);
    System.out.println("Dados 3 numeros flotantes, obtener su promedio");

    System.out.println("Dame numero 1:"); Float n1 = obj.nextFloat();
    System.out.println("Dame numero 2:"); Float n2 = obj.nextFloat();
    System.out.println("Dame numero 3:"); Float n3 = obj.nextFloat();

    float prom = Promedio(n1, n2, n3);
    System.out.println("El promedio es: " + prom);

    //System.out.println("El promedio es: " + Promedio(10, 10, 10));
}
}