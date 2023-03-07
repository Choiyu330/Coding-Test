import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] copyArr = new int[emergency.length];
                                
        for(int i=0; i<emergency.length; i++) {
            copyArr[i] = emergency[i];
        }
        
        Arrays.sort(copyArr);
        
        for(int i=0; i<emergency.length; i++) {
            for(int j=0; j<emergency.length; j++) {
                if(copyArr[i] == emergency[j]) {
                    answer[j] = emergency.length - i;
                }
            }
        }
        return answer;
    }
}