import java.util.Arrays;

public class productExceptSelf {
	
public static int[] productExceptSelf(int[] nums) {
        
        int[]freq=new int[nums.length];

        int product=nums[nums.length-1];

        int[] ans=new int[nums.length];

        int i=nums.length-2;

            while(i>=0){
        
                freq[i]=product;

                product=product*nums[i--];

            }

        product = 1;
        for(int j=0;j<nums.length;j++){

                if(j==nums.length-1){
                    ans[j]=product;
                    break;
            }

                if(j==0){
                    ans[j]=freq[j];
            }

                else if(j!=0 && j!=nums.length-1){
                    ans[j]=freq[j]*product;
                }

            product=product*nums[j];

        }

        return ans;

    }
    
	public static void main(String[] args) {
		int nums[] = {1,2,3,4};
		System.out.println(Arrays.toString(productExceptSelf(nums)));
	}

}

