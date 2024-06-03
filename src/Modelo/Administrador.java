package Modelo;

public class Administrador 
{




	private String nombre;
	private String correo;
	private String telefono;
	
	private String login;
	private String contraseña;
	
	private int ID;
	
	
	public Administrador(String nombre, String correo, String telefono, String login, String contraseña, int iD) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.telefono = telefono;
		this.login = login;
		this.contraseña = contraseña;
		ID = iD;
	}




	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	
	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	

}
