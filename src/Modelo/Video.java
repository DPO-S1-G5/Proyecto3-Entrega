package Modelo;

public class Video 
{
	private Double duracion;
	private String tamaño;
	private String estilo;
	
	private String resolucion;
	
	
	public Video(Double duracion, String tamaño, String estilo, String resolucion) {
		super();
		this.duracion = duracion;
		this.tamaño = tamaño;
		this.estilo = estilo;
		this.resolucion = resolucion;
	}
	
	
	public Double getDuracion() {
		return duracion;
	}


	public void setDuracion(Double duracion) {
		this.duracion = duracion;
	}


	public String getTamaño() {
		return tamaño;
	}


	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}


	public String getEstilo() {
		return estilo;
	}


	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}


	public String getResolucion() {
		return resolucion;
	}


	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}



}
