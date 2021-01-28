package edu.escuelaing.Arep;

public class Node<d> {
    d dato;
    Node<d> nodoSiguiente,nodoanterior;
    
    public Node(d data, Node<d> siguiente, Node<d> anterior ){
        dato=data;
        nodoSiguiente=siguiente;
        nodoanterior=anterior;
    }

    public Node<d> getnodoSiguiente (){
        return this.nodoSiguiente;
    }

    public Node<d> getnodoanterior (){
        return this.nodoanterior;
    }

    public d getdato (){
        return this.dato;
    }
    
    public void setnodoSiguiente (Node<d> nodo){
        this.nodoSiguiente=nodo;
    }
    
    public void setnodoanterior (Node<d> nodo){
        this.nodoanterior=nodo;
    }

    public void setnodoSiguiente (d dato){
        this.dato=dato;
    }
}
