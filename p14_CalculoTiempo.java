import java.util.Scanner;

public class p14_CalculoTiempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa total de horas: ");
        int horasTotales = scanner.nextInt();     
        int dias = horasTotales / 24;
        int horasRestantes = horasTotales % 24;
        int minutosTotales = horasTotales * 60;
        int segundosTotales = minutosTotales * 60;
        System.out.println("En dias son: " + dias);
        System.out.println("Horas extra: " + horasRestantes);
        System.out.println("En minutos son: " + minutosTotales);
        System.out.println("En segundos son: " + segundosTotales);
        scanner.close();
    }
}