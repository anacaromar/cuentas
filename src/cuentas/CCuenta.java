package cuentas;

/**
 * The Class CCuenta.
 * 
 * @version 2
 * @author anacaromarsolorzanoojeda
 * @since 02/03/2022
 * 
 */
public class CCuenta {

	/** The nombre. */
	private String nombre;

	/** The cuenta. */
	private String cuenta;

	/** The saldo. */
	private double saldo;

	/** The tipo interes. */
	private double tipoInteres;

	/**
	 * Instantiates a new c cuenta.
	 */
	public CCuenta() {
	}

	/**
	 * Instantiates a new c cuenta.
	 *
	 * @param nom  the nom
	 * @param cue  the cue
	 * @param sal  the sal
	 * @param tipo the tipo
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		setNombre(nom);
		setCuenta(cue);
		saldo = sal;
	}

	/**
	 * Gets the tipo interes.
	 *
	 * @return the tipoInteres
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * Sets the tipo interes.
	 *
	 * @param tipoInteres the tipoInteres to set
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	/**
	 * Gets the cuenta.
	 *
	 * @return the cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Sets the cuenta.
	 *
	 * @param cuenta the cuenta to set
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Estado.
	 *
	 * @return the double
	 */
	public double estado() {
		return saldo;
	}

	/**
	 * Ingresar.
	 *
	 * @param cantidad the cantidad
	 * @throws Exception the exception
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		saldo = saldo + cantidad;
	}

	/**
	 * Retirar.
	 *
	 * @param cantidad the cantidad
	 * @throws Exception the exception
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		saldo = saldo - cantidad;
	}

}
