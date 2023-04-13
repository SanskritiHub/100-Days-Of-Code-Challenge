
public class validSqrt {

	public static void main(String[] args) {
		int n = 16;
		System.out.println(sqrt(n));
	}

	public static boolean sqrt(int n) {
		int start = 0 ;
		int end = n;
		
		while(start<=end) {
			int mid = start + (end-start)/2;
			
			if(mid*mid==n) {
				return true;
			}
			else if(mid*mid>n) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		return false;
	}

}

