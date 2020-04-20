import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        //Objeto de tipo Scanner
        Scanner entrada = new Scanner(System.in);

        String nombre;
        int edad;
        double sueldo;

        System.out.print("¿ Cómo te llamas: ? ");
        nombre = entrada.nextLine();

        System.out.print("¿Qué edad tienes: ? ");
        edad = entrada.nextInt();

        
    }
}
