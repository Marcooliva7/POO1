package p113_SegundoExamenParcial;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Equipo miequipo = new Equipo("Mexa", "Torneo la Bombonera");
        miequipo.reporte();
        miequipo.agregarJugador(new JugadorEntrenador("Juanito pistolas", 'H', "Entrenador Principal", 1000, 8,1));
        miequipo.agregarJugador(new JugadorEntrenador("Pedro Navajas", 'H', "Entrenador de Apoyo", 900, 10,2));
        miequipo.agregarJugador(new JugadorActivo("El tri",'H',"Principal No 11",100,2,2));
        miequipo.agregarJugador(new JugadorActivo("La borre",'H',"Principal No 16",100,3,1));
        miequipo.agregarJugador(new JugadorActivo("Sam",'M',"Principal No 21",100,3,3));
        miequipo.agregarJugador(new JugadorActivo("Shoraaa",'H',"Banca No 10",520,5,13));
        miequipo.agregarJugador(new JugadorActivo("La bolsa",'H',"Banca No 15",150,4,4));
        miequipo.agregarJugador(new JugadorActivo("EL cuaz",'M',"Banca No 20",350,5,3));
        miequipo.agregarJugador(new JugadorActivo("La mis",'M',"Principal No 12",550,5,5));
        miequipo.agregarJugador(new JugadorActivo("Mar",'M',"Principal No 12",600,4,2));
        miequipo.agregarJugador(new JugadorActivo("Yimbooo",'M',"Principal No 12",700,5,3));
        miequipo.reporte();
        }
}
