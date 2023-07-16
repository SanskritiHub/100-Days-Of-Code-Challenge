public class countAndSay {
	
	public String countAndSay(int n) {
        if(n == 1){
            return "1";
        }
        String st = "11";
        int j = 0;
        for(int i = 0;i<n-2;i++){
            int count = 1;
            String s = "";
            for( j = 0;j<st.length()-1;j++){
                if(st.charAt(j) == st.charAt(j+1)){
                    count++;
                }
                else{
                    s += Integer.toString(count);
                    s += st.charAt(j);
                    count = 1;
                }
            }
            s += Integer.toString(count);
            s += st.charAt(j);
            st = s;
        }
        return st;
    }

}
