import java.util.Arrays;

public class containDuplicate {

	public static void main(String[] args) {
		int arr[] = {1,3,4,1};
		System.out.println(duplicate(arr));
	}

	public static boolean duplicate(int[] arr) {
		Arrays.sort(arr);
		for(int i = 0; i<arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				return true;
			}
		}
		return false;
	}

}
