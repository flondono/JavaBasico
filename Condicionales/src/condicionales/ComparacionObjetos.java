package condicionales;

public class ComparacionObjetos {
    public static void main(String[] args) {

        String cad1 = "abcd";
        String cad2 = "abcd";
        String cad3 = new String("abcd");

        //Comparando la referencia ==
        if (cad1 == cad2) {
            System.out.println("Comparando referencia  cad1 = cad2");
        }
        if (cad1 == cad3) {
            System.out.println("Comparando referencia  cad1 = cad3");
        }

        //Comparando el valor con el método equals
        if (cad1.equals(cad2)) {
            System.out.println("Comparando valor  cad1 = cad2");
        }
        if (cad1.equals(cad3)) {
            System.out.println("Comparando valor  cad1 = cad3");
        }
    }
}
