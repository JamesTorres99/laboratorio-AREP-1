package edu.escuelaing.Arep;

import edu.escuelaing.Arep.Linkedlist;

public class Calculadora{
    
    public Calculadora(){}

    public static double mean(Linkedlist<Double> lista){   
        double suma=0.0;
        for (double val:lista)suma+=val;
        double respuesta=suma/lista.getsize();
        return respuesta;
    }

    public static double standarD(Linkedlist<Double> lista){
    	double sum = 0;
    	double llevo= mean(lista);
        int size=lista.getsize()-1;
        for (double val:lista){
            double result=val-llevo;
            sum=result*result;
        }
        llevo=Math.sqrt(sum/size);
        return llevo;
    }

}
    