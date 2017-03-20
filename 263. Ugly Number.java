public class Solution {
    public static boolean isUgly(int num) {
    		boolean sub = false;
    	if(num>0){
	    	while(num%2==0)
	    		num/=2;
	    	while(num%3==0)
	    		num/=3;
	    	while(num%5==0)
	    		num/=5;
	    	if(num==1)
	    		sub = true;
	    	else
	    		sub = false;	
    }
    else if(num<=0)
    		sub = false;
    	return sub;
    }
}