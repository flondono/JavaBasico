package metodoesaticos;

public class Calificaciones {

    public double totalCalificaciones = 0.0;

    public double sumaCalifiacion(Alumno a) {
        totalCalificaciones = totalCalificaciones + a.calificacion;
        return totalCalificaciones;
    }
}
