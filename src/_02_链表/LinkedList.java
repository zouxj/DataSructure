package _02_链表;
import _01_动态数组.AbstractList;


public class LinkedList<E> extends AbstractList<E> {

	private Node<E> first;
	private Node<E> last;
	
	/**
	 * 
	 * 
	 * 
	 * gc root对象
	 * 被局部变量指向的对象
	 */
	@Override
	public void clear() {
		size=0;
		first=null;
		last=null;
		
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
		if (index==size) {
			//往最后一个添加元素
			Node<E> oldLast=last;
			last=new Node<E>(element, oldLast, null);
			if (oldLast==null) {
				first=last;
			}else {
				last.nextNode=last;
			}
		}else {
			Node<E> next=node(index);
			Node<E> prev=next.prevNode;
			Node<E> node = new Node<E>(element, prev, next);
			next.prevNode=node;
			if (prev==null) {
				first=node;
			}else {
				prev.nextNode=node;
			}
		}
		size++;
		
	}

	@Override
	public E remove(int index) {
		rangeCheck(index);
		Node<E> node=node(index);
		Node<E> prve=node.prevNode;
		Node<E> next=node.nextNode;
		//第一个
		if (prve==null) {
			first=next;
		}else {
			prve.nextNode=next;
		}
		//最后一个
		if (next==null) {
			last=prve;
		}else {
			next.prevNode = prve;
		}
		size--;
		return node.element;
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
		if (index<(size>>1)) {
			Node<E> node =first;
			for (int i = 0; i < index; i++) {
				node=node.nextNode;
			}
			return node;
		}else {
			Node<E> node =last;
			for (int i = size-1; i > index; i--) {
				node=node.prevNode;
			}
			return node;
		}
	
	
	
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
