package Modelo;

import java.util.List;

public class Pintura 
{
	private String dimensiones;
	private List<String> materiales;
	private Double peso;
	private Boolean requiereElectricidad;
	
	private String estilo;

	
	public Pintura(String dimensiones, List<String> materiales, Double peso, Boolean requiereElectricidad,
			String estilo) {
		super();
		this.dimensiones = dimensiones;
		this.materiales = materiales;
		this.peso = peso;
		this.requiereElectricidad = requiereElectricidad;
		this.estilo = estilo;
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


	public String getEstilo() {
		return estilo;
	}


	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}


}
