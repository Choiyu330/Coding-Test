import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(int)Math.ceil((double)my_str.length() / n)];
        String str = "";
        int cnt = 0;

        for(int i=0; i<my_str.length(); i++) {
            str += my_str.charAt(i);
            // str 문자열의 크기가 n과 같거나 i가 my_str 길이 끝인 경우
            if(str.length() == n || i == my_str.length() - 1) {
                answer[cnt] = str;
                cnt++;
                str = "";
            }

        }
        return answer;
    }
}