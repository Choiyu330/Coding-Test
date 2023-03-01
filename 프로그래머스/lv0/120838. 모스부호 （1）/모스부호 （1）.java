class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] strLetter = letter.split(" ");
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        for(int i=0; i<strLetter.length; i++) {
            for(int j=0; j< morse.length; j++) {
                if(strLetter[i].equals(morse[j])) {
                    answer += Character.toString(j + 'a');
                }
            }
        }
        return answer;
    }
}