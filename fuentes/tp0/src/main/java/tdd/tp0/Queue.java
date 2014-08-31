package tdd.tp0;


/**
* <h1>Interface Queue</h1>
* Define una interface para una Cola con métodos básicos a ser implementados.
* <p>
* 
* @author  Federico Rossi (federicomrossi@gmail.com)
* @version 1.0
* @since   2014-08-28
*/
public interface Queue {
	
	/**
	 * <h2>isEmpty()</h2>
	 * Comprueba si la cola se encuentra vacía.
	 * <p>
	 * 
	 * @return	'true' si la cola se encuentra vacía o 'false' en su defecto.
	 */
	boolean isEmpty();
	
	
	/**
	 * <h2>size()</h2>
	 * Retorna el tamaño de la cola, es decir, la cantidad de elementos que contiene.
	 * <p>
	 * 
	 * @return	Integer que representa la cantidad de elementos.
	 */
	int size();
	
	
	/**
	 * <h2>add()</h2>
	 * Permite agregar un elemento a la cola.
	 * <p>
	 * 
	 * @param	item	elemento de tipo Object que será agregado a la cola.
	 * @return	Nada.
	 */
	void add(Object item); 
	
	
	/**
	 * <h2>size()</h2>
	 * Retorna el primer elemento de la cola.
	 * <p>
	 * 
	 * @exception AssertionError La cola se encuentra vacía
	 * @return	Elemento de tipo Object.
	 */
	Object top(); 
	
	
	/**
	 * <h2>size()</h2>
	 * Remueve el primer elemento de la cola.
	 * <p>
	 * 
	 * @exception AssertionError La cola se encuentra vacía
	 */
	void remove();
}
