package clasemath;

public class EjerciciosMath {

    public static void main(String[] args) {
        EjerciciosMath objeto = new EjerciciosMath();
        objeto.numerosAleatorios();
        objeto.potencia();
        objeto.maximoMinimo();
        objeto.mayorMenorParametro();
        objeto.raizCuadrada();
    }

    public void raizCuadrada() {
        double a = 5;
        System.out.println("La raiz cuadrada de " + a + " es: " + Math.sqrt(a));
    }

    public void potencia() {
        double a = 2.0;
        double b = 5.0;
        System.out.println("El resultado de elevar:" + a + " a " + b + " b " + " es = " + Math.pow(a, b));
    }

    public void redondeo() {
        double a = 5.8;
        double b = 5.3;
        System.out.println("El redondeo del número es: " + Math.round(a));
        System.out.println("El redondeo del número es: " + Math.round(a));

    }

    public void mayorMenorParametro() {
        double numero = 5.1;
        System.out.println("El entero mayor del número es: " + Math.ceil(numero));
        System.out.println("El entero mayor del número es: " + Math.floor(numero));
    }

    public void maximoMinimo() {
        int numero1 = 1000;
        int numero2 = 999;
        System.out.println("El mayor de los números es: " + Math.max(numero1, numero2));
        System.out.println("El mayor de los números es: " + Math.min(numero1, numero2));
    }

    public void numerosAleatorios() {
        for (int i = 0; i < 10; i++) {
            double aleatorio = Math.random();
            System.out.println(aleatorio);
        }
    }
}
