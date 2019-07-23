package _02_链表;

//节点类
public class Node<E> {
	//当前节点的元素
	public E element;
	//下一个节点的引用
	public Node<E> nextNode;

	public Node(E element, Node<E> nextNode) {
		this.element = element;
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		return "Node [element=" + element + ", nextNode=" + nextNode + "]";
	}


}
