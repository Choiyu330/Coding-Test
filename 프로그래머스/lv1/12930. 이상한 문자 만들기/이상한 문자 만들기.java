class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int cnt = 1;
        
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ' ') {
                answer.append(" ");
                cnt = 0;
            }
            else {
                if(cnt % 2 == 1) 
                    answer.append(String.valueOf(s.charAt(i)).toUpperCase());
                else
                    answer.append(String.valueOf(s.charAt(i)).toLowerCase());
            }
            cnt++;
        }
        return answer.toString();
    }
}