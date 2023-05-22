
public class removeNthNodeFromEnd {
	
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		 }
	
	public static ListNode remove(ListNode head, int n) {
		if(head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;

        while(n-->0) fast = fast.next;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        if(slow==head && fast == null) head = head.next; //edge case
        else slow.next = slow.next.next;
        return head;
    }
}
	

