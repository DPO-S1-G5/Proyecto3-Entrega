package Consola;

import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

import Modelo.Administrador;
import Modelo.Comprador;
import Modelo.Galeria;
import Modelo.Propietario;
import Modelo.Usuario;

public class Empresa 
{

    private List<Administrador> Administradores;
    private String usuario = "admin1";
    private String contraseña1 = "1234";
    


    public boolean validarCedencialesAdmin(String login, String contraseña) 
    {
        Boolean encontrado = false;
    	if (usuario.equals(login) && contraseña1.equals(contraseña)) 
    	{
    		encontrado = true;
    	}
    	
    	return encontrado;
		
    }
    
    
    
    public void guardarCuenta(String nombre, String nacionalidad, String correo, String cedula, String tipoTarjeta,
            String telefono, String numeroTarjeta, String fechaNacimiento, String usuario, String contrasena,
            String tipoUsuario, Galeria galeria) 
    {
    	if (tipoUsuario.equals("Comprador")) {
            Comprador nuevoComprador = new Comprador(nombre, telefono, fechaNacimiento, nacionalidad, correo, numeroTarjeta, 0, "", "");
            galeria.registrarUsuario(new Usuario(usuario, contrasena, nombre, new Date(System.currentTimeMillis()), "Comprador"));
            guardarDatosEnArchivo(nuevoComprador, "comprador.txt");
        } else if (tipoUsuario.equals("Propietario")) {
            Propietario nuevoPropietario = new Propietario(nombre, telefono, fechaNacimiento, nacionalidad, correo, numeroTarjeta, 0, "", "");
            galeria.registrarUsuario(new Usuario(usuario, contrasena, nombre, new Date(System.currentTimeMillis()), "Propietario"));
            guardarDatosEnArchivo(nuevoPropietario, "propietario.txt");
        }

        
        System.out.println("Cuenta creada exitosamente: " + usuario);
    }
    
    
    private void guardarDatosEnArchivo(Object usuario, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            if (usuario instanceof Comprador) {
                Comprador comprador = (Comprador) usuario;
                writer.write("Nombre: " + comprador.getNombre());
                writer.write(", Nacionalidad: " + comprador.getNacionalidad());
                writer.write(", Correo: " + comprador.getCorreo());
                writer.write(", Cédula: " + comprador.getID());
                writer.write(", Tipo de tarjeta: " + comprador.getCuentaBancaria());
                writer.write(", Teléfono: " + comprador.getTelefono());
                writer.write(", Número de tarjeta: " + comprador.getCuentaBancaria());
                writer.write(", Fecha de nacimiento: " + comprador.getFechaNacimiento());
                writer.write(", Dirección: " + comprador.getDirrecion());
                writer.write(", Género: " + comprador.getGenero());
                writer.newLine();
            } else if (usuario instanceof Propietario) {
                Propietario propietario = (Propietario) usuario;
                writer.write("Nombre: " + propietario.getNombre());
                writer.write(", Nacionalidad: " + propietario.getNacionalidad());
                writer.write(", Correo: " + propietario.getCorreo());
                writer.write(", Cédula: " + propietario.getID());
                writer.write(", Tipo de tarjeta: " + propietario.getCuentaBancaria());
                writer.write(", Teléfono: " + propietario.getTelefono());
                writer.write(", Número de tarjeta: " + propietario.getCuentaBancaria());
                writer.write(", Fecha de nacimiento: " + propietario.getFechaNacimiento());
                writer.write(", Dirección: " + propietario.getDirrecion());
                writer.write(", Género: " + propietario.getGenero());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}