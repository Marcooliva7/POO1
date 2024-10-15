package p106_Persona;

public class Apoyo extends Persona {
    private String Descripcion;
    private String Escolaridad;
    private double Page;

    public Apoyo() {}
    public Apoyo(String nombre, String direccion, int edad, String descripcion, String escolaridad, double page) {
        super(nombre, direccion, edad);
        Descripcion = descripcion;
        Escolaridad = escolaridad;
        Page = page;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
    public String getEscolaridad() {
        return Escolaridad;
    }
    public void setEscolaridad(String escolaridad) {
        Escolaridad = escolaridad;
    }
    public double getPage() {
        return Page;
    }
    public void setPage(double page) {
        Page = page;
    }
    @Override
    public String toString() {
        return "Apoyo [" + super.toString() + ", Descripcion=" + Descripcion + ", Escolaridad=" + Escolaridad + ", Page=" + Page + "]";
    }
    
    

   
    
}
