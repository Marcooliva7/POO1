// Enviar un saludo a la pantalla

public class p01_Holamundo {
    public static void main(String[] args) {
        String amigo = "Antonio";
        String hermano = "Fer";
        String mensaje = String.format("Tanto %s como %s desean aprender java",amigo,hermano);

        System.out.println("Hola Mundo en el Lenguaje Java");
        System.out.println("\nHola amigo " + amigo + " bienvenido a java");
        System.out.println("\nMi amigo es " + amigo + " mi hermano es " + hermano);
        System.out.println("\n" + mensaje);
        }
    }
