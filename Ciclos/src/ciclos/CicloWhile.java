package ciclos;

public class CicloWhile {

    public static void main(String[] args) {

        CicloWhile objeto = new CicloWhile();
        objeto.ejemplo1();
        objeto.tablasDeMultiplicar();
    }

    public void ejemplo1() {
        int i = 0;
        while (i == 0) {
            System.out.println("Este código no se ejecutara");
            i++;
        }
    }

    public void tablasDeMultiplicar() {
        int tabla = 1;
        int i = 1;

        while (tabla <= 3) {
            while (i <= 10) {
                System.out.println(tabla + " * " + i + " = " + (tabla * i));
                i++;
            }
            System.out.println("--------");
            System.out.println("");
            i = 1;
            tabla++;
        }
    }
}
