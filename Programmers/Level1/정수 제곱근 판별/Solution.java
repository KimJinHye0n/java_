import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        double x = Math.sqrt(n);
        long y = (long)x;
        double z = x - y;
        if (z == 0) {
            answer = (long)Math.pow(y+1,2);
        }
        else {
            answer = -1;
        }        
        return answer;
    }
}