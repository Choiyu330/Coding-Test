import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++) {
            int size = stk.size();
            
            if(size == 0)
                stk.add(arr[i]);
            else if(stk.get(size - 1) == arr[i])
                stk.remove(size - 1);
            else
                stk.add(arr[i]);
        }
        return stk.size() == 0 ? new int[]{-1} : stk.stream().mapToInt(item -> item).toArray();
    }
}