import java.util.*;

class Solution {
    public int solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=1; i<=200; i++) {
            if(i % 3 != 0 && !String.valueOf(i).contains("3")) {
                arr.add(i);
            }
        }
        return arr.get(n-1);
    }
}