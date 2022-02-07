package poo;

/**
 * @author Jose Daniel Maza
 * Clase Jefe que hereda de Empleado
 */
public class Boss extends Employee {
    private String departamento;
    private double incentivo;

    /**
     * Constructor de la clase Jefe
     * @param nombre
     * @param departamento
     * @param incentivo
     */
    public Boss(String nombre, String departamento, double incentivo) {
        super(nombre);
        this.departamento = departamento;
        this.incentivo = incentivo;
    }

    /**
     * Metodos de la clase
     */

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getIncentivo() {
        return incentivo;
    }

    private  void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }

    @Override
    public String toString() {
        return "Jefe{" +
                "departamento='" + departamento + '\'' +
                ", incentivo=" + incentivo +
                '}';
    }
}




