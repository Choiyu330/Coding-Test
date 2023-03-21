import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(int)Math.ceil((double)my_str.length() / n)];
        String str = "";
        int cnt = 0;

        for(int i=0; i<my_str.length(); i++) {
            str += my_str.charAt(i);
            if(str.length() == n || i == my_str.length() - 1) {
                answer[cnt] = str;
                cnt++;
                str = "";
            }

        }
        return answer;
    }
}