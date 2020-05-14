package metodoesaticos;

public class Alumno {
    int calificacion;
    String nombre;
    static double cuotaSemestral;

    public Alumno(int cal, String nom) {
        calificacion = cal;
        nombre = nom;
    }

    public void muestaInformacionAlumno() {
        System.out.print("Nombre: " + nombre);
        System.out.println("\tCalificación: " + calificacion);
        //System.out.println("La cuota semestral es de: " + cuotaSemestral);
        muestraCuotaSemestral();
    }

    public static void muestraCuotaSemestral() {
        System.out.println("La cuota semestral es de: " + cuotaSemestral);
    }

}
