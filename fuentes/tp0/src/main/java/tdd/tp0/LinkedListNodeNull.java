package tdd.tp0;

/**
* <h1>Clase LinkedListNodeNull</h1>
* Implementa el nodo que se comportará como null.
* <p>
* 
* @author  Federico Rossi (federicomrossi@gmail.com)
* @version 1.0
* @since   2014-08-30
*/
public class LinkedListNodeNull extends LinkedListNode
{
	public LinkedListNodeNull()
	{
		super(null);
	}
	
	/**
	 * <h2>getElement()</h2>
	 * Retorna el elemento almacenado en el nodo.
	 * <p>
	 * 
	 * @return	Elemento de tipo Object.
	 */
	@Override
	public Object getElement() throws AssertionError
	{
		throw new AssertionError();
	}
	
	/**
	 * <h2>getNextNode()</h2>
	 * Retorna el nodo siguiente.
	 * <p>
	 * 
	 * @return	Nodo de tipo LinkedListNode.
	 */
	@Override
	public LinkedListNode getNextNode() throws AssertionError
	{
		throw new AssertionError();
	}

	/**
	 * <h2>setNextNode()</h2>
	 * No realiza ninguna acción ya que no permite establecer un nodo siguiente a este.
	 * <p>
	 * 
	 * @param	newNextNode	Nodo de tipo LinkedListNode.
	 * @return	Nada.
	 */
	@Override
	public void setNextNode(LinkedListNode newNextNode) { }
	
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
		comingNode.setNextNode(node);
	}
	
	/**
	 * <h2>countMeAndGoToNextNode()</h2>
	 * Retorna la cantidad de nodos que se encuentran unidos entre sí
	 * <p>
	 * 
	 * @return	Integer que representa la cantidad de nodos encadenados.
	 */
	@Override
	protected int countMeAndGoToNextNode()
	{
		return 0;
	}
}
