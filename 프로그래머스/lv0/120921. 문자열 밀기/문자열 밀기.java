class Solution {
    public int solution(String A, String B) {
        B += B;
        
        return B.indexOf(A);
    }
}