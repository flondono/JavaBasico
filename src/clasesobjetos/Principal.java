package clasesobjetos;

public class Principal {
    public static void main(String[] args) {
        
        Persona p1 = new Persona("Fernando", "Londono", 23,
                "M");
        
        Persona p2 = new Persona("Juan", "lopez", 30,
                "M");
        
        p1 = p2;
        p2.setNombre("Carlos");
        System.out.println(p1.getNombre());
        System.out.println(p1.getEdad());
        System.out.println(p1.getGenero());
        System.out.println(p1.getApellido());
        
        System.out.println(p1.getNombre());
        System.out.println(p1.getEdad());
        System.out.println(p1.getGenero());
        System.out.println(p1.getApellido());
        
        String var1 = "Hola";
        String var2 = "Hola";
        String var3 = new String("hola");
    }
}
