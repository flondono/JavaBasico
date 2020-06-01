package co.domain;

import javax.swing.*;

public class Amable extends Cualidad {

    @Override
    public void describir() {
        JOptionPane.showMessageDialog(null, "Se porta bien con las personas", "Soy amable", 1);

    }
}
