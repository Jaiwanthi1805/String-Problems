import java.util.Scanner;

public class p1{
    static void print(String s){
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i)+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String :");
        String s = sc.nextLine();
        print(s);
    }
}