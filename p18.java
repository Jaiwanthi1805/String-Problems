import java.util.Scanner;

public class Main {
    static String reverseWordOrder(String s) {
        String result = "";
        String word = "";
        String[] words = new String[100];
        int count = 0;

        for (int i = 0; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) == ' ') {
                if (!word.equals("")) {
                    words[count] = word;
                    count++;
                    word = "";
                }
            } else {
                word = word + s.charAt(i);
            }
        }

        for (int i = count - 1; i >= 0; i--) {
            result = result + words[i];

            if (i != 0) {
                result = result + " ";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String s = sc.nextLine();

        System.out.println(reverseWordOrder(s));
    }
}