
public class reverseInteger {

	    public int reverse(int x) {
	        long res = 0;
	        int k = x;

	        if(x<0){
	            k=(-1)*k;
	        }
	        while(k>0){
	            res=res*10+x%10;
	            x=x/10;
	            k=k/10;
	        }
	        if(res<Math.pow(-2,31) || res>Math.pow(2,31) )
	            return 0;
	        else 
	            return (int)res;
	    }
	}


