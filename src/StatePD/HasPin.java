package StatePD;

public class HasPin implements ATMState {

	private final ATM atm;
	
	public HasPin(ATM atm)
	{
		this.atm = atm;
	}
	
	@Override
	public void insertCard(String cardNum) {
		System.out.println("ERROR: ATM already has card inserted");
		
	}

	@Override
	public void ejectCard() {
		System.out.println("Card Ejected");
		atm.setState(atm.getNoCard());
		
		
	}

	@Override
	public void requestCash(double cash) {
		
		if(cash > atm.getCash())
		{
			System.out.println("ERROR: ATM does not have enough cash");
		}
		else
		{
			double result = this.getAtm().getCash() - cash;
			this.getAtm().setCash(result); 
			
			if (atm.getCash() == 0)
			{
				atm.setState(atm.getNoCash());
			}
		}
		
		
		
	}

	private ATM getAtm() {
		
		return this.atm;
	}

	@Override
	public void insertPin(String pin) {
		System.out.println("ERROR: Pin already inserted");
		
		
	}

	@Override
	public void addCash(double cash) {
		
		double result = this.getAtm().getCash() + cash;
		this.getAtm().setCash(result); 
		
	}

}
