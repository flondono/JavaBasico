package ciclos;

public class CicloDoWhile {

    public static void main(String[] args) {

        CicloDoWhile objeto = new CicloDoWhile();
        objeto.regresaPares();
    }

    public void regresaPares() {
        int i = 1;
        do {
            i++;
            if (i % 2 == 0) {
                System.out.println(i);
            }
        } while (i < 100);
    }
}
