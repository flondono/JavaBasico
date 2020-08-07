package principal.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayListSimple {


    public static void usoArrayListSimple() {

        List meses = new ArrayList<>();

        //agregando elementos a nuestra lista
        meses.add("Enero");
        meses.add("Febrero");
        meses.add("Marzo");

        //Obtener el último elemento
        int ultimoElemento = meses.size() - 1;
        String ultimoMes = (String) meses.get(ultimoElemento);

        System.out.println("IMPRIMIENDO EL ÚLTIMO ELEMENTO");
        System.out.println(ultimoElemento);
        System.out.println(ultimoElemento + " elemento " + ultimoMes);

        //Imprimir todos lo elementos para modo debug
        System.out.println("IMPRIMIENDO EN MODO DEBUG");
        System.out.println(meses);

        //Agregando un elemento en la posicón 0
        meses.add(0, "abril");
        meses.add("abril");
        System.out.println("meses = " + meses);


        //Llamar al método imprimirCollection
        imprimirCollection(meses);
    }

    private static void imprimirCollection(Collection col) {
        Iterator iter = col.iterator();
        System.out.println();
        while (iter.hasNext()) {
            String mes = (String) iter.next();
            System.out.println("mes = " + mes);
        }
    }


}
