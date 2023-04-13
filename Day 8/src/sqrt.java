
public class sqrt {

	public static void main(String[] args) {
		int n = 9;
		System.out.println(sqrt(n));
		
		int n1 = 8;
		System.out.println(sqrt(n1));

	}

	public static int sqrt(int n) {
		int start = 0;
		int end = n;
		
		while(start<=end) {
			int mid = start + (end-start)/2;
			
			//for perfect square
			if(mid*mid==n) {
				return mid;
			}
			
			else if(mid*mid>n) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		//else we want floor value therefore will return end
		return end;
	}

}
