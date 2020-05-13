package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class AjustandoDateTime {

    public void ajustaDateTime() {
        LocalDate fech1 = LocalDate.of(2020, 10, 16);
        System.out.println("Fecha actual: " + fech1);
        fech1 = fech1.withDayOfMonth(31);
        System.out.println("Fecha cambiando al día: " + fech1);

        fech1 = fech1.withMonth(2);
        System.out.println("Cambiando el mes: " + fech1);

        fech1 = fech1.withDayOfYear(365);
        System.out.println("Alterando el día del año:" + fech1);

        LocalTime horaActual = LocalTime.now();

        System.out.println("La hora acutal es: " + horaActual);

        horaActual = horaActual.withHour(10);
        System.out.println("La hora modifica es: " + horaActual);

        horaActual = horaActual.withMinute(50);
        System.out.println("El minuto modificado es: " + horaActual);
    }

    public void modificarTiempo() {
        LocalDateTime objetoFecha = LocalDateTime.now();
        System.out.println("Fecha y hora actual: " + objetoFecha);

        objetoFecha = objetoFecha.plus(3, ChronoUnit.WEEKS);
        System.out.println("La fecha modificada sumando tres semanas: " + objetoFecha);

        objetoFecha = objetoFecha.minus(3, ChronoUnit.WEEKS);
        System.out.println("Fecha modificada restando 3 semanas: " + objetoFecha);

        LocalDateTime fechaNueva = LocalDateTime.now();
        System.out.println("La fecha actual es: " + fechaNueva);

        fechaNueva = fechaNueva.plusDays(20);
        System.out.println("La fecha modificada más 20 días es: " + fechaNueva);
    }
}
