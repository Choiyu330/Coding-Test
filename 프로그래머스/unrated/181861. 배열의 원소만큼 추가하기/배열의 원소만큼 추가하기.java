import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> a = new ArrayList<>();

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i]; j++) {
                a.add(arr[i]);
            }
        }
        return a.stream().mapToInt(Integer::intValue).toArray();
    }
}