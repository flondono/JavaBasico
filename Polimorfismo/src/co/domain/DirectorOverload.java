package co.domain;

import javax.swing.*;

public class DirectorOverload extends EmpleadoOverload {
    //Utilizando polimorfismo overload

    public void datos(String nombre, String apellido) {
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + " \nApellidos: " + apellido);

    }

    public void labores(String labores) {
        JOptionPane.showMessageDialog(null, "Soy Directro y me dedico a : " + labores);
    }

    public void sueldo(int horas, double pagoHoras) {
        JOptionPane.showMessageDialog(null, "El pago es: " + horas * pagoHoras);
    }

}
