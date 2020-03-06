package abtractsClasses;

import cards.Card;
import cards.Mastercard;

public class FactoryMaster extends AbstractFactory{
	
	private int number;
	private String name;
	private int cvv;
	
	public FactoryMaster(int number, String name, int cvv) {
		this.number = number;
		this.cvv = cvv;
		this.name = name;
	}
	
	@Override
	public Card createCard() {
		// TODO Auto-generated method stub
		return new Mastercard(number, name, cvv);
	}

	
}
