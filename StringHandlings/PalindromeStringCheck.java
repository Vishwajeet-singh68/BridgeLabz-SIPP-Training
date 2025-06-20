import java.util.Scanner;

public class PalindromeStringCheck {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next(),reversed="";
        for(char ch:s.toCharArray()){
            reversed=ch+reversed;
        }
        if(s.equals(reversed))
            System.out.println(s+" is palindrome");
        else
            System.out.println(s+" is not palindrome.");
    }
}
