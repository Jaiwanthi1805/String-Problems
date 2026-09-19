import java.util.Scanner;

public class Main {
    static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            char a = Character.toLowerCase(s.charAt(i));
            char b = Character.toLowerCase(s.charAt(j));

            if (a != b) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println(isPalindrome(s));
    }
}