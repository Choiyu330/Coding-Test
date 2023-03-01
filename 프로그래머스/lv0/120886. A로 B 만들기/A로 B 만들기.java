class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        for(int i=0; i<after.length(); i++) {
            before = before.replaceFirst(String.valueOf(after.charAt(i)), "");
        }
        return answer = (before.length() == 0) ? 1 : 0 ;
    }
}