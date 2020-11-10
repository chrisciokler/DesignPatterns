package AbstractFactory;

//PRODUCT TYPE 1
public class FactoryProductType1 implements FactoryProduct {

	
	@Override
	public void Create() {
		
		System.out.println("creating instance of productType 1 ");
	}

	@Override
	public void Delete() {

		System.out.println("deleting instance of productType 1 ");
	}

}
