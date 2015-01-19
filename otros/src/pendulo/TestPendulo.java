package pendulo;



/**
 * Programa que calcula el Periodo de un Pendulo
 * @author Diego Jesus Torres Peinado
 * @version 1.0
 */
public class TestPendulo {
	public static void main(String[] args) {
		//Comprobamos el funcionamiento de la clase Pendulo
		Pendulo p = new Pendulo(23);
		System.out.println(p);
		p.setLongitud(42);
		System.out.println(p);
	}
}
