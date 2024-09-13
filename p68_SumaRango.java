// p68_SumaRango - suma un rango de valores enteros definidos por el usuario

import java.util.Scanner;
public class p68_SumaRango {
    public static int SumaRango(float ini, float fin) {
        int suma=0;
        for(float i=ini; i <= fin ;i++)
        suma+=i;     
        return suma;}
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int suma=0, ini, fin;
        System.out.print("\033[H\033[2J"); System.out.flush();

        do{
            System.out.println("Dame el inicio :"); ini = obj.nextInt();
            System.out.println("Dame el Final :"); fin = obj.nextInt();

        }while(ini > fin);

        suma = SumaRango(ini, fin);
        System.out.println("\nLa suma del rango es: "+suma);
    }
}