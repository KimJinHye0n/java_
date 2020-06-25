class Solution {
    public int solution(int num) {
        long numx = (long)num;
        int count = 0;
        for(int i = 0; i < 500; i++) {
            if (numx == 1) {
                break;
            }
            else {
                if (numx % 2 == 0) {
                 numx = numx / 2;
                }
                else {
                 numx = numx * 3 + 1;
                }    
            }
            count++;
        }
        if(numx != 1) {
            count = -1;
        }
        return count;
    }
}