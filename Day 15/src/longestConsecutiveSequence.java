import java.util.HashSet;
import java.util.Set;

public class longestConsecutiveSequence {
	
	public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
             set.add(i);
        }
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            if(!set.contains(nums[i]-1)){
                int j = nums[i] + 1;
                while(set.contains(j)){
                    j++;
                }
                ans = Math.max(ans, j - nums[i]);
            }
        }
        return ans;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {4,1,7,2,3,8};
		System.out.println(longestConsecutive(nums));

	}

}
