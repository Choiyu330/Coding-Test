import java.util.*;

class Solution {
    public int[] solution(int n) {
        double size = Math.round(((double)n/2));
        int[] answer = new int[(int)size];
        // answer[0] = 1 = i+1
        // answer[1] = 3 = i+2
        // answer[2] = 5 = i+3
        // answer[3] = 7 = i+4
        for(int i=0; i<size; i++) {
            answer[i] = 2*i + 1;
        }
        return answer;
    }
}