package herencia;

public class Alumno extends Persona {

    private int numeroAlumo;

    public Alumno() {

    }

    public Alumno(int numeroAlumo, String nombre, int edad, String sexo) {
        this.setNumeroAlumo(numeroAlumo);
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setSexo(sexo);
    }

    public void muestraInfoAlumno() {
        System.out.println();
        System.out.println("----INFORMACIÓN DEL ALUMNO------");
        System.out.println("Escuela a la que pertenece: " + Persona.getNombreEscuela());
        System.out.println("Número de alumno: " + this.getNumeroAlumo());
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Sexo: " + getSexo());
    }

    public int getNumeroAlumo() {
        return numeroAlumo;
    }

    public void setNumeroAlumo(int numeroAlumo) {
        this.numeroAlumo = numeroAlumo;
    }

}
