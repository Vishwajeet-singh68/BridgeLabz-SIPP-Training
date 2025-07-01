package learning;

public class FlightBooking {
	static String boarding[]= {"New Delhi","Agra","Banglore","Dubai","USA"};
	static String destination[]= {"Banglore","Dubai","New Delhi","USA","Banglore"};
	
	String passangerName;
	String passangerSource,passangerDestination;
	boolean isBooked;
	
	FlightBooking(String passangerName,String passangerSource,String passangerDestination){
		this.passangerName=passangerName;
		this.passangerSource=passangerSource;
		this.passangerDestination=passangerDestination;
	}
	int searchFlight() {
		for(int i=0;i<boarding.length;i++) {
			String boardingAirport=boarding[i].toLowerCase();
			String destinationAirport=destination[i].toLowerCase();
			if(boardingAirport.equals(passangerSource.toLowerCase()) && destinationAirport.equals(passangerDestination.toLowerCase()))
					return i;
		}
		return -1;
	}
	String booking() {
		int n=searchFlight();
		if(n==-1)
			return "No flight found";
		this.isBooked=true;
		return "Flight Booked";
	}
	void dispalyBooking() {
		String s=booking();
		
		System.out.println(s);
		if(s.equals("Flight Booked"))
			System.out.println("From "+passangerSource+" To "+passangerDestination);
	}
}
