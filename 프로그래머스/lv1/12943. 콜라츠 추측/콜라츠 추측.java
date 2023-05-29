class Solution {
    public int solution(long num) {
        int answer = -1;
        int cnt = 0;
        
        if(num == 1) { return 0; }
        
        while(cnt <= 500) {
            if(num == 1) { 
                answer = cnt;
                break;
            }
            else {
                if(num % 2 == 0) {
                    num /= 2;
                }
                else {
                    num = (num * 3) + 1;
                }
            }
            cnt++;
        }
        return answer;
    }
}