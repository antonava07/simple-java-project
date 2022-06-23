package com.proyectos.ProyectoDePrueba;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	
	private static Scanner scanner;

	public static String categoria(int edad) {
	
		if(edad>=0 && edad<=14) {
			return "Esta dentro de la poblacion INFANTIL";
		}else if(edad>14 && edad<=29) {
			return "Esta dentro de la poblacion JOVEN";
		}else if(edad>29 && edad<=59) {
			return "Esta dentro de la poblacion ADULTA";
		}else if(edad>=60) {
			return"Esta dentro de la poblacion ADULTA MAYOR";
		}
		
		return "ERROR: Ingrese una edad valida.";

		
	}
	
    public static void main( String[] args )
    {
    	 scanner = new Scanner(System.in);
        System.out.println( "Ingrese su edad: " );
        
        if(scanner.hasNextInt()) {
            int numero = scanner.nextInt();    
            categoria(numero);
        }else {
        	System.out.println( "Debe ingresar solo numeros validos." );
        }

    }
}
