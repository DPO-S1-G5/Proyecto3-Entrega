package Modelo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Galeria 

{
	private List<Pieza> listaDePiezas;
	public List<Pieza> getListaDePiezas() {
		return listaDePiezas;
	}



	public List<Oferta> getListaDeOferetas() {
		return listaDeOferetas;
	}

	public void setListaDeOferetas(List<Oferta> listaDeOferetas) {
		this.listaDeOferetas = listaDeOferetas;
	}

	

	public void setListaDeUsuarios(List<Usuario> listaDeUsuarios) {
		this.listaDeUsuarios = listaDeUsuarios;
	}

	public List<Subasta> getListaDeSubastas() {
		return listaDeSubastas;
	}

	public void setListaDeSubastas(List<Subasta> listaDeSubastas) {
		this.listaDeSubastas = listaDeSubastas;
	}

	public List<Historial_Venta> getListaDeHistorialVenta() {
		return listaDeHistorialVenta;
	}

	public void setListaDeHistorialVenta(List<Historial_Venta> listaDeHistorialVenta) {
		this.listaDeHistorialVenta = listaDeHistorialVenta;
	}

	private List<Oferta> listaDeOferetas;
	private List<Usuario> listaDeUsuarios;
	private List<Subasta> listaDeSubastas;
	private List<Historial_Venta> listaDeHistorialVenta;

	
	public Galeria(){
		this.listaDePiezas = new ArrayList<>();
		
		
	}
	
	public void agregarPieza(Pieza pieza)
	{
		listaDePiezas.add(pieza);
	}
	
/**
	public void manejarSubasta(Usuario usuario, Subasta subasta, double monto) throws IOException {
        // Operador inicia la subasta
        iniciarSubasta(subasta);
        
        // Usuario realiza una oferta
        Oferta oferta = new Oferta;
        boolean ofertaAceptada = subasta.registrarOferta(oferta);
        
        if (ofertaAceptada) {
            listaDeOfertas.add(oferta);
            
            // El sistema verifica la autenticidad del usuario y la seriedad de la compra
            boolean esUsuarioAutentico = verificarUsuario(usuario);
            
            if (esUsuarioAutentico && subasta.cerrarSubasta()) {
                // El operador cierra la subasta si se alcanza el precio establecido o se finaliza el tiempo
                Historial_Venta venta = new Historial_Venta(usuario, subasta.pieza, monto);
                listaDeHistorialVenta.add(venta);
                // Opcionalmente, escribir la venta en un archivo
                registrarVentaEnArchivo(venta);
            }
        }
    }
**/

    private void iniciarSubasta(Subasta subasta) {
        listaDeSubastas.add(subasta);
    }

    private boolean verificarUsuario(Usuario usuario) {
        return listaDeUsuarios.contains(usuario);
    }

    private void registrarVentaEnArchivo(Historial_Venta venta) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("ventas.txt", true))) {
            writer.write("Venta: " + venta.usuario + ", " + venta.pieza + ", " + venta.montoVenta);
            writer.newLine();
        }
    }
    
    public void registrarUsuario(Usuario usuario) {
        listaDeUsuarios.add(usuario);
    }
    
    public List<Usuario> getListaDeUsuarios()
    {
    	return listaDeUsuarios;
    }



    public void registrarPieza(Pieza pieza) {
        listaDePiezas.add(pieza);
    }

    public void consultarEstadoPiezas() { 
        for (Pieza pieza : listaDePiezas) {
            System.out.println(pieza.getEstado()); 
        }
    }

    public void consultarHistorialPiezas() {
        for (Historial_Venta venta : listaDeHistorialVenta) {
            System.out.println(venta.detalleVenta()); 
        }
    }

    public void actualizarPrecio(double nuevoPrecio, Pieza pieza) {

        pieza.setPrecio(nuevoPrecio);
    }

    public void cambiarEstado(Estado_Pieza estado, Pieza pieza) {
        pieza.setEstado(estado);
    }
    
    public void mostrarDetalles(Pieza pieza) {

        System.out.println(pieza);
    }


    public void cerrarSesion() 
    {
        
    }

    public void realizarPago(double monto, Usuario usuario) {

        System.out.println("Realizado pago de " + monto + " por el usuario " + usuario.getUsuario());
    }

    public void cancelarPago() {

        Usuario usuarioActual = null;
		System.out.println("Pago cancelado por el usuario " + (usuarioActual != null ? usuarioActual.getUsuario() : "Desconocido"));
    }

    public void aceptarOferta(Oferta oferta) {
        oferta.aceptar();
        
    }
    public void rechazarOferta(Oferta oferta) 
    {
        
    }

    public void cambiarDisponibilidad(Pieza pieza, boolean disponible) 
    {
        
    }



    public void finalizarSubasta(Subasta subasta) {
        //subasta.finalizar();
    }


    public void eliminarPieza(Pieza pieza) {
        listaDePiezas.remove(pieza);
    }
 

}