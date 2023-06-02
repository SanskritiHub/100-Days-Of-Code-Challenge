
public class climbingStairs {
	
	public static int climb(int n) {
		if(n<=1) return 1;
		int op1 = climb(n-1);
		int op2 = climb(n-2);
		return op1 + op2;
	}
	
	public static int climbDP(int n) {
		int dp[] = new int [n+1];
		dp[0] = 1;
		dp[1] = 1;
		
		for(int i = 2; i<n+1; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[n];
	}
	

	public static void main(String[] args) {
		int n = 30;
		System.out.println(climbDP(n));
		System.out.println(climb(n));

	}

}
