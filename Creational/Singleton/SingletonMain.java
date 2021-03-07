package Singleton;

/*
 * The Singleton pattern is used to allow access to an object without having to create a new instance 
 * for every access.
 * 
 * is very useful when a lot of users had to access the same piece of information, avoiding a new 
 * instance for every user and allowing to access the same instance saving resources.
 * 
 */
public class SingletonMain {

	public static void main(String[] args) {
		
		//CREATING TWO OBJECTS FROM THE SAME CLASS
		SingletonInstance instance1=SingletonInstance.getInstance();
		SingletonInstance instance2=SingletonInstance.getInstance();

		//PASSING DIFFERENT VALUES TO THOSE OBJECTS
		instance1.setNumber(5);
		instance2.setNumber(7);
		
		//CHECKING OBJECTS VALUES
		System.out.println(instance1.getNumber());
		System.out.println(instance2.getNumber());
	}

}
