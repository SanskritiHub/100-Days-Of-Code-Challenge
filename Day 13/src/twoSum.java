import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
	
	public static int[] sum(int[]nums, int target) {
		HashMap<Integer, Integer> prev = new HashMap<>();
		
		for(int i = 0; i<nums.length; i++) {
			int num = nums[i];
			int diff = target - num;
			
			if(prev.containsKey(diff)) {
				return new int[] {prev.get(diff) , i};
			}
			
			prev.put(num, i);
		}
		return new int[] {};
	}
	

	public static void main(String[] args) {
		int nums[] = {3,2,4};
		int target = 6;
		
		System.out.println(Arrays.toString(sum(nums, target)));
	}

}
