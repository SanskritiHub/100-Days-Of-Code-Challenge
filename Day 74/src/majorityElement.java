import java.util.Arrays;

public class majorityElement {
	
	public static int majorityE(int nums[]) {
		Arrays.sort(nums);
		return nums[nums.length/2];
	}

	public static void main(String[] args) {
		int arr[] = {3,2,3};
		System.out.println(majorityE(arr));
	}

}
