package principal.arraylist;

import clases.Agenda;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.jws.WebService;

public class SetCollection {

    public static void ejemploSet() {
        Agenda agenda = new Agenda("Juan", "36", "2195555");
        Agenda agenda1 = new Agenda("Pedro", "34", "2196666");
        Agenda agenda2 = new Agenda("Luis", "26", "2197777");

        Set<Agenda> agendaClientes = new HashSet<Agenda>();

        agendaClientes.add(agenda);
        agendaClientes.add(agenda1);
        agendaClientes.add(agenda2);
        imprimeSet(agendaClientes);
    }

    static void imprimeSet(Collection<Agenda> col) {
        for (Agenda agenda : col) {
            System.out.println("agenda = " + agenda.getNombre() + agenda.getEdad() + agenda.getTelefono());
        }
    }
}
