package Modelo;

public class Estado_Pieza 
{
	private Boolean disponibilidad;

	public Estado_Pieza(Boolean disponibilidad) {
		super();
		this.disponibilidad = disponibilidad;
	}
	
	
	public Boolean getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(Boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

}
