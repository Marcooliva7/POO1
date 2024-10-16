package p113_SegundoExamenParcial;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private String liga;
    private ArrayList<Jugador> jugadores;

    public Equipo() {
        this.jugadores = new ArrayList<>();
    }

    public Equipo(String nombre, String liga) {
        this.nombre = nombre;
        this.liga = liga;
        this.jugadores = new ArrayList<>();
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }
    
    public double getTotalBono() {
        double totalBono = 0;
        for ( Jugador jugador : jugadores){
            totalBono += jugador.getBono();
        }
        return totalBono;
    }

    public double getTotal() {
        double total = 0;
        for (Jugador jugador : jugadores) {
            total += jugador.getTotal();
        }
        return total;
    }

    public int getTotalH() {
        int totalHombres = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.getSexo() == 'M') {
                totalHombres++;
            }
        }
        return totalHombres;
    }

    public int getTotalM() {
        int totalMujeres = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.getSexo() == 'F') {
                totalMujeres++;
            }
        }
        return totalMujeres;
    }

    public void reporte() {
        System.out.println(this); // Imprime la información del equipo
        for (Jugador jugador : jugadores) {
            System.out.println("- " + jugador);
        }
    }
    

    @Override
    public String toString() {
        return "Equipo [nombre=" + nombre + ", liga=" + liga + ", jugadores=" + jugadores + ", getJugadores()="
                + getJugadores() + ", getTotalBono()=" + getTotalBono() + ", getTotal()=" + getTotal()
                + ", getTotalH()=" + getTotalH() + ", getTotalM()=" + getTotalM() + "]";
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }
}
