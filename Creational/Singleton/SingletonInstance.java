package Singleton;

public class SingletonInstance {
	
	//PRIVATE STATIC TO AVOID MORE THAN ONE INSTANCE
	private static SingletonInstance instance;
	
	//PRIVATE CONSTRUCTOR TO AVOID NEW INSTANCES 
	private SingletonInstance() {
		
	}
	
	//PUBLIC STATIC METHOD TO ACCESS THE INSTANCE
	public static SingletonInstance getInstance() {
		if(instance==null) {
			instance=new SingletonInstance();
			return instance;
		}
		else {
			return instance;
		}
	}

	private int number;
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	

}
