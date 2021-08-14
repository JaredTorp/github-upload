package StatePD;

public class NoCard implements ATMState {

	private final ATM atm;
	
	public NoCard(ATM atm)
	{
		this.atm = atm;
	}
	
	@Override
	public void insertCard(String cardNum) {
		System.out.println("Card Inserted: " + cardNum);
		atm.setState(atm.getHasCard());
		
	}

	@Override
	public void ejectCard() {
		System.out.println("ERROR: No card inserted ");
		
	}

	@Override
	public void requestCash(double cash) {
		System.out.println("ERROR: No card inserted ");
		
	}

	@Override
	public void insertPin(String pin) {
		System.out.println("ERROR: No card inserted ");
		
	}

	@Override
	public void addCash(double cash) {
		System.out.println("ERROR: No card inserted ");
		
	}

	public ATM getAtm() {
		return atm;
	}

}
