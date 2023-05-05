
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class groupAnagram {
	
	public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s:strs){
            char charArray[] = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);

            if(!map.containsKey(sorted)){
                map.put(sorted, new LinkedList<String>());
            }
            map.get(sorted).add(s);
        }
        return new LinkedList<>(map.values());
    }


	    public static void main (String[] args) throws java.lang.Exception
	    {
	        String[] words = {"pop","bat","tab","opp"};
	        System.out.println(groupAnagrams(words));
	    }

	}
