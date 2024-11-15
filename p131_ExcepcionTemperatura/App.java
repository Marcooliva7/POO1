package p131_ExcepcionTemperatura;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
     static float res;
        
        public static float convertir(float grados) throws TemperaturaExcesiva {
            if (grados>100) throw new TemperaturaExcesiva("Temperatura demasiado alta, no se puede convertir");
            return res = (grados * 9f / 5f) + 32;
        }
        public static void main(String[] args) {
            System.out.print("\033[H\033[2J");

            try {
                System.out.print("Dame una temperatura en Centigrados: ");
                @SuppressWarnings("resource")
                float grados = new Scanner(System.in).nextFloat();
                System.out.println(grados +" grados  centigrados, equivale a: " +convertir(grados) + " Farenheit");
                
            } catch (TemperaturaExcesiva e) {
                System.out.println("Error "+ e);
                
            } catch (InputMismatchException e) {
                System.out.println("La teperatura a convertir, debe ser un valor numérico");
            }
    }
    
}
