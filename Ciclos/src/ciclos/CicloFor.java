package ciclos;

public class CicloFor {

    public static void main(String args[]) {

        CicloFor objeto = new CicloFor();
        //objeto.concatenarNumeros();
        objeto.imprimirTablas();
    }

    //0 1 2 3 4 5 ...
    public void concatenarNumeros() {
        String numeros = "";
        for (int i = 0; i < 5; i++) {
            numeros += i;
            numeros += " ";
        }
        System.out.println(numeros);

        //Imprimir una tabla de multiplicar
        int numero = 2;
        System.out.println("Tabla del " + numero);

        for (int j = 1; j <= 10; j++) {
            System.out.println(numero + " * " + j + " = " + (numero * j));
        }
    }

    //Realiza las tablas de multiplicar hasta n numero
    public void imprimirTablas() {

        int cuantasTablas = 3;

        for (int i = 1; i <= cuantasTablas; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println("----------");
            System.out.println("");
        }
    }
}
