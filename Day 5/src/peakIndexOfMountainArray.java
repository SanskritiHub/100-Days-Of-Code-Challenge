
public class peakIndexOfMountainArray {

		public static void main(String[] args) {
			int arr[] = {0,2,3,4,2,1,0};
			System.out.println(peak(arr));

		}

		public static int peak(int[] arr) {
			int s = 0;
			int e = arr.length-1;
			
			while(s<e) {
				int mid = s + (e-s)/2;
				
				if(arr[mid]<arr[mid+1]) {
					s = mid + 1;
				}
				else {
					e = mid;
				}
				
			}
			return e; //or start
		}

	}
