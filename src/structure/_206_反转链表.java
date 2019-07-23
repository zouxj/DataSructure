package structure;

import _01_动态数组.List;
import _02_链表.LinkedList;
import _02_链表.Node;

public class _206_反转链表 {
	
		
	/**
	 * 递归反转链表
	 * @param head
	 * @return
	 */
	public  static Node reverseList(Node head) {
		
		if (head == null || head.nextNode == null) return head;
		Node newHead  = reverseList(head.nextNode);
		head.nextNode.nextNode = head;
		head.nextNode = null;
		return newHead;
	
    }
	
	public void reverseList2(Node head) {
		if (head==null||head.nextNode==null) 
			return;
			Node newNode=null;
			while (head.nextNode!=null) {
				Node tmpNode=head.nextNode;
				head.nextNode =newNode;
				newNode=head;
				head=tmpNode;
			}
	}

	public boolean hasCircle(Node head) {
		if (head==null||head.nextNode==null) 
			return false;
		Node slowNode =head;
		Node fastNode=head.nextNode;
		while (slowNode!=null&&fastNode!=null) {
			if (slowNode==fastNode)return true;
			slowNode=slowNode.nextNode;
			fastNode=fastNode.nextNode;
		} 
		return false;
	}


}
