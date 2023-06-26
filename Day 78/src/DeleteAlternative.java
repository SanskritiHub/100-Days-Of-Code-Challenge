//https://www.codingninjas.com/studio/problems/delete-alternate-nodes_624615
public class DeleteAlternative {
	
	public class Nodes <T>{
		
		T data;
		Nodes <T> next;
		
		Nodes(T data){
			this.data = data;
			next = null;
		}
	
	public static void deleteAlternativeNodes(Nodes<Integer> head) {
		Nodes<Integer> cur = head;
		Nodes<Integer> curNext;
		
		while(cur != null && cur.next != null){
			curNext = cur.next;
			cur.next = curNext.next;
			cur = cur.next;
			}
		}
	}
}
