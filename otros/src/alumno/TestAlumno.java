package alumno;

import alumno.Alumno;

import javax.swing.JOptionPane;

/**
 *
 * @author Martin Jesus Perez Justicia
 * @version 1.0
 */
public class TestAlumno {
	//Comprobamos el funcionamiento de la clase Alumno
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre= JOptionPane.showInputDialog("Introduzca un nombre");
		String apellidos= JOptionPane.showInputDialog("Introduzca unos apellidos");
		String dni= JOptionPane.showInputDialog("Introduzca un dni");
		String curso= JOptionPane.showInputDialog("Introduzca un curso");
		String edad2= JOptionPane.showInputDialog("Introduzca un edad");
		int edad = Integer.parseInt(edad2);
		String direccion= JOptionPane.showInputDialog("Introduzca un direccion");
		String localidad= JOptionPane.showInputDialog("Introduzca un localidad");
		String telefono2= JOptionPane.showInputDialog("Introduzca un telefono");
		int telefono= Integer.parseInt(telefono2);
		
		Alumno a = new Alumno(nombre,apellidos,dni,curso,edad,direccion,localidad,telefono);
		System.out.println(a);
		JOptionPane.showMessageDialog(null, a, "vo que pasa", JOptionPane.INFORMATION_MESSAGE);
	}

}