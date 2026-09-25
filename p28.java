import java.util.Scanner;

public class Main {

    static int countDistinct(String s) {
        boolean[] visited = new boolean[256];
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i);

            if(!visited[index]){
                visited[index] = true;
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Distinct characters = "+ countDistinct(str));
    }
}