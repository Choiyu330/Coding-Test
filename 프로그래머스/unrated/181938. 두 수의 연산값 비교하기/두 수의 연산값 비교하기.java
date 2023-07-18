class Solution {
    public int solution(int a, int b) {
        
        int answer = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        
        return answer >= 2 * a * b ? answer : 2 * a * b;
    }
}