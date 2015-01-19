package persona;

public class Persona {
	private String nombre;
	private int edad;
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	/**Crear metodo que devuelve si es mayor de edad
	 * @return true si es mayor de edad
	 */
	public boolean esMayorDeEdad(){
		return this.edad>18;		
	}
}