

public class middleOfLL {
	
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	
	public ListNode middle(ListNode head) {
		
		ListNode s = head;
		ListNode f = head;
		
		while(f != null && f.next != null) {
			s = s.next;
			f = f.next.next;
		}
		
		return s;
	}
}
