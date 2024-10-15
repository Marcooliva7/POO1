package p107_Forma;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Circulo c1 = new Circulo("Rojo",10.22);
        Triangulo t1 = new Triangulo("Azul", 10, 20);

        ArrayList<Forma> formas = new ArrayList<>();

        System.out.print("\033[H\033[2J");
        System.out.println("Circulo");
        System.out.println(c1);

        System.out.println("Triangulo");
        System.out.println(t1);

        formas.add(c1);
        formas.add(t1);
        formas.add(new Circulo("Cafe", 45.50));
        formas.add(new Triangulo("Purpura", 100, 300));

        System.out.println("\nLas formas dentro del arreglo:");
        for (Forma forma : formas){
            System.out.println(forma);
        }
    }
    
}

