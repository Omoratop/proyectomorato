//Version 1.0
public class Morato {
	private String nombre;
	private String apellidos;
	private int edad;
	private String lugarNacimiento;
	private int anyoNacimiento;
	private String dni;
	
	public Morato(){
		nombre = "Oscar";
		apellidos = "Morato Prieto";
		edad = 43;
		lugarNacimiento = "St. Gallen (Suiza)";
		anyoNacimiento = 1975;
		dni = "345248450R";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getLugarNacimiento() {
		return lugarNacimiento;
	}

	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}

	public int getAnyoNacimiento() {
		return anyoNacimiento;
	}

	public void setAnyoNacimiento(int anyoNacimiento) {
		this.anyoNacimiento = anyoNacimiento;
	}
	
}
