package poo;

/**
 * @author jose
 * Clase que representa una impresora
 */
public class Impresora {
    /**
     * Atributos de la clase
     */
    private String marca;
    private int modelo;
    public String color;
    public String tipoTinta;
    public String tipoPapel;

    /**
     * Constructor de la clase
     * @param marca
     * @param modelo
     * @param color
     * @param tipoTinta
     * @param tipoPapel
     */
    public Impresora (String marca, int modelo, String color, String tipoTinta, String tipoPapel){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipoTinta = tipoTinta;
        this.tipoPapel = tipoPapel;
    }

    /**
     * Metodos de la clase
     */
    public void imprimir(){
        System.out.println("Imprimiendo...");
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(int modelo){
        this.modelo = modelo;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setTipoTinta(String tipoTinta){
        this.tipoTinta = tipoTinta;
    }

    public void setTipoPapel(String tipoPapel){
        this.tipoPapel = tipoPapel;
    }

    public String getMarca(){
        return marca;
    }

    public int getModelo(){
        return modelo;
    }

    public String getColor(){
        return color;
    }

    public String getTipoTinta(){
        return tipoTinta;
    }

    public String getTipoPapel(){
        return tipoPapel;
    }

    public String toString(){
        return "Marca: " + marca + "\nModelo: " + modelo + "\nColor: " + color + "\nTipo de Tinta: " + tipoTinta + "\nTipo de Papel: " + tipoPapel;
    }


    public void Encender(){
        System.out.println("La impresora esta encendida");
    }

    public void Apagar(){
        System.out.println("La impresora esta apagada");
    }

    /**
     * Metodo que formatea la impresora
     * @param mensaje
     */
    private void formatear(String mensaje){
        System.out.println("--------------------");
        System.out.println(mensaje);
        System.out.println("--------------------");

    }

    public static void main(String[] args) {
        Impresora impresora = new Impresora("HP", 123, "negra", "a color", "Carta");
        impresora.Encender();
        impresora.formatear("Datos de la impresora");
        System.out.println(impresora);

    }
}
