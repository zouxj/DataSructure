package _03_ջ;

import java.util.Queue;

import javax.naming.InitialContext;

import _01_��̬����.ArrayList;
import _01_��̬����.List;

public class Stack<E> {
	
	private List<E>  list;

	public Stack() {
		// TODO Auto-generated constructor stub
		list=new ArrayList<E>();
				
	}

	public int size() {
		return list.size();
		
	}
	public E pop() {
		return list.get(list.size()-1);
	}
	public void push(E element) {
		list.add(element);
	}
	
	public E top() {
		return list.get(list.size()-1);
		
	}
	public void clear() {
		list.clear();
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}

}
