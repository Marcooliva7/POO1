import java.util.Scanner;

public class p36_CompraPizza {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int PRECIO_CHICA = 5;
        final int PRECIO_MEDIANA = 10;
        final int PRECIO_GRANDE = 20;

        System.out.println("Selecciona el tamaño de la pizza que desé:");
        System.out.println("1. Chica ($5)");
        System.out.println("2. Mediana ($10)");
        System.out.println("3. Grande ($20)");
        System.out.print("Ingrese el número correspondiente al tamaño: ");
        int tamaño = scanner.nextInt();

        int precioPizza = 0;
        switch (tamaño) {
            case 1:
                precioPizza = PRECIO_CHICA;
                break;
            case 2:
                precioPizza = PRECIO_MEDIANA;
                break;
            case 3:
                precioPizza = PRECIO_GRANDE;
                break;
            default:
                System.out.println("La opcion que ingresaste no es correcta, vuelve a elejir.");
                scanner.close();
                return;
            }

            System.out.print("Ingrese la cantidad de pizzas: ");
            int cantidad = scanner.nextInt();
    
            double totalCompra = precioPizza * cantidad;
    
            double descuento = 0;
            if (totalCompra > 200) {
                descuento = totalCompra * 0.15;  // 15% de descuento
            }
    
            double totalConDescuento = totalCompra - descuento;
            System.out.println("\nDetalles de la compra:");
            System.out.println("Tamaño de la pizza: " + (tamaño == 1 ? "Chica" : (tamaño == 2 ? "Mediana" : "Grande")));
            System.out.println("Pizzas compradas: " + cantidad );
            System.out.println("Total compra: $" + totalCompra);
            System.out.println("El descuento es de : $" + descuento);
            System.out.println("Total de compra con descuento: $" + totalConDescuento);
    
            scanner.close();
        }
    }