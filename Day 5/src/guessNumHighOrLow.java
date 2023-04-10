import java.util.Random;

public class guessNumHighOrLow {
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		int range = rand.nextInt(10);
		
		int guess = 6;
		
		if(guess==range) {
			System.out.println("Good job the number was " + range);
		}
		else {
			System.out.println("Sorry but the number was " + range);
		}
		
	
	}
	
	public static int guess(int num) {
		int start = 0;
		int end = num;
		
		while(start<=end) {
			int mid = start + (end-start)/2;
			
			int pick = guess(mid);
			
			if(pick==0) {
				return mid;
			}
			else if(pick==1) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		return -1;
	}

}
