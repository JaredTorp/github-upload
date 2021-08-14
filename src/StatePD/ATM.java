package StatePD;

public class ATM {
	private double cash;
	private ATMState hasCard;
	private ATMState noCard;
	private ATMState hasPin;
	private ATMState noCash;
	//this is the atm state 
	private ATMState state;
	
	public ATM(double cash)
	{
		this.cash = cash;
		this.setHasCard(new HasCard(this));
		this.noCard = new NoCard(this);
		this.setHasPin(new HasPin(this));
		this.setNoCash(new NoCash(this));
		
		this.state = noCard; //the default state
	}
	
	public ATMState getHasCard() {
		return hasCard;
	}

	public void setHasCard(ATMState hasCard) {
		this.hasCard = hasCard;
	}
	
	public ATMState getNoCard() {
		return noCard;
	}

	public void setNoCard(ATMState noCard) {
		this.noCard = noCard;
	}
	
	

	public ATMState getHasPin() {
		return hasPin;
	}

	public void setHasPin(ATMState hasPin) {
		this.hasPin = hasPin;
	}

	public ATMState getNoCash() {
		return noCash;
	}

	public void setNoCash(ATMState noCash) {
		this.noCash = noCash;
	}

	public double getCash() {
		return cash;
	}

	public void setCash(double cash) {
		this.cash = cash;
	}
	
	public void setState(ATMState state)
	{
		this.state = state;
	}
	
	public void insertCard(String cardNum)
	{
		state.insertCard(cardNum);
	}
	
	public void ejectCard()
	{
		state.ejectCard();
	}
	
	public void requestCash(double cash)
	{
		state.requestCash(cash);
	}
	
	public void insertPin(String pin)
	{
		state.insertPin(pin);
	}
	
	public void addCash (double cash) 
	{
		state.addCash(cash);
	}
	

	
	
}
