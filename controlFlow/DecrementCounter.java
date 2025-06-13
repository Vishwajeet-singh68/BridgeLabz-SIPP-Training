package controlFlow;

import java.util.Scanner;

public class DecrementCounter {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int counter=in.nextInt();
        while(counter-->1){
            System.out.println(counter);
        }
    }
}
