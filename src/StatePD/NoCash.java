package StatePD;

public class NoCash implements ATMState {
	
	private final ATM atm;
	
	public NoCash(ATM atm)
	{
		this.atm = atm;
	}
	
	@Override
	public void insertCard(String cardNum) {
		System.out.println("ERROR: Machine is out of cash");
		
	}

	@Override
	public void ejectCard() {
		System.out.println("ERROR: Machine is out of cash");
		
	}

	@Override
	public void requestCash(double cash) {
		System.out.println("ERROR: Machine is out of cash");
		
	}

	@Override
	public void insertPin(String pin) {
		System.out.println("ERROR: Machine is out of cash");
		
	}

	@Override
	public void addCash(double cash) {
		System.out.println("ERROR: Machine is out of cash");
		
	}

}
