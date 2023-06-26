//https://www.geeksforgeeks.org/delete-n-nodes-after-m-nodes-of-a-linked-list/
public class DeleteNAfterM {
	
	public class Nodes <T>{
		
		T data;
		Nodes <T> next;
		
		Nodes(T data){
			this.data = data;
			next = null;
		}
	
	public static Nodes<Integer> DeleteN (Nodes<Integer> head, int m, int n){
		 
		if (head==null) {
			return head;
		}
		if (m==0) {
			return null;
		}
		if (n==0) {
			return head;
		}
		
		Nodes<Integer> curr = head, t;
		int count;
		
		for(count = 1; count<m && curr!=null; count++) {
			curr = curr.next;
		}
		
		if(curr == null) {
			return head;
		}
		
		t = curr.next;
		for (count = 1; count<=n && t!=null; count++) {
			t = t.next;
		}
		curr.next = t;
		curr = t;
		return head;
			
		
	}

	}

}
