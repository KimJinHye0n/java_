class Solution {
    public int[] solution(int n, int m) {
        int a = 0;
        int b = 0;
        int c = 0;
        
        if (n<m) {
            a = n;
            b = m;
        }
        else {
            a = m;
            b = n;
        }
        
        int[] answer = new int[2];
        while (a!=0) {
            c = b % a;
            b = a;
            a = c;
            }
        answer[0] = b;
        answer[1] = n*m/b;
        return answer;
    }
}