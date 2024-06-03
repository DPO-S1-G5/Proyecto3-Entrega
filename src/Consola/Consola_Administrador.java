package Consola;

import java.util.Scanner;

public class Consola_Administrador 

{
	public void mostrarMenu_Administrador()
	{
		Scanner scanner = new Scanner (System.in);
		boolean continuar = true;
        
		while (continuar)
		{

			try {
				
				System.out.println("\n BIENVENIDO ADMINISTRADOR \n");
		        System.out.println("1. Registrar ingreso de nueva pieza");
		        System.out.println("2. Registrar venta");
		        System.out.println("3. Registrar devolucion");
		        System.out.println("4. Cambiar valor maximo de compras a usuario");
		        
		        System.out.print("Ingrese su opcion: ");
		        
		        int opcion_seleccionada = Integer.parseInt(scanner.nextLine());
		        
		        switch (opcion_seleccionada) 
		        {
		        case 1:
		        	System.out.println("Hola");
		        	
		        	System.out.print("Ingrese su login: ");
		        	String login = scanner.nextLine();
		        	
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
		        
		        case 4:
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



    public static void main(String[] args)
	{
    	Consola_Administrador consola = new Consola_Administrador();
		consola.mostrarMenu_Administrador();
	}

	
	
	
}
