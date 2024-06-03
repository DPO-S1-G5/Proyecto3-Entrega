package Modelo;

import java.sql.Date;

public class Medio_Pago 
{

	private String tipo;
	private Date fechaVenta;
	private Comprador comprador;
	
	private Double Monto;
	private String estado;
	

	
	
	public Medio_Pago(String tipo, Date fechaVenta, Comprador comprador, Double monto, String estado) {
		super();
		this.tipo = tipo;
		this.fechaVenta = fechaVenta;
		this.comprador = comprador;
		Monto = monto;
		this.estado = estado;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public Comprador getComprador() {
		return comprador;
	}

	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}

	public Double getMonto() {
		return Monto;
	}

	public void setMonto(Double monto) {
		Monto = monto;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}



	
}
