import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int num = section[0];
        
        for(int i=0; i<section.length; i++) {
            if(num + m > section[i])
                continue;
            
            num = section[i];
            answer++;
        }
        return answer;
    }
}