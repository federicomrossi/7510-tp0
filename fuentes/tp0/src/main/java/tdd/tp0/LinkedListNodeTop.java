package tdd.tp0;

public class LinkedListNodeTop extends LinkedListNode {

	private LinkedListNode nextNode = new LinkedListNodeNull();
	
	public LinkedListNodeTop()
	{
		super(null);
	}
	
	@Override
	public Object getElement()
	{
		return this.nextNode.getElement();
	}
	
	@Override
	public LinkedListNode getNextNode()
	{
		return this.nextNode;
	}
	
	@Override
	public int countMeAndGoToNextNode()
	{
		return this.nextNode.countMeAndGoToNextNode();
	}
	
	@Override
	public void setNextNode(LinkedListNode newNextNode)
	{
		this.nextNode = newNextNode;
	}

	@Override
	public void sinkNode(LinkedListNode node, LinkedListNode comingNode)
	{
		this.nextNode.sinkNode(node, this);
	}
}
