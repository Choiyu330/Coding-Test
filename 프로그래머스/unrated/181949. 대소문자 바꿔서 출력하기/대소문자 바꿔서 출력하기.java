import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<a.length(); i++) {
            Character ch = a.charAt(i);
            
            if(Character.isUpperCase(ch))
                sb.append(String.valueOf(ch).toLowerCase());
            else
                sb.append(String.valueOf(ch).toUpperCase());
        }
        System.out.println(sb.toString());
    }
}