import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next(),ans="";
        for(char ch:s.toCharArray()){
            if(ans.contains(ch+""))
                continue;
            ans+=ch;
        }
        System.out.println("String after removing duplicates is "+ans);
    }
}
