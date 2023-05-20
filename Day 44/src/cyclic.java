class cNode {
      int val;
      cNode next;
      cNode(int x) {
          val = x;
          next = null;
      }
  }
 
public class cyclic {
	
    public boolean hasCycle(cNode head) {
        cNode slow = head;
        cNode fast = head;
        
        while(fast!=null && fast.next!=null) {
        	fast = fast.next.next;
        	slow = slow.next;
        	
        	if(fast == slow) {
        		return true;
        	}
        }
        return false;
    }
}