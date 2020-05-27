package co.domain;

public abstract class Figura {

    private int ancho, alto;

    public Figura() {
        this.ancho = 0;
        this.alto = 0;
    }

    public Figura(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public void mostar() {
        System.out.println("El ancho capturado es: " + this.ancho);
        System.out.println("El ancho capturado es: " + this.alto);
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public abstract float getArea();
}
