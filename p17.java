import java.util.Scanner;

public class Main {
    static String reverseWords(String s) {
        String result = "";
        String word = "";

        for (int i = 0; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) == ' ') {
                for (int j = word.length() - 1; j >= 0; j--) {
                    result = result + word.charAt(j);
                }

                if (i != s.length()) {
                    result = result + " ";
                }

                word = "";
            } else {
                word = word + s.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String s = sc.nextLine();

        System.out.println(reverseWords(s));
    }
}