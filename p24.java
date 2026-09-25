import java.util.Scanner;

public class Main {

    static char nonRepeating(String s) {

        for (int i = 0; i < s.length(); i++) {
            int count=0;

            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }

            if (count==1) {
              return s.charAt(i);
            }
        }

        return '-';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Non Repeating character = " + nonRepeating(str));
    }
}