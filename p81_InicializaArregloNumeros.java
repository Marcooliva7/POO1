/*
 * p81_InicializaArregloNumeros - Inicializar un arreglo numerico con arrglos flotantes 
 */

public class p81_InicializaArregloNumeros {
    public static void main(String[] args) {

        double[] nums = new double[7];

        nums[0] =5.0;
        nums[1] =10.0;
        nums[2] =15.5;
        nums[3] =20.5;
        nums[4] =25.0;
        nums[5] =100.22;
        nums[6] =90.0;
        //  nums[7] = 100; // No existe posicion 7 

        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("Primer elemento " + nums[0]);
        System.out.println("Ultimo elemento " + nums[6]);
        //System.out.println("otro " + nums[7]); // No es posible, fuera de rango

        System.out.println("Todos los elementosdel arreglo con un for en base al indice");
        for(int i=0; i<nums.length; i ++)
            System.out.print(nums[i] + " ");

         System.out.println("\nTodos los elementosdel arreglo con un for sin indice");
        for(double i : nums)
            System.out.print(i + " ");

            System.out.println("\n\nTodo ha terminado...");

    }
}
