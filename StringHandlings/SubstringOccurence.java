import java.util.Scanner;

public class SubstringOccurence {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
	    String sub=in.nextLine();
        int count=0;
	    for(int i=0;i<s.length();i++){
            if(s.charAt(i)==sub.charAt(0) && s.substring(i,i+sub.length()).equals(sub))
                count++;
        }
	    System.out.println("Occurence of \""+sub+"\" in String \""+s+"\" is "+count);
    }
}
