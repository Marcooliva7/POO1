package p147_TercerExamenParcial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Util {
    public static ArrayList<Jugador> inicializarDatos() {
        ArrayList<Jugador> datos = new ArrayList<>();
        datos.add(new Jugador("Shora", 21, 'H', "Soltero", "Delantero", 10234));
        datos.add(new Jugador("El bichooo", 30, 'H', "Casao", "Dt", 12334440));
        return datos;

    }

     public static void grabarDatos(String archivo, ArrayList<Jugador> datos ) throws IOException{
        ObjectOutputStream fdatos = new ObjectOutputStream(new FileOutputStream(archivo));
        fdatos.writeObject(datos);
        fdatos.close();
    }

    @SuppressWarnings("unchecked")
    public static ArrayList<Jugador> leerDatos(String archivo) throws IOException, ClassNotFoundException{
        ArrayList<Jugador> datos = new ArrayList<>();
        ObjectInputStream fdatos = new ObjectInputStream(new FileInputStream(archivo));
        datos = (ArrayList<Jugador>) fdatos.readObject();
        fdatos.close();
        return datos;
    }
}
