import java.util.Scanner;

public class ToggleCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String toggled = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                // Convert lowercase to uppercase
                toggled += (char)(ch - 32);
            } else if (ch >= 'A' && ch <= 'Z') {
                // Convert uppercase to lowercase
                toggled += (char)(ch + 32);
            } else {
                // Non-alphabet character remains same
                toggled += ch;
            }
        }

        System.out.println("Toggled string: " + toggled);
    }
}
