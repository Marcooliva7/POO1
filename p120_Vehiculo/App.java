package p120_Vehiculo;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        Maquina vochito = new Sedan("Shora movileeeeeeee", "Marco Oliva EL Shora ", 7);
        System.out.println(vochito);
        vochito.sistemaElectrico();
        vochito.combustionInterna();
        ((Familiar) vochito).carroceriaTres();
        ((Familiar) vochito).chasisMonocasco();
        vochito.repostar();
        vochito.arrancar();
        vochito.frenar();

        System.out.println();

        Maquina mamalona = new Suv("La mamawhisky", "El padrino", 6);
        System.out.println(mamalona);
        mamalona.sistemaElectrico();
        mamalona.combustionInterna();
        ((TodoTerreno) mamalona).traccion4x4();
        ((TodoTerreno) mamalona).chasisIndependiente();
        mamalona.repostar();
        mamalona.arrancar();
        mamalona.frenar();
    }
}
