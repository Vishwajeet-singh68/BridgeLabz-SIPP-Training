import java.util.Scanner;

public class LongestWordInSentence {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine(),ans="",temp="";
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch==' '){
                if(temp.length()>ans.length()){
                    ans=temp;
                    temp="";
                    count=0;
                    continue;
                }
            }
            temp+=ch;
        }
        System.out.println("Longest word in \""+s+"\" is "+ans);
    }
}
