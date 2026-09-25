import java.util.Scanner;

public class Main {

    static String shortestWord(String str) {
        String word = "";
        String shortest = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ') {
                word = word + str.charAt(i);
            } else {
                if (!word.equals("")) {
                    if (shortest.equals("") ||
                        word.length() < shortest.length()) {

                        shortest = word;
                    }
                }

                word = "";
            }
        }

        if (!word.equals("")) {
            if (shortest.equals("") ||
                word.length() < shortest.length()) {

                shortest = word;
            }
        }

        return shortest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        System.out.println("Shortest word = " + shortestWord(str));
    }
}