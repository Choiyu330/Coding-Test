class Solution {
    public int solution(int n) {
        int answer = 0;
        // 7명당 피자 1판
        // 15명은 피자 3판
        // 15/7 몫은 2 나머지는 1
        // 나머지가 있을 경우 몫+1 없으면 몫만큼
        if(n%7 != 0) { answer = (n / 7) + 1; } 
        else { answer = n / 7; }
        
        return answer;
    }
}