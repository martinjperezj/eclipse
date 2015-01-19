package pendulo;


import java.util.Scanner;

/**
 * Programa que calcula el Periodo de un Pendulo
 * @author Diego Jesus Torres Peinado
 * @version 1.0
 */
public class TestPenduloScanner {
	/**
	 * @param Recibe el valor por la consola utilizando la clase Scanner
	 */
	public static void main(String[] args) {
		//En este ocasion pasamos el valor por Scanner
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce el valor de la longitud:");
		double numero = in.nextFloat();
		Pendulo p = new Pendulo(numero);
		System.out.println(p);
		in.close();
	}
}
