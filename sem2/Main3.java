package sem2;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String s = scan.next();
            boolean result = checkPalindrome(s);
            System.out.println(result);
        }
    }

    public static boolean checkPalindrome(String s) {

        boolean check = true;
        int j = s.length() - 1;
        int i = 0;
        while (i <= s.length() / 2) {
            if (s.charAt(i) != s.charAt(j)) {
                check = false;
            }
            j--;
            i++;
        }
        return check;
    }
}
