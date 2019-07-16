package structure;

public class _206_·´×ªÁ´±í {
	
	
	public static   ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) return head;
	
		ListNode newHead = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
    }

	
	public static void  main(String[] args) {
		ListNode l0 = new ListNode(0);
		
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		l0.next = l1;
		l1.next = l2;
		
		System.out.print(reverseList(new ListNode(5)).val);  ;
		
	

	}

}
