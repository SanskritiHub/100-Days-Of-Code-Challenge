import java.util.Arrays;

public class thirdMax {

	public static void main(String[] args) {
		int nums[] = {3,10,5,6,1,7};
		System.out.println(thirdMax(nums));
	}
	
	public static int thirdMax(int nums[]) {
		Arrays.sort(nums);
		int r = 1;
		for(int i = nums.length-2; i>=0; i--) {
			if(nums[i]!=nums[i+1]) {
				r++;
			}
			if(r==3) {
				return nums[i];
			}
		}
		return nums.length-1;
	}

}