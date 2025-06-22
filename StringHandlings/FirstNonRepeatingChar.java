import java.util.Scanner;

public class FirstNonRepeatingChar {

    // Method to find the first non-repeating character
    public static char findFirstNonRepeatingChar(String str) {
        int[] freq=new int[256]; // For ASCII characters

        // Count frequency of each character
        for (int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            freq[ch]++;
        }

        // Find first character with frequency 1
        for (int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if (freq[ch]==1) {
                return ch;
            }
        }

        return '\0'; // Returning null character if none found
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input=sc.nextLine();

        char result=findFirstNonRepeatingChar(input);

        if (result!='\0') {
            System.out.println("First non-repeating character: "+result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
