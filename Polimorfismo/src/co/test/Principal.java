package co.test;

import co.domain.DirectorOverload;
import co.domain.DirectorOverride;
import co.domain.IntendenteOverload;

public class Principal {
    public static void main(String[] args) {

       /* DirectorOverload directorOverload = new DirectorOverload();
        IntendenteOverload intendenteOverload = new IntendenteOverload();

        directorOverload.datos("Juan", "Tinajero");
        directorOverload.sueldo(300,25);
        directorOverload.labores("Organizar labores");

        intendenteOverload.datos("Pedro", "Ramirez", "Cra8545");
        intendenteOverload.labores("Limpiar", "8");
*/

        DirectorOverride d2 = new DirectorOverride();
        d2.datos("Fernando");


    }
}
