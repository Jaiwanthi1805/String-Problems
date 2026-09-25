import java.util.Scanner;

public class Main {

    static String removeDuplicates(String s) {
        
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (result.indexOf(ch)==-1) {
                result = result + ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("After removing duplicates = "+ removeDuplicates(str));
    }
}