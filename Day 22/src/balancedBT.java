
public class balancedBT {

public static int count(int h){		
		
		if(h == 0 || h == 1){
			return 1;
		}
		int mod = (int)Math.pow(10, 9) + 7;
		
		int x = count( h - 1);
		int y = count(h - 2);
		
		long res1 = (long)x * x;
		long res2 = (long)x * y * 2;
		
		int value1 = (int)(res1 % mod);
		int value2 = (int)(res2 % mod);
		
		return  (value1 + value2) % mod;
	}
	
	public static int countDP(int h) {
		if(h==0||h==1){
            return 1;
        }
        int storage[] = new int[h+1];
        int mod = (int) (Math.pow(10,9)+7);
        storage[0] = 1;
        storage[1] = 1;

        for (int i =2; i<=h;i++) {
            long x = storage[i-1];
            long y = storage[i-2];

            long value1 = (x*x) % mod;
            long value2 = (x*y*2) % mod;

            storage[i] = (int) (value1+value2) % mod;
        }

        return storage[h];

	}
	
	
	public static long countLong(long h) {

		if(h<=1){
			return 1;
		}

		int mod = (int) Math.pow(10, 9) + 7;
		long x = countLong(h-1);
		long y = countLong(h-2);

		long ans = (x*x + 2*x*y) % mod;

		return ans;

	}

	public static void main(String[] args) {
		int h = 40;
		System.out.println(countDP(h));
		System.out.println(countLong(h));
		System.out.println(count(h));
	}

}