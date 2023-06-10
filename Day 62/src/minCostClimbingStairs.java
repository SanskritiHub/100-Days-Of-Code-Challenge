
public class minCostClimbingStairs {
	
	public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length ;
        for(int i=2 ; i<n ; i++){
            cost[i] = Math.min(cost[i-1] , cost[i-2]) + cost[i];
        }
        return Math.min(cost[n-1] , cost[n-2]);
    }


	public static void main(String[] args) {
		int[] cost = {10, 15, 20};
		System.out.println(minCostClimbingStairs(cost));
	}

}
