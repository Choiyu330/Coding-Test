import java.math.*;

class Solution {
    public String solution(String a, String b) {
        BigInteger bigNum = new BigInteger(a);
        BigInteger bigNum2 = new BigInteger(b);
        return String.valueOf(bigNum.add(bigNum2));
    }
}