package poo;

import java.util.ArrayList;

/**
 * Clase que representa una fruta
 * @author Jose Daniel Maza
 */
public class Fruta {
    /**
     * Atributos de la clase
     */
    public String name;
    private Float averageWeight;
    public ArrayList<String> colors;

    /**
     * Constructor por defecto
     */
    public Fruta(){
    }

    /**
     * Constructor con parametros
     * @param name
     * @param averageWeight
     * @param colors
     */
    public Fruta(String name, Float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    @Override
    public String toString() {
        return "poo.Fruta" + "\n" +
                "name: " + name + "\n" +
                "averageWeight: " + averageWeight + "\n" +
                "colors: " + colors;
    }

    public static void main(String[] args) {
        Fruta Manzana = new Fruta("Manzana", 1.5f, new ArrayList<String>());
        Manzana.colors.add("Roja");
        Manzana.colors.add("Amarilla");
        System.out.println(Manzana);
    }
}


