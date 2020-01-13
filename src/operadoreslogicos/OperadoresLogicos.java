package operadoreslogicos;

public class OperadoresLogicos {
    public static void main(String[] args) {
        String sexo = "hombre";
        int edad = 18;
        
        //Uso de operador &&(AND)
        if (sexo.equalsIgnoreCase("hombre") && edad == 18) {
            System.out.println("La persona es un hombre y tiene 18 años");
        } else {
            System.out.println("La persona no es un hombre o no tiene 18 años");
        }
        
        //Uso del operador || OR
        if (sexo.equalsIgnoreCase("hombre") || edad == 18) {
            System.out.println("La persona es un hombre y tiene 18 años");
        } else {
            System.out.println("La persona no es un hombre o no tiene 18 años");
        }
        
        //Uso de operador !
        if (!sexo.equals("hombre")) {
            System.out.println("El personaje es un hombre");
        }
    }
}