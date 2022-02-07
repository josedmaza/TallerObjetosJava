package poo;

import java.util.ArrayList;

/**
 * Clase que representa una fruta
 * @author Jose Daniel Maza
 */
public class Fruit {
    /**
     * Atributos de la clase
     */
    public String name;
    private Float averageWeight;
    public ArrayList<String> colors;

    /**
     * Constructor por defecto
     */
    public Fruit(){
    }

    /**
     * Constructor con parametros
     * @param name
     * @param averageWeight
     * @param colors
     */
    public Fruit(String name, Float averageWeight, ArrayList<String> colors) {
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
        return "Fruta" + "\n" +
                "name: " + name + "\n" +
                "averageWeight: " + averageWeight + "\n" +
                "colors: " + colors;
    }
}


