package tdd.tp0;

public abstract class LinkedListNode {
	
	private Object element;
	
	public LinkedListNode(Object element)
	{
		this.element = element;
	}

	public Object getElement()
	{
		return this.element;
	}
	
	public abstract LinkedListNode getNextNode();

	public abstract void setNextNode(LinkedListNode newNextNode);
	
	public abstract int countMeAndGoToNextNode();
	
	public abstract void sinkNode(LinkedListNode node, LinkedListNode comingNode);
}

	
