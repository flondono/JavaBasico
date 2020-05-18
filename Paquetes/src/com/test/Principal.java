package com.test;

import com.clases.Alumno;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Alumno.setCuotaSemestral(500);
        Alumno alumno = new Alumno();
        solictaInformacion(alumno);
        muestraInformacion(alumno);
    }

    public static void muestraInformacion(Alumno alumno) {

        System.out.println();
        System.out.println("Nombre: " + alumno.getNombre());
        System.out.println("Edad: " + alumno.getEdad());
        System.out.println("Calificación: " + alumno.getCalificacion());
        System.out.println("Cuota semestral: " + Alumno.getCuotaSemestral());
        System.out.println();
    }

    public static void solictaInformacion(Alumno alumno) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Nombre del alumno: ");
        String nombre = entrada.nextLine();
        alumno.setNombre(nombre);

        System.out.print("Edad de " + alumno.getNombre() + ": ");
        int edad = entrada.nextInt();
        alumno.setEdad(edad);

        System.out.print("Califiación de " + alumno.getNombre() + ": ");
        double cal = entrada.nextDouble();
        alumno.setCalificacion(cal);
    }
}
