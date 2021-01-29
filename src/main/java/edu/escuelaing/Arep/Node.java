package edu.escuelaing.Arep;

/**
 * Clase nodo de la lista enlazada
 * @author Alexander Torres
 *
 * @param <d> tipo de dato en el nodo.
 */
public class Node<d> {
    d dato;
    Node<d> nodoSiguiente,nodoanterior;
    
    /**
     * Constructor de la clase.
     * @param data tipo de dato del nodo.
     * @param siguiente referencia al siguiente nodo.
     * @param anterior referencia al anterior nodo.
     */
    public Node(d data, Node<d> siguiente, Node<d> anterior ){
        this.dato=data;
        this.nodoSiguiente=siguiente;
        this.nodoanterior=anterior;
    }

    /**
     * Metodo get devuelve una referencia al nodo siguiente.
     * @return Node<d> retorna el nodo siguiente.
     */
    public Node<d> getnodoSiguiente (){
        return this.nodoSiguiente;
    }

    /**
     * Metodo get devuelve una referencia al nodo anterior.
     * @return Node<d> retorna el nodo anterior.
     */
    public Node<d> getnodoanterior (){
        return this.nodoanterior;
    }
    
    /**
     * Metodo get devuelve el dato almacenado.
     * @return d retorna el dato almacenado.
     */
    public d getdato (){
        return this.dato;
    }
    
    /**
     * Metodo set remplaza la referencia al dato siguinte.
     * @param nodo es el nodo a remplazar como referencia al dato siguiente.
     */
    public void setnodoSiguiente (Node<d> nodo){
        this.nodoSiguiente=nodo;
    }
    
    /**
     * Metodo set remplaza la referencia al dato anterior.
     * @param nodo es el nodo a remplazar como referencia al dato anterior.
     */
    public void setnodoanterior (Node<d> nodo){
        this.nodoanterior=nodo;
    }
	
	/**
	 * Metodo set remplaza el dato almacenado en el nodo.
	 * @param dato es el dato a remplazar por el dato anterior.
	 */
    public void setnodoSiguiente (d dato){
        this.dato=dato;
    }
}
