class Solution {
    public String solution(String my_string) {
        String[] con = {"a", "e", "i", "o", "u"};

        for(int i=0; i<con.length; i++) {
            if(my_string.contains(con[i])) {
                my_string = my_string.replace(con[i], "");

            }
        }
        return my_string;
    }
}