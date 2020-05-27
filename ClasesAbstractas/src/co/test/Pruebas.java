package co.test;

import co.domain.Rectangulo;
import co.domain.Triangulo;

public class Pruebas {

    public static void main(String[] args) {

        Rectangulo rectangulo = new Rectangulo();
        rectangulo.mostar();

        rectangulo.setAlto(20);
        rectangulo.setAncho(30);
        rectangulo.mostar();
        System.out.println("El area de un rectangulo es: " + rectangulo.getArea());
        System.out.println("------------");

        Triangulo triangulo = new Triangulo(20,10);
        triangulo.mostar();
        System.out.println("El area de un triangulo es: " + triangulo.getArea());
    }
}
