class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int numer3 = (denom2 * numer1) + (denom1 * numer2);
        int denom3 = denom1 * denom2;
        
        answer[0] = numer3 / gcd(numer3, denom3);
        answer[1] = denom3 / gcd(numer3, denom3);
        
        return answer;
    }
    private int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}