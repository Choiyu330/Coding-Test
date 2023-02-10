class Solution {
    public int solution(int slice, int n) {
        // n 명이 slice 만큼 먹는다
        // n % slice != 0 일 때 (n / slice) + 1
        int answer = 0;
        
        if(n % slice != 0) { answer = (n / slice) + 1; } 
        else { answer = n / slice; }
        
        return answer;
    }
}