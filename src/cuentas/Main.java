package cuentas;

/**
 * The Class Main.
 * 
 * @version 2
 * @author anacaromarsolorzanoojeda
 * @since 02/03/2022
 * 
 */
public class Main {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		CCuenta cuenta1;
		double saldoActual = 0;

		cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
		operativa_cuenta(cuenta1, saldoActual, 1F);
	}

	/**
	 * Operativa cuenta.
	 *
	 * @version 1
	 * @see CCuenta
	 * @param cuenta1     the cuenta 1
	 * @param saldoActual the saldo actual
	 * @param cantidad    the cantidad
	 */
	private static void operativa_cuenta(CCuenta cuenta1, double saldoActual, float cantidad) {
		saldoActual = cuenta1.estado();
		System.out.println("El saldo actual es: " + saldoActual);

		try {
			cuenta1.retirar(2300);
		} catch (Exception e) {
			System.out.print("Fallo al retirar");
		}
		try {
			System.out.println("Ingreso en cuenta");
			cuenta1.ingresar(695);
		} catch (Exception e) {
			System.out.print("Fallo al ingresar");
		}
	}
}
