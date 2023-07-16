
public class reverseVowelsOfString {

	public String reverseVowels(String s) {
        int n= s.length();
        char[] ch = s.toCharArray();
        int start = 0;
        int end = n-1;
        while(start < end) {
            if(!isVowel(ch[start])) {
                start++;
            }
            else if(!isVowel(ch[end])) {
                end--;
            }else {
                char t = ch[start];
                ch[start] = ch[end];
                ch[end] = t;
                start++;
                end--;
            }
        }
        return new String(ch);
    }
    public boolean isVowel(char temp) {
        if(temp == 'a'|| temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u' || temp == 'A'|| temp == 'E' || temp == 'I' || temp == 'O' || temp == 'U') return true;
        return false;
    }
}
