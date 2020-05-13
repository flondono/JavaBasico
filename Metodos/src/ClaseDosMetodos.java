public class ClaseDosMetodos {

    //Calling method
    public void calcula() {
        int a = 5, b = 9, c;
        c = multiplicacion(a, b);
        System.out.println(a + " * " + b + " es igual a " + c);
    }

    //Worker method
    public int multiplicacion(int a, int b) {
        return a * b;
    }
}
