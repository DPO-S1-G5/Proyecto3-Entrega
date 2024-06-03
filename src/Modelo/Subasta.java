package Modelo;

import java.sql.Date;
import java.util.List;

public class Subasta 
{
	
	private Date fechaInicio;
	private Date fechasFin;
	private List<Pieza> piezas;
	private Double valorMinimo;
	private Double valorInicial;
	
	
	public Subasta(Date fechaInicio, Date fechasFin, List<Pieza> piezas, Double valorMinimo, Double valorInicial) {
		super();
		this.fechaInicio = fechaInicio;
		this.fechasFin = fechasFin;
		this.piezas = piezas;
		this.valorMinimo = valorMinimo;
		this.valorInicial = valorInicial;
	}
	
	
	public Date getFechaInicio() {
		return fechaInicio;
	}


	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}


	public Date getFechasFin() {
		return fechasFin;
	}


	public void setFechasFin(Date fechasFin) {
		this.fechasFin = fechasFin;
	}


	public List<Pieza> getPiezas() {
		return piezas;
	}


	public void setPiezas(List<Pieza> piezas) {
		this.piezas = piezas;
	}


	public Double getValorMinimo() {
		return valorMinimo;
	}


	public void setValorMinimo(Double valorMinimo) {
		this.valorMinimo = valorMinimo;
	}


	public Double getValorInicial() {
		return valorInicial;
	}


	public void setValorInicial(Double valorInicial) {
		this.valorInicial = valorInicial;
	}

		

}
