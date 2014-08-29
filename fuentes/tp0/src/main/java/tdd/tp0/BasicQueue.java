package tdd.tp0;

/**
* <h1>Clase BasicQueue</h1>
* Implementa una Cola básica con métodos que permiten las operaciones elementales sobre esta.
* <p>
* 
* @author  Federico Rossi (federicomrossi@gmail.com)
* @version 1.0
* @since   2014-08-28
*/
public class BasicQueue implements Queue
{
	private BasicQueueNode last = null;
	private BasicQueueNode top = null;
	private int cantNodes = 0;
	
	/**
	 * <h2>isEmpty()</h2>
	 * Comprueba si la cola se encuentra vacía.
	 * <p>
	 * 
	 * @return	'true' si la cola se encuentra vacía o 'false' en su defecto.
	 */
	public boolean isEmpty()
	{
		return this.top == null;
	}

	/**
	 * <h2>size()</h2>
	 * Retorna el tamaño de la cola, es decir, la cantidad de elementos que contiene.
	 * <p>
	 * 
	 * @return	Integer que representa la cantidad de elementos.
	 */
	public int size()
	{
		return this.cantNodes;
	}

	/**
	 * <h2>add()</h2>
	 * Permite agregar un elemento a la cola.
	 * <p>
	 * 
	 * @param	item	elemento de tipo Object que será agregado a la cola.
	 * @return	Nada.
	 */
	public void add(Object item)
	{
		BasicQueueNode n = new BasicQueueNode(item);
		
		if(this.last != null)
			this.last.setNext(n);
		
		this.last = n;
		
		if(this.top == null)
			this.top = this.last;
		
		this.cantNodes++;
	}

	/**
	 * <h2>size()</h2>
	 * Retorna el primer elemento de la cola.
	 * <p>
	 * 
	 * @exception IllegalStateException La cola se encuentra vacía
	 * @return	Elemento de tipo Object.
	 */
	public Object top() throws IllegalStateException
	{
		if(this.top == null)
			throw new IllegalStateException("La cola se encuentra vacía");
		
		return this.top.getElement();
	}

	/**
	 * <h2>size()</h2>
	 * Remueve el primer elemento de la cola.
	 * <p>
	 * 
	 * @exception IllegalStateException La cola se encuentra vacía
	 */
	public void remove() throws IllegalStateException
	{
		if(this.top == null)
			throw new IllegalStateException("La cola se encuentra vacía");
	
		this.top = this.top.getNext();
		this.cantNodes--;
	}
	
//	private BasicQueueNode getNextUntilTop(BasicQueueNode n)
//	{
//		return this.getNextUntilTop(n.getNext());
//	}
}
