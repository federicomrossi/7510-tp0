package tdd.tp0;

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
	 * @exception Excepción La cola se encuentra vacía
	 * @return	Elemento de tipo Object.
	 */
	Object top(); 
	
	
	/**
	 * <h2>size()</h2>
	 * Remueve el primer elemento de la cola.
	 * <p>
	 * 
	 * @exception Excepción La cola se encuentra vacía
	 */
	void remove();
}
