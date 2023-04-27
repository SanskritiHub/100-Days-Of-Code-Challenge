
public class maxValue {

	public static void main(String[] args) {
		int[] arr = {4, 9 ,88, 97, 0};
		
		System.out.println(max(arr));
		
		System.out.println(maxInRange(arr,0,2));
		
		//reverse(arr);

	}

	static int max(int[] arr) {
		int maxValue = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if (arr[i]> maxValue) {
				
				maxValue = arr[i];
				
		}
			
	}
		return maxValue;

}
	static int maxInRange(int[] arr, int start, int end) {
		int maxValue = arr[start];
		for(int i = start; i<=end; i++) {
			if (arr[i]> maxValue) {
				
				maxValue = arr[i];
				
		}
			
	}
		return maxValue;

}
	

	
}