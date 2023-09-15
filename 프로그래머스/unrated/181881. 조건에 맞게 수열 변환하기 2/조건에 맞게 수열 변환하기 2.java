class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        while(true) {
            Boolean isEqual = true;
            
            for(int i=0; i<arr.length; i++) {
                int num = arr[i];
                
                if(num >= 50 && num % 2 == 0)
                    num /= 2;
                else if(num < 50 && num % 2 == 1)
                    num = 2 * num + 1;
                if(num != arr[i])
                    isEqual = false;
                
                arr[i] = num;
            }
            if(isEqual)
                break;
            else
                answer++;
        }
        return answer;
    }
}