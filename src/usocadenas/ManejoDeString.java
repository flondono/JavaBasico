package usocadenas;

public class ManejoDeString {
    
    public void mostrarCadenas() {
        String mensaje1 = "Entrada de datos o cadena válida";
        String mensaje2 = "";
        String mensaje3 = null;
        mensaje1 += " esta es una concatenación";
        
        //Uniendo strings
        String nombre = "Juan";
        String apellido = "Perez";
        String nombreCompleto = nombre + " " + apellido;
        //System.out.println(nombreCompleto);
        
        //Concatenación de cadenas y números
        double precio = 100.60;
        String mensaje ="Precio: " + precio;
        //System.out.println(mensaje);
        
        /*Caracteres especiales en String
        \n nueva linea
        \t tabulación
        \r retorno de carro
        \n nueva linea
        \" doble comillas
        \\ backslash
        * */
        String caracterEspecial;
        caracterEspecial ="CÓDIGO: JSP\nPrecio: $50.00";
        caracterEspecial ="CÓDIGO:\tJSP\t\r\nPrecio:\t$60.0";
        caracterEspecial ="presionar la letra \"x\" para salir";
        caracterEspecial ="c:\\java\\ejercios";
        System.out.println(caracterEspecial);
    }
}
