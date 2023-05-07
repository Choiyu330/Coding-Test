class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        // 평행 조건 -> 기울기 동일
        if(function(dots[0], dots[1]) == function(dots[2], dots[3])) answer = 1;
        if(function(dots[0], dots[2]) == function(dots[1], dots[3])) answer = 1;
        if(function(dots[0], dots[3]) == function(dots[1], dots[2])) answer = 1;
        
        return answer;
    }
    public double function(int[] a, int[] b) {
            return (double)(b[1] - a[1]) / (b[0] - a[0]); 
        }
}