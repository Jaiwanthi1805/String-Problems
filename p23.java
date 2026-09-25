import java.util.Scanner;

public class Main {

    static char leastFrequent(String s) {
        int min=0;
        char result=s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            int count=0;

            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }

            if (count < min) {
                min = count;
                result = s.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Least frequent character = " + leastFrequent(str));
    }
}