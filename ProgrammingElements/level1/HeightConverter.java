import java.util.Scanner;

public class HeightConverter {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter your height in cm:");
		double heightCm=in.nextDouble();
		double totalInches=heightCm/2.54;
		int feet=(int)(totalInches/12);
		double inches=totalInches%12;
        System.out.print("Your Height in cm is "+heightCm+" while in feet is "+feet+" and inches is "+inches+"\n");	}

    }
