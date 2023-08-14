class Solution {
    public String solution(String my_string, int[] indices) {
        String[] answer = my_string.split("");
        
        for(int i=0; i<indices.length; i++) {
            answer[indices[i]] = "";
        }
        return String.join("", answer);
    }
}