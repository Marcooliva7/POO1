/*
 * p82_InicializaArregloCadena - Inicializar un arreglo numerico con arrglos flotantes 
 */

public class p82_InicializaArregloCadena {
    public static void main(String[] args) {

        String[] muns = new String[10];

        muns[0] = "Apozol";
        muns[1] = "Apulco";
        muns[2] = "Cañitas";
        muns[3] = "Jerez";
        muns[4] = "Fresnillo";
        muns[5] = "Rio Grande";
        muns[6] = "Sain Alto";
        muns[7] = "Sombrerete";
        muns[8] = "Teul de Gonzales Ortega";
        muns[9] = "Zacatecas";

        //  muns[10] = "Atolinga"; // No existe posicion 10

        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("Primer elemento " + muns[0]);
        System.out.println("Ultimo elemento " + muns[9]);
        //System.out.println("otro " + muns[10]); // No es posible, fuera de rango

        System.out.println("Todos los elementosdel arreglo con un for en base al indice");
        for(int i=0; i<muns.length; i ++)
            System.out.print(muns[i] + ", ");

         System.out.println("\nTodos los elementosdel arreglo con un for sin indice");
        for(String m : muns)
            System.out.print(m + " ");

            System.out.println("\n\nTodo ha terminado...");
    }
}
