class Solution {
    boolean solution(String s) {
        char[] c = s.toCharArray();
        int p = 0;
        int y = 0;
        boolean answer = true;
        for(int i = 0; i<c.length; i++) {
            if (c[i]=='P' || c[i]=='p') {p++;}
            if (c[i]=='Y' || c[i]=='y') {y++;}
        }
        if (p == y) {
            answer = true;
        }
        else {
            answer = false;
        }     

        return answer;
    }
}