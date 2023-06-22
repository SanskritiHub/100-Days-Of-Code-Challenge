public class searchInsertPOsition {

	public static void main(String[] args) {
		int arr[]= {1,3,5,6};
		int k = 2;
		System.out.println(search(arr, k));

	}

	public static int search(int[] arr, int k) {
		
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end) {
			int mid = start + (end-start)/2;
			
			if(arr[mid]==k) {
				return mid;
			}
			else if (arr[mid]>k) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		return start;
	}

}
