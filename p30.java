import java.util.Scanner;

public class Main {

    static boolean allUnique(String str) {
        boolean[] visited = new boolean[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (visited[ch]) {
                return false;
            }

            visited[ch] = true;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println(allUnique(str));
    }
}