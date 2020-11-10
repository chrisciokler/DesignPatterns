package Facade;

public class FlightsAPI {

	public void searchFlights(String departDate,String returnDate, String origin,String destiny) {
		System.out.println("========================================");
		System.out.println("Available flights for "+destiny+" from "+origin);
		System.out.println("Depart date: "+departDate+" return date: "+returnDate);
		System.out.println("========================================");
	}
}
