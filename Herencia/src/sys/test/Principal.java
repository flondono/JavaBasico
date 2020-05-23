package sys.test;

import herencia.*;

public class Principal {

    public static void main(String[] args) {

        Persona.setNombreEscuela("Carpinelo");
        /*Alumno alumno = new Alumno(1000, "Fernando", 30, "M");
        alumno.muestraInfoAlumno();
        alumno.setEdad(50);
        alumno.muestraInfoAlumno();*/

        Director director = new Director("Juan", "123", 50, "M");
        director.muestraInfoDirector();

        Intendente intendente = new Intendente("Cocina", "Pedro", 50, "M");
        intendente.muestraInfoIntendete();

        Profesor profesor = new Profesor("1235", "Matematicas", "Fernando", 50, "M");
        profesor.muestraInfoProfesor();
    }
}
