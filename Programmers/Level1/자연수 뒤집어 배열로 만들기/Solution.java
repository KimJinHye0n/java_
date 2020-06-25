import java.util.*;

class Solution {
    public int[] solution(long n) {
        int length = (int)(Math.log10(n) + 1);
        int[] answer = new int[length];
        long y = n;
        for (int i = 0; i < length; i++) {
            long x = y % 10;
            answer[i] = (int)x;
            y = y / 10;
        }
        return answer;
    }
}