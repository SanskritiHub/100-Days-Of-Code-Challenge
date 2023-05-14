
public class searchIn2DArray {

	public static boolean searchMatrix(int[][] matrix, int target) {
	       for(int i = 0; i < matrix.length; i++){
	            int n = matrix[i].length - 1;
	            // Finding that row.
	            if(target <= matrix[i][n]){
	                // Binary Search
	                int s = 0;
	                int e = n;
	                while(s <= e){
	                    int mid = s + (e - s)/2;
	                    if(matrix[i][mid] == target)
	                        return true;
	                    else if(matrix[i][mid] < target){
	                        s = mid + 1;
	                    }else{
	                        e = mid - 1;
	                    }
	                }
	            }
	        }
	        return false;
	    }
	
	public static void main(String[] args) {
		int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		System.out.println(searchMatrix(matrix, 21));

	}

}
