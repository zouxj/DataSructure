package _02_链表;

//节点类
public class Node<E> {
	//当前节点的元素
	public E element;
	//下一个节点的引用
	public Node<E> nextNode;
	
	public Node<E> prevNode;

	public Node(E element,Node<E> prevNode, Node<E> nextNode) {
		this.element = element;
		this.nextNode = nextNode;
		this.prevNode=prevNode;
	}

	@Override
	public String toString() {
		StringBuffer sBuffer=new StringBuffer();
		sBuffer.append(element).append("_").append(nextNode.element);
		return sBuffer.toString();
	}


}
