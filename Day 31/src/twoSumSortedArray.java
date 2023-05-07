import java.util.Arrays;

public class twoSumSortedArray {
	
	public static int[] twoSum(int[]nums, int target) {
		//solving by binary search
		int start = 0;
		int end = nums.length-1;
		
		while(start<=end) {
			int sum = nums[start]+ nums[end];
			
			if(sum==target) {
				return new int[] {start+1, end+1};
			}
			if(target<sum) {
				end--;
			}
			else {
				start++;
			}
		}
		return new int[] {-1,-1};
	}

	public static void main(String[] args) {
		int nums[] = {2,3,4};
		int target = 6;
		System.out.println(Arrays.toString(twoSum(nums, target)));
	}

}
