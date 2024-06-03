package Modelo;

import java.util.List;

public class Impresiones 
{

	private String dimensiones;
	private List<String> materiales;
	private Double peso;
	private Boolean requiereElectricidad;
	
	private String Tecnica;
	private String calidad;

	
	
	
	public Impresiones(String dimensiones, List<String> materiales, Double peso, Boolean requiereElectricidad,
			String tecnica, String calidad) {
		super();
		this.dimensiones = dimensiones;
		this.materiales = materiales;
		this.peso = peso;
		this.requiereElectricidad = requiereElectricidad;
		Tecnica = tecnica;
		this.calidad = calidad;
	}
	
	public String getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}

	public List<String> getMateriales() {
		return materiales;
	}

	public void setMateriales(List<String> materiales) {
		this.materiales = materiales;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Boolean getRequiereElectricidad() {
		return requiereElectricidad;
	}

	public void setRequiereElectricidad(Boolean requiereElectricidad) {
		this.requiereElectricidad = requiereElectricidad;
	}

	public String getTecnica() {
		return Tecnica;
	}

	public void setTecnica(String tecnica) {
		Tecnica = tecnica;
	}

	public String getCalidad() {
		return calidad;
	}

	public void setCalidad(String calidad) {
		this.calidad = calidad;
	}


	
}
