package wrapper;

public class ClasesEnvolventes {

    public static void main(String[] args) {

        ClasesEnvolventes objeto = new ClasesEnvolventes();
        //objeto.xxxValue();
        //objeto.parseValueOf();
        objeto.metodoToString();
    }

    public void metodoToString(){
        Double d = new Double("1234");
        String dCadena = d.toString();
        System.out.println(dCadena);
    }
    public void parseValueOf() {
        double d4 = Double.parseDouble("3.14");
        long primitivoLong = Long.parseLong("323");
        Long objetoLong = Long.valueOf("456");
        System.out.println(d4 + 1);
        System.out.println(primitivoLong + 1);
        System.out.println(objetoLong + 1);
    }

    public void xxxValue() {
        Integer var = new Integer(420);
        byte b = var.byteValue();
        short s = var.shortValue();
        double d = var.doubleValue();

        System.out.println("El valor de var = " + var);
        System.out.println("El valor de b = " + b);
        System.out.println("El valor de s = " + s);
        System.out.println("El valor de d = " + d);
    }
}
