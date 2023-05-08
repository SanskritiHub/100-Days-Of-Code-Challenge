
public class containerWithMoreWater {
	
	public static int maxArea(int[] height) {
		int l = 0;
		int r = height.length-1;
		int max = 0;
		while(l<r) {
			int lh = height[l];
			int rh = height[r];
			int min_h = Math.min(lh, rh);
			int len = r-l;
			int curr_area = min_h * len;
			max = Math.max(max, curr_area);
			
			if(lh<rh) l++;
			else r--;
		}
		return max;
	}

	public static void main(String[] args) {
		int[] height = {6,4,2,5,4,6,1,3,5};
		System.out.println(maxArea(height));
	}
}
