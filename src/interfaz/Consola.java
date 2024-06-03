package interfaz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import javax.swing.JFrame;

import proyecto_alquiler_carros_Modelo.*;
import proyecto_alquiler_carros_procesamiento.Procesador;


public class Consola {
	//Atributos
	private Sistema_alquiler sistema;
	private File archivoCategoria; 
	private File archivoClientes;
	private File archivoReservas;
	private File archivoSedes;
	private File archivoTemporadas;
	private File archivoUsuarios;
	private File archivoVehiculos;
	
	//Constructor
	public Consola() throws FileNotFoundException, IOException {

	}
	
	//Main
	public static void main(String[] args) throws IOException {
		Consola consola = new Consola();
		consola.menu();
	}
	

	private void menu() {
		new AgregarConductor();
		
	}

	
	
	public String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}
}

