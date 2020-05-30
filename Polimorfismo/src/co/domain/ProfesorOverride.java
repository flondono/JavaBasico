package co.domain;

import javax.swing.*;

public class ProfesorOverride extends EmpleadoOverride {


    @Override
    public void datos(String nombre) {
        JOptionPane.showMessageDialog(null, "El nombre es: " + nombre);
    }

    @Override
    public void labores(String labores) {
        JOptionPane.showMessageDialog(null, "Las labores son: " + labores);
    }

    @Override
    public void sueldo(double sueldo) {
        JOptionPane.showMessageDialog(null, "El pago es: " + sueldo);
    }
}
