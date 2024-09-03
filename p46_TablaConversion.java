/**
 * - p46_TablaConversion
 */
import java.util.Scanner;
public class p46_TablaConversion {
    public static void main(String[] args) {
        int Ini, Fin, c;
        float tc = 20.74f, te = 25.00f;
        char resp;
        Scanner obj = new Scanner(System.in);

        do {

            System.out.print("\033^[H\033[2J"); System.out.flush();
            System.out.println("Tabla de conversion de $ Peso a  $$ Dollar ");
            do {
                System.out.print("Dame Inicio : "); Ini = obj.nextInt();
                System.out.print("Dame Fin    : "); Fin = obj.nextInt();
            } while( Fin < Ini ); // valida que inicio sea menor que fin
            c = Ini;
            System.out.println("Peso \t\t Dollar \t Euro");
            System.out.println("-----------------------------------------------");
            while (c <= Fin)  {
                System.out.printf("%10d \t %10.2f \t %10.2f \n", c , c * tc, c * te);
                c++;

            }
            System.out.print("\nDeseas continuar (S/N) ? "); resp = Character.toUpperCase(obj.next().charAt(0));
        }   while(resp!='N');
                
        }

    }
