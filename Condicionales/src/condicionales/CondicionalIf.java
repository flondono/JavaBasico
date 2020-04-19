package condicionales;

public class CondicionalIf {
    public static void main(String[] args) {

        int edad = 5;

        //if simple ? parte verdadera, : parte falsa
        String resultado = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println(resultado);
        /*
        if (edad >= 18) {
            System.out.println("Eres una persona mayor de edad");
            System.out.println("Por lo cual ya puedes votar");
        } else {
            System.out.println("No eres una persona mayor de edad");
        }*/

        if (edad > 18) {
            System.out.println("Ya tienes 18 años o más");
        } else if (edad >= 15) {
            System.out.println("Tienes 15 años o más, pero tienes menos de 18");
        } else if (edad >= 10) {
            System.out.println("Tienes 10 años o más, pero tienes menos de 15");
        } else {
            System.out.println("Eres un niño aun..");
        }
    }
}
