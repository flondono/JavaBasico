package sys.test;

import herencia.Alumno;
import herencia.Persona;

public class Principal {

    public static void main(String[] args) {

        Persona.setNombreEscuela("Carpinelo");
        Alumno alumno = new Alumno(1000, "Fernando", 30, "M");
        alumno.muestraInfoAlumno();
        alumno.setEdad(50);
        alumno.muestraInfoAlumno();
    }
}
