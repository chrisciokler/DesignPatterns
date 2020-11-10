package Facade;

/*
 * Facade pattern hides or simplifies the complexity of the code or app.
 * A class or object allows the user to interact and receive data without him to 
 * know what it is really happening behind it. This pattern is most used on apis. 
 */

public class FacadeMain {

	public static void main(String[] args) {
		
		//USING FACADE
		FacadeImplemmentation client1=new FacadeImplemmentation();
		client1.search("3/5/2020","13/5/2020","Peru","France");
		
		FacadeImplemmentation client2=new FacadeImplemmentation();
		client1.search("12/6/2020","22/6/2020","Italy","Spain");
	}

}
