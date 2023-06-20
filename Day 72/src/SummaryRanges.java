import java.util.*;

public class SummaryRanges {
	
	public static List<String> summaryRanges(int[] nums) {
	        
	    	List<String> stringList = new ArrayList<>();
	        int fromIndex = 0;
	        int toIndex = nums.length;

	        for (int i = 0; i <= nums.length - 1; i++) {
	            fromIndex = i;

	            while (i != nums.length - 1 && nums[i] + 1 == nums[i + 1]) {
	                i++;
	            }

	            toIndex = i;

	            if (fromIndex == toIndex) {
	                stringList.add("" + nums[fromIndex]);

	            } else {
	                stringList.add(nums[fromIndex] + "->" + nums[toIndex]);

	            }

	        }

	        return stringList;
	            
	}

	public static void main(String[] args) {
		int[] nums = {0,1,2,4,5,7};
		System.out.println(summaryRanges(nums));

	}

}
