package herencia;

public class Profesor extends Persona {

    private String especialidad;
    private String cedulaProfesor;

    public Profesor() {

    }

    public Profesor(String cedulaProfesor, String especialidad,
                    String nombre, int edad, String sexo) {
        this.setCedulaProfesor(cedulaProfesor);
        this.setEspecialidad(cedulaProfesor);
        this.setEdad(edad);
        this.setNombre(nombre);
        this.setSexo(sexo);

    }

    public void muestraInfoProfesor() {
        System.out.println();
        System.out.println("----INFORMACIÓN DEL PROFESOR------");
        System.out.println("Escuela a la que pertenece: " + Persona.getNombreEscuela());
        System.out.println("cedula profesional: " + this.getCedulaProfesor());
        System.out.println("Especialidad: " + this.getEspecialidad());
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Sexo: " + getSexo());
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCedulaProfesor() {
        return cedulaProfesor;
    }

    public void setCedulaProfesor(String cedulaProfesor) {
        this.cedulaProfesor = cedulaProfesor;
    }
}
