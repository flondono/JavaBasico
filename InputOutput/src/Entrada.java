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

        System.out.print("¿Cuál es tu sueldo actual: ?");
        sueldo = entrada.nextDouble();

        System.out.println("----------------------------------------");
        System.out.println("Tu nombes es: " + nombre);
        System.out.println("Tu edad es: " + edad);
        System.out.println("Tu sueldo actual es: " + sueldo);
    }
}
