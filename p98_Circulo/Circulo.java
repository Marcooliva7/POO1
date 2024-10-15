package p98_Circulo;

public class Circulo {
    private double Radio, Area, Circunferencia;

    public Circulo() {}

    public Circulo(double radio){
        Radio = radio;
    }
    public double getRadio() {
        return Radio;
    }
    public void setRadio(double radio) {
        Radio = radio;
    }
    public double getArea() {
        Area = (Math.PI*(Radio*Radio));
        return Area;
    }
    public double getCircunferencia() {
        Circunferencia = ((Radio*2)*Math.PI);
        return Circunferencia;
    }

    @Override
    public String toString() {
        return "Circulo [Radio=" + Radio + "]";
    }
}
    
}
