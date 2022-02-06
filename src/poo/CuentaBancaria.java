package poo;

/**
 * @author jose
 * Clase que representa una cuenta bancaria
 */
public class CuentaBancaria {
    /**
     *
     */
    private int accountNumber;
    protected boolean activated;

    /**
     * Constructor de la clase
     * @param accountNumber
     */
    public CuentaBancaria(int accountNumber) {
        this.accountNumber = accountNumber;
        this.activated = false;
    }

    public boolean getActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
