package _03_栈;

import java.util.Queue;

import javax.naming.InitialContext;

import _01_动态数组.ArrayList;
import _01_动态数组.List;

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
