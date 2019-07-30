package structure;



import java.util.Stack;

import _01_动态数组.List;
import _02_链表.CircleLinkedList;
import _02_链表.CircleSingleLinkedList;
import _02_链表.SingleLinkedList;

public class Day1 {
	
	
	public static void  main(String[] args) {
		
		testList( new CircleLinkedList<Integer>());
	}

	public static void testList(List<Integer> list) {
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
	
		Stack st;
		System.out.println(list);
	}
}
