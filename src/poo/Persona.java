package poo;

import javax.swing.*;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Una clase que representa una persona y algunos de sus atributos.
 * @author Jose Daniel Maza
 */
public class Persona {

    /**
     * atributos de la clase.
     */
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public Float height;
    public Float weight;

    /**
     * Constructor por defecto.
     */
    public Persona(){
        this.name = "";
        this.lastName1 = "";
        this.lastName2 = "";
        this.dateBirth = new Date();
        this.height = 0.0f;
        this.weight = 0.0f;
    }

    /**
     * Constructor con parámetros.
     * @param name Nombre de la persona.
     * @param lastName1 Primer apellido de la persona.
     * @param lastName2 Segundo apellido de la persona.
     * @param dateBirth Fecha de nacimiento de la persona.
     * @param height Altura de la persona.
     * @param weight Peso de la persona.
     */
    public Persona(String name, String lastName1, String lastName2, int agno, int mes, int dia, Float height, Float weight){
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        GregorianCalendar cal = new GregorianCalendar(agno, mes - 1, dia);
        this.dateBirth = cal.getTime();
        this.height = height;
        this.weight = weight;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    //Metodos

    /**
     * @return Método que calcula el IMC de la persona.
     */
    public double calcularIMC(){
        double imc = weight / Math.pow(height, 2);
        return Math.round(imc * 10) / 10.0;
    }

    public String toString(){
        return "Name: " + name + "\n" +
                "LastName 1: " + lastName1 + "\n" +
                "LastName 2: " + lastName2 + "\n" +
                "BirthDate: " + dateBirth + "\n" +
                "Height: " + height + "\n" +
                "Weight: " + weight + "\n" +
                "IMC: "  +  name + " " + calcularIMC() + "\n";
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Jose", "Maza", "Arnedo", 1995,10,21, 1.74f, 76f);
        System.out.println(persona1);
        Persona persona2 = new Persona();
        persona2.setName(JOptionPane.showInputDialog("Ingrese su nombre"));
        persona2.setHeight(Float.parseFloat(JOptionPane.showInputDialog("Ingrese su altura en metros")));
        persona2.setWeight(Float.parseFloat(JOptionPane.showInputDialog("Ingrese su peso")));
        System.out.println(persona2);
    }


}
