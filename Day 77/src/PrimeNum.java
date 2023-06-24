import java.util.Scanner;
public class PrimeNum {
	
	public static boolean isPrime (int n) {
		int d = 2;
		while(d<n) {
			if(n%d==0) {
				return false;
			}
			d++;
		}
		return true;
	}
	
	public static boolean prime(int n) {
		if(n<2) {
			return false;
		}
		for(int i = 2; i<=n/2; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean prime = isPrime(n);
		System.out.println(prime);
		System.out.println(prime(n));
		
	}

}
