class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == ' ')
                answer.append(" ");
            else if(Character.isUpperCase(ch))
                answer.append((char)((ch - 'A' + n) % 26 + 'A'));
            else
                answer.append((char)((ch - 'a' + n) % 26 + 'a'));
        }
        return answer.toString();
    }
}