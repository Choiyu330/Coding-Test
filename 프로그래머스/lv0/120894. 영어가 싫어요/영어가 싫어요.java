import java.util.HashMap;

class Solution {
    public long solution(String numbers) {
        String answer = "";
        HashMap<Integer, String> map = new HashMap<>();

        map.put(0, "zero");     map.put(1, "one");
        map.put(2, "two");      map.put(3, "three");
        map.put(4, "four");     map.put(5, "five");
        map.put(6, "six");      map.put(7, "seven");
        map.put(8, "eight");    map.put(9, "nine");

        String str = "";
        
        for(int i=0; i<numbers.length(); i++) {
            str += String.valueOf(numbers.charAt(i));
            if (str.length() > 2) {
                for(int j=0; j<=map.size(); j++) {
                    if (str.equals(map.get(j))) {
                        answer += String.valueOf(j);
                        str = "";
                        break;
                    }
                }
            }
        }
        return Long.parseLong(answer);
    }
}