package condicionales;

public class CondicionalSwitch {

    public static void main(String[] args) {

        CondicionalSwitch objeto = new CondicionalSwitch();
        objeto.imprimeProducto();
        objeto.imprimeClave();
        objeto.diaSemana();
    }

    public void imprimeProducto() {

        int productoId = 0;
        switch (productoId) {
            case 1:
                System.out.println("El producto tiene el id 1");
                break;
            case 2:
                System.out.println("El producto tiene el id 2");
                break;
            case 3:
                System.out.println("El producto tiene el id 3");
                break;
            default:
                System.out.println("El producto tiene un id invalido");
        }
    }

    public void imprimeClave() {

        String nombreProducto = "sandia";

        switch (nombreProducto) {
            case "sandia":
                System.out.println("La clave de la sandia es: 001");
                break;
            case "manzana":
                System.out.println("La clave de la manzana es: 002");
                break;
            default:
                System.out.println("Producto indicado no existe");

        }
    }

    public void diaSemana() {
        int dia = 1;
        switch (dia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Este día pertenece a un día de la semana y no es fin de semana");
                break;
            case 6:
            case 7:
                System.out.println("Este día pertenece a fin de semana");
                break;
        }
    }

}

