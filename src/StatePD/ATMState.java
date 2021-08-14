package StatePD;

public interface ATMState {


	public void insertCard(String cardNum);
	public void ejectCard();
	public void requestCash(double cash);
	public void insertPin(String pin);
	public void addCash (double cash);
	
	
}


