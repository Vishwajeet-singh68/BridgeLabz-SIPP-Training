import java.util.Scanner;

public class VowelsAndConsonants{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int vowels=0,consonants=0;
        for(char ch:s.toCharArray()){
            if(ch=='a' || ch=='e' ||ch=='i' || ch=='o' || ch=='u')
                vowels++;
            else
                consonants++;
        }
        System.out.println("Counts of vowels are "+vowels+" and consonants are "+consonants);
    }
}