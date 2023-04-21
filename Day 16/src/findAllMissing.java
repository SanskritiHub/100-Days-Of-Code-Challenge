import java.util.ArrayList;
import java.util.List;

public class findAllMissing {
	
   public static void main(String[] args) {
				
			int arr[] = {4,3,2,7,8,2,3,1};
			System.out.println(findMissing(arr));

		}
   
	public static List<Integer> findMissing(int arr[]){
			int i = 0;
				
			while(i<arr.length) {
				int correctIndex = arr[i]-1;
					
				if(arr[i]!=arr[correctIndex]) {
						swap(arr, i, correctIndex);
				}
				else {
					i++;
				}
			}
			List<Integer> ans = new ArrayList<>();
				
			for(int index = 0; index<arr.length; index++) {
				if(arr[index]!= index+1) {
					ans.add(index+1);
				}
			}
			return ans;
		}
	
	public static void swap(int[] arr, int i, int correctIndex) {
			int temp = arr[i];
			arr[i] = arr[correctIndex];
			arr[correctIndex] = temp;
				
			
	}

		
}

