package poo;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author jose
 * Clase que representa un empleado
 */
public class Empleado {
    /**
     * Atributos de la clase Empleado
     */
    protected String nombre;
    private double sueldo;
    protected Date altaContrato;

    /**
     * Constructor por defecto
     */
    public Empleado() {
    }

    /**
     * Constructor con parámetros
     * @param nombre
     * @param sueldo
     * @param agno
     * @param mes
     * @param dia
     */
    public Empleado(String nombre, double sueldo, int agno, int mes, int dia) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        GregorianCalendar cal = new GregorianCalendar(agno, mes - 1, dia);
        this.altaContrato = cal.getTime();
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    /**
     * Método que sube el sueldo del empleado
     * @param porcentaje
     */
    protected void subeSueldo(double porcentaje) {
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;
    }

    public static void main(String[] args) {
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
