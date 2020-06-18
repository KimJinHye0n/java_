class Solution {
    public boolean solution(int x) {
        boolean answer;
        int a = 0;
        int n = x;
        for(int i = (int)(Math.log10(x)+1); i>0; i--) {
        	int y = n / (int)Math.pow(10,i-1);
            a += y;
            n = n - y*(int)Math.pow(10, i-1);
        }
        if (x % a == 0) {
            answer = true;
        }
        else {
            answer = false;
        }
        return answer;
    }
}