package co.domain;

import javax.swing.*;

public class IntendenteOverload {

    public void datos(String nombre, String apellido, String direccion) {
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nApellidos: " + apellido +
                "\nDirección: " + direccion);

    }

    public void labores(String labores, String horas) {
        JOptionPane.showMessageDialog(null, "Soy Intendete y me dedico a : " + labores + "\ny trabajo: " + horas);
    }

    public void sueldo(int horas, double pagoHoras, double incentivo) {
        JOptionPane.showMessageDialog(null, "El pago es: " + horas * pagoHoras + "\n incentivo: " + incentivo);
    }
}
