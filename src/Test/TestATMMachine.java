package Test;

import StatePD.ATM;

public class TestATMMachine {
 
	public static void main(String[] args){

		ATM atm = new ATM(2000);
		atm.insertCard("1234 5678 0000 1111");
		atm.ejectCard();
		atm.ejectCard(); //does it twice, should be error
		atm.insertCard("1234 5678 0000 2222");
		atm.requestCash(2000); //should be error
		atm.insertPin("1234");
		atm.requestCash(2000);//takes out all the cash from the ATM
		atm.ejectCard(); //error no cash
		atm.insertCard("1234 5678 0000 2222"); //error no cash

		}


}
