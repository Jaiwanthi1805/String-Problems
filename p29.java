import java.util.Scanner;

public class Main {

    static char maximumASCII(String str) {
        char max = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch > max) {
                max = ch;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Maximum ASCII character = "+ maximumASCII(str));
    }
}