package structure;

import _02_����.LinkedList;
import _02_����.Node;

public class _237_ɾ�������еĽڵ� {
	
	/**
	 * ɾ���ڵ�Ԫ��
	 * @param linked
	 */
	public  void  deleteNode(Node linked) {
		
		linked.element=linked.nextNode.element;
		linked.nextNode=linked.nextNode.nextNode;
		
	}

}
