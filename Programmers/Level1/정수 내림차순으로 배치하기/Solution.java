import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        int a = (int)(Math.log10(n)+1);
        long[] array = new long[a];
        for(int i = a ; i>0 ; i--) {
			int x = (int) (n / Math.pow(10,i-1));
			array[i-1] = x;
		    n -= (long)x * (Math.pow(10, i-1));    
		}
        
		Arrays.sort(array);
        
		for (int i = a ; i>0 ; i--) {
			answer += array[i-1] * Math.pow(10,i-1);
		}
        return answer;
    }
}