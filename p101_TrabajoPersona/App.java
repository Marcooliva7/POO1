package p101_TrabajoPersona;

public class App {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Trabajo trabajo = new Trabajo();
        //Aqui mandamos a imprimir los datos utilizando el metodo constructor vacio
        trabajo.setId(1);
        trabajo.setPuesto("Parrillero");
        trabajo.setSueldo(3000);
        persona1.setNombre("Rolando Hits");
        persona1.setTrabajo(trabajo);

        System.out.print("\033[H\033[2J");
        System.out.println("Datos de la persona 1: ");
        System.out.println("Nombre         : " + persona1.getNombre());
        System.out.println("Id Trabajador  : " + persona1.getTrabajo().getId());
        System.out.println("Rol            : " + persona1.getTrabajo().getPuesto());
        System.out.println("Sueldo         : " + persona1.getTrabajo().getSueldo());
        System.out.println(persona1.toString()); //Al imprimir persona1, se imprimen todos los datos en lugar de hacerlo manualmete uno x uno
 
        //Aqui se asignan los datos desde el metodo constructor
        Persona persona2 = new Persona("Club Hats", new Trabajo(2, "Beat Maker", 5000));
        System.out.println("Datos de la persona 2: ");
        System.out.println("Nombre         : " + persona2.getNombre());
        System.out.println("Id Trabajador  : " + persona2.getTrabajo().getId());
        System.out.println("Rol            : " + persona2.getTrabajo().getPuesto());
        System.out.println("Sueldo         : " + persona2.getTrabajo().getSueldo());
        System.out.println(persona2.toString());

        
        Persona persona3 = new Persona("Lyland Wayne", new Trabajo(0, "Compositor del Futuro", 10000));
        System.out.println("Datos de la persona 3: ");
        System.out.println("Nombre         : " + persona3.getNombre());
        System.out.println("Id Trabajador  : " + persona3.getTrabajo().getId());
        System.out.println("Rol            : " + persona3.getTrabajo().getPuesto());
        System.out.println("Sueldo         : " + persona3.getTrabajo().getSueldo());
        System.out.println(persona3.toString());
        
    }
}
