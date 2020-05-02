package matrices;


public class Matrices {

    //SINTAXIS tipo[][] nombreArreglo = new [renglon][columna]
    int[][] matrizEnteros = new int[3][4];

    //Asignacion
    //int[][] matrizEnteros = {{1, 3, 5, 7}, {5, 4, 1, 16}, {7, 9, 16, 13}};

    //Sintaxis para asignar valores nombreArreglo [renglon][columna] = valor;

    public static void main(String[] args) {
        Matrices m = new Matrices();
        m.asignaValores();
        m.leerArregloBidimensional();
    }

    public void asignaValores() {

        //primera fila
        matrizEnteros[0][0] = 1;
        matrizEnteros[0][1] = 3;
        matrizEnteros[0][2] = 5;
        matrizEnteros[0][3] = 7;

        //segunda fila
        matrizEnteros[1][0] = 7;
        matrizEnteros[1][1] = 4;
        matrizEnteros[1][2] = 1;
        matrizEnteros[1][3] = 16;

        //Tercera fila
        matrizEnteros[2][0] = 7;
        matrizEnteros[2][1] = 9;
        matrizEnteros[2][2] = 61;
        matrizEnteros[2][3] = 13;

    }

    //Leer información arreglo
    public void leerArregloBidimensional() {
        for (int[] renglon : matrizEnteros) {
            for (int columna : renglon) {
                System.out.print(columna + " ");
            }
            System.out.print("\n");
        }
    }

}
