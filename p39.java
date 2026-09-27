import java.util.Scanner;

public class Main {

    static boolean isRotation(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }

        String combined = a + a;

        for (int i = 0; i <= combined.length() - b.length(); i++) {

            int j = 0;

            while (j < b.length() &&
                   combined.charAt(i + j) == b.charAt(j)) {

                j++;
            }

            if (j == b.length()) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String a = sc.nextLine();

        System.out.print("Enter second string: ");
        String b = sc.nextLine();

        System.out.println(isRotation(a, b));
    }
}