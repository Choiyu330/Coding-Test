import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i=l; i<=r; i++) {
            String str = String.valueOf(i);
            int cnt = 0;
            for(int j=0; j<str.length(); j++) {
                if(str.charAt(j) != '0' && str.charAt(j) != '5')
                    cnt++;
            }
            
            if(cnt == 0)
                answer.add(i);
        }
        
        if(answer.size() == 0)
            answer.add(-1); 
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}