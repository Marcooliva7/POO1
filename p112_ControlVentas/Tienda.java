package p112_ControlVentas;

public class Tienda {
    private String Nombre;
    private String Propietario;
    private String Domicilio;
    private ArrayList<Cliente> Clientes;

    public Tienda(String nombre, String propietario, String domicilio, ArrayList<Cliente> clientes) {
        Clientes = new ArrayList<>();
        Nombre = nombre;
        Propietario = propietario;
        Domicilio = domicilio;
    }
    public void agregarCliente(Cliente cliente) {
        Cliente.add(cliente);
    }
    public ArrayList<Cliente> getClientes() {
        return Clientes;
    }
    public double getTotal() {
        double total = 0;
        for (Cliente cliente : Clientes) {
            total = total + cliente.getTotal();
    }
    return total;
    }
    public void reporte() {
        System.out.println(this);
        for (Cliente cliente : Clientes) {
            System.out.println("> " + cliente);
            for (Venta venta : cliente.getVentas())
            System.out.println(venta);
        }
        
    }
}

