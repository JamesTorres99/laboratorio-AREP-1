package edu.escuelaing.Arep;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import edu.escuelaing.Arep.Calculadora;

import edu.escuelaing.Arep.Linkedlist;

/**
 * Clase main del proyecto
 * @author Alexander Torres
 *
 */
public class main {
    static Calculadora cal = new Calculadora();
    
    /**
     * Main del proyecto.
     * @param args Funcionalidad del main. 
     */
    public static void main(String[] args) {
        Linkedlist<Double> lista= new Linkedlist<Double>();
        Linkedlist<Double> lista2= new Linkedlist<Double>();
        try {
			lista=leer("test1.txt") ;
			lista2=leer("test2.txt") ;
			
		} catch (Exception e) {
			e.printStackTrace();
		}   
    
        double meanlista1=cal.mean(lista);
        double meanlista2=cal.mean(lista2);
        double desvlista1=cal.standarD(lista);
        double desvlista2=cal.standarD(lista2);

        System.out.println("mean table1 Column 1= "+meanlista1+"  desviation table Column 1= "+desvlista1);
        
        System.out.println("mean table1 Column 2= "+meanlista2+"  desviation table Column 2= "+desvlista2);

    }

    /**
     * Metodo que lee los ficheros y extrae los valores para usar en la lista enlazada.
     * @param fichero es la ubicacion del fichero a utilizar.
     * @return devuelve la lista enlazada con sus valores del fichero.
     * @throws Exception esta excepcion ocurre al leer el documento.
     */
    public static Linkedlist<Double> leer(String fichero) throws Exception{
        File archivo= new File(fichero);
        FileReader documento= new FileReader(archivo);
        BufferedReader reader = new BufferedReader(documento);
        String stringg= reader.readLine();
        Linkedlist<Double> lista= new Linkedlist<Double>();
        while( stringg != null){
            double valor= Double.parseDouble(stringg);
            lista.addini(valor);
            stringg = reader.readLine();
        }    
        return lista;
    }
}
