package p106_Persona;

public class Estudiante extends Persona {
    private String Carrera;
    private int Año;
    private double Colegiatura;

    public Estudiante() {}
    public Estudiante(String nombre, String direccion, int edad, String carrera, int año, double colegiatura) {
        super(nombre, direccion, edad);
        Carrera = carrera;
        Año = año;
        Colegiatura = colegiatura;
    }
    public String getCarrera() {
        return Carrera;
    }
    public void setCarrera(String carrera) {
        Carrera = carrera;
    }
    public int getAño() {
        return Año;
    }
    public void setAño(int año) {
        Año = año;
    }
    public double getColegiatura() {
        return Colegiatura;
    }
    public void setColegiatura(double colegiatura) {
        Colegiatura = colegiatura;
    }
    @Override
    public String toString() {
        return "Estudiante [Nombre=" + Nombre + ", Carrera=" + Carrera + ", Direccion=" + Direccion + ", Año=" + Año
                + ", Edad=" + Edad + ", Colegiatura=" + Colegiatura + "]";
    }
    
}

