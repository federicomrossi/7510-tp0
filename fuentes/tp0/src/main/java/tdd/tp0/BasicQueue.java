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
	private LinkedList linkedList = new LinkedList();
	
	/**
	 * <h2>isEmpty()</h2>
	 * Comprueba si la cola se encuentra vacía.
	 * <p>
	 * 
	 * @return	'true' si la cola se encuentra vacía o 'false' en su defecto.
	 */
	public boolean isEmpty()
	{
		return this.linkedList.size() == 0;
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
		return this.linkedList.size();
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
		this.linkedList.insertBottom(item);
	}

	/**
	 * <h2>top()</h2>
	 * Retorna el primer elemento de la cola.
	 * <p>
	 * 
	 * @exception AssertionError La cola se encuentra vacía
	 * @return	Elemento de tipo Object.
	 */
	public Object top() throws AssertionError
	{
		return this.linkedList.getTop();
	}

	/**
	 * <h2>remove()</h2>
	 * Remueve el primer elemento de la cola.
	 * <p>
	 * 
	 * @exception AssertionError La cola se encuentra vacía
	 */
	public void remove() throws AssertionError
	{
		this.linkedList.removeTop();
	}
}
