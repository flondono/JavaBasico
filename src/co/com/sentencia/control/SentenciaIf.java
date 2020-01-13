package co.com.sentencia.control;

public class SentenciaIf {
    public static void main(String[] args) {
        
        /*int edad = 18;
        
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("No eres una persona mayor de edad");
        }
        */
        int edad = 5;
        
        String resultado=(edad>=18)? "Mayor de edad":"Menor de edad";
        
        if (edad >= 18) {
            System.out.println("Ya tienes 18 años o más");
        } else if (edad >= 15) {
            System.out.println("Tienes 15 años o más, pero tienes menos de 18");
        } else if (edad >= 10) {
            System.out.println("Tienes 10 años o más pero tienes menos de 15");
        }else{
            System.out.println("Eres un niño aun...");
        }
    }
}
