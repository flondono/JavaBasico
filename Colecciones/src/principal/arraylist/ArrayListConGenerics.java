package principal.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListConGenerics {


    public static void usoArrayListSimple() {

        List<String> meses = new ArrayList<String>();

        //agregando elementos a nuestra lista
        meses.add("Enero");
        meses.add("Febrero");
        meses.add("Marzo");

        //Obtener el último elemento
        int ultimoElemento = meses.size() - 1;
        String ultimoMes = meses.get(ultimoElemento);

        //System.out.println("IMPRIMIENDO EL ÚLTIMO ELEMENTO");
        //System.out.println(ultimoElemento);
        //System.out.println(ultimoElemento + " elemento " + ultimoMes);

        //Imprimir todos lo elementos para modo debug
        //System.out.println("IMPRIMIENDO EN MODO DEBUG");
        //System.out.println(meses);

        //Agregando un elemento en la posicón 0
        meses.add(0, "abril");
        meses.add("abril");
        //System.out.println("meses = " + meses);


        //Llamar al método imprimirCollection
        //imprimirCollection(meses);

        //VALIDADANDO SI UN ELEMENTO ESTA DENTRO DE NUESTRO ARRAYLIST
        String objetoBuscado = "Enero";
        if (meses.contains(objetoBuscado)) {
            System.out.println("En esta lista existe: " + objetoBuscado);
            System.out.println("Se encuentra en la posición: " + meses.indexOf(objetoBuscado));
            meses.remove(1);
        } else {
            System.out.println("En esta lista no existe el objeto buscado");
        }
    }

    private static void imprimirCollection(Collection<String> col) {
        //Iterator iter = col.iterator();
        System.out.println();
        System.out.println();
        System.out.println();
        //while (iter.hasNext()) {
        //    String mes = (String) iter.next();
        //    System.out.println("mes = " + mes);

        for (String str : col) {
            System.out.println("str = " + str);

        }
    }
}



