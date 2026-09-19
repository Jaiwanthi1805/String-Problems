import java.util.Scanner;

public class Main {
    static String convert(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }

            result = result + ch;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println(convert(s));
    }
}