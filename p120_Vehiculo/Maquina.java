package p120_Vehiculo;

public abstract class Maquina {
    private String nombre;
    private String propietario;
    private int pasajeros;

    public Maquina(String nombre, String propietario, int pasajeros) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.pasajeros = pasajeros;
    }

    public abstract void repostar();
    public abstract void arrancar();
    public abstract void frenar();

    @Override
    public String toString() {
        return "Maquina [Nombre=" + nombre + ", Propietario=" + propietario + ", Pasajeros=" + pasajeros + "]";
    }

    protected abstract void sistemaElectrico();

    protected abstract void combustionInterna();
}
