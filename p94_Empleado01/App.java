package p94_Empleado01;

//Programa principal

public class App {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado(); // Intanciar 
        Empleado empleado2 = new Empleado(); // Intanciar 

        empleado1.Nombre = "Juan Perez";
        empleado1.Edad   = 45;
        empleado2.Nombre = "Maria lopez";
        empleado2.Edad   = 25;

        Empleado empleado3;
        empleado3 = new Empleado();
        empleado3.Nombre = "Pedro navajas";
        empleado3.Edad   = 57;




        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("Empleado 1 nombre:" + empleado1.Nombre);
        System.out.println("Empleado 1 Edad:" + empleado1.Edad);
        System.out.println(empleado1.toString()); // Invicar metodo toString() del objeto
        System.out.println("Empleado 2 nombre:" + empleado2.Nombre);
        System.out.println("Empleado 2 Edad:" + empleado2.Edad);
        System.out.println(empleado2.toString()); // Invicar metodo toString() del objeto
        System.out.println("\nEmpleado3:");
        System.out.println(empleado3.toString()); // Invicar metodo toString() del objeto






    }


    
}
