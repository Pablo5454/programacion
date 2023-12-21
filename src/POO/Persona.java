package POO;

public class Persona {

	private String dni;
	private int añonacimiento;
	private String ciudad;
	private String pais;
	private String nombre;
	private int edad;

	public Persona(String d, int a, String c, String p, String n) {
		dni = d;
		añonacimiento = a;
		ciudad = c;
		pais = p;
		nombre = n;
	}

	public String getDni() {
		return dni;
	}

	public int getAñonacimiento() {
		return añonacimiento;
	}

	public String getCiudad() {
		return ciudad;
	}

	public String getPais() {
		return pais;
	}

	public String getNombre() {
		return nombre;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setAñonacimiento(int añonacimiento) {
		this.añonacimiento = añonacimiento;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int edad (int edad) {
		edad = 2023 - añonacimiento;
		return edad;
	}

	public String toString() {
		return ("Mi nombre es " + nombre + ", con DNI " + dni + ", nacido en " + ciudad + " (" + pais + ") en "
				+ añonacimiento + ". Tengo " + edad(edad)+ " años.");
	}

}
