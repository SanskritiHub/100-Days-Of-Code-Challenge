
public class lootHouse {

public static int maxLoot(int house[]) {
		
		if(house.length == 0) {
			return 0;
		}
		
		if(house.length == 1) {
			return 0;
		}
		
		if(house.length == 2) {
			return Math.max(house[0], house[1]);
		}
		
		int store[] = new int [house.length];
		store[0] = house[0];
		store[1] = Math.max(house[0], house[1]);
		
		for(int i = 2; i<house.length ; i++) {
			
			//if we loot 1st house
			int res1 = house[i] + store[i-2];
			
			//if we skip 1st house
			int res2 = store[i-1];
			
			store[i] = Math.max(res1, res2);
		}
	     
		return store[house.length-1];
	}

	public static void main(String[] args) {
		int house[] = {5,10};
		System.out.println(maxLoot(house));
	}

}
