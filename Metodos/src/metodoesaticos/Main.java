package metodoesaticos;

public class Main {

    public static void main(String[] args) {

        Calificaciones calificaciones = new Calificaciones();

        Alumno alumno = new Alumno(5, "fernando");
        Alumno alumno1 = new Alumno(3, "Pedro");
        Alumno alumno2 = new Alumno(2, "Luis");

        alumno.cuotaSemestral = 500;

        alumno.muestaInformacionAlumno();
        alumno1.muestaInformacionAlumno();
        alumno2.muestaInformacionAlumno();
        Alumno.muestraCuotaSemestral();

        alumno.cuotaSemestral = 600;

        alumno.muestaInformacionAlumno();
        alumno1.muestaInformacionAlumno();
        alumno2.muestaInformacionAlumno();
        Alumno.muestraCuotaSemestral();
    }
}
