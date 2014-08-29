package tdd.tp0;

/**
* <h1>Clase BasicQueueNode</h1>
* Implementa el nodo de una Cola básica implementada como lista enlazada.
* <p>
* 
* @author  Federico Rossi (federicomrossi@gmail.com)
* @version 1.0
* @since   2014-08-28
*/
public class BasicQueueNode {
	
	private Object element = null;
	private BasicQueueNode next = null;
	
	public BasicQueueNode(Object element)
	{
		this.element = element;
	}
	
	public BasicQueueNode(Object element, BasicQueueNode next)
	{
		this.element = element;
		this.next = next;
	}
	
	public Object getElement()
	{
		return this.element;
	}
	
	public BasicQueueNode getNext()
	{
		return this.next;
	}
	
	public void setNext(BasicQueueNode newNext)
	{
		this.next = newNext;
	}
	
	public boolean hasNext() {
		return this.next != null;
	}
}
