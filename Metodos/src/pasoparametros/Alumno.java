package pasoparametros;

public class Alumno {
    int calificacion;
    String nombre;

    public Alumno(int cal, String nom) {
        calificacion = cal;
        nombre = nom;
    }

    public void muestaInformacionAlumno() {
        System.out.print("Nombre: " + nombre);
        System.out.println("\tCalificación: " + calificacion);
    }

}
