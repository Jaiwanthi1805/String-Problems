import java.util.Scanner;

public class Main {

    static boolean checkPalindrome(String str, int i, int j) {

        while (i < j) {

            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    static boolean validPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {

            if (str.charAt(i) != str.charAt(j)) {

                return checkPalindrome(str, i + 1, j) ||
                       checkPalindrome(str, i, j - 1);
            }

            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println(validPalindrome(str));
    }
}