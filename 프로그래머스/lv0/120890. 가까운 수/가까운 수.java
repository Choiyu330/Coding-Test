import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int index = 0;
        
        for(int i=1; i<array.length; i++) {
            if(Math.abs(array[i] - n) < Math.abs(answer - n)) {
                answer = array[i];
                index = i;
            }
            else if(Math.abs(array[i] -n) == Math.abs(answer - n)) {
                if(array[i] < answer) {
                    answer = array[i];
                    index = i;
                }
            }
        }
        return answer;
    }
}