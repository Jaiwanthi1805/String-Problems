import java.util.Scanner;

public class Main {
    static void countCase(String s) {
        int upper = 0;
        int lower = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                upper++;
            } else if (ch >= 'a' && ch <= 'z') {
                lower++;
            }
        }

        System.out.println("Uppercase = " + upper);
        System.out.println("Lowercase = " + lower);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        countCase(s);
    }
}