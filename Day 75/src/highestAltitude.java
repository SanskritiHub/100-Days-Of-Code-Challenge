
public class highestAltitude {
	
	public static int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        int currentAltitude = 0;
        
        for (int i = 0; i < gain.length; i++) {
            currentAltitude += gain[i];
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }
        
        return maxAltitude;
    }

	public static void main(String[] args) {
		int[] gain = {-5,1,5,0,-7};
		System.out.println(largestAltitude(gain));
	}

}
