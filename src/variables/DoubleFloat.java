package variables;

public class DoubleFloat {

    public static void main(String[] args) {
        int valorEntero = 10 / 3; //32 bits
        float valorFlotante = 10f / 3f; //32 bits
        double valorDouble = 10d / 3d; //64 bits

        System.out.println("valorEntero = " + valorEntero);
        System.out.println("valorFlotante = " + valorFlotante);
        System.out.println("valorDouble = " + valorDouble);

        System.out.println("Tipo\tMínimo\tMáximo");
        System.out.println("byte\t" + Byte.MIN_VALUE + "\t" + Byte.MAX_VALUE);
        System.out.println("short\t" + Short.MIN_VALUE + "\t" + Short.MAX_VALUE);
        System.out.println("int\t" + Integer.MIN_VALUE + "\t" + Integer.MAX_VALUE);
        System.out.println("long\t" + Long.MIN_VALUE + "\t" + Long.MAX_VALUE);
        System.out.println("float\t" + Float.MIN_VALUE + "\t" + Float.MAX_VALUE);
        System.out.println("double\t" + Double.MIN_VALUE + "\t" + Double.MAX_VALUE);

    }
}
