package encapsulamiento;

public class Principal {

    public static void main(String[] args) {
        Profesor profesor = new Profesor();

        profesor.setNombre("Fernando");
        profesor.setSueldo(5000);
        profesor.setIdentificacion("0001");

        System.out.println("Nombre: " + profesor.getNombre());
        System.out.println("Sueldo: " + profesor.getSueldo());
        System.out.println("Identificación: " + profesor.getIdentificacion());
    }
}
