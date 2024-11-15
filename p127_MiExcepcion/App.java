package p127_MiExcepcion;

public class App {
    public static int sumar (int a , int b) throws p127_MiExcepcion {
        if (a>100 || b>100) throw new p127_MiExcepcion("Valores fuera de rango");
            
        
        return a + b;
    }
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        try {
            System.out.println(" La suma es :" + sumar(100, 200));
            System.out.println(" La suma es :" + sumar(100, 100));

            
        } catch (p127_MiExcepcion e) {
            System.out.println(e.getMessage());
        }
    }
}
