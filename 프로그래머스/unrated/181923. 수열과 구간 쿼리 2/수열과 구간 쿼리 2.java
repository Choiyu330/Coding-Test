import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<queries.length; i++) {
            int min = 1000001;
            for(int j=queries[i][0]; j<=queries[i][1]; j++) {
                if(queries[i][2] < arr[j])
                    min = Math.min(min, arr[j]);
            }
            if(min == 1000001)
                answer.add(-1);
            else
                answer.add(min);
        }
        return answer.stream().mapToInt(item -> item).toArray();
    }
}