package edu.escuelaing.Arep;

import java.util.Iterator;
import java.util.List;
import edu.escuelaing.Arep.Node;

/**
 * Clase Linkedlist la cual es la lista enlazada.
 * @author Alexander Torres
 *
 * @param <d> es el tipo de objetos que contiene la lista enlazada.
 */
public class Linkedlist<d> implements Iterable<d>
{
    public Node<d> head,tail;
    private int size;

    /**
     * Constructor de la clase Linkedlist.
     */
    public Linkedlist (){
        this.head=null;
        this.tail=null;
        this.size=0;
    }

    /**
     * Metodo que agrega un nodo al inicio de la lista enlazada.
     * @param data es dato que se va a almacenar en el nodo.
     */
    
    public void addini (d data) {
    	Node<d> nodo = new Node<d>(data, this.head, null);
    	
    	if (this.head!=null)this.head.nodoanterior=nodo;    	
    	
    	else this.tail=nodo;
    	
    	this.head=nodo;
    	
    	size+=1;
    }
    
    /**
     * Metodo que agrega un nodo al final de la lista enlazada.
     * @param data es dato que se va a almacenar en el nodo.
     */
    public void addfin (d data) {
    	Node<d> nodo = new Node<d>(data, null , this.tail);
    	
    	if (this.tail!=null)this.tail.nodoSiguiente=nodo;    	
    	
    	else this.head=nodo;
    	
    	this.tail=nodo;
    	
    	size+=1;
    }
	
    /**
     * Metodo que elimina un nodo al inicio de la lista enlazada.
     */
    public void deleteini() {
	
    	if (this.head==null)return;
    	
    	this.head=this.head.getnodoSiguiente();
    	
    	if (this.head!=null)this.head.nodoanterior=null;
    		
    	else this.tail=null;
    	
    	size-=1;
    }
    
    /**
     * Metodo que elimina un nodo al final de la lista enlazada.
     */
    public void deletefin() {
    	 	
    	if (this.tail==null)return;
    	
    	this.head=this.head.getnodoSiguiente();
    	
    	if (this.tail!=null)this.tail.nodoSiguiente=null;
    		
    	else this.head=null;
    	
    	size-=1;	
    }
    
    /**
     * Retorna la cola de la lista enlazada.
     * @return tail el nodo cabeza de la lista enlazada.
     */
    public Node<d> gethead(){
        return head;
    }
    /**
     * Retorna la cola de la lista enlazada.
     * @return tail el nodo cola de la lista enlazada.
     */
    public Node<d> gettail(){
        return tail;
    }
    /**
     * Retorna el tamaño de la lista enlazada.
     * @return size el tamaño de la lista enlazada.
     */
    public int getsize(){
        return size;
    }

    /**
     * Metodo que reprensenta el iterador en la lista enlazada.
     * @return retorna el iterador de la lista enlazada.
     */
	@Override
	public Iterator<d> iterator() {
		 return new LinkedListIterator<d>(this);
		 }


		
}