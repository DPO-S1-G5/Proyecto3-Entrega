package Consola;

import java.util.List;

import Modelo.Administrador;

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


}