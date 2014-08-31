package tdd.tp0;

/**
* <h1>Clase abstracta LinkedListNode</h1>
* Implementa un nodo generalizado de la clase LinkedList. Declara métodos necesarios que deben implementarse.
* <p>
* 
* @author  Federico Rossi (federicomrossi@gmail.com)
* @version 1.0
* @since   2014-08-30
*/
public abstract class LinkedListNode {
	
	private Object element;
	
	/**
	 * <h2>Constructor</h2>
	 * Constructor del nodo de la lista enlazada.
	 * <p>
	 * 
	 * @param	element	Elemento de tipo Object que almacenará el nodo.
	 */
	public LinkedListNode(Object element)
	{
		this.element = element;
	}

	/**
	 * <h2>getElement()</h2>
	 * Retorna el elemento almacenado en el nodo.
	 * <p>
	 * 
	 * @return	Elemento de tipo Object.
	 */
	public Object getElement()
	{
		return this.element;
	}
	
	/**
	 * <h2>sizeOfChainOfNodes()</h2>
	 * Retorna la cantidad de nodos que se encuentran unidos entre sí
	 * <p>
	 * 
	 * @return	Integer que representa la cantidad de nodos encadenados.
	 */
	public int sizeOfChainOfNodes()
	{
		return this.countMeAndGoToNextNode();
	}
	
	/**
	 * <h2>getNextNode()</h2>
	 * Retorna el nodo siguiente.
	 * <p>
	 * 
	 * @return	Nodo de tipo LinkedListNode.
	 */
	public abstract LinkedListNode getNextNode();

	/**
	 * <h2>setNextNode()</h2>
	 * Permite establecer el nodo siguiente a este.
	 * <p>
	 * 
	 * @param	newNextNode	Nodo de tipo LinkedListNode.
	 * @return	Nada.
	 */
	public abstract void setNextNode(LinkedListNode newNextNode);
	
	/**
	 * <h2>sinkNode()</h2>
	 * Permite hundir un nodo hacia el fondo de la cadena de nodos unidos entre sí.
	 * Es decir, coloca un nuevo nodo luego del último nodo actual de la cadena.
	 * <p>
	 * 
	 * @param	node	Nodo de tipo LinkedListNode que será agregado a la cadena.
	 * @param	comingNode	Nodo de tipo LinkedListNode del cual proviene la invocación al método.
	 * @return	Nada.
	 */
	public abstract void sinkNode(LinkedListNode node, LinkedListNode comingNode);
	
	/**
	 * <h2>countMeAndGoToNextNode()</h2>
	 * Retorna la cantidad de nodos que se encuentran unidos entre sí
	 * <p>
	 * 
	 * @return	Integer que representa la cantidad de nodos encadenados.
	 */
	protected abstract int countMeAndGoToNextNode();
}

	
