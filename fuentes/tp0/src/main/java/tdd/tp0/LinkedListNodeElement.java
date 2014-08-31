package tdd.tp0;

public class LinkedListNodeElement extends LinkedListNode {

	private LinkedListNode nextNode = new LinkedListNodeNull();
	
	public LinkedListNodeElement(Object element) {
		super(element);
	}

	@Override
	public LinkedListNode getNextNode()
	{
		return this.nextNode;
	}

	@Override
	public void setNextNode(LinkedListNode newNextNode)
	{
		this.nextNode = newNextNode;
	}
	
	@Override
	public int countMeAndGoToNextNode()
	{
		return 1 + this.nextNode.countMeAndGoToNextNode();
	}
	
	@Override
	public void sinkNode(LinkedListNode node, LinkedListNode comingNode)
	{
		this.nextNode.sinkNode(node, this);
	}
}
