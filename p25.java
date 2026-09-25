import java.util.Scanner;

public class Main {

    static void repeated(String s) {

        boolean visited[] = new boolean[s.length()];

        for (int i = 0; i < s.length(); i++) {

            if (visited[i]) {
                continue;
            }

            int count = 0;

            for (int j = i + 1; j < s.length(); j++) {

                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                    visited[j] = true;
                }
            }
            if(count>0){
                System.out.print(s.charAt(i)+" ");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        repeated(s);
    }
}