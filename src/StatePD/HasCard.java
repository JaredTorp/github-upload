package StatePD;

public class HasCard implements ATMState {

	private final ATM atm;
	
	public HasCard(ATM atm)
	{
		this.atm = atm;
	}
	
	@Override
	public void insertCard(String cardNum) {
		System.out.println("ERROR: Cannot insert card, Card already is inserted");
		
	}

	@Override
	public void ejectCard() 
	{
		System.out.println("Card Ejected");
		atm.setState(atm.getNoCard());
		
	}

	@Override
	public void requestCash(double cash) {
		System.out.println("ERROR: PIN required");
		
		
	}

	@Override
	public void insertPin(String pin) {
		System.out.println("Pin inserted: " + pin);
		atm.setState(atm.getHasPin());
		
	}

	@Override
	public void addCash(double cash) {
		System.out.println("ERROR: PIN required");
		
	}

	public ATM getAtm() {
		return atm;
	}

}
