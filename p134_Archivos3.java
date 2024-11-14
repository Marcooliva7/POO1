// Utiliza

import java.io.*;
import java.util.Arraylist;

public class p134_Archivos3 {
    public static void main(String[] args) {
        File arch = new File("ciudades.txt");

        if (arch.exists());{
            try {
            BufferedReader fciudades = new BufferedReader(new FileReader(arch));
            int nolineas = (int) fciudades.lines().count();
            System.out.println("El archivo tiene " + nolineas + " lineas");

            String [] ciudades = new String[nolineas];
        
            for (int i=0; i<nolineas i++) {
                ciudades(i) = fciudades.reaadLine();
            }
            fciudades.close();

            for (String ciudad : ciudades ) {
                System.out.println(ciudad);
            }

                 } catch (Exception e) {
                  //ODO: handle exception
                }
            } 
        }
    }
