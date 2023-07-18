import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int min = arr[0];
        
        if(arr.length == 1)
            answer.add(-1);
        
        else {
            for(int i=0; i<arr.length; i++) {
                min = Math.min(arr[i], min);
            }
        
            for(int i=0; i<arr.length; i++) {
                if(arr[i] != min) {
                    answer.add(arr[i]);
                }
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}