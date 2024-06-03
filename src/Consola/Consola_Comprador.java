package Consola;

import java.util.Scanner;

public class Consola_Comprador 
{
	public void mostrarMenu_Comprador()
	{
		Scanner scanner = new Scanner (System.in);
		boolean continuar = true;
        
		while (continuar)
		{

			try {
				
				System.out.println("\n BIENVENIDO COMPRADOR \n");
		        System.out.println("1. Consultar inventario");
		        System.out.println("2. Adquirir Pieza");
		        System.out.println("3. Participar en subasta");
		    
		        
		        System.out.print("Ingrese su opcion: ");
		        
		        int opcion_seleccionada = Integer.parseInt(scanner.nextLine());
		        
		        switch (opcion_seleccionada) 
		        {
		        case 1:
		        	System.out.println("Hola");
		        	continuar = false;
		        	break;
		        
		        case 2:
		        	System.out.println("Hola");
		        	continuar = false;
		        	break;
		        	
		        case 3:
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
