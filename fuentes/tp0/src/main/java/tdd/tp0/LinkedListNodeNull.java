package tdd.tp0;

public class LinkedListNodeNull extends LinkedListNode
{
	public LinkedListNodeNull()
	{
		super(null);
	}
	
	@Override
	public Object getElement() throws AssertionError
	{
		throw new AssertionError();
	}
	
	@Override
	public LinkedListNode getNextNode() throws AssertionError
	{
		throw new AssertionError();
	}
	
	@Override
	public int countMeAndGoToNextNode()
	{
		return 0;
	}
	
	@Override
	public void setNextNode(LinkedListNode newNextNode) { }
	
	@Override
	public void sinkNode(LinkedListNode node, LinkedListNode comingNode)
	{
		comingNode.setNextNode(node);
	}
}
