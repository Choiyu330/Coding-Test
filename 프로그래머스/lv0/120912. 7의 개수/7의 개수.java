class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int i=0; i<array.length; i++) {
            if(String.valueOf(array[i]).length() >= 2) {
                
                String str1 = String.valueOf(array[i]);
                String[] str2 = str1.split("");
                
                for(int j=0; j<str2.length; j++) {
                    if(str2[j].equals("7")) {
                        answer++;
                    }
                }
            }
            else {
                if(String.valueOf(array[i]).equals("7")) {
                    answer++;
                }
            }
        }
        return answer;
    }
}