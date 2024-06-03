package Modelo;

import java.sql.Date;

public class Usuario 
{
	private String usuario;
	private String contraseña;
	
	private String nombreCompleto;
	private Date fechaCreacion;
	private String tipo;

	
	
	public Usuario(String usuario, String contraseña, String nombreCompleto, Date fechaCreacion, String tipo) {
		super();
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.nombreCompleto = nombreCompleto;
		this.fechaCreacion = fechaCreacion;
		this.tipo = tipo;
	}
	
	
	public String getUsuario() {
		return usuario;
	}



	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}



	public String getContraseña() {
		return contraseña;
	}



	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}



	public String getNombreCompleto() {
		return nombreCompleto;
	}



	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}



	public Date getFechaCreacion() {
		return fechaCreacion;
	}



	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


}
