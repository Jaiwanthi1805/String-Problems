import java.util.Scanner;

public class Main {
    static int countWords(String s) {
        int count = 0;
        boolean insideWord = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && !insideWord) {
                count++;
                insideWord = true;
            } else if (s.charAt(i) == ' ') {
                insideWord = false;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String s = sc.nextLine();

        System.out.println(countWords(s));
    }
}