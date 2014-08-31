package tdd.tp0;

public class LinkedList {
	
	LinkedListNode top = new LinkedListNodeTop();

	public LinkedList() { }
	
	public int size()
	{
		return this.top.countMeAndGoToNextNode();
	}
	
	public void insertBottom(Object element)
	{
		this.top.sinkNode(new LinkedListNodeElement(element), null);
	}
	
	public Object getTop() throws AssertionError
	{
		return this.top.getElement();
	}
	
	public void removeTop() throws AssertionError
	{
		this.top.setNextNode((this.top.getNextNode()).getNextNode());
	}
}
