package AbstractFactory;

//THIS IS THE FACTORY
public class Factory {
	
	//CHOOSING FACTORY TYPE
	public static AbstractFactoryInterface ChoosingFactory(String FactoryType, String Item) {
		
		if(FactoryType.equals("Product")) {
			return getProductType(Item);
		}
		else if(FactoryType.equals("Service")) {
			return getServiceType(Item);
		}
		else {
			return null;
		}
	}

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
	
	//CREATING SERVICES DEPENDING OF REQUERIMENTS
	public static FactoryService getServiceType(String type) {
		
		if(type.equals("type1")) {
			return new FactoryServiceType1();
		}
		else if(type.equals("type2")) {
			return new FactoryServiceType2();
		}
		else if(type.equals("type3")) {
			return new FactoryServiceType3();
		}
		else {
			return null;
		}
	}
}
