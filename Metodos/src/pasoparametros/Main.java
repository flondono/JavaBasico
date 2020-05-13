package pasoparametros;

public class Main {

    public static void main(String[] args) {

        Calificaciones calificaciones = new Calificaciones();

        Alumno alumno = new Alumno(5, "fernando");
        Alumno alumno1 = new Alumno(3, "Pedro");
        Alumno alumno2 = new Alumno(2, "Luis");

        double sumaCalificaciones = calificaciones.sumaCalifiacion(alumno);
        alumno.muestaInformacionAlumno();

        sumaCalificaciones = calificaciones.sumaCalifiacion(alumno1);
        alumno1.muestaInformacionAlumno();

        sumaCalificaciones = calificaciones.sumaCalifiacion(alumno2);
        alumno2.muestaInformacionAlumno();

        System.out.println("Suma de puntos del grupo: " + sumaCalificaciones);
        double promedioGrupo = sumaCalificaciones / 3;
        System.out.println("El promedio del grupo es: " + promedioGrupo);
    }
}
