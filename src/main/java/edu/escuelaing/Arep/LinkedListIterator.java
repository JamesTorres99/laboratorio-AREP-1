package edu.escuelaing.Arep;

import java.util.Iterator;

/**
 * Clase que representa la lista enlazada.
 * @author Alexander Torres
 *
 * @param <d> tipo de dato que contiene la lista enlazada.
 */
public class LinkedListIterator<d> implements Iterator<d> {
	Node<d> nodo;
	
	/**
	 * Constructor de la clase LinkedListIterator que representa la lista enlazada.
	 * @param linkedlist lista enlazada utilizada.
	 */
	public LinkedListIterator(Linkedlist<d> linkedlist) {
		// TODO Auto-generated constructor stub
		this.nodo=linkedlist.head;
	}
	
	/**
	 * Metodo que verifica si la lista enlzada contenga elementos.
	 * @return retorna true si al revisar la lista enlazada esta tiene elementos.
	 */
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (nodo!=null)return true;
		else return false;
	}
	/**
	 * Metodo que retorna el siguiente elemento de la lista enlazada.
	 * @return retorna el siguiente elemento durante la iteracion.
	 */
	@Override
	public d next() {
		// TODO Auto-generated method stub
		d dato=nodo.getdato();
		nodo=nodo.getnodoSiguiente();
		return dato;
	}
	/**
	 * Metodo que remueve la iteracion.
	 */
	public void remove() {
	    }

}
