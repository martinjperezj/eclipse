package alumno;

/**
 * Clase que representa un alumno de Ciclo Formativo de grado superior
 * @author Diego Jesus Torres Peinado
 * @version 1.0
 */
public class Alumno {
	//Atributos
	private String nombre;
	private String apellidos;
	private String dni;
	private String curso;
	private int edad;
	private String direccion;
	private String localidad;
	private int telefono;
	
	/**
	 * @param nombre del alumno
	 * @param apellidos del alumno
	 * @param dni del alumno
	 * @param curso del alumno
	 * @param edad del alumno
	 * @param direccion del alumno
	 * @param localidad del alumno
	 * @param telefono del alumno
	 */
	public Alumno(String nombre, String apellidos, String dni, String curso,
			int edad, String direccion, String localidad, int telefono) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.curso = curso;
		this.edad = edad;
		this.direccion = direccion;
		this.localidad = localidad;
		this.telefono = telefono;
	}
	/**
	 * @return retorna el nombre del alumno
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param permite cargar un nombre al alumno
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return retorna los apellidos del alumno
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param permite cargar unos apellidos al alumno
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * @return retorna el dni del alumno
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * @param permite cargar un dni al alumno
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * @return retorna el curso del alumno
	 */
	public String getCurso() {
		return curso;
	}
	/**
	 * @param permite asignar un curso al alumno
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}
	/**
	 * @return retorna la edad del alumno
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param permite cargar un edad al alumno
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * @return retorna la dirección del alumno
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param permite cargar un dirección al alumno
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return retorna la localidad del alumno
	 */
	public String getLocalidad() {
		return localidad;
	}
	/**
	 * @param permite cargar un localidad al alumno
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	/**
	 * @return retorna el teléfono del alumno
	 */
	public int getTelefono() {
		return telefono;
	}
	/**
	 * @param permite cargar un teléfono al alumno
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Alumno\n\tnombre: " + nombre + "\n\tapellidos: " + apellidos
				+ "\n\tdni: " + dni + "\n\tcurso: " + curso + "\n\tedad: " + edad
				+ "\n\tdireccion: " + direccion + "\n\tlocalidad: " + localidad
				+ "\n\ttelefono: " + telefono;
	}
	
}