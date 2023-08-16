import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        Stack<Integer> answer = new Stack<>();
        
        for(int i=0; i<arr.length; i++) {
            int cnt = 0;
            if(flag[i]) {
                while(cnt < arr[i] * 2) {
                    answer.push(arr[i]);
                    cnt++;
                }
            }
            else {
                while(cnt < arr[i]) {
                    answer.pop();
                    cnt++;
                }
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}