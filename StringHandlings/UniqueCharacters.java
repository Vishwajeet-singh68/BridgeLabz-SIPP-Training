import java.util.Scanner;

public class UniqueCharacters {

    public static int findLength(String str) {
        int count=0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // end of string
        }
        return count;
    }

    public static char[] findUniqueCharacters(String str) {
        int len=findLength(str);
        char[] unique=new char[len];
        int uniqueCount=0;

        for (int i=0;i<len;i++) {
            char current=str.charAt(i);
            boolean isUnique=true;
            for (int j=0;j<i;j++) {
                if (str.charAt(j)==current) {
                    isUnique=false;
                    break;
                }
            }
            if (isUnique) {
                unique[uniqueCount]=current;
                uniqueCount++;
            }
        }

        char[] result=new char[uniqueCount];
        for (int i=0;i<uniqueCount;i++) {
            result[i]=unique[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input=sc.nextLine();
        char[] uniqueChars=findUniqueCharacters(input);
        System.out.println("Unique characters:");
        for (int i=0;i<uniqueChars.length;i++) {
            System.out.println(uniqueChars[i]);
        }
    }
}
