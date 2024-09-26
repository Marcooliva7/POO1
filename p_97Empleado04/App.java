package p_97Empleado04;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        
        ArrayList<Empleado> empleados = new ArrayList<>();

        Empleado empleado1 = new Empleado("Juan perez",35, 'H', true);
        Empleado empleado2 = new Empleado("Juan perez",35, 'M', false);


    empleados.add(empleado1);
    empleados.add(empleado2);
    empleados.add( new Empleado("Dario Jimenez" , 33, 'H', false));
    empleados.add( new Empleado("Jesyca lee" , 22, 'H', false));

    System.out.print("\033[H\033[2J");System.out.flush();
    System.out.println("Todos los empleados ");
    for (Empleado empleado : empleados) {
        System.out.println(empleado.toString());
        if(empleado.getSexo()=='H') h++;
        else if(empleado.getSexo() =='M') m++;
        
        if(empleados)
    }

    }
    
}
