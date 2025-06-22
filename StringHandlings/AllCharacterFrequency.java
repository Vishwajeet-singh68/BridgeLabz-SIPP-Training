import java.util.Scanner;

public class AllCharacterFrequency {

    // Method to find frequency and return 2D array
    public static char[][] findCharacterFrequencies(String str) {
        int[] freq=new int[256]; // For all ASCII characters

        // Count frequency of each character
        for (int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            freq[ch]++;
        }

        // Maximum possible size is the length of string (for unique characters)
        char[][] result=new char[str.length()][2];
        int index=0;

        for (int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if (freq[ch]!=0) {
                result[index][0]=ch;
                result[index][1]=(char)(freq[ch]+'0'); // Store frequency as character
                freq[ch]=0; // Mark as processed
                index++;
            }
        }

        // Create exact-sized array for result
        char[][] finalResult=new char[index][2];
        for (int i=0;i<index;i++) {
            finalResult[i][0]=result[i][0];
            finalResult[i][1]=result[i][1];
        }

        return finalResult;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input=sc.nextLine();

        char[][] frequencies=findCharacterFrequencies(input);

        System.out.println("Character Frequencies:");
        for (int i=0;i<frequencies.length;i++) {
            System.out.println("Character: "+frequencies[i][0]+" Frequency: "+(frequencies[i][1]-'0'));
        }
    }
}
