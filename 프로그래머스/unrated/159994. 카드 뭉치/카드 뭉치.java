import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        List<String> cards1_idx = new ArrayList(Arrays.asList(cards1));
        List<String> cards2_idx = new ArrayList(Arrays.asList(cards2));
        
        for(int i=0; i<goal.length; i++) {
            if(cards1_idx.size() > 0 && goal[i].equals(cards1_idx.get(0)))
                cards1_idx.remove(0);
            else if(cards2_idx.size() > 0 && goal[i].equals(cards2_idx.get(0)))
                cards2_idx.remove(0);
            else
                return "No";
        }
        return answer;
        
        
    }
}