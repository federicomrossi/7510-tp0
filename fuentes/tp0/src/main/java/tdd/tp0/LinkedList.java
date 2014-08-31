package tdd.tp0;

/**
* <h1>Clase LinkedList</h1>
* Implementa una Lista Enlazada cuyas operaciones se encuentran acotadas a unas pocas operaciones elementales.
* <p>
* 
* @author  Federico Rossi (federicomrossi@gmail.com)
* @version 1.0
* @since   2014-08-30
*/
public class LinkedList {
	
	LinkedListNode top = new LinkedListNodeTop();

	public LinkedList() { }

	/**
	 * <h2>size()</h2>
	 * Retorna el tamaño actual de la lista, es decir, la cantidad de elementos que contiene.
	 * <p>
	 * 
	 * @return	Integer que representa la cantidad de elementos.
	 */
	public int size()
	{
		return this.top.sizeOfChainOfNodes();
	}
	
	/**
	 * <h2>insertBottom()</h2>
	 * Permite insertar un elemento detrás del último elemento de la lista.
	 * <p>
	 * 
	 * @param	item	elemento de tipo Object que será agregado a la lista.
	 * @return	Nada.
	 */
	public void insertBottom(Object element)
	{
		this.top.sinkNode(new LinkedListNodeElement(element), null);
	}
	
	/**
	 * <h2>getTop()</h2>
	 * Retorna el primer elemento de la lista.
	 * <p>
	 * 
	 * @exception AssertionError La lista se encuentra vacía.
	 * @return	Elemento de tipo Object.
	 */
	public Object getTop() throws AssertionError
	{
		return this.top.getElement();
	}
	
	/**
	 * <h2>remove()</h2>
	 * Remueve el primer elemento de la lista.
	 * <p>
	 * 
	 * @exception AssertionError La lista se encuentra vacía.
	 */
	public void removeTop() throws AssertionError
	{
		this.top.setNextNode((this.top.getNextNode()).getNextNode());
	}
}
