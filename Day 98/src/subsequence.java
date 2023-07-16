
public class subsequence {

	public boolean isSubsequence(String s, String t) {

        int l = s.length();
        int r = t.length();
        int k = 0;

        if (l == 0) {
            return true;
        }

        if (l > r) {
            return false;
        }

        for (int i = 0; i < r; i++) {
            if (s.charAt(k) == t.charAt(i)) {
                if (k == l - 1) {
                    return true;
                }
                k++;
            }
        }

        return false;
    }
}


