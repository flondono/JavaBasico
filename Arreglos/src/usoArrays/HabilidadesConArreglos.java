package usoArrays;


import java.util.Arrays;

public class HabilidadesConArreglos {

    //int[] cantidades = new int[5];
    int[] cantidades = {5, 4, 3, 2, 1};

    public static void main(String[] args) {
        HabilidadesConArreglos objeto = new HabilidadesConArreglos();
        //objeto.rellenarValores();
        //objeto.leerArreglo();

        //System.out.println("-------------");

        //objeto.ordenarValores();
        //objeto.leerArreglo();
        objeto.buscarValor();
    }

    //Buscar valores en un arreglo ordenado
    public void buscarValor() {
        String[] nombreEmpleados = {"Pedor", "Maria", "Juan"};
        Arrays.sort(nombreEmpleados);
        int index = Arrays.binarySearch(nombreEmpleados, "Pedro");
        System.out.println("La palabra pedro la encontre en la posición o indice = " + index);
    }

    //Ordenar los valores de un arreglo
    public void ordenarValores() {
        Arrays.sort(cantidades);
    }

    //Rellenar con valores un arreglo
    public void rellenarValores() {
        Arrays.fill(cantidades, 100);

    }

    public void leerArreglo() {
        for (int valor : cantidades) {
            System.out.println(valor);
        }
    }

}
