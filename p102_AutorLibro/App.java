package p102_AutorLibro;

public class App {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        Autor autor = new Autor();
        //Se asignan de uno por uno los datos, esto se debe por el uso del constructor vacío
        libro1.setIsbn("1234567-27-32");
        libro1.setNombre("El Resplandor");
        libro1.setPrecio(450);
        autor.setNombre("Stephen King");
        autor.setEdad(77);
        autor.setCorreo("contacto@stephenking.es");
        libro1.setAutor(autor);

        System.out.print("\033[H\033[2J");
        System.out.println("Datos del libro 1: ");
        System.out.println("Isbn          : " + libro1.getIsbn());
        System.out.println("Nombre Libro  : " + libro1.getNombre());
        System.out.println("Precio        : " + libro1.getPrecio());
        System.out.println("Autor         : " + libro1.getAutor().getNombre());
        System.out.println("Edad Autor    : " + libro1.getAutor().getEdad());
        System.out.println("Correo        : " + libro1.getAutor().getCorreo());
        System.out.println("\n" + libro1.toString());

        //Aqui usamos los metodos constructores asignando valores para despues imprimirlos.
        Libro libro2 = new Libro("821-473-664", "Ready Player One", 500, new Autor("Ernest Cline", 52, "ernest@cline.com"));
        System.out.println("\nDatos del libro 2: ");
        System.out.println("Isbn          : " + libro2.getIsbn());
        System.out.println("Nombre Libro  : " + libro2.getNombre());
        System.out.println("Precio        : " + libro2.getPrecio());
        System.out.println("Autor         : " + libro2.getAutor().getNombre());
        System.out.println("Edad Autor    : " + libro2.getAutor().getEdad());
        System.out.println("Correo        : " + libro2.getAutor().getCorreo());
        System.out.println("\n" + libro2.toString());
        
    }
    
}

