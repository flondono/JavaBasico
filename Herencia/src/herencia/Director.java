package herencia;

public class Director extends Persona {

    private String claveSector;

    public Director(){

    }

    public Director(String nombre, String claveSector, int edad, String sexo) {
        this.claveSector=claveSector;
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setSexo(sexo);
    }

    public void muestraInfoDirector(){
        System.out.println();
        System.out.println("----INFORMACIÓN DEL DIRECTOR------");
        System.out.println("Escuela a la que pertenece: " + Persona.getNombreEscuela());
        System.out.println("Clave de sector: " + this.getClaveSector());
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Sexo: " + getSexo());
    }

    public String getClaveSector() {
        return claveSector;
    }

    public void setClaveSector(String claveSector) {
        this.claveSector = claveSector;
    }
}
