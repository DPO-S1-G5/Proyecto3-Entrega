package Modelo;

public class Fotografia 
{
	private String estilo;
	private String tamaño;
	
	private String resolucion;

	
	
	public Fotografia(String estilo, String tamaño, String resolucion) {
		super();
		this.estilo = estilo;
		this.tamaño = tamaño;
		this.resolucion = resolucion;
	}
	
	
	public String getEstilo() {
		return estilo;
	}



	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}



	public String getTamaño() {
		return tamaño;
	}



	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}



	public String getResolucion() {
		return resolucion;
	}



	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}


}
