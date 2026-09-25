import java.util.Scanner;

public class Main {

    static void countVowelsEachWord(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                count++;
            }

            if (ch == ' ') {
                System.out.print(count + " ");
                count = 0;
            }
        }

        System.out.print(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        countVowelsEachWord(str);
    }
}