import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        
		Arrays.sort(numlist);
        
		for (int i : numlist) {
            arr.add(i);
        }
		arr.sort((s1, s2) -> Integer.compare(Math.abs(s2 - n), Math.abs(s1 - n)));
		Collections.reverse(arr);
        
		return arr.stream().mapToInt(num -> num).toArray();
    }
}