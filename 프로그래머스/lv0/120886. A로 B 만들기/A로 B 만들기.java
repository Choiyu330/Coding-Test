class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        for(int i=0; i<after.length(); i++) {
            before = before.replaceFirst(String.valueOf(after.charAt(i)), "");
        }
        
        if(before.length() == 0) { answer = 1; }
        else { answer = 0; }
        
        return answer;
    }
}