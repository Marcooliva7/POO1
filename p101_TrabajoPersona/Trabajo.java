package p101_TrabajoPersona;

public class Trabajo {
    private int Id;
    private String Puesto;
    private double Sueldo;
    
    public Trabajo() {
    
    }

    public Trabajo(int id, String puesto, double sueldo) {
        Id = id;
        Puesto = puesto;
        Sueldo = sueldo;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String puesto) {
        Puesto = puesto;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double sueldo) {
        Sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Trabajo [Id=" + Id + ", Puesto=" + Puesto + ", Sueldo=" + Sueldo + "]";
    }
    
    

   


    
    
}

