package Facade;

//FACADE IMPLEMENTATION
public class FacadeImplemmentation {

	private FlightsAPI flights;
	private HotelsAPI hotels;
	
	public FacadeImplemmentation() {
		flights=new FlightsAPI();
		hotels=new HotelsAPI();
	}
	
	public void search(String arriveDate,String returnDate, String origin,String destiny) {
		flights.searchFlights(arriveDate, returnDate, origin, destiny);
		hotels.searchHotels(arriveDate, returnDate, origin, destiny);
	}
}
