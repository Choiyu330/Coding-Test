import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i=0; i<quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
            int num = 0;
            
            if(arr[1].equals("+")) {
                num = Integer.valueOf(arr[0]) + Integer.valueOf(arr[2]);
            }
            else {
                num = Integer.valueOf(arr[0]) - Integer.valueOf(arr[2]);
            }
            
            if(num == Integer.valueOf(arr[4])) {
                answer[i] = "O";
            }
            else {
                answer[i] = "X";
            }
        }
        return answer;
    }
}