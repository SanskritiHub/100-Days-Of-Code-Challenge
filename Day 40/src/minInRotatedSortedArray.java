
public class minInRotatedSortedArray {
	
	public static int getMin(int arr[]) {
		int l = 0;
		int r = arr.length-1;
		while(l<r) {
			int mid = l + (r-l)	/ 2;
			if(arr[mid]>arr[r]) l = mid+1;
			else if(arr[mid]<arr[r]) r = mid;
			else return arr[r];
		}
		return arr[l];
	}

	public static void main(String[] args) {
		int arr [] = {4,5,0,1,2,3};
		System.out.println(getMin(arr));

	}

}
