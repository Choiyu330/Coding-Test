class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        
        if(n < 3)
            return n;
        
        while(n / 3 != 0) {
            sb.append(n % 3);
            n /= 3;
            if(n / 3 == 0 && n % 3 < 3) {
                sb.append(n);
            }
        }
        for(int i=0; i<sb.length(); i++) {
            answer += (sb.charAt(sb.length() - i - 1) - '0') * Math.pow(3, i);
        }
        return answer;
    }
}