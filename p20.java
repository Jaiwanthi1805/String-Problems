import java.util.Scanner;

public class p20 {
    static int lastOccurrence(String s, char target) {
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);

        System.out.println(lastOccurrence(s, ch));
    }
}