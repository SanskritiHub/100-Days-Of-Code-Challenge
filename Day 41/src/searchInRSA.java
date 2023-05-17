
public class searchInRSA {
	
	public static int find(int nums[], int target) {
		int l = 0;
        int r = nums.length-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(nums[mid]==target) return mid;
            if(nums[l]<=nums[mid]){
                if(target>=nums[l] && target<nums[mid]) r = mid-1;
                else l = mid + 1;
            }
            else{
                if(target<=nums[r] && target>nums[mid] ) l = mid+1;
                else r = mid-1;
            }
        }
        return -1;
    }

	
	public static void main(String[] args) {
		int arr[] = {4,5,6,7,0,1,2};
		int target = 0;
		System.out.println(find(arr, target));
		
		int arr1[] = {4,5,6,7,0,1,2};
		int target1 = 5;
		System.out.println(find(arr1, target1));
		
		int arr2[] = {1};
		int target2 = 0;
		System.out.println(find(arr2, target2));
	}

}
