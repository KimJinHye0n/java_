class Solution {
    public int[] solution(int[] arr) {
        int mina = arr[0];
        int[] answer = new int[arr.length-1];
        int x = 0;
        if (arr.length <= 1) {
            answer = new int[1];
            answer[0] = -1;
        }
        else {
            for (int i = 0; i<arr.length; i++) {
                if(mina > arr[i]) {
                    mina = arr[i];
                    x = i;
                }   
            }
            for (int j = 0; j<arr.length; j++) {
                if(j < x) {
                    answer[j] = arr[j];
                }
                else if (j > x) {
                    answer[j-1] = arr[j];
                }
                else {
                    continue;   
                }
            }
        }
        return answer;

    }
}