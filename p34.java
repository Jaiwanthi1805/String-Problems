import java.util.Scanner;

public class Main {

    static boolean isSubsequence(String s, String t) {
        int j = 0;

        for (int i = 0; i < t.length(); i++) {

            if (j < s.length() &&
                s.charAt(j) == t.charAt(i)) {

                j++;
            }
        }

        return j == s.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter s: ");
        String s = sc.nextLine();

        System.out.print("Enter t: ");
        String t = sc.nextLine();

        System.out.println(isSubsequence(s, t));
    }
}