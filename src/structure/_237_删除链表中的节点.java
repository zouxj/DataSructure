package structure;

import _02_链表.LinkedList;
import _02_链表.Node;

public class _237_删除链表中的节点 {
	
	/**
	 * 删除节点元素
	 * @param linked
	 */
	public  void  deleteNode(Node linked) {
		
		linked.element=linked.nextNode.element;
		linked.nextNode=linked.nextNode.nextNode;
		
	}

}
