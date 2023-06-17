import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int n, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=k; i<=n; i+=k) {
            arr.add(i);
        }
        return arr;
    }
}