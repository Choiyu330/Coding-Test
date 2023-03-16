import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> prime = new ArrayList<>();
        
        for(int i=2; i<= n; i++) {
            if(n % i == 0) {
                while(n % i == 0) { n /= i; }
                prime.add(i);
            }
        }
        
        int[] answer = new int[prime.size()];  
        
        for(int i=0; i<prime.size(); i++) {
            answer[i] = prime.get(i);
        }
        return answer;
    }
}