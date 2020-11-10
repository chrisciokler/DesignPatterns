package Prototype;

public class CreatingAccount implements BankAccount{

	private String AccountType;
	private double assets;
	
	//CONSTRUCTOR
	public CreatingAccount() {
		this.AccountType="Savings";
	}
	
	//SETTERS AND GETTERS
	public String getAccountType() {
		return AccountType;
	}
	public void setAccountType(String accountType) {
		AccountType = accountType;
	}
	public double getAssets() {
		return assets;
	}
	public void setAssets(double assets) {
		this.assets = assets;
	}

	public BankAccount cloning() {
		CreatingAccount account=null;
		
		try {
			account=(CreatingAccount) clone();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return account;
	}

	@Override
	public String toString() {
		return "CreatingAccount [AccountType=" + AccountType + ", assets=" + assets + "]";
	}
	
	
}
