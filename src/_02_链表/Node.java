package _02_����;

//�ڵ���
public class Node<E> {
	//��ǰ�ڵ��Ԫ��
	public E element;
	//��һ���ڵ������
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
