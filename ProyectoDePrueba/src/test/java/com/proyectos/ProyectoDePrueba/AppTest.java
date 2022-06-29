package com.proyectos.ProyectoDePrueba;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	
    @Test
    public void esInfantil()
    {
        int n=5;
        assertEquals("Esta dentro de la poblacion INFANTIL",App.categoria(n));
    }
    
    @Test
    public void esJoven()
    {
        int n=28;
        assertEquals("Esta dentro de la poblacion JOVEN",App.categoria(n));
    }

    @Test
    public void esAdulto()
    {
        int n=50;
        assertEquals("Esta dentro de la poblacion ADULTA",App.categoria(n));
    }
    
    @Test
    public void esAdultoMayor()
    {
        int n=69;
        assertEquals("Esta dentro de la poblacion ADULTA MAYOR",App.categoria(n));
    }
    
    //COMENTADO PARA PROBAR
    @Test
    public void edadInvalida()
    {
        int n=-1;
        assertEquals("ERROR: Ingrese una edad valida.",App.categoria(n));
    }
	
}
