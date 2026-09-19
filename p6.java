import java.util.Scanner;

public class Main {
    static void count(String s) {
        int digits = 0;
        int special = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= '0' && ch <= '9') {
                digits++;
            } else if (!((ch >= 'A' && ch <= 'Z') ||
                         (ch >= 'a' && ch <= 'z'))) {
                special++;
            }
        }

        System.out.println("Digits = " + digits);
        System.out.println("Special = " + special);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        count(s);
    }
}