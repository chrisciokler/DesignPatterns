package AbstractFactory;

/*
 * This pattern implements a Factory of factories. 
 * 
 * * Abstract Factory pattern allows to create different kind of Factories that implements an interface
 * depending of what the program needs.
 * 
 * All this objects are instanciated by another object 
 * known as the factory which its only purpose is to return the specific object ask by the program or 
 * user.
 * 
 */

public class AbstractFactoryMain {

	public static void main(String[] args) {
		
		AbstractFactoryInterface NuevoProduct1=Factory.ChoosingFactory("Product", "type1");
		AbstractFactoryInterface NuevoProduct3=Factory.ChoosingFactory("Product", "type2");

		AbstractFactoryInterface NuevoService1=Factory.ChoosingFactory("Service", "type1");
		AbstractFactoryInterface NuevoService3=Factory.ChoosingFactory("Service", "type3");

		NuevoProduct1.Create();
		NuevoProduct3.Create();
		NuevoService1.Create();
		NuevoService3.Create();
		

	}

}
