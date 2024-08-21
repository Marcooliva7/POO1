// Calcular el area de un circulo

import java.util.Scanner;

public class p02_AreaCirculo ¨{
    public static void main(String[] args) {
        double radio, area;
        Scanner lradio = new Scanner(System.in);

        System.out.print("\nCalculando el area de un circulo\n");
        System.out.print("Dame el radio ? ");
        radio = lradio.nextFloat();

        area = Math.PI * Math.pow(radio, 2);

        System.out.println("El circulo de radio " + radio + " tiene un area de " + area);
        }
    }