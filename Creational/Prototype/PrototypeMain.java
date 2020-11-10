package Prototype;

/*
 * Prototype pattern allows to create a new object using the previous values already
 * set of another object of the same type. Saving time on setting the new values of that
 * new object.
 */

public class PrototypeMain {

	public static void main(String[] args) {
		CreatingAccount account1=new CreatingAccount();
		account1.setAssets(2000);

		CreatingAccount  account2=(CreatingAccount) account1.cloning();
		
		System.out.println(account1);
		System.out.println(account2);
	}

}
