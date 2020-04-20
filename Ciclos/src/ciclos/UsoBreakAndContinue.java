package ciclos;

public class UsoBreakAndContinue {

    public static void main(String[] args) {

        UsoBreakAndContinue objeto = new UsoBreakAndContinue();
        //objeto.utilizaBreak();
        objeto.utilizaContinue();
    }

    public void utilizaContinue() {
        String frase = "Anita lava la tina";
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);

            if (caracter == 'a' || caracter == 'A') {
                continue;
            }
            System.out.println(caracter);
        }
    }

    //break utilizando for
    public void utilizaBreak() {/*
        String frase = "Anita lava la tina";
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            System.out.println(caracter);
            if (caracter == 'v') {
                System.out.println("Sí existe la letra v (utilizando un ciclo for)");
                break;
            }
        }*/

        //break utilizando while
        String frase1 = "Zapatero a tu zapato";
        int i = 0;
        while (i < frase1.length()) {
            char caracter1 = frase1.charAt(i);
            System.out.println(caracter1);
            System.out.println("");
            if (caracter1 == 'z') {
                System.out.println("Sí existe la letra z (utilizando ciclo while)");
                break;
            }
            i++;
        }
    }
}
