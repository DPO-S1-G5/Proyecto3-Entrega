package Consola;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Sistema 
{
	
	public void ejecutarAplicacion()
	{
		System.out.println("BIENVENIDO AL SISTEMA DE  \n");
        System.out.println("A continuacion, se le presentara 5 categorias. Por favor, seleccione su categoria. \n");
        
        boolean continuar = true;
        
        while (continuar)
		{
			try
			{
				System.out.println("\nOpciones de la aplicación\n");
				System.out.println("1. ADMINISTRADOR\n");
				System.out.println("2. CAJERO\n");
				System.out.println("3. OPERADOR\n");
				System.out.println("4. COMPRADOR\n");
	            System.out.println("5. PROPIETARIO\n");
	            System.out.println("6. SALIR DE LA APLICACION\n");
	            
	            
	            int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));
	            
	            if (opcion_seleccionada == 1) {
	            	
	            	continuar = false;
	            	String login = input("Ingrese su login");
                    String contraseña = input("Ingrese su contraseña");
                    Empresa empresa = new Empresa();
                    Boolean respuesta = empresa.validarCedencialesAdmin(login, contraseña);
                    System.out.println(respuesta);
                    
                    if (respuesta == true)
                    {
                    	Consola_Administrador consola_A = new Consola_Administrador();
                        consola_A.mostrarMenu_Administrador();
                    }
                    else 
                    {
                    	System.out.println("Error en el Usuario o Contraseña. Volver a intentar.\n");
                    	
                    }
                    
	            }
	            
	          
	            
	            else if (opcion_seleccionada == 2) {
	            	
	            	
	            	continuar = false;
	            	Consola_Cajero consola_C = new Consola_Cajero();
                    consola_C.mostrarMenu_Cajero();
	            }
	            
	            

	            else if (opcion_seleccionada == 3) {
	            	
	            	
	            	continuar = false;
	            	Consola_Operador consola_O = new Consola_Operador();
                    consola_O.mostrarMenu_Operador();
	            }
	            

	            
	            else if (opcion_seleccionada == 4) {
	            	
	            	
	            	continuar = false;
	            	Consola_Comprador consola_C = new Consola_Comprador();
                    consola_C.mostrarMenu_Comprador();
	            }
	            
	            

	            else if (opcion_seleccionada == 5) {
	            	
	            	continuar = false;
	            	Consola_Propietario consola_P = new Consola_Propietario();
                    consola_P.mostrarMenu_Propietario();
	            }
	            
	            
	            else if (opcion_seleccionada == 6)
				{
					System.out.println("Saliendo de la aplicación ...");
					continuar = false;
				}
	            
	            else	
				{
					System.out.println("\nPor favor seleccione una opción válida.");
				}
			}
			catch (NumberFormatException e)
			{
				System.out.println("Debe seleccionar uno de los números de las opciones.");
			
			}
			
		}
        
	}
	
	
	
	
	
	
	
	
	
	
	
	
    public static void main(String[] args)
	{
    	Sistema consola = new Sistema();
		consola.ejecutarAplicacion();
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


