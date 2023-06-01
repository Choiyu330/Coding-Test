import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
        int num_len = num_list.length;
        int ans_len = answer.length;
        
        if(num_list[num_len - 1] > num_list[num_len - 2]) {
            answer[ans_len - 1] = num_list[num_len - 1] - num_list[num_len -2];
        }
        else {
            answer[ans_len - 1] = 2 * num_list[num_len - 1];
        }
        return answer;
    }
}