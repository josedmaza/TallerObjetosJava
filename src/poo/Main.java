package poo;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Instancia clase Persona
        Persona persona1 = new Persona("Jose", "Maza", "Arnedo", 1995,10,21, 1.74f, 76f);
        System.out.println(persona1);
        Persona persona2 = new Persona();
        persona2.setName(JOptionPane.showInputDialog("Ingrese su nombre"));
        persona2.setHeight(Float.parseFloat(JOptionPane.showInputDialog("Ingrese su altura en metros")));
        persona2.setWeight(Float.parseFloat(JOptionPane.showInputDialog("Ingrese su peso")));
        System.out.println(persona2);

        // Instancia clase fruta
        Fruta Manzana = new Fruta("Manzana", 1.5f, new ArrayList<String>());
        Manzana.colors.add("Roja");
        Manzana.colors.add("Amarilla");
        System.out.println(Manzana);

        // Instancia clase Empleado
        Empleado[] empleados = new Empleado[3];

        empleados[0] = new Empleado("Jose", 2000, 1991, 10, 8);
        empleados[1] = new Empleado("Rocky", 3000, 1998, 5, 5);
        empleados[2] = new Empleado("Arturo", 4000, 1995, 4, 20);

        empleados[0].subeSueldo(5);
        empleados[1].subeSueldo(10);
        empleados[2].subeSueldo(20);

        for (Empleado empleado : empleados) {
            System.out.println("Empleado: " + empleado.getNombre() +"\nSueldo: " + empleado.getSueldo() +
                    "\nFecha de alta: " + empleado.altaContrato);
        }
    }
}
