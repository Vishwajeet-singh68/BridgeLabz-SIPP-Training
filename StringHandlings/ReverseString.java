import java.util.Scanner;

public class ReverseString{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next(),ans="";
        for(char ch:s.toCharArray()){
            ans=ch+ans;
        }
        System.out.println("Reverse of the given String "+s+" is "+ans);
    }
}