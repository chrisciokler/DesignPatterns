package AbstractFactory;

public class FactoryServiceType1 implements FactoryService{

	@Override
	public void Create() {
		// TODO Auto-generated method stub
		System.out.println("creating instance of ServiceType 1 ");
	}

	@Override
	public void Delete() {
		// TODO Auto-generated method stub
		System.out.println("deleting instance of ServiceType 1 ");
	}

}
