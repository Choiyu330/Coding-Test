class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int first = (total / num) - (num / 2);
        
        if(num%2 == 0) {
            int odd_num = first + 1;
            for(int i=0; i<answer.length; i++) {
                answer[i] = odd_num;
                odd_num++;
            }
        }
        else {
            for(int i=0; i<answer.length; i++) {
                answer[i] = first;
                first++;
            }
        }
        return answer;
    }
}
