package structure;



import java.util.Stack;

import _01_��̬����.List;
import _02_����.CircleLinkedList;
import _02_����.CircleSingleLinkedList;
import _02_����.SingleLinkedList;

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
