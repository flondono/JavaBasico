package herencia;

public class Intendente extends Persona {

    private String areaLimpieza;

    public Intendente() {

    }

    public Intendente(String areaLimpieza, String nombre, int eada, String sexo) {
        this.setAreaLimpieza(areaLimpieza);
        this.setNombre(nombre);
        this.setEdad(eada);
        this.setSexo(sexo);
    }

    public void muestraInfoIntendete() {
        System.out.println();
        System.out.println("----INFORMACIÓN DEL INTENDENTE------");
        System.out.println("Escuela a la que pertenece: " + Persona.getNombreEscuela());
        System.out.println("Area de limpieza a la que pertenece: " + this.getAreaLimpieza());
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Sexo: " + getSexo());
    }

    public String getAreaLimpieza() {
        return areaLimpieza;
    }

    public void setAreaLimpieza(String areaLimpieza) {
        this.areaLimpieza = areaLimpieza;
    }
}
