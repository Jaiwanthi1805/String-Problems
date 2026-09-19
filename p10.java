import java.util.Scanner;

public class Main {
    static void printASCII(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            System.out.println(ch + " = " + (int) ch);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        printASCII(s);
    }
}