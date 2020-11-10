package Factory;

//PRODUCT TYPE 1
public class FactoryProductType1 implements FactoryProduct {

	
	@Override
	public void CreateProduct() {
		
		System.out.println("creating instance of productType 1 ");
	}

	@Override
	public void DeleteProduct() {

		System.out.println("deleting instance of productType 1 ");
	}

}
