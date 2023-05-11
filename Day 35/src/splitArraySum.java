
public class splitArraySum {
	
	public static void main(String[] args) {
		int num[] = {7,2,5,8,10};
		System.out.println(splitArray(num,2));

	}
	
	public static int splitArray(int [] nums, int m) {
		int start = 0;
		int end = 0;
		
		for(int i = 0; i<nums.length; i++) {
			
			start = Math.max(start, nums[i]);
			end += nums[i];
			
		}
		
		while(start<end) {
			int mid = start + (end-start)/2;
			
			int sum = 0;
			int pieces = 1;
			
			for(int num: nums) {
				if(sum + num > mid) {
					sum = num;
					pieces++;
				}
				else {
					sum += num;
				}
			}
			
			if(pieces>m) {
				start = mid +1;
			}
			else {
				end = mid;
			}
		}
		
		return end; //start==end only

	}
	
}
