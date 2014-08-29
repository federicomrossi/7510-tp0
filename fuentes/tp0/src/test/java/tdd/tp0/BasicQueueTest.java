package tdd.tp0;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
* <h1>Clase BasicQueueTest</h1>
* Implementa los métodos de prueba sobre las operaciones de la clase BasicQueue.
* <p>
* 
* @author  Federico Rossi (federicomrossi@gmail.com)
* @version 1.0
* @since   2014-08-28
*/
public class BasicQueueTest extends TestCase {

	public static Test suite()
	{
		return new TestSuite(BasicQueueTest.class);
	}

	/**
	 * <h2>testBasicQueueCreation_01()</h2>
	 * Prueba sobre la creación de la Cola y de su estado inicial.
	 */
	public void testBasicQueueCreation_01()
	{
		BasicQueue q = new BasicQueue();
		
		assertTrue("Está vacia", q.isEmpty());
		assertEquals("El tamaño es cero", 0, q.size());
	}
	
	/**
	 * <h2>testBasicQueueCreation_02()</h2>
	 * Prueba sobre la creación de la Cola y de su estado inicial.
	 */
	public void testBasicQueueCreation_02()
	{
		BasicQueue q = new BasicQueue();
		
		try
		{
			q.top();
		}
		catch(IllegalStateException e1)
		{
			return;
		}
		fail("Se esperaba IllegalStateException");
	}
	
	/**
	 * <h2>testBasicQueueCreation_03()</h2>
	 * Prueba sobre la creación de la Cola y de su estado inicial.
	 */
	public void testBasicQueueCreation_03()
	{
		BasicQueue q = new BasicQueue();
		
		try
		{
			q.remove();
		}
		catch(IllegalStateException e1)
		{
			return;
		}
		fail("Se esperaba IllegalStateException");
	}
	
	/**
	 * <h2>testIsEmpty()</h2>
	 * Prueba sobre el método isEmpty() de la Cola.
	 */
	public void testIsEmpty()
	{
		BasicQueue q = new BasicQueue();
		
		assertTrue("La cola debe estar vacía", q.isEmpty());
		q.add(1);
		assertFalse("La cola no debe estar vacía", q.isEmpty());
		q.add(2);
		assertFalse("La cola no debe estar vacía", q.isEmpty());
		q.remove();
		assertFalse("La cola no debe estar vacía", q.isEmpty());
		q.remove();
		assertTrue("La cola debe estar vacía", q.isEmpty());
	}
	
	/**
	 * <h2>testSize()</h2>
	 * Prueba sobre el método size() de la Cola.
	 */
	public void testSize()
	{
		BasicQueue q = new BasicQueue();
		
		assertEquals("El tamaño es 0", 0, q.size());
		q.add(1);
		assertEquals("El tamaño es 1", 1, q.size());
		q.add(2);
		assertEquals("El tamaño es 2", 2, q.size());
		q.remove();
		assertEquals("El tamaño es 1", 1, q.size());
		q.remove();
		assertEquals("El tamaño es 0", 0, q.size());
	}
	
	/**
	 * <h2>testAddAndTop()</h2>
	 * Prueba sobre los métodos add(), top() y remove() de la Cola.
	 */
	public void testAddTopRemove()
	{
		BasicQueue q = new BasicQueue();
		
		q.add(1);
		assertEquals("El elemento 1 se encuentra en el top de la cola", 1, q.top());
		q.add(2);
		q.add(3);
		assertEquals("El elemento 1 se encuentra en el top de la cola", 1, q.top());
		q.remove();
		assertEquals("El elemento 2 se encuentra en el top de la cola", 2, q.top());
		q.remove();
		assertEquals("El elemento 3 se encuentra en el top de la cola", 3, q.top());
		q.remove();
		assertTrue("La cola debe estar vacía", q.isEmpty());
		
		try
		{
			q.remove();
		}
		catch(IllegalStateException e1)
		{
			return;
		}
		fail("Se esperaba IllegalStateException");
	}
}
