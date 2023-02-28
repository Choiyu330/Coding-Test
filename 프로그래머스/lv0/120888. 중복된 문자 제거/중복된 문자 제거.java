class Solution {
    public String solution(String my_string) {
        String[] str = my_string.split("");

        for(int i=0; i<str.length; i++) {
            for(int j=i+1; j<str.length; j++) {
                if(str[i].equals(str[j])) {
                    str[j] = str[j].replace(str[i], "");
                }
            }
        }
        return String.join("", str);
    }
}