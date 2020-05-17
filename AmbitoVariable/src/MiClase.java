public class MiClase {
    static String nacionalidad = "Colombiano";
    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int ed) {
        edad = ed;
    }

    public String mayorDeEdad(int ed) {
        int faltante = 0;
        System.out.println(edad);
        if (ed >= 18) {
            return "Eres mayor de edad y tu nacionalidad es: " + nacionalidad;
        } else {
            faltante = 18 - ed;
            return "Te faltan " + faltante + " años para ser mayor de edad y tu nacionalidad es: " + nacionalidad;
        }
    }
}
