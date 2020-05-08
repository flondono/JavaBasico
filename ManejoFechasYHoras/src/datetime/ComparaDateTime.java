package datetime;

import java.time.LocalDate;
import java.time.Month;

public class ComparaDateTime {

    public void isBefore() {

        /*Regresa True si la fecha o tiempo estan antes de la otra fecha
          de lo contrario regresa falso
        * */
        LocalDate fecha1 = LocalDate.now();
        LocalDate fecha2 = LocalDate.of(2018, Month.AUGUST, 31);

        if (fecha1.isBefore(fecha2)) {
            System.out.println("El día " + fecha1 + " Sí esta ANTES DE " + fecha2);
        } else {
            System.out.println("El día " + fecha1 + " No esta ANTES DE " + fecha2);
        }
    }

    public void isAfter() {
        /*Regresa True si la fecha o tiempo estan despues de la otra fecha
          de lo contrario regresa falso
        * */
        LocalDate fecha1 = LocalDate.now();
        LocalDate fecha2 = LocalDate.of(2018, Month.AUGUST, 31);

        if (fecha1.isAfter(fecha2)) {
            System.out.println("El día " + fecha1 + " Sí esta DESPUES DE " + fecha2);
        } else {
            System.out.println("El día " + fecha1 + " No esta DESPUES DE " + fecha2);
        }
    }

    public void compareTo() {
        LocalDate fecha1 = LocalDate.now();
        LocalDate fecha2 = LocalDate.of(2020, Month.MAY, 7);

        if (fecha1.compareTo(fecha2) < 0) {
            System.out.println("La fecha " + fecha1 + " esta antes de la fecha: " + fecha2);
        } else if (fecha1.compareTo(fecha2) > 0) {
            System.out.println("La fecha " + fecha1 + " esta después de la fecha: " + fecha2);
        } else {
            System.out.println("La fecha " + fecha1 + " es IGUAL a la fecha: " + fecha2);
        }
    }
}
