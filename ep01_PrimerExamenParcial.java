/**
 * ep01_PrimerExamenParcial de Programación Orientada a Objetos y Laboratorio
 */
import java.util.Scanner;

public class ep01_PrimerExamenParcial {
    private String nombre;
    private int edad;
    private String sexo;
    private String tipoParticipante;

    public ep01_PrimerExamenParcial(String nombre, int edad, String sexo, String tipoParticipante) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.tipoParticipante = tipoParticipante;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public String getTipoParticipante() {
        return tipoParticipante;
    }

    public int calcularCosto() {
        switch (tipoParticipante.toLowerCase()) {
            case "alumno":
                return 40;
            case "docente":
                return 60;
            case "trabajador":
                return 80;
            default:
                return 0;
        }
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
        System.out.println("Tipo de Participante: " + tipoParticipante);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numParticipantesAceptados = 0;
        int totalEdadAceptados = 0;
        int conteoAlumnos = 0, conteoDocentes = 0, conteoTrabajadores = 0;
        int conteoMasculinos = 0, conteoFemeninos = 0;
        int conteoRechazados = 0;
        int dineroAlumnos = 0, dineroDocentes = 0, dineroTrabajadores = 0;
        int dineroTotal = 0;

        String continuar;
        do {
            System.out.println("Ingrese los datos del participante:");

            System.out.print("¿Cual es el Nombre?: ");
            String nombre = scanner.nextLine();

            System.out.print("¿Cual es la Edad?: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Sexo (M/F): ");
            String sexo = scanner.nextLine().toUpperCase();

            System.out.print("Que Tipo de Participante es: (Alumno/Docente/Trabajador): ");
            String tipoParticipante = scanner.nextLine();

            ep01_PrimerExamenParcial participante = new ep01_PrimerExamenParcial(nombre, edad, sexo, tipoParticipante);

            if (edad >= 23) {
                System.out.println("\n¡Felicidades Bienvenido al curso!");
                participante.mostrarInformacion();

                int costo = participante.calcularCosto();
                System.out.println("Costo de Inscripción: $" + costo);

                numParticipantesAceptados++;
                totalEdadAceptados += edad;

                if (tipoParticipante.equalsIgnoreCase("Alumno")) {
                    conteoAlumnos++;
                    dineroAlumnos += costo;
                } else if (tipoParticipante.equalsIgnoreCase("Docente")) {
                    conteoDocentes++;
                    dineroDocentes += costo;
                } else if (tipoParticipante.equalsIgnoreCase("Trabajador")) {
                    conteoTrabajadores++;
                    dineroTrabajadores += costo;
                }

                if (sexo.equals("M")) {
                    conteoMasculinos++;
                } else if (sexo.equals("F")) {
                    conteoFemeninos++;
                }

                dineroTotal += costo;
            } else {
                conteoRechazados++;
                System.out.println("\nNo tienes la edadrequerida para ingresar al curso. ¡Sigue participando!");
            }

            System.out.print("¿Quieres ingresar otro participante? (si/no): ");
            continuar = scanner.nextLine().toLowerCase();

        } while (continuar.equals("si"));

        System.out.println("\nResultados Finales:");
        System.out.println("Total de Alumnos: " + conteoAlumnos);
        System.out.println("Total de Docentes: " + conteoDocentes);
        System.out.println("Total de Trabajadores: " + conteoTrabajadores);
        System.out.println("Total de Hombres: " + conteoMasculinos);
        System.out.println("Total de Mujeres: " + conteoFemeninos);
        System.out.println("Total de Participantes Aceptados: " + numParticipantesAceptados);
        System.out.println("Total de Rechazados: " + conteoRechazados);
        System.out.println("Promedio de Edad de los Participantes Aceptados: " + 
            (numParticipantesAceptados > 0 ? (double) totalEdadAceptados / numParticipantesAceptados : 0));
        System.out.println("Total dinero recaudado de Alumnos: $" + dineroAlumnos);
        System.out.println("Total dinero recaudado de Docentes: $" + dineroDocentes);
        System.out.println("Total dinero recaudado de Trabajadores: $" + dineroTrabajadores);
        System.out.println("Total dinero recaudado en general: $" + dineroTotal);

        if (dineroTotal < 50) {
            System.out.println("El evento concluye con ganancias BAJAS.");
        } else if (dineroTotal >= 50 && dineroTotal < 1000) {
            System.out.println("El evento concluye con ganancias MODERADAS.");
        } else {
            System.out.println("El evento concluye con BUENAS ganancias.");
        }

        scanner.close();
    }
}
