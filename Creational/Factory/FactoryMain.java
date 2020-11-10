package Factory;

/*
 * Factory pattern allows to create different kind of objects that implements an interface
 * depending of what the program needs.
 * 
 * All this objects are instanciated by another object 
 * known as the factory which its only purpose is to return the specific object ask by the program or 
 * user.
 * 
 */


public class FactoryMain {

	public static void main(String[] args) {
		
		//CREATING DIFFERENT PRODUCTS FROM THE FACTORY
		FactoryProduct product1=Factory.getProductType("type1");
		FactoryProduct product2=Factory.getProductType("type2");
		FactoryProduct product3=Factory.getProductType("type3");
		
		//CHECKING THE PRODUCTS
		product1.CreateProduct();
		product2.CreateProduct();
		product3.CreateProduct();

	}

}
