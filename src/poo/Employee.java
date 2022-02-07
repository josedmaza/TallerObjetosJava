package poo;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author jose
 * Clase que representa un empleado
 */
public class Employee {
    /**
     * Atributos de la clase Empleado
     */
    protected String nombre;
    private double sueldo;
    protected Date altaContrato;

    /**
     * Constructor por defecto
     */
    public Employee() {
    }

    /**
     * Constructor con parámetros
     * @param nombre
     * @param sueldo
     * @param agno
     * @param mes
     * @param dia
     */
    public Employee(String nombre, double sueldo, int agno, int mes, int dia) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        GregorianCalendar cal = new GregorianCalendar(agno, mes - 1, dia);
        this.altaContrato = cal.getTime();
    }

    public Employee(String nombre) {
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
        Employee[] empleados = new Employee[3];

        empleados[0] = new Employee("Jose", 2000, 1991, 10, 8);
        empleados[1] = new Employee("Rocky", 3000, 1998, 5, 5);
        empleados[2] = new Employee("Arturo", 4000, 1995, 4, 20);

        empleados[0].subeSueldo(5);
        empleados[1].subeSueldo(10);
        empleados[2].subeSueldo(20);

        for (Employee empleado : empleados) {
            System.out.println("Empleado: " + empleado.getNombre() +"\nSueldo: " + empleado.getSueldo() +
                    "\nFecha de alta: " + empleado.altaContrato);
        }

    }
}
