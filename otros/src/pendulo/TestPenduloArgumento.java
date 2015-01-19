package pendulo;



/**
 * Programa que calcula el Periodo de un Pendulo
 * @author Diego Jesus Torres Peinado
 * @version 1.0
 */
public class TestPenduloArgumento {
	/**
	 * @param Recibe los valores desde la linea de comando como argumentos
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero = Double.parseDouble(args[0]);
		Pendulo p = new Pendulo(numero);
		System.out.println(p);
	}
}
