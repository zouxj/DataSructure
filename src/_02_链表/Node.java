package _02_����;

//�ڵ���
public class Node<E> {
	//��ǰ�ڵ��Ԫ��
	public E element;
	//��һ���ڵ������
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
