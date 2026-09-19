import java.util.Scanner;

public class Main {
    static int findLength(String s) {
        int count = 0;

        for (char ch : s.toCharArray()) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println(findLength(s));
    }
}