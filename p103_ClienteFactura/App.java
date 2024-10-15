package p103_ClienteFactura;

import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static Factura Llenar() {
        Factura f = new Factura();
        Cliente c = new Cliente();
        Scanner obj = new Scanner(System.in);
        System.out.println("Dame los datos de la Factura y el Cliente");
        System.out.print("ID Factura         : ");  f.setId(obj.nextInt());
        System.out.print("Monto              : ");  f.setMonto(obj.nextDouble());
        System.out.print("Cliente Id         : " );  c.setId(obj.nextInt()); obj.nextLine(); 
        System.out.print("Cliente Nombre     : " );  c.setNombre(obj.nextLine());
        System.out.print("Cliente Descuento  : " );  c.setDescuento(obj.nextFloat());
        f.setCliente(c);
        return f;
    }    
    public static void main(String[] args) {
        //Creamos un arreglo llamado facturas dentro de la funcion Factura, para ir agregando todas las facturas al arreglo
        ArrayList <Factura> facturas = new ArrayList<>();

        //Creamos facturas agregando datos en el metodo constructor.
        Factura f1 = new Factura(1, 500,  new Cliente(1, "Moonkey D Luffy", 0.05f));
        Factura f2 = new Factura(2, 1000, new Cliente(2, "Roronoa Zoro", 0.03f));
        //Agregamos las facturas al arreglo.
        facturas.add(f1);
        facturas.add(f2);

        System.out.print("\033[H\033[2J");

        //Creamos nuevas facturas utilizando la funcion que creamos al inicio, la cual ya contiene todos los datos.
        Factura f3 = new Factura();
        f3 = Llenar();
        System.out.println("Mi Factura es: " + f3.toString());
        facturas.add(f3);

        Factura f4 = new Factura();
        f4 = Llenar();
        System.out.println("Mi otra Factura es: " + f4.toString());
        facturas.add(f4);

        System.out.println("\n\n Todas las Facturas: ");
        double grantotal = 0;
        //En este ciclo se capturan los datos de las facturas generadas por la funcion Factura que creamos al inicio.
        for (Factura factura : facturas) {
            System.out.println("ID Factura          : " + factura.getId()); 
            System.out.println("Monto               : " + factura.getMonto());  
            System.out.println("Cliente Id          : " + factura.getCliente().getId());  
            System.out.println("Cliente Nombre      : " + factura.getCliente().getNombre());  
            System.out.println("Cliente Descuento   : " + factura.getCliente().getDescuento());
            System.out.println("Total con Descuento : " + factura.getTotal());
            grantotal = grantotal + factura.getTotal();
            System.out.println();      
        }
        System.out.println("Total de Ventas: " + grantotal);
    }    
}