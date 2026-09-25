import java.util.Scanner;

public class Main {

    static String commonPrefix(String a, String b) {
        int min;

        if (a.length() < b.length()) {
            min = a.length();
        } else {
            min = b.length();
        }

        String result = "";

        for (int i = 0; i < min; i++) {

            if (a.charAt(i) == b.charAt(i)) {
                result = result + a.charAt(i);
            } else {
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String a = sc.nextLine();

        System.out.print("Enter second string: ");
        String b = sc.nextLine();

        System.out.println("Common prefix = " + commonPrefix(a, b));
    }
}