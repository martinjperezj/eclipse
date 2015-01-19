package pendulo;

/**
 * Programa que calcula el periodo de un péndulo dado su longitud.
 * @author Diego Jesus Torres Peinado
 * @version 1.0
 */
public class Pendulo {
	public static final double gravedad=9.8;
	private double longitud;
	/**
	 * Constructor
	 * @param longitud
	 */
	public Pendulo(double longitud) {
		this.longitud = longitud;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	/**
	 * Metodo que calcula el periodo
	 * @return devuelve el valor del periodo
	 */
	public double calculaPeriodo(){
		return 2*Math.PI*(Math.sqrt(longitud/gravedad));
	}
	@Override
	public String toString() {
		return "la longitud del pendulo es = "+getLongitud()+ 
				" mts y su perido es = "+calculaPeriodo()+" seg";
	}
}