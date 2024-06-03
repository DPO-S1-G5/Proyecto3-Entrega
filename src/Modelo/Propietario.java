package Modelo;

public class Propietario 
{
	private String nombre;
	private String telefono;
	private String fechaNacimiento;
	private String nacionalidad;
	private String correo;
	private String cuentaBancaria;
	
	private int ID;
	private String dirrecion;
	private String genero;

	
	public Propietario(String nombre, String telefono, String fechaNacimiento, String nacionalidad, String correo,
			String cuentaBancaria, int iD, String dirrecion, String genero) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.correo = correo;
		this.cuentaBancaria = cuentaBancaria;
		ID = iD;
		this.dirrecion = dirrecion;
		this.genero = genero;
	}
	
	
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getNacionalidad() {
		return nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getCuentaBancaria() {
		return cuentaBancaria;
	}


	public void setCuentaBancaria(String cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getDirrecion() {
		return dirrecion;
	}


	public void setDirrecion(String dirrecion) {
		this.dirrecion = dirrecion;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}

	
}
