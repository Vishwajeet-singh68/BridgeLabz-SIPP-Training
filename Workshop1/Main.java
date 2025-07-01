package learning;
import java.util.*;
public class Main {
	public static void main(String args[]) {
		
		ArrayList<FlightBooking> allBooking = new ArrayList();
		FlightBooking person1= new FlightBooking("vishwajeet","new delhi","banglore");
		person1.dispalyBooking();
		if(person1.isBooked)
			allBooking.add(person1);
		
	}
}
