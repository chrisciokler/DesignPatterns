package Factory;

//PRODUCT TYPE 2
public class FactoryProductType2 implements FactoryProduct {

	@Override
	public void CreateProduct() {
		// TODO Auto-generated method stub

		System.out.println("creating instance of productType 2 ");
	}

	@Override
	public void DeleteProduct() {
		// TODO Auto-generated method stub

		System.out.println("deleting instance of productType 2 ");
	}

}
