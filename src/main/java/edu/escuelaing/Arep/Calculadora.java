package edu.escuelaing.Arep;

import edu.escuelaing.Arep.Linkedlist;

/**
 * clase calculadora de estadistica.
 * @author Alexander Torres
 *
 */
public class Calculadora{
    
	/**
	 * Constructor de la clase Calculadora.
	 */
    public Calculadora(){}

    /**
     * Metodo que calcula la media de los datos en la lista enlazada.
     * @param lista la lista enlazada a tratar.
     * @return respuesta de la media de la lista enlazada.
     */
    public static double mean(Linkedlist<Double> lista){   
        double suma=0.0;
        for (double val:lista)suma+=val;
        double respuesta=suma/lista.getsize();
        respuesta= Math.round(respuesta * 100.0) / 100.0;
        return respuesta;
    }

    /**
     * Metodo que calcula la desviacion estandar de los datos en la lista enlazada.
     * @param lista la lista enlazada a tratar.
     * @return respuesta de la desviacion estandar de la lista enlazada.
     */
    public static double standarD(Linkedlist<Double> lista){
    	double sum = 0.0;
    	double llevo= mean(lista);
        int size=lista.getsize()-1;
        for (double val:lista){
            double result=val-llevo;
            sum+=result*result;
        }
        llevo=Math.sqrt(sum/size);
        llevo= Math.round(llevo * 100.0) / 100.0;
        return llevo;
    }

}
    