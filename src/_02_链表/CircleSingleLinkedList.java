package _02_链表;
import _01_动态数组.AbstractList;


/**
 * 单向循环链表
 * @author win10
 *
 * @param <E>
 */
public class CircleSingleLinkedList<E> extends AbstractList<E> {

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
		//获取当前节点
		Node<E> node =node(index);
		//获取当前节点元素
		E oldE = node.element;
		//修改节点元素
		node.element=element;
		//返回之前的节点元素
		return oldE;
	}

	@Override
	public void add(int index, E element) {
		rangeCheckForAdd(index);
		if (index==0) {
			Node<E> newFirst=new Node<>(element,null,first);
			Node<E> last=(size==0)?newFirst:node(size-1);
			last.nextNode=newFirst;
			first=newFirst;
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
			if (size == 1) {
				first = null;
			}else {
				Node<E> last=node(size-1);
				first=(preNode=first.nextNode);
				last.nextNode=first;
			}
			
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
	 * 获取对应参数的node
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
