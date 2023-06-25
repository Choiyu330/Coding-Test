class Solution {
    public String solution(String n_str) {
        for(int i=0; i<n_str.length(); i++) {
            if(Integer.valueOf(n_str.charAt(i) - '0') == 0)
                n_str = n_str.replaceFirst(String.valueOf(n_str.charAt(i)), "-");
            else {
                break;
            }
        }
        return n_str.replace("-", "");
    }
}