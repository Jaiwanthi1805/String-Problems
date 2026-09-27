import java.util.Scanner;

public class Main {

    static boolean isPalindrome(String word) {
        int i = 0;
        int j = word.length() - 1;

        while (i < j) {

            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    static String longestPalindrome(String str) {
        String word = "";
        String longest = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ') {
                word = word + str.charAt(i);
            } else {

                if (isPalindrome(word) &&
                    word.length() > longest.length()) {

                    longest = word;
                }

                word = "";
            }
        }

        if (isPalindrome(word) &&
            word.length() > longest.length()) {

            longest = word;
        }

        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        System.out.println("Longest palindromic word = "+ longestPalindrome(str));
    }
}