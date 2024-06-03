package Modelo;

import java.sql.Date;

public class Pieza 
{
	
	private String titulo;
	private Date añoCreacion;
	private String lugarCreacion;
	private String autor;
	private String detalles;
	private Estado_Pieza estado;
	private Date fechaIngreso;
	private Date fechaDevolucion;
	
	private int ID;
	private Double precio;
	private String condicion;
	
    private Escultura escultura;
    private Pintura pintura;
    private Video video;
    private Fotografia fotografia;
    private Impresiones impresion;
    
    
    
    public Pieza(String titulo, Date añoCreacion, String lugarCreacion, String autor, String detalles,
			Estado_Pieza estado, Date fechaIngreso, Date fechaDevolucion, int iD, Double precio, String condicion,
			Escultura escultura, Pintura pintura, Video video, Fotografia fotografia, Impresiones impresion) {
		super();
		this.titulo = titulo;
		this.añoCreacion = añoCreacion;
		this.lugarCreacion = lugarCreacion;
		this.autor = autor;
		this.detalles = detalles;
		this.estado = estado;
		this.fechaIngreso = fechaIngreso;
		this.fechaDevolucion = fechaDevolucion;
		ID = iD;
		this.precio = precio;
		this.condicion = condicion;
		this.escultura = escultura;
		this.pintura = pintura;
		this.video = video;
		this.fotografia = fotografia;
		this.impresion = impresion;
	}
    
    
    
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public Date getAñoCreacion() {
		return añoCreacion;
	}


	public void setAñoCreacion(Date añoCreacion) {
		this.añoCreacion = añoCreacion;
	}


	public String getLugarCreacion() {
		return lugarCreacion;
	}

	public void setLugarCreacion(String lugarCreacion) {
		this.lugarCreacion = lugarCreacion;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getDetalles() {
		return detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}

	public Estado_Pieza getEstado() {
		return estado;
	}

	public void setEstado(Estado_Pieza estado) {
		this.estado = estado;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getCondicion() {
		return condicion;
	}

	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}
    
   
   
	
	
	
	
    public Pieza(Escultura escultura) {
        this.escultura = escultura;
    }
    
    public Pieza(Pintura pintura) {
        this.pintura = pintura;
    }
    
    public Pieza(Video video) {
        this.video = video;
    }
    
    public Pieza(Fotografia fotografia) {
        this.fotografia = fotografia;
    }
    
    public Pieza(Impresiones impresion) {
        this.impresion = impresion;
    }
	

}
