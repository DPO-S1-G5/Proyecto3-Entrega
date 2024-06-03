package Modelo;

import java.sql.Date;

public class Oferta 
{
	private Double valorOfrecido;
	private Comprador comprador;
	
	private Date fecha;
	private String estado;

	
	
	public Oferta(Double valorOfrecido, Comprador comprador, Date fecha, String estado) {
		super();
		this.valorOfrecido = valorOfrecido;
		this.comprador = comprador;
		this.fecha = fecha;
		this.estado = estado;
	}
	
	public Double getValorOfrecido() {
		return valorOfrecido;
	}

	public void setValorOfrecido(Double valorOfrecido) {
		this.valorOfrecido = valorOfrecido;
	}

	public Comprador getComprador() {
		return comprador;
	}

	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void aceptar() {
		// TODO Auto-generated method stub
		
	}



}
