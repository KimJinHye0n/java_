class Solution {
    public String solution(String phone_number) {
        char[] star = phone_number.toCharArray();
        String answer = "";
        for(int i = 0; i<star.length-4; i++) {
        	star[i] = '*';
        }
        answer = String.valueOf(star);
        return answer;
    }
}