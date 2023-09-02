import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        ArrayList<String> strList = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        char[] arr = myStr.toCharArray();
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 'a' || arr[i] == 'b' || arr[i] == 'c') {
                if(sb.length() != 0) {    
                    strList.add(sb.toString());
                    sb.setLength(0);
                }
            } else if (arr[i] != 'a' || arr[i] != 'b' || arr[i] != 'c') {
                sb.append(arr[i]);
                if(i==arr.length-1) {
                    strList.add(sb.toString());
                    sb.setLength(0);
                }
            }
        }
        
        if(strList.size() == 0) {
            return new String[] {"EMPTY"};
        }
        
        return strList.toArray(new String[strList.size()]);
    }
}
