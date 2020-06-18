import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = (int)(Math.log10(n)+1); i>0; i--) {
        	int y = n / (int)Math.pow(10,i-1);
            answer += y;
            n = n - y*(int)Math.pow(10, i-1);
        }
        return answer;
    }
}