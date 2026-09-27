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

    static int countPalindromes(String str) {
        String word = "";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ') {
                word = word + str.charAt(i);
            } else {

                if (!word.equals("") && isPalindrome(word)) {
                    count++;
                }

                word = "";
            }
        }

        if (!word.equals("") && isPalindrome(word)) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        System.out.println("Palindromic words = "+ countPalindromes(str));
    }
}