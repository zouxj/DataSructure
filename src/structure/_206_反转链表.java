package structure;

import _01_��̬����.List;
import _02_����.LinkedList;
import _02_����.Node;

public class _206_��ת���� {
	
		
	/**
	 * �ݹ鷴ת����
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
