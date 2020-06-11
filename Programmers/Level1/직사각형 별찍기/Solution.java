import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String x = String.valueOf('*');
        String y = x;
        
        
        for (int i = 0 ; i < a-1 ; i++) {
            y += x;
        }
        for (int i = 0; i < b ; i ++) {
            System.out.println(y);
        }
    }
}