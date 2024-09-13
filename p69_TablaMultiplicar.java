//p69_TablaMultiplicar - 

import java.util.Scanner;

public class p69_TablaMultiplicar {
    public static void tabla(int tabla, int limite){
        for(int i=1; i <=limite; i++)
            System.out.printf("%d x %d = %d\n", tabla, i, tabla*i);
            System.out.println();
        
    }


        public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.print("Que tabla quieres? "); int tabla = obj.nextInt();
        System.out.print("Hasta donde      ? "); int limite = obj.nextInt();

        tabla(tabla, limite);

        //tabla(3,5);
        //tabla(2,4);
        //tabla(99,2);
    }
}