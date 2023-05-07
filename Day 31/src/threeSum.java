import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {

	static List<List<Integer>> res = new ArrayList();
	public static List<List<Integer>> ThreeSum(int nums[]){
		Arrays.sort(nums);
        //a+b+c = 0 --> b+c = 0-a
        for(int i=0; i<nums.length; i++){
            //avoid duplicate a
            if(i==0 || nums[i]!=nums[i-1]){
                twoSum(i+1, nums.length-1, nums, 0-nums[i]);
            }
        }
        return res;
    }

	
	public static void twoSum(int i, int j, int[]nums, int target){
		//i = b, j = c
        int a = nums[i-1];

        while(i<j){
            int sum = nums[i] + nums[j];

            if(sum<target){
                i++;
            }
            else if(sum>target){
                j--;
            }
            else{
                List<Integer> list = new ArrayList();
                list.add(a); list.add(nums[i]); list.add(nums[j]); //add a b c
                res.add(list);

                //avoid duplicate b
                while(i<j && nums[i]==nums[i+1]) i++;
                //avoid duplicate c
                while(i<j && nums[j]==nums[j-1]) j--;

                i++; j--;

            }
        }
    }

	public static void main(String[] args) {
		int nums1[] = {0,1,1};
		System.out.println(ThreeSum(nums1));
		
		int nums2[] = {-1,0,1,2,-1,-4};
		System.out.println(ThreeSum(nums2));
		
	}

}
