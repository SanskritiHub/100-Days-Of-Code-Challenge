public class Node {
 	  int val;
      Node next;
      Node() {}
      Node(int val) { this.val = val; }
      Node(int val, Node next) { this.val = val; this.next = next; }
  }
 
class merge {
	//Merge Two Sorted List - https://leetcode.com/problems/merge-two-sorted-lists/description/
	public Node merge(Node l1 , Node l2) {
		if(l1 != null && l2 != null) {
			if(l1.val<l2.val) {
				l1.next = merge(l1.next, l2);
				return l1;
			}
			else {
				l2.next = merge(l1, l2.next);
				return l2;
			}
		}
		if(l1!=null) {
			return l1;
		}
		return l2;
	}
	
	// Re-Order List - https://leetcode.com/problems/reorder-list/description/
	public void reorderList(Node head) {
        if(head == null || head.next == null) return;
        Node slow = head;
        Node fast = head;
        Node prev = head;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        Node l1 = head;
        Node l2 = reverse(slow);
        merging(l1, l2);    
    }
    
    private static Node reverse(Node l2){
        if(l2 == null) return null;
        Node prev = null;
        Node curr = l2;
        Node next = l2.next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    private static void merging(Node l1, Node l2) {
        while (l2 != null) {
        	Node next = l1.next;
            l1.next = l2;
            l1 = l2;
            l2 = next;
        }
    }

}

	