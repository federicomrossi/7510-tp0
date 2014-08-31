package tdd.tp0;

/**
* <h1>Clase LinkedListNodeElement</h1>
* Implementa el nodo que contendrá un elemento real de la lista.
* <p>
* 
* @author  Federico Rossi (federicomrossi@gmail.com)
* @version 1.0
* @since   2014-08-30
*/
public class LinkedListNodeElement extends LinkedListNode 
{
	private LinkedListNode nextNode = new LinkedListNodeNull();
	
	/**
	 * <h2>Constructor</h2>
	 * Constructor del nodo de la lista enlazada.
	 * <p>
	 * 
	 * @param	element	Elemento de tipo Object que almacenará el nodo.
	 */
	public LinkedListNodeElement(Object element)
	{
		super(element);
	}

	/**
	 * <h2>getNextNode()</h2>
	 * Retorna el nodo siguiente.
	 * <p>
	 * 
	 * @return	Nodo de tipo LinkedListNode.
	 */
	@Override
	public LinkedListNode getNextNode()
	{
		return this.nextNode;
	}

	/**
	 * <h2>setNextNode()</h2>
	 * Permite establecer el nodo siguiente a este.
	 * <p>
	 * 
	 * @param	newNextNode	Nodo de tipo LinkedListNode.
	 * @return	Nada.
	 */
	@Override
	public void setNextNode(LinkedListNode newNextNode)
	{
		this.nextNode = newNextNode;
	}
	
	/**
	 * <h2>countMeAndGoToNextNode()</h2>
	 * Retorna la cantidad de nodos que se encuentran unidos entre sí
	 * <p>
	 * 
	 * @return	Integer que representa la cantidad de nodos encadenados.
	 */
	@Override
	public int countMeAndGoToNextNode()
	{
		return 1 + this.nextNode.countMeAndGoToNextNode();
	}
	
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
	@Override
	public void sinkNode(LinkedListNode node, LinkedListNode comingNode)
	{
		this.nextNode.sinkNode(node, this);
	}
}
