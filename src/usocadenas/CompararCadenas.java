package usocadenas;

public class CompararCadenas {
    public void comparandoString() {
        String nombre = "Juan";
        
        if (nombre.equals("Juan")) {
            System.out.println("Sí corresponde");
        }
        
        nombre = "";
        if (nombre.isEmpty()) {
            System.out.println("La cadena esta vacia");
        }
        
        nombre = "FERNANDO LONDOÑO RAMIREZ";
        if (nombre.startsWith("FERNANDO")) {
            System.out.println("El nombre de la persona comienza con la " +
                    "palabra FERNANDO");
        }
        
        if (nombre.endsWith("RAMIREZ")) {
            System.out.println("El nombre de la persona termina con RAMIREZ");
        }
        
        //Tamaño de una cadena
        String miCadena = "este mi primer curso de java";
        int lenght = miCadena.length();
        System.out.println("El tamaño de mi cadena es: " + lenght);
        
        miCadena = "";
        if (miCadena.length() == 0) {
            System.out.println("Cadena vacia");
        }
        
        miCadena = "este es mi primer curso de java";
        String cadenaBuscada = "mi";
        int indice = miCadena.indexOf(cadenaBuscada);
        System.out.println("La posición donde se encontro la cadena fue: " + indice);
        char caracter = miCadena.charAt(2);
        System.out.println("El caracter en la posición 2 es: " + caracter);
        
        //Limpiar cadenas con espacios
        String cadenaConEspacios = "   esta es una cadena con espacios   ";
        System.out.println(cadenaConEspacios.trim());
        
        //Extraer subcadena
        String numCta = "7890 5432 8765 9975";
        String cuatroUltimosCaracteres = numCta.substring(5, 9);
        System.out.println(cuatroUltimosCaracteres);
        
    }
}
