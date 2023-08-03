import java.util.*;

class Solution {
    public int solution(String s) {
        HashMap<String, String> hs = new HashMap<>();
        
        hs.put("zero", "0");        hs.put("five", "5");
        hs.put("one", "1");         hs.put("six", "6");
        hs.put("two", "2");         hs.put("seven", "7");
        hs.put("three", "3");       hs.put("eight", "8");
        hs.put("four", "4");        hs.put("nine", "9");
        
        for(String key : hs.keySet()) {
        	if(s.contains(key))
                s = s.replace(key, hs.get(key));
        }
        return Integer.parseInt(s);
    }
}