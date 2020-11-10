package Facade;

public class HotelsAPI {

	public void searchHotels(String arriveDate,String returnDate, String origin,String destiny) {
		System.out.println("========================================");
		System.out.println("Available hotels for "+destiny+" from "+origin);
		System.out.println("Depart date: "+arriveDate+" return date: "+returnDate);
		System.out.println("Hotel A");
		System.out.println("Hotel B");
		System.out.println("Hotel C");
		System.out.println("========================================");
	}
}
