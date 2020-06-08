package co.domain;

public class Animal implements AccionesGlobales {

    private String raza;

    public void cazar() {
        System.out.println("El animal de raza " + raza + " esta casando (desde la clase animal)");
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void caminar() {
        System.out.println("El animal de raza " + raza + " esta caminado");
    }

    @Override
    public void comer() {
        System.out.println("El animal de raza " + raza + " esta comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("El animal de raza " + raza + " esta dourmiendo");
    }
}
