package p136_Archivos5;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class procesos {
     public static void CapturarDatos(ArrayList<Persona> datos){
            try (Scanner obj = new Scanner(System.in)) {
                System.out.println("\nIntroduce los datos de una persona (nombre vacio para terminar)");
                while (true) {
                    Persona persona = new Persona();
                    System.out.println("datos de la persona");
                    System.out.print("Nombre  :");persona.setNombre(obj .nextLine());
                    if (persona.getNombre().isEmpty()) break; 
                    System.out.print("Edad    :");persona.setEdad(obj .nextInt());
                    System.out.print("peso    :");persona.setPeso(obj .nextDouble()); obj .nextLine();
                    System.out.print("correo  :");persona.setCorreo(obj .nextLine());
                    
                    datos.add(persona);
   
                    
                    
                }
            }
            
    }
    
        public static void mostrarDatos(ArrayList<Persona> datos){
            System.out.println("\nlos datos de momento son ");
            for (Persona persona : datos) {
                System.out.println(persona);
            }
    
        }
        public static void grabarDatos(String archivo, ArrayList<Persona> datos) throws IOException {
            FileOutputStream arch = new FileOutputStream(archivo);
            ObjectOutputStream fdatos = new ObjectOutputStream(arch);
            fdatos.writeObject(datos);
            fdatos.close();
                    
                
    
        }
        @SuppressWarnings("unchecked")
        public static ArrayList<Persona> leerDatos(String archivo) throws IOException,
            ClassNotFoundException {
            ArrayList<Persona> datos = new ArrayList<>();
            FileInputStream arch = new FileInputStream(archivo);
            ObjectInputStream fdatos = new ObjectInputStream(arch);
            datos = (ArrayList<Persona>) fdatos.readObject();
            fdatos.close();
            return datos;
            }
}
