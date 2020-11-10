package Factory;

//THIS IS THE FACTORY
public class Factory {

	//CREATING PRODUCTS DEPENDING OF REQUERIMENTS
	public static FactoryProduct getProductType(String type) {
		
		if(type.equals("type1")) {
			return new FactoryProductType1();
		}
		else if(type.equals("type2")) {
			return new FactoryProductType2();
		}
		else if(type.equals("type3")) {
			return new FactoryProductType3();
		}
		else {
			return null;
		}
	}
}
