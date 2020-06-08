package co.test;

import co.domain.Animal;
import co.domain.Hombre;
import co.domain.Persona;

public class Principal {

    public static void main(String[] args) {

        Animal oso = new Animal();
        Persona ana = new Persona();

        oso.setRaza("Oso Pardo");
        oso.caminar();
        oso.comer();
        oso.dormir();

        ana.setNumControl("1040475");
        ana.caminar();
        ana.bailar("ana");

        Hombre fernando = new Hombre();
        fernando.setNombre("fernando");
        fernando.setNumControl("45456");
        fernando.trabajar(fernando.getNombre(), fernando.getNumControl());
    }
}
