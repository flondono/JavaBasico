public class Principal {

    public static void main(String[] args) {

        MiClase.nacionalidad ="Alemana";

        MiClase miClase = new MiClase();
        MiClase miClase1 = new MiClase();
        miClase.setEdad(10);
        miClase1.setEdad(30);

        System.out.println("La edad es: " + miClase.getEdad());
        System.out.println(miClase.mayorDeEdad(miClase.getEdad()));
        //System.out.println("Te faltan " + faltante + " años para ser mayor");

        //System.out.println(miClase.mayorDeEdad(80));
        System.out.println("La edad es: " + miClase1.getEdad());
        System.out.println(miClase1.mayorDeEdad(miClase1.getEdad()));


    }
}
