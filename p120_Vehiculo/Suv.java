package p120_Vehiculo;

public class Suv extends Maquina implements TodoTerreno {

    public Suv(String nombre, String propietario, int pasajeros) {
        super(nombre, propietario, pasajeros);
    }

    @Override
    public void repostar() {
        System.out.println("Repostando...");
    }

    @Override
    public void arrancar() {
        System.out.println("Arrancando...");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando...");
    }

    @Override
    public void sistemaElectrico() {
        System.out.println("Es un automóvil con sistema eléctrico es una SUV");
    }

    @Override
    public void combustionInterna() {
        System.out.println("Es un automóvil de combustión interna es una SUV");
    }

    @Override
    public void traccion4x4() {
        System.out.println("Es un automóvil con tracción 4x4 es una SUV");
    }

    @Override
    public void chasisIndependiente() {
        System.out.println("Es un automóvil con chasis independiente es una SUV");
    }
    
}
