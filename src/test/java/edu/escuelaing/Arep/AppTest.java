package edu.escuelaing.Arep;

import org.junit.Test;
import org.junit.Assert;
import edu.escuelaing.Arep.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{	
	private final Calculadora calculadora = new Calculadora();
	private Linkedlist<Double> lista= new Linkedlist<Double>();
	private Linkedlist<Double> lista2= new Linkedlist<Double>();
	private Double resultadomean1,resultadomean2,resultadodev1,resultadodev2;
	private Double resultadomean1cal,resultadomean2cal,resultadodev1cal,resultadodev2cal;


    /**
     * Test Programa Principal
     * @throws Exception 
     */
	@Test
    public void testApp() throws Exception
    {	
    	lista=main.leer("test1.txt");
    	lista2=main.leer("test2.txt");
    	resultadomean1 = 550.6;
    	resultadomean2 = 60.32;
    	resultadodev1 = 572.03;
    	resultadodev2 = 62.26;
    	resultadomean1cal=calculadora.mean(lista);
    	resultadomean2cal=calculadora.mean(lista2);
    	resultadodev1cal=calculadora.standarD(lista);
    	resultadodev2cal=calculadora.standarD(lista2);
    	
    	Assert.assertEquals(resultadomean1, resultadomean1cal, 0.0);

    	Assert.assertEquals(resultadomean2, resultadomean2cal, 0.0);

    	Assert.assertEquals(resultadodev1, resultadodev1cal, 0.0);

    	Assert.assertEquals(resultadodev2, resultadodev2cal, 0.0);
    	
    }
    
    
    /**
     * Rigourous Test :-)
     * @throws Exception 
     */
	@Test
    public void testriguroso() throws Exception
    {	
    	lista=main.leer("resources\\Table_tests\\test1.txt");
    	lista2=main.leer("resources\\Table_tests\\test2.txt");
    	resultadomean1 = 115.83;
    	resultadomean2 = 30.68;
    	resultadodev1 = 84.51;
    	resultadodev2 = 18.53;
    	resultadomean1cal=calculadora.mean(lista);
    	resultadomean2cal=calculadora.mean(lista2);
    	resultadodev1cal=calculadora.standarD(lista);
    	resultadodev2cal=calculadora.standarD(lista2);
    	
    	Assert.assertEquals(resultadomean1, resultadomean1cal, 0.0);

    	Assert.assertEquals(resultadomean2, resultadomean2cal, 0.0);

    	Assert.assertEquals(resultadodev1, resultadodev1cal, 0.0);

    	Assert.assertEquals(resultadodev2, resultadodev2cal, 0.0);
    	
    	lista=main.leer("resources\\Table_tests\\test3.txt");
    	lista2=main.leer("resources\\Table_tests\\test4.txt");
    	resultadomean1 = 64.13;
    	resultadomean2 = 51.82;
    	resultadodev1 = 70.73;
    	resultadodev2 = 26.64;
    	resultadomean1cal=calculadora.mean(lista);
    	resultadomean2cal=calculadora.mean(lista2);
    	resultadodev1cal=calculadora.standarD(lista);
    	resultadodev2cal=calculadora.standarD(lista2);
    	
    	Assert.assertEquals(resultadomean1, resultadomean1cal, 0.0);

    	Assert.assertEquals(resultadomean2, resultadomean2cal, 0.0);

    	Assert.assertEquals(resultadodev1, resultadodev1cal, 0.0);

    	Assert.assertEquals(resultadodev2, resultadodev2cal, 0.0);
    }
   
}
