import java.util.Scanner;

public class Main {

    static String longestWord(String str) {
        String word = "";
        String longest = "";

        for (int i = 0; i < str.length(); i++) {

            if(i==str.charAt(i)||str.charAt(i) == ' '){
                if (word.length() > longest.length()) {
                    longest = word;
                }
                word = "";
            }
            else{
                word = word + str.charAt(i);
            }
        }
         if (word.length() > longest.length()) {
            longest = word;
        }
             
        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        System.out.println("Longest word = " + longestWord(str));
    }
}