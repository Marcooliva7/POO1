package p120_Vehiculo;

public abstract class Maquina {
    protected String nombre;
    protected String propietario;
    protected int pasajeros;

    public Maquina(String nombre, String propietario, int pasajeros) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.pasajeros = pasajeros;
    }

    public void verInformacion() {
        System.out.println("[Nombre=" + nombre + ", Propietario=" + propietario + ", Pasajeros=" + pasajeros + "]");
    }

    public abstract void sistemaElectrico();
    public abstract void combustionInterna();

}
