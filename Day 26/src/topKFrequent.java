import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class topKFrequent {

	public static int[] topKFrequentElement(int[] nums, int k) {
	      HashMap<Integer,Integer>map=new LinkedHashMap<>();
	      
	        ArrayList<Integer> a = new ArrayList();
	        int arr[]=new int[k];
	        for(int i=0;i<nums.length;i++){
	            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
	        }
	        
	        for(Entry<Integer, Integer> e:map.entrySet()){
	            a.add(e.getValue());
	        }
	        
	        Collections.sort(a);
	        
	        int j=a.size()-1;
	        for(int i=0;i<arr.length;i++){
	            for(Entry<Integer, Integer> e:map.entrySet()){
	                if(a.get(j)==e.getValue()){
	                    arr[i]=e.getKey();
	                    map.remove(e.getKey());
	                    j--;
	                    break;
	                }
	            }
	        }
	        return arr;
	        
	    }

	public static void main(String[] args) {
		int nums[] = {1,1,1,2,2,3};
		int k = 2;
		System.out.println(Arrays.toString(topKFrequentElement(nums, k)));
	}

}
