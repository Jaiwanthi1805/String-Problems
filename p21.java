import java.util.Scanner;

public class Main {

    static void findFrequency(String s) {

        boolean visited[] = new boolean[s.length()];

        for (int i = 0; i < s.length(); i++) {

            if (visited[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < s.length(); j++) {

                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(s.charAt(i) + " = " + count);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        findFrequency(s);
    }
}