class Solution {
    public long solution(long n) {
        double b = Math.sqrt((double)n);
        
        if(isInteger(b)) { 
            return (long)((b + 1) * (b + 1)); 
        }
        else { 
            return -1;
        }
    }
    public boolean isInteger(double num) {
	    return num % 1 == 0.0;
    }
}
