package p120_Vehiculo;

public interface Vehiculo {
    void sistemaElectrico();
    void combustionInterna();
}

public interface Familiar extends Vehiculo {
    void carroceriaTres();
    void chasisMonocasco();
}

public interface TodoTerreno extends Vehiculo {
    void traccion4x4();
    void chasisIndependiente();
}
    
