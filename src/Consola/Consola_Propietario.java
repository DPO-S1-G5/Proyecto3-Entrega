package Consola;

import java.util.Scanner;

public class Consola_Propietario 
{
	public void mostrarMenu_Propietario()
	{
		Scanner scanner = new Scanner (System.in);
		boolean continuar = true;
        
		while (continuar)
		{

			try {
				
				System.out.println("\n BIENVENIDO PROPIETARIO \n");
		        System.out.println("1. Consultar Piezas");
		        
		        
		        System.out.print("Ingrese su opcion: ");
		        
		        int opcion_seleccionada = Integer.parseInt(scanner.nextLine());
		        
		        switch (opcion_seleccionada) 
		        {
		        case 1:
		        	System.out.println("Hola");
		        	continuar = false;
		        	break;
	        
		        default:
		        	System.out.println("\nPor favor seleccione una opcion valida.");
				}
			}
			catch (NumberFormatException e)
			{
				System.out.println("Debe seleccionar uno de los numeros de las opciones.");
			}
		
		}
		
		scanner.close();
	}

}
