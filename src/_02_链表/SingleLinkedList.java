package _02_����;
import _01_��̬����.AbstractList;


public class SingleLinkedList<E> extends AbstractList<E> {

	private Node<E> first;
	
	@Override
	public void clear() {
		size=0;
		first=new Node<>(null, null,null);
		
	}


	@Override
	public boolean contains(E element) {
		Node<E> node =first;
		if (element==null) {
			for (int i = 0; i < size; i++) {
				if (node.element==null) {
					return true;
				}
				node=node.nextNode;
			}
		}else {
			for (int i = 0; i < size; i++) {
				if (node.element.equals(element)) {
					return true;
				}
				node=node.nextNode;
			}
		}
		return false;

	}

	@Override
	public void add(E element) {
		add(size,element);
		
	}

	@Override
	public E get(int index) {
		return node(index).element;
	}

	@Override
	public E set(int index, E element) {
		//��ȡ��ǰ�ڵ�
		Node<E> node =node(index);
		//��ȡ��ǰ�ڵ�Ԫ��
		E oldE = node.element;
		//�޸Ľڵ�Ԫ��
		node.element=element;
		//����֮ǰ�Ľڵ�Ԫ��
		return oldE;
	}

	@Override
	public void add(int index, E element) {
		rangeCheckForAdd(index);
		if (index==0) {
			first=new Node<>(element,null,first);
		}else {
			Node<E> prevNode  = node(index-1);
			prevNode.nextNode=new Node<>(element,null,prevNode.nextNode);
		}
		size++;
		
	}

	@Override
	public E remove(int index) {
		rangeCheck(index);
		Node<E>	preNode=first;
		if (index==0) {
			first=(preNode=first.nextNode);
		}else {
			Node<E> node=node(index-1);
			preNode=node.nextNode;
			node.nextNode=node.nextNode.nextNode;
		}
		size--;
		return preNode.element;
	}

	@Override
	public int indexOf(E element) {
		Node<E> node =first;
		if (element==null) {
			for (int i = 0; i < size; i++) {
				if (node.element==null) {
					return i;
				}
				node=node.nextNode;
			}
		}else {
			for (int i = 0; i < size; i++) {
				if (node.element.equals(element)) {
					return i;
				}
				node=node.nextNode;
			}
		}
		return 0;
	}
	/**
	 * ��ȡ��Ӧ������node
	 * @param index
	 */
	public Node<E> node(int index) {
		rangeCheck(index);
		Node<E> node =first;
		for (int i = 0; i < index; i++) {
			node=node.nextNode;
		}
		return node;
	}
	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("size=").append(size).append(", [");
		Node<E> node = first;
		for (int i = 0; i < size; i++) {
			if (i != 0) {
				string.append(", ");
			}
			string.append(node);
			node = node.nextNode;
		}
		string.append("]");
		return string.toString();
	}
}
