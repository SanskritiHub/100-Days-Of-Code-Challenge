
public class findEvenNumber {

	public static void main(String[] args) {
		int [] num = {12, 6, 7 , 2345 ,9876};
		System.out.println(findNumber(num));
		System.out.println(digits(-12394));
		
	}
	
	//counting how many number contain even digit.
	static int findNumber(int[] nums) {
		int count = 0;
		for(int num: nums) {
			if(even(num)) {
				count++;
			}
		}
		return count;
	}
	
	//checking whether digit in num is even or not
	static boolean even(int num) {
		
		int numberOfDigit = digits(num);
//		if(numberOfDigit%2==0) {
//			return true;
//		}
//		return false;
		
		return numberOfDigit%2==0;
	}
	
	static int digits(int num) {
		
		if(num<0) {
			num= num * -1;
		}
		
		if(num==0) {
			return 1;
		}
		
		int count = 0;
		while(num>0) {
			count++;
			num = num/10;
			
			//return (int)(Math.log10(num)+1;
		}
		return count;
	}

}
