package edu.escuelaing.Arep;

import java.util.Iterator;
import java.util.List;
import edu.escuelaing.Arep.Node;
public class Linkedlist<d> implements Iterable<d>
{
    private Node<d> head,tail;
    private int size;

    public Linkedlist (){
        this.head=null;
        this.tail=null;
        this.size=0;
    }

    public void add(d data){
        Node<d> nudo = new Node<d>(data, null , null);
        if (head==null)head=nudo;
        else{
                nudo.setnodoanterior(tail);
                nudo.setnodoSiguiente(nudo);
        }
        tail=nudo;
        size+=1;
    }

    public void eliminar(double data){
        d valorhead=head.getdato();
        if(head!=null && valorhead.equals(data)){tail=head.getnodoSiguiente();size-=1;}
        
        else{
            Node<d> siguiente=null;
            Node<d>selec=head;
            while ((siguiente=selec.getnodoSiguiente())!=null){
                valorhead=siguiente.getdato();
                if (valorhead.equals(data)){ 
                    selec.setnodoSiguiente(siguiente.getnodoSiguiente());
                    siguiente.getnodoSiguiente().setnodoanterior(selec);
                    size-=1;
                    break;
                }
                selec=selec.getnodoSiguiente();
    		}
        }
    }

    public Node<d> gethead(){
        return head;
    }
    public Node<d> gettail(){
        return tail;
    }
    public int getsize(){
        return size;
    }

	@Override
	public Iterator iterator() {
		 return new LinkedListIterator<d>(this);
		 }


		
}