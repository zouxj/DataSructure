package structure;

import _02_链表.CircleLinkedList;

public class _约瑟夫问题 {
	
	public static void main(String[] args) {
		
		josephus();
		
	}

	private static void josephus() {
		CircleLinkedList<Integer> list=new CircleLinkedList<Integer>();
		for (int i = 1; i <=8; i++) {
			list.add(i);
		}
		list.reset();
		while (!list.isEmpty()) {
			list.next();
			list.next();
			System.out.println(list.remove()+"");
			
		}
	}
}
