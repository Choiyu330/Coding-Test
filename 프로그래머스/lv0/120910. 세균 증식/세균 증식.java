class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        // 0 -> 7
        // 1 -> 7x2
        // 2 -> (7x2)x2
        for(int i=0; i<=t; i++) {
            if(i == 0) {
                answer = n;
            } else {
                answer *= 2;
            }
        }
        return answer;
    }
}