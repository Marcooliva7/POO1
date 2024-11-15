package p136_Archivos5;

import java.util.Scanner;
import java.util.ArrayList;;

public class App {

   
        public static void main(String[] args) {
            int op;
            try (Scanner obj = new Scanner(System.in)) {
                String Archivo = "datos.dat";
                ArrayList<Persona> datos = new ArrayList<>();
   
                
   
                do {
                    System.out.print("\033[H\033[2J");
                    System.out.println("-------------Procesamiento de datos-----------------");
                    System.out.println("Captura de datos------------------[1]");
                    System.out.println("Grabar datos en archivo-----------[2]");
                    System.out.println("Leer datos en archivo-------------[3]");
                    System.out.println("Mostrar datos---------------------[4]");
                    System.out.println("SALIR-----------------------------[5]");
                    System.out.println("Seleciona una opcion ?"); op = obj.nextInt();
   
                    switch (op) {
                        case 1:
                            if (datos.size()==0) System.out.println("capturando datos por primera vez");
                            else System.out.println("los datos capturados se agregan al final de los existentes");
                            procesos.CapturarDatos(datos);
                        
                         break;
                        case 2:
                            try {
                                if (datos.size()!=0) {
                                    procesos.grabarDatos(Archivo, datos);
                                    System.out.println("datos grabados correctamente ");
                                }else System.out.println("No hay datos para grabar ");
                            } catch (Exception e) {
                                System.out.println("Error al grabar los datos en el archivo");
                            }
                         break;
                        
                        case 3:
                            try {
                                if(datos.size()!=0) System.out.println("los datos que se leen, sobre escriben a los archivos actuales");
                                datos = procesos.leerDatos(Archivo);
                                System.out.println("datos cargados correctamente");
                            } catch (Exception e) {
                                System.out.println("error al cargar los datos");
                            }
                         break;

                        case 4:
                            if (datos.size()==0) 
                                System.out.println("\nNo hay datos para mostrar");
                            else procesos.mostrarDatos(datos);
                            
                         break;

                  
      
                    default:
                        System.out.println("\nOpcion invalida");
                        break;
                }
      


                System.out.println("\n\n Presiones cualquier tecla para continuar "); obj.nextLine();obj.nextLine();

       } while (op!=5);
            }

    }
}
