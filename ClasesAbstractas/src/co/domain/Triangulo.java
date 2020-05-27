package co.domain;

public class Triangulo extends Figura {


    public Triangulo() {
        super();
    }

    public Triangulo(int ancho, int alto) {
        super(ancho, alto);
    }

    @Override
    public float getArea() {
        return (this.getAncho() * this.getAlto()) / 2;
    }
}
