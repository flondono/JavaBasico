package co.domain;

public class Persona implements AccionesGlobales, AccionesPersona {


    private String numControl;

    public void pensar(){
        System.out.println("La persona esta pensando... desde la clase persona");
    }

    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }

    @Override
    public void caminar() {
        System.out.println("La persona esta caminando");

    }

    @Override
    public void comer() {
        System.out.println("La persona esta comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("La persona esta durmiendo");
    }

    @Override
    public void bailar(String nombre) {
        System.out.println(nombre + " esta bailando");
    }

    @Override
    public void trabajar(String nombre, String numControl) {
        System.out.println(nombre + " esta trabajando con numero de control: " + numControl);
    }

    @Override
    public void estudiar() {

    }
}
