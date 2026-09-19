import java.util.Scanner;

public class Main {
    static String replaceSpaces(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                result = result + '-';
            } else {
                result = result + s.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println(replaceSpaces(s));
    }
}