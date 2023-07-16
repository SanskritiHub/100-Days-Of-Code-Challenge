
public class lengthOfLastWord {

	public int lengthOfLastWord(String s) {
        int count = 0;
        boolean b = false;
        
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i) != ' '){
                b = true;
                count++;
            }else{
                if(b){
                    return count;
                    }
            }
        }
        return count;
    }
}

